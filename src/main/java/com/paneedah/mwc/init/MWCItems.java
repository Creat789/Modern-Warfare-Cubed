package com.paneedah.mwc.init;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.bases.ItemBase;
import com.paneedah.mwc.bases.ManufacturingItemBase;
import com.paneedah.mwc.creativetab.PlanTab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

import static com.paneedah.mwc.utils.ModReference.ID;

@Mod.EventBusSubscriber(modid =ID)
public class MWCItems {
    public static ItemBase PLAN_M249;
    public static ItemBase PLAN_M40A6;
    public static ItemBase PLAN_Beowulf50Cal;
    public static ItemBase PLAN_M110;
    public static ItemBase PLAN_AR10SuperSASS;
    public static ItemBase PLAN_ZbroyarZ10;
    public static ItemBase PLAN_M1014;
    public static ItemBase PLAN_Supernova;
    public static ItemBase PLAN_HK417;
    public static ItemBase PLAN_M38;
    public static ItemBase PLAN_M16A1;
    public static ItemBase PLAN_M16A4;
    public static ItemBase PLAN_M4A1;
    public static ItemBase PLAN_AR15;
    public static ItemBase PLAN_SIGMCX;
    public static ItemBase PLAN_NGSWR;
    public static ItemBase PLAN_P226;
    public static ItemBase PLAN_FiveSeven;
    public static ItemBase PLAN_M9A1;
    public static ItemBase PLAN_MAS21;

    public static ItemBase PLAN_turretgun;
    public static ItemBase PLAN_turretgunupgraded;
    public static ItemBase PLAN_turretgunsilenced;

    public static ItemBase PLAN_MP443;
    //public static Item PLAN_AK12_kal;
    public static ItemBase PLAN_AK15;
    public static ItemBase PLAN_KBP9A91;
    public static ItemBase PLAN_Kedr;
    public static ItemBase PLAN_VSSVintorez;
    public static ItemBase PLAN_KS23;
    public static ItemBase PLAN_SV98;

