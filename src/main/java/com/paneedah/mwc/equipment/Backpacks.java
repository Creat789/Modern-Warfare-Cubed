package com.paneedah.mwc.equipment;

import com.paneedah.mwc.items.equipment.carryable.ItemBackpack;
import com.paneedah.weaponlib.animation.Transform;
import net.minecraft.item.Item;

public class Backpacks {

    public static Item combatSustainmentBackpackTan;
    public static Item combatSustainmentBackpackBlack;
    public static Item combatSustainmentBackpackForest;

    public static Item assaultBackpackTan;
    public static Item assaultBackpackBlack;
    public static Item assaultBackpackForest;

    public static Item truSpecCorduraBackpackTan;
    public static Item truSpecCorduraBackpackBlack;
    public static Item truSpecCorduraBackpackForest;

    public static Item f5SwitchbladeBackpack;

    public static Item duffleBag, duffleBag_green, duffleBag_red;

    public static void init() {

        combatSustainmentBackpackTan = new ItemBackpack.Builder()
                .withName("combat_sustainment_backpack_tan")
                .withSize(10)
                .withModel("CombatSustainmentBackpack")
                .withTexture("equipment/carryable/backpacks/combat_sustainment_backpack_tan")
                .withInventoryPositioning(itemStack -> new Transform()
                        .withPosition(-0.15, -4.6, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.3, 3.3, 3.3)
                        .doGLDirect())
                .withFirstPersonModelPositioning((modelBase, itemStack) -> new Transform()
                        .withPosition(-64, -0.20, -1.25)
                        .withRotation(0, 0, 0)
                        .withScale(16, 16, 16)
                        .doGLDirect())
                .build();

        combatSustainmentBackpackBlack = new ItemBackpack.Builder()
                .withName("combat_sustainment_backpack_black")
                .withSize(10)
                .withModel("CombatSustainmentBackpack")
                .withTexture("equipment/carryable/backpacks/combat_sustainment_backpack_black")
                .withInventoryPositioning(itemStack -> new Transform()
                        .withPosition(-0.15, -4.6, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.3, 3.3, 3.3)
                        .doGLDirect())
                .build();

        combatSustainmentBackpackForest = new ItemBackpack.Builder()
                .withName("combat_sustainment_backpack_forest")
                .withSize(10)
                .withModel("CombatSustainmentBackpack")
                .withTexture("equipment/carryable/backpacks/combat_sustainment_backpack_forest")
                .withInventoryPositioning(itemStack -> new Transform()
                        .withPosition(-0.15, -4.6, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.3, 3.3, 3.3)
                        .doGLDirect())
                .build();

        assaultBackpackTan = new ItemBackpack.Builder()
                .withName("assault_backpack_tan")
                .withSize(16)
                .withModel("AssaultBackpack")
                .withTexture("equipment/carryable/backpacks/assault_backpack_tan")
                .build();

        assaultBackpackBlack = new ItemBackpack.Builder()
                .withName("assault_backpack_black")
                .withSize(16)
                .withModel("AssaultBackpack")
                .withTexture("equipment/carryable/backpacks/assault_backpack_black")
                .build();

        assaultBackpackForest = new ItemBackpack.Builder()
                .withName("assault_backpack_forest")
                .withSize(16)
                .withModel("AssaultBackpack")
                .withTexture("equipment/carryable/backpacks/assault_backpack_forest")
                .build();

        truSpecCorduraBackpackTan = new ItemBackpack.Builder()
                .withName("tru_spec_cordura_backpack_tan")
                .withSize(20)
                .withModel("TruSpecCorduraBackpack")
                .withTexture("equipment/carryable/backpacks/tru_spec_cordura_backpack_tan")
                .build();

        truSpecCorduraBackpackBlack = new ItemBackpack.Builder()
                .withName("tru_spec_cordura_backpack_black")
                .withSize(20)
                .withModel("TruSpecCorduraBackpack")
                .withTexture("equipment/carryable/backpacks/tru_spec_cordura_backpack_black")
                .build();

        truSpecCorduraBackpackForest = new ItemBackpack.Builder()
                .withName("tru_spec_cordura_backpack_forest")
                .withSize(20)
                .withModel("TruSpecCorduraBackpack")
                .withTexture("equipment/carryable/backpacks/tru_spec_cordura_backpack_forest")
                .build();

        f5SwitchbladeBackpack = new ItemBackpack.Builder()
                .withName("f5_switchblade_backpack")
                .withSize(16)
                .withModel("F5SwitchbladeBackpack")
                .withTexture("equipment/carryable/backpacks/f5_switchblade_backpack")
                .build();

        duffleBag = new ItemBackpack.Builder()
                .withName("duffle_bag")
                .withSize(24)
                .withModel("Dufflebag")
                .withTexture("equipment/carryable/backpacks/duffle_bag")
                .withEntityPositioning(itemStack -> new Transform()
                        .withPosition(-0.5F, -1.9F, 0.5F)
                        .withScale(1, 1, 1)
                        .doGLDirect())
                .withInventoryPositioning(itemStack -> new Transform()
                        .withPosition(-0.15, -3.65, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(2.4, 2.4, 2.4)
                        .doGLDirect())
                .build();

        duffleBag_green = new ItemBackpack.Builder()
                .withName("duffle_bag")
                .withSize(24)
                .withModel("Dufflebag")
                .withTexture("equipment/carryable/backpacks/duffle_bag_green")
                .withEntityPositioning(itemStack -> new Transform()
                        .withPosition(-0.5F, -1.9F, 0.5F)
                        .withScale(1, 1, 1)
                        .doGLDirect())
                .withInventoryPositioning(itemStack -> new Transform()
                        .withPosition(-0.15, -3.65, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(2.4, 2.4, 2.4)
                        .doGLDirect())
                .build();

        duffleBag_red = new ItemBackpack.Builder()
                .withName("duffle_bag")
                .withSize(24)
                .withModel("Dufflebag")
                .withTexture("equipment/carryable/backpacks/duffle_bag_red")
                .withEntityPositioning(itemStack -> new Transform()
                        .withPosition(-0.5F, -1.9F, 0.5F)
                        .withScale(1, 1, 1)
                        .doGLDirect())
                .withInventoryPositioning(itemStack -> new Transform()
                        .withPosition(-0.15, -3.65, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(2.4, 2.4, 2.4)
                        .doGLDirect())
                .build();
    }
}
