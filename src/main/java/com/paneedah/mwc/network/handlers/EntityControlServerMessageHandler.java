package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.EntityControlClientMessage;
import com.paneedah.mwc.network.messages.EntityControlServerMessage;
import com.paneedah.mwc.utils.PlayerUtil;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

@NoArgsConstructor
@AllArgsConstructor
public final class EntityControlServerMessageHandler implements IMessageHandler<EntityControlServerMessage, IMessage> {

    private ModContext modContext;

    @Override
    public IMessage onMessage(EntityControlServerMessage message, MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final EntityPlayer player = messageContext.getServerHandler().player;
            CompatibleExtraEntityFlags.setFlags(player, message.getFlags(), message.getValues());
            final NetworkRegistry.TargetPoint point = new NetworkRegistry.TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 200);

            final int updatedFlags = CompatibleExtraEntityFlags.getFlags(player);
            if((updatedFlags & CompatibleExtraEntityFlags.PRONING) != 0)
                PlayerUtil.setSize(player, 0.6F);
            else
                PlayerUtil.setSize(player, 1.8F);

            modContext.getChannel().sendToAllAround(new EntityControlClientMessage(player, updatedFlags), point);
        });

        return null;
    }
}