    public static ItemBase PLAN_MP5A5;
    public static ItemBase PLAN_MP7;
    public static ItemBase PLAN_UMP45;
    public static ItemBase PLAN_MPX;
    public static ItemBase PLAN_P90;
    public static ItemBase PLAN_MAC10;
    public static ItemBase PLAN_ScorpionEVO3A1;
    public static ItemBase PLAN_APC9;
    public static ItemBase PLAN_S710Tricun;
    public static ItemBase PLAN_ScarL;
    public static ItemBase PLAN_ScarH;
    public static ItemBase PLAN_FamasF1;
    public static ItemBase PLAN_VP70;
    public static ItemBase PLAN_Glock19;
    public static ItemBase PLAN_SCCYCPX2;
    public static ItemBase PLAN_HK_P12;
    public static ItemBase PLAN_BrowningHiPower;
    public static ItemBase PLAN_M1911;
    public static ItemBase PLAN_Python;
    public static ItemBase PLAN_TaurusRagingHunter;
    public static ItemBase PLAN_ChiappaRhino;
    public static ItemBase PLAN_SW500Magnum;
    public static ItemBase PLAN_DesertEagle;
    public static ItemBase PLAN_MP40;
    public static ItemBase PLAN_M17;
    public static ItemBase PLAN_M1A1Thompson;
    public static ItemBase PLAN_M1928Thompson;
    public static ItemBase PLAN_AK101;
    public static ItemBase PLAN_AK74;
    public static ItemBase PLAN_AK47;
    public static ItemBase PLAN_Malyuk;
    public static ItemBase PLAN_AK12;
    public static ItemBase PLAN_ACR;
    public static ItemBase PLAN_Type20;
    public static ItemBase PLAN_CZ805Bren;
    public static ItemBase PLAN_ARX160;
    public static ItemBase PLAN_F2000;
    public static ItemBase PLAN_G36C;
    public static ItemBase PLAN_AUG;
    public static ItemBase PLAN_K2C1;
    public static ItemBase PLAN_SIG556;
    public static ItemBase PLAN_G11;
    public static ItemBase PLAN_STG44;
    public static ItemBase PLAN_G3;
    public static ItemBase PLAN_M1873;
    public static ItemBase PLAN_MaresLeg;
    public static ItemBase PLAN_G2Contender;
    public static ItemBase PLAN_Remington870;
    public static ItemBase PLAN_BrowningAuto5;
    public static ItemBase PLAN_M1Carbine;
    public static ItemBase PLAN_M1Garand;
    public static ItemBase PLAN_G43Gewehr;
    public static ItemBase PLAN_Springfield;
    public static ItemBase PLAN_Kar98K;
    public static ItemBase PLAN_KragJorgensen;
    public static ItemBase PLAN_SVDDragunov;
    public static ItemBase PLAN_Glock18C;
    public static ItemBase PLAN_MakarovPM;
    public static ItemBase PLAN_APS;
    public static ItemBase PLAN_M712;
    public static ItemBase PLAN_Uzi;
    public static ItemBase PLAN_AACHoneyBadger;
    public static ItemBase PLAN_KrissVector;
    public static ItemBase PLAN_FMG9;
    public static ItemBase PLAN_Saiga12;
    public static ItemBase PLAN_Spas12;
    public static ItemBase PLAN_MP43E;
    public static ItemBase PLAN_HS12;
    public static ItemBase PLAN_Origin12;
    public static ItemBase PLAN_M1897;
    public static ItemBase PLAN_FNFAL;
    public static ItemBase PLAN_Mk14EBR;
    public static ItemBase PLAN_BrenMkII;
    public static ItemBase PLAN_M1941Johnson;
    public static ItemBase PLAN_M1941JohnsonRifle;
    public static ItemBase PLAN_DP28;
    public static ItemBase PLAN_MG34;
    public static ItemBase PLAN_MG42;
    public static ItemBase PLAN_M60E4;
    public static ItemBase PLAN_StonerA1;
    public static ItemBase PLAN_SSG08;
    public static ItemBase PLAN_DSR1;
    public static ItemBase PLAN_L96A1;
    public static ItemBase PLAN_M200Intervention;
    public static ItemBase PLAN_AS50;
    public static ItemBase PLAN_M82;

    //    public static ItemBase PLAN_NTW20;
    public static ItemBase PLAN_GL06;
    public static ItemBase PLAN_M79;
    public static ItemBase PLAN_M32MGL;
    public static ItemBase PLAN_RPG7;
    public static ItemBase PLAN_M202;
    public static ItemBase PLAN_M134;
    //    public static ItemBase PLAN_NinthSin;
    //Ingots
    public static ItemBase copperIngot;
    public static ItemBase tinIngot;
    public static ItemBase leadIngot;

    //Dusts
    public static ItemBase sulfurDust;
    public static ItemBase steelDust;
    public static ItemBase graphiteChunk;

    //Misc Items
    public static ItemBase gunmetalComposite;
    public static ItemBase carbonFiber;
    public static ItemBase syntheticPolymerComposite;
    public static ItemBase syntheticPlastic;


    //Items used in the custom crafting table
    public static ManufacturingItemBase steelIngot;
    public static ManufacturingItemBase gunmetalIngot;
    public static ManufacturingItemBase gunmetalPlate;
    public static ManufacturingItemBase carbonComposite;

    //Render...?
    public static ItemBase vestRender;

    public static ItemBase[] items;

