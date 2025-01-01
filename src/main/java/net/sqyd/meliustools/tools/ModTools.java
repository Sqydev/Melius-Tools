package net.sqyd.meliustools.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sqyd.meliustools.MeliusTools;

public class ModTools {


    //Wooden


    public static final Item Oak_Pickaxe = registerTools("oak_pickaxe",
            new PickaxeItem(ModToolsM.Oak, 1, -2.8f, new FabricItemSettings()));
    public static final Item Oak_Axe = registerTools("oak_axe",
            new AxeItem(ModToolsM.Oak, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Oak_Shovel = registerTools("oak_shovel",
            new ShovelItem(ModToolsM.Oak, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Oak_Sword = registerTools("oak_sword",
            new SwordItem(ModToolsM.Oak, 3, -2.4f, new FabricItemSettings()));
    public static final Item Oak_Hoe = registerTools("oak_hoe",
            new HoeItem(ModToolsM.Oak, 0, -3.0f, new FabricItemSettings()));

    public static final Item DOak_Pickaxe = registerTools("doak_pickaxe",
            new PickaxeItem(ModToolsM.DOak, 1, -2.8f, new FabricItemSettings()));
    public static final Item DOak_Axe = registerTools("doak_axe",
            new AxeItem(ModToolsM.DOak, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item DOak_Shovel = registerTools("doak_shovel",
            new ShovelItem(ModToolsM.DOak, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item DOak_Sword = registerTools("doak_sword",
            new SwordItem(ModToolsM.DOak, 3, -2.4f, new FabricItemSettings()));
    public static final Item DOak_Hoe = registerTools("doak_hoe",
            new HoeItem(ModToolsM.DOak, 0, -3.0f, new FabricItemSettings()));

    public static final Item Acacia_Pickaxe = registerTools("acacia_pickaxe",
            new PickaxeItem(ModToolsM.Acacia, 1, -2.8f, new FabricItemSettings()));
    public static final Item Acacia_Axe = registerTools("acacia_axe",
            new AxeItem(ModToolsM.Acacia, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Acacia_Shovel = registerTools("acacia_shovel",
            new ShovelItem(ModToolsM.Acacia, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Acacia_Sword = registerTools("acacia_sword",
            new SwordItem(ModToolsM.Acacia, 3, -2.4f, new FabricItemSettings()));
    public static final Item Acacia_Hoe = registerTools("acacia_hoe",
            new HoeItem(ModToolsM.Acacia, 0, -3.0f, new FabricItemSettings()));

    public static final Item Spruce_Pickaxe = registerTools("spruce_pickaxe",
            new PickaxeItem(ModToolsM.Spruce, 1, -2.8f, new FabricItemSettings()));
    public static final Item Spruce_Axe = registerTools("spruce_axe",
            new AxeItem(ModToolsM.Spruce, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Spruce_Shovel = registerTools("spruce_shovel",
            new ShovelItem(ModToolsM.Spruce, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Spruce_Sword = registerTools("spruce_sword",
            new SwordItem(ModToolsM.Spruce, 3, -2.4f, new FabricItemSettings()));
    public static final Item Spruce_Hoe = registerTools("spruce_hoe",
            new HoeItem(ModToolsM.Spruce, 0, -3.0f, new FabricItemSettings()));

    public static final Item Birch_Pickaxe = registerTools("birch_pickaxe",
            new PickaxeItem(ModToolsM.Birch, 1, -2.8f, new FabricItemSettings()));
    public static final Item Birch_Axe = registerTools("birch_axe",
            new AxeItem(ModToolsM.Birch, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Birch_Shovel = registerTools("birch_shovel",
            new ShovelItem(ModToolsM.Birch, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Birch_Sword = registerTools("birch_sword",
            new SwordItem(ModToolsM.Birch, 3, -2.4f, new FabricItemSettings()));
    public static final Item Birch_Hoe = registerTools("birch_hoe",
            new HoeItem(ModToolsM.Birch, 0, -3.0f, new FabricItemSettings()));

    public static final Item Azalea_Pickaxe = registerTools("azalea_pickaxe",
            new PickaxeItem(ModToolsM.Oak, 1, -2.8f, new FabricItemSettings()));
    public static final Item Azalea_Axe = registerTools("azalea_axe",
            new AxeItem(ModToolsM.Oak, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Azalea_Shovel = registerTools("azalea_shovel",
            new ShovelItem(ModToolsM.Oak, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Azalea_Sword = registerTools("azalea_sword",
            new SwordItem(ModToolsM.Oak, 3, -2.4f, new FabricItemSettings()));
    public static final Item Azalea_Hoe = registerTools("azalea_hoe",
            new HoeItem(ModToolsM.Oak, 0, -3.0f, new FabricItemSettings()));

    public static final Item Cherry_Pickaxe = registerTools("cherry_pickaxe",
            new PickaxeItem(ModToolsM.Cherry, 1, -2.8f, new FabricItemSettings()));
    public static final Item Cherry_Axe = registerTools("cherry_axe",
            new AxeItem(ModToolsM.Cherry, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Cherry_Shovel = registerTools("cherry_shovel",
            new ShovelItem(ModToolsM.Cherry, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Cherry_Sword = registerTools("cherry_sword",
            new SwordItem(ModToolsM.Cherry, 3, -2.4f, new FabricItemSettings()));
    public static final Item Cherry_Hoe = registerTools("cherry_hoe",
            new HoeItem(ModToolsM.Cherry, 0, -3.0f, new FabricItemSettings()));

    public static final Item Jungle_Pickaxe = registerTools("jungle_pickaxe",
            new PickaxeItem(ModToolsM.Jungle, 1, -2.8f, new FabricItemSettings()));
    public static final Item Jungle_Axe = registerTools("jungle_axe",
            new AxeItem(ModToolsM.Jungle, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Jungle_Shovel = registerTools("jungle_shovel",
            new ShovelItem(ModToolsM.Jungle, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Jungle_Sword = registerTools("jungle_sword",
            new SwordItem(ModToolsM.Jungle, 3, -2.4f, new FabricItemSettings()));
    public static final Item Jungle_Hoe = registerTools("jungle_hoe",
            new HoeItem(ModToolsM.Jungle, 0, -3.0f, new FabricItemSettings()));

    public static final Item Mangrove_Pickaxe = registerTools("mangrove_pickaxe",
            new PickaxeItem(ModToolsM.Mangrove, 1, -2.8f, new FabricItemSettings()));
    public static final Item Mangrove_Axe = registerTools("mangrove_axe",
            new AxeItem(ModToolsM.Mangrove, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Mangrove_Shovel = registerTools("mangrove_shovel",
            new ShovelItem(ModToolsM.Mangrove, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Mangrove_Sword = registerTools("mangrove_sword",
            new SwordItem(ModToolsM.Mangrove, 3, -2.4f, new FabricItemSettings()));
    public static final Item Mangrove_Hoe = registerTools("mangrove_hoe",
            new HoeItem(ModToolsM.Mangrove, 0,-3.0f ,new FabricItemSettings()));


    //Stone

    


    private static Item registerTools(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MeliusTools.MOD_ID, name), item);
    }

    public static void registerModTools() {
        MeliusTools.LOGGER.info("Regging " + MeliusTools.MOD_ID + "s Tools");
    }

    public static void registerToVanillaItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addBefore(Items.STONE_SHOVEL,

                    ModTools.Oak_Shovel, ModTools.Oak_Pickaxe, ModTools.Oak_Axe, ModTools.Oak_Hoe,
                    ModTools.Spruce_Shovel, ModTools.Spruce_Pickaxe, ModTools.Spruce_Axe, ModTools.Spruce_Hoe,
                    ModTools.Birch_Shovel, ModTools.Birch_Pickaxe, ModTools.Birch_Axe, ModTools.Birch_Hoe,
                    ModTools.Azalea_Shovel, ModTools.Azalea_Pickaxe, ModTools.Azalea_Axe, ModTools.Azalea_Hoe,
                    ModTools.Jungle_Shovel, ModTools.Jungle_Pickaxe, ModTools.Jungle_Axe, ModTools.Jungle_Hoe,
                    ModTools.Acacia_Shovel, ModTools.Acacia_Pickaxe, ModTools.Acacia_Axe, ModTools.Acacia_Hoe,
                    ModTools.DOak_Shovel, ModTools.DOak_Pickaxe, ModTools.DOak_Axe, ModTools.DOak_Hoe,
                    ModTools.Mangrove_Shovel, ModTools.Mangrove_Pickaxe, ModTools.Mangrove_Axe, ModTools.Mangrove_Hoe,
                    ModTools.Cherry_Shovel, ModTools.Cherry_Pickaxe, ModTools.Cherry_Axe, ModTools.Cherry_Hoe
            );
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.addBefore(Items.STONE_SWORD,

                    ModTools.Oak_Sword,
                    ModTools.Spruce_Sword,
                    ModTools.Birch_Sword,
                    ModTools.Azalea_Sword,
                    ModTools.Jungle_Sword,
                    ModTools.Acacia_Sword,
                    ModTools.DOak_Sword,
                    ModTools.Mangrove_Sword,
                    ModTools.Cherry_Sword
            );
        });
    }
}
