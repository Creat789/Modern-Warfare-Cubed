package com.paneedah.mwc.network;

import com.paneedah.mwc.network.messages.PermitMessage;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.PlayerItemInstance;
import com.paneedah.weaponlib.state.ExtendedState;
import com.paneedah.weaponlib.state.ManagedState;
import com.paneedah.weaponlib.state.Permit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.UUID;
import java.util.function.BiConsumer;

import static com.paneedah.mwc.utils.ModReference.LOG;

@NoArgsConstructor
@AllArgsConstructor
public final class NetworkPermitManager {

    private ModContext modContext;
    @Getter private final HashMap<UUID, BiConsumer<Permit<?>, PlayerItemInstance<?>>> permitCallbacks = new HashMap<>();
    @Getter private final HashMap<Class<?>, BiConsumer<Permit<?>, PlayerItemInstance<?>>> permitEvaluators = new HashMap<>();

    public <S extends ManagedState<S>, P extends Permit<S>, E extends ExtendedState<S>> void request(P permit, E extendedState, BiConsumer<P, E> callback) {
        permitCallbacks.put(permit.getUuid(), (BiConsumer<Permit<?>, PlayerItemInstance<?>>) callback);
        modContext.getChannel().sendToServer(new PermitMessage(permit, (PlayerItemInstance<?>) extendedState));
    }

    public <S extends ManagedState<S>, P extends Permit<S>, E extends ExtendedState<S>> void registerEvaluator(Class<? extends P> permitClass, Class<? extends E> esClass, BiConsumer<P, E> evaluator) {
        permitEvaluators.put(permitClass, (permit, playerItemInstance) -> {
            LOG.debug("Processing permit {} for instance {}", permit, playerItemInstance);
            evaluator.accept(permitClass.cast(permit), esClass.cast(playerItemInstance));
        });
    }
}