    public static void init() {
        // Try not to change the order of the guns to ensure stable recipes
        //AR2

        // Assault Rifles
        PLAN_M4A1 = new ItemBase("plan_m4a1");
        PLAN_AR15 = new ItemBase("plan_ar15");
        PLAN_M16A1 = new ItemBase("plan_m16a1");
        PLAN_M16A4 = new ItemBase("plan_m16a4");
        PLAN_M38 = new ItemBase("plan_m38");
        PLAN_ACR = new ItemBase("plan_acr");
        PLAN_NGSWR = new ItemBase("plan_ngswr");
        PLAN_SIGMCX = new ItemBase("plan_sigmcx");
        PLAN_AACHoneyBadger = new ItemBase("plan_aachoneybadger");

// AK Series
        PLAN_AK47 = new ItemBase("plan_ak47");
        PLAN_AK15 = new ItemBase("plan_ak15");
        PLAN_Malyuk = new ItemBase("plan_malyuk");
        //PLAN_AK12_kal = new ItemBase("plan_ak12_kal");
        PLAN_AK12 = new ItemBase("plan_ak12");
        PLAN_AK101 = new ItemBase("plan_ak101");
        PLAN_AK74 = new ItemBase("plan_ak74");
        PLAN_KBP9A91 = new ItemBase("plan_kbp9a91");
        PLAN_K2C1 = new ItemBase("plan_k2c1");

// Other Assault Rifles
        PLAN_ScarH = new ItemBase("plan_scarh");
        PLAN_ScarL = new ItemBase("plan_scarl");
        PLAN_SIG556 = new ItemBase("plan_sig556");
        PLAN_CZ805Bren = new ItemBase("plan_cz805bren");
        PLAN_ARX160 = new ItemBase("plan_arx160");
        PLAN_Type20 = new ItemBase("plan_type20");
        PLAN_FamasF1 = new ItemBase("plan_famasf1");
        PLAN_G36C = new ItemBase("plan_g36c");
        PLAN_G11 = new ItemBase("plan_g11");

// Other Rifles
        PLAN_F2000 = new ItemBase("plan_f2000");
        PLAN_AUG = new ItemBase("plan_aug");
        PLAN_STG44 = new ItemBase("plan_stg44");
        PLAN_M1Garand = new ItemBase("plan_m1garand");
        PLAN_M1941JohnsonRifle = new ItemBase("plan_m1941johnsonrifle");
        PLAN_G43Gewehr = new ItemBase("plan_g43gewehr");
        PLAN_M1Carbine = new ItemBase("plan_m1carbine");
        PLAN_M1873 = new ItemBase("plan_m1873");
        PLAN_MaresLeg = new ItemBase("plan_maresleg");

// Designated Marksman Rifles (DMR)
        PLAN_AR10SuperSASS = new ItemBase("plan_ar10supersass");
        PLAN_Beowulf50Cal = new ItemBase("plan_beowulf50cal");
        PLAN_M110 = new ItemBase("plan_m110");
        PLAN_ZbroyarZ10 = new ItemBase("plan_zbroyarz10");
        PLAN_HK417 = new ItemBase("plan_hk417");
        PLAN_Mk14EBR = new ItemBase("plan_mk14ebr");
        PLAN_FNFAL = new ItemBase("plan_fnfal");
        PLAN_G3 = new ItemBase("plan_g3");

// Springfield (DMR1)
        PLAN_Springfield = new ItemBase("plan_springfield");

// Sniper Rifles (SR2)
        PLAN_M82 = new ItemBase("plan_m82");
        PLAN_M40A6 = new ItemBase("plan_m40a6");
        PLAN_SVDDragunov = new ItemBase("plan_svddragunov");
        PLAN_VSSVintorez = new ItemBase("plan_vssvintorez");

// Sniper Rifles (SR1)
        PLAN_AS50 = new ItemBase("plan_as50");
        PLAN_SSG08 = new ItemBase("plan_ssg08");
        PLAN_M200Intervention = new ItemBase("plan_m200intervention");
        PLAN_DSR1 = new ItemBase("plan_dsr1");
        PLAN_L96A1 = new ItemBase("plan_l96a1");
        //PLAN_Remington700 = new ItemBase("plan_remington700");
        PLAN_SV98 = new ItemBase("plan_sv98");
        PLAN_KragJorgensen = new ItemBase("plan_kragjorgensen");
        PLAN_Kar98K = new ItemBase("plan_kar98k");

// Submachine Guns (SMG2)
        PLAN_MP7 = new ItemBase("plan_mp7");
        PLAN_MP5A5 = new ItemBase("plan_mp5a5");
        PLAN_P90 = new ItemBase("plan_p90");
        PLAN_MAC10 = new ItemBase("plan_mac10");
        PLAN_KrissVector = new ItemBase("plan_krissvector");
        PLAN_UMP45 = new ItemBase("plan_ump45");
        PLAN_ScorpionEVO3A1 = new ItemBase("plan_scorpionevo3a1");
        PLAN_MPX = new ItemBase("plan_mpx");
        PLAN_FMG9 = new ItemBase("plan_fmg9");
        PLAN_Uzi = new ItemBase("plan_uzi");

// Submachine Guns (SMG1)
        PLAN_S710Tricun = new ItemBase("plan_s710tricun");
        PLAN_APC9 = new ItemBase("plan_apc9");
        PLAN_Kedr = new ItemBase("plan_kedr");
        PLAN_MP40 = new ItemBase("plan_mp40");
        PLAN_M1928Thompson = new ItemBase("plan_m1928thompson");

// Shotguns (Shotgun1)
        PLAN_Origin12 = new ItemBase("plan_origin12");
        PLAN_Saiga12 = new ItemBase("plan_saiga12");
        PLAN_Spas12 = new ItemBase("plan_spas12");
        PLAN_M1014 = new ItemBase("plan_m1014");
        PLAN_Supernova = new ItemBase("plan_supernova");
        PLAN_Remington870 = new ItemBase("plan_remington870");
        PLAN_KS23 = new ItemBase("plan_ks23");
        PLAN_M1897 = new ItemBase("plan_m1897");
        PLAN_HS12 = new ItemBase("plan_hs12");
        PLAN_MP43E = new ItemBase("plan_mp43e");
        PLAN_BrowningAuto5 = new ItemBase("plan_browningauto5");

// Light Machine Guns (LMG)
        PLAN_M60E4 = new ItemBase("plan_m60e4");
        PLAN_MG42 = new ItemBase("plan_mg42");
        PLAN_MG34 = new ItemBase("plan_mg34");
        PLAN_DP28 = new ItemBase("plan_dp28");
        PLAN_BrenMkII = new ItemBase("plan_brenmkii");
        PLAN_M1941Johnson = new ItemBase("plan_m1941johnson");
        PLAN_M249 = new ItemBase("plan_m249");
        PLAN_StonerA1 = new ItemBase("plan_stonera1");
        PLAN_M134 = new ItemBase("plan_m134");

// Revolvers
        PLAN_Python = new ItemBase("plan_python");
        PLAN_TaurusRagingHunter = new ItemBase("plan_taurusraginghunter");
        PLAN_SW500Magnum = new ItemBase("plan_sw500magnum");
        PLAN_ChiappaRhino = new ItemBase("plan_chiapparhino");

// Sidearms (SIDEARM2)
        PLAN_APS = new ItemBase("plan_aps");
        PLAN_MakarovPM = new ItemBase("plan_makarovpm");
        PLAN_DesertEagle = new ItemBase("plan_deserteagle");
        PLAN_Glock18C = new ItemBase("plan_glock18c");
        PLAN_Glock19 = new ItemBase("plan_glock19");
        PLAN_FiveSeven = new ItemBase("plan_fiveseven");
        PLAN_M9A1 = new ItemBase("plan_m9a1");
        PLAN_P226 = new ItemBase("plan_p226");
        PLAN_MP443 = new ItemBase("plan_mp443");
        PLAN_VP70 = new ItemBase("plan_vp70");
        PLAN_M17 = new ItemBase("plan_m17");
        PLAN_SCCYCPX2 = new ItemBase("plan_sccycpx2");
        PLAN_HK_P12 = new ItemBase("plan_hk_p12");

// Sidearms (SIDEARM1)
        PLAN_MAS21 = new ItemBase("plan_mas21");
        PLAN_G2Contender = new ItemBase("plan_g2contender");
        PLAN_M712 = new ItemBase("plan_m712");
        PLAN_M1911 = new ItemBase("plan_m1911");
        PLAN_BrowningHiPower = new ItemBase("plan_browninghipower");

// Launchers
        PLAN_M202 = new ItemBase("plan_m202");
        PLAN_RPG7 = new ItemBase("plan_rpg7");
        PLAN_M32MGL = new ItemBase("plan_m32mgl");
        PLAN_GL06 = new ItemBase("plan_gl06");
        PLAN_M79 = new ItemBase("plan_m79");
        //PLAN_Chainsaw = new ItemBase("plan_chainsaw");
        PLAN_turretgun = new ItemBase("plan_turretgun");
        PLAN_turretgunupgraded = new ItemBase("plan_turretgunupgraded");
        PLAN_turretgunsilenced = new ItemBase("plan_turretgunsilenced");

        copperIngot = new ItemBase("copper_ingot");
        copperIngot.setOreDict("ingotCopper");

        tinIngot = new ItemBase("tin_ingot");
        tinIngot.setOreDict("ingotTin");

        leadIngot = new ItemBase("lead_ingot");
        leadIngot.setOreDict("ingotLead");

        sulfurDust = new ItemBase("sulfur_dust");
        sulfurDust.setOreDict(new String[]{"dustSulfur", "gunpowder"}); // Set the sulfur as gunpowder directly, instead of having to smelt it; just remove the gunpowder oredict to fix.

        steelDust = new ItemBase("steel_dust");
        steelDust.setOreDict("dustSteel");

        graphiteChunk = new ItemBase("graphite_chunk");
        graphiteChunk.setOreDict(new String[]{"dustGraphite", "dustCharcoal"});

        gunmetalComposite = new ItemBase("gunmetal_composite");
        gunmetalComposite.setOreDict("compositeGunmetal");

        carbonFiber = new ItemBase("carbon_fiber");
        carbonFiber.setOreDict("fiberCarbon"); // Not sure about this one

        syntheticPolymerComposite = new ItemBase("synthetic_polymer_composite");
        syntheticPolymerComposite.setOreDict(new String[]{"compositePolymerSynthetic", "Nylon"});

        // Since there are no other plastics
        syntheticPlastic = new ItemBase("synthetic_plastic");
        syntheticPlastic.setOreDict("plastic");

        gunmetalIngot = new ManufacturingItemBase("gunmetal_ingot");
        gunmetalIngot.setOreDict("ingotGunmetal");
        gunmetalIngot.setRecoveryChance(.3);

        steelIngot = new ManufacturingItemBase("steel_ingot");
        steelIngot.setOreDict("ingotSteel");
        steelIngot.setRecoveryChance(.3);

        gunmetalPlate = new ManufacturingItemBase("gunmetal_plate");
        gunmetalPlate.setOreDict("plateGunmetal");
        gunmetalPlate.setRecoveryChance(.3);

        carbonComposite = new ManufacturingItemBase("carbon_composite");
        carbonComposite.setOreDict("compositeCarbon");
        carbonComposite.setRecoveryChance(.3);

        vestRender = (ItemBase) new ItemBase("vest_render").setCreativeTab(null);

        items = new ItemBase[] {
                copperIngot,
                tinIngot,
                leadIngot,
                sulfurDust,
                steelDust,
                graphiteChunk,
                gunmetalComposite,
                carbonFiber,
                syntheticPolymerComposite,
                syntheticPlastic,
                steelIngot,
                gunmetalIngot,
                gunmetalPlate,
                carbonComposite,
                vestRender,
                // Assault Rifles
                PLAN_AR15,
                PLAN_M16A1,
                PLAN_M16A4,
                PLAN_M38,
                PLAN_ACR,
                PLAN_NGSWR,
                PLAN_SIGMCX,
                PLAN_AACHoneyBadger,

                // AK Series
                PLAN_AK47,
                PLAN_AK15,
                PLAN_Malyuk,
                //PLAN_AK12_kal,
                PLAN_AK12,
                PLAN_AK101,
                PLAN_AK74,
                PLAN_KBP9A91,
                PLAN_K2C1,
                PLAN_M4A1,
                // Other Assault Rifles
                PLAN_ScarH,
                PLAN_ScarL,
                PLAN_SIG556,
                PLAN_CZ805Bren,
                PLAN_ARX160,
                PLAN_Type20,
                PLAN_FamasF1,
                PLAN_G36C,
                PLAN_G11,

                // Other Rifles
                PLAN_F2000,
                PLAN_AUG,
                PLAN_STG44,
                PLAN_M1Garand,
                PLAN_M1941JohnsonRifle,
                PLAN_G43Gewehr,
                PLAN_M1Carbine,
                PLAN_M1873,
                PLAN_MaresLeg,

                // Designated Marksman Rifles (DMR)
                PLAN_AR10SuperSASS,
                PLAN_Beowulf50Cal,
                PLAN_M110,
                PLAN_ZbroyarZ10,
                PLAN_HK417,
                PLAN_Mk14EBR,
                PLAN_FNFAL,
                PLAN_G3,

                // Springfield (DMR1)
                PLAN_Springfield,

                // Sniper Rifles (SR2)
                PLAN_M82,
                PLAN_M40A6,
                PLAN_SVDDragunov,
                PLAN_VSSVintorez,

                // Sniper Rifles (SR1)
                PLAN_AS50,
                PLAN_SSG08,
                PLAN_M200Intervention,
                PLAN_DSR1,
                PLAN_L96A1,
                //PLAN_Remington700,
                PLAN_SV98,
                PLAN_KragJorgensen,
                PLAN_Kar98K,

                // Submachine Guns (SMG2)
                PLAN_MP7,
                PLAN_MP5A5,
                PLAN_P90,
                PLAN_MAC10,
                PLAN_KrissVector,
                PLAN_UMP45,
                PLAN_ScorpionEVO3A1,
                PLAN_MPX,
                PLAN_FMG9,
                PLAN_Uzi,

                // Submachine Guns (SMG1)
                PLAN_S710Tricun,
                PLAN_APC9,
                PLAN_Kedr,
                PLAN_MP40,
                PLAN_M1928Thompson,

                // Shotguns (Shotgun1)
                PLAN_Origin12,
                PLAN_Saiga12,
                PLAN_Spas12,
                PLAN_M1014,
                PLAN_Supernova,
                PLAN_Remington870,
                PLAN_KS23,
                PLAN_M1897,
                PLAN_HS12,
                PLAN_MP43E,
                PLAN_BrowningAuto5,

                // Light Machine Guns (LMG)
                PLAN_M60E4,
                PLAN_MG42,
                PLAN_MG34,
                PLAN_DP28,
                PLAN_BrenMkII,
                PLAN_M1941Johnson,
                PLAN_M249,
                PLAN_StonerA1,
                PLAN_M134,

                // Revolvers
                PLAN_Python,
                PLAN_TaurusRagingHunter,
                PLAN_SW500Magnum,
                PLAN_ChiappaRhino,

                // Sidearms (SIDEARM2)
                PLAN_APS,
                PLAN_MakarovPM,
                PLAN_DesertEagle,
                PLAN_Glock18C,
                PLAN_Glock19,
                PLAN_FiveSeven,
                PLAN_M9A1,
                PLAN_P226,
                PLAN_MP443,
                PLAN_VP70,
                PLAN_M17,
                PLAN_SCCYCPX2,
                PLAN_HK_P12,

                // Sidearms (SIDEARM1)
                PLAN_MAS21,
                PLAN_G2Contender,
                PLAN_M712,
                PLAN_M1911,
                PLAN_BrowningHiPower,

                // Launchers
                PLAN_M202,
                PLAN_RPG7,
                PLAN_M32MGL,
                PLAN_GL06,
                PLAN_M79,
                //PLAN_Chainsaw,
                PLAN_turretgun,
                PLAN_turretgunupgraded,
                PLAN_turretgunsilenced
        };
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> itemRegistryEvent) {
        //init();
        itemRegistryEvent.getRegistry().registerAll(items);
        registerOreDictionaryKeys(items);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent modelRegistryEvent) {
        for (ItemBase item : items)
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    static void registerOreDictionaryKeys(ItemBase[] items){
        for (ItemBase item : items) {
            String[] oreDictKeys = item.getOreDictKeys();

            if(oreDictKeys == null)
                continue;

            for (String oreDictKey : oreDictKeys)
                OreDictionary.registerOre(oreDictKey, item);
        }
    }
}
