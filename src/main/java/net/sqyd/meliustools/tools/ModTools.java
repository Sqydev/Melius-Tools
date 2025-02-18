package net.sqyd.meliustools.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sqyd.meliustools.MeliusTools;

public class ModTools {


    //Handles
        //Sticks
    public static final Item Oak_Stick = registerItems("oak_stick",
            new Item(new FabricItemSettings()));
    public static final Item DOak_Stick = registerItems("doak_stick",
            new Item(new FabricItemSettings()));
    public static final Item Acacia_Stick = registerItems("acacia_stick",
            new Item(new FabricItemSettings()));
    public static final Item Spruce_Stick = registerItems("spruce_stick",
            new Item(new FabricItemSettings()));
    public static final Item Birch_Stick = registerItems("birch_stick",
            new Item(new FabricItemSettings()));
    public static final Item Azalea_Stick = registerItems("azalea_stick",
            new Item(new FabricItemSettings()));
    public static final Item Cherry_Stick = registerItems("cherry_stick",
            new Item(new FabricItemSettings()));
    public static final Item Jungle_Stick = registerItems("jungle_stick",
            new Item(new FabricItemSettings()));
    public static final Item Mangrove_Stick = registerItems("mangrove_stick",
            new Item(new FabricItemSettings()));
    public static final Item Crimson_Stick = registerItems("crimson_stick",
            new Item(new FabricItemSettings()));
    public static final Item Warped_Stick = registerItems("warped_stick",
            new Item(new FabricItemSettings()));

    //Heads


    public static final Item Oak_Pickaxe_Head = registerItems("oak_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item Oak_Axe_Head = registerItems("oak_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item Oak_Shovel_Head = registerItems("oak_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item Oak_Sword_Head = registerItems("oak_sword_head",
            new Item(new FabricItemSettings()));
    public static final Item Oak_Hoe_Head = registerItems("oak_hoe_head",
            new Item(new FabricItemSettings()));

    public static final Item DOak_Pickaxe_Head = registerItems("doak_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item DOak_Axe_Head = registerItems("doak_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item DOak_Shovel_Head = registerItems("doak_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item DOak_Sword_Head = registerItems("doak_sword_head",
            new Item(new FabricItemSettings()));
    public static final Item DOak_Hoe_Head = registerItems("doak_hoe_head",
            new Item(new FabricItemSettings()));

    public static final Item Acacia_Pickaxe_Head = registerItems("acacia_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item Acacia_Axe_Head = registerItems("acacia_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item Acacia_Shovel_Head = registerItems("acacia_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item Acacia_Sword_Head = registerItems("acacia_sword_head",
            new Item(new FabricItemSettings()));
    public static final Item Acacia_Hoe_Head = registerItems("acacia_hoe_head",
            new Item(new FabricItemSettings()));

    public static final Item Spruce_Pickaxe_Head = registerItems("spruce_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item Spruce_Axe_Head = registerItems("spruce_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item Spruce_Shovel_Head = registerItems("spruce_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item Spruce_Sword_Head = registerItems("spruce_sword_head",
            new Item(new FabricItemSettings()));
    public static final Item Spruce_Hoe_Head = registerItems("spruce_hoe_head",
            new Item(new FabricItemSettings()));

    public static final Item Birch_Pickaxe_Head = registerItems("birch_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item Birch_Axe_Head = registerItems("birch_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item Birch_Shovel_Head = registerItems("birch_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item Birch_Sword_Head = registerItems("birch_sword_head",
            new Item(new FabricItemSettings()));
    public static final Item Birch_Hoe_Head = registerItems("birch_hoe_head",
            new Item(new FabricItemSettings()));

    public static final Item Azalea_Pickaxe_Head = registerItems("azalea_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item Azalea_Axe_Head = registerItems("azalea_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item Azalea_Shovel_Head = registerItems("azalea_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item Azalea_Sword_Head = registerItems("azalea_sword_head",
            new Item(new FabricItemSettings()));
    public static final Item Azalea_Hoe_Head = registerItems("azalea_hoe_head",
            new Item(new FabricItemSettings()));

    public static final Item Cherry_Pickaxe_Head = registerItems("cherry_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item Cherry_Axe_Head = registerItems("cherry_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item Cherry_Shovel_Head = registerItems("cherry_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item Cherry_Sword_Head = registerItems("cherry_sword_head",
            new Item(new FabricItemSettings()));
    public static final Item Cherry_Hoe_Head = registerItems("cherry_hoe_head",
            new Item(new FabricItemSettings()));

    public static final Item Jungle_Pickaxe_Head = registerItems("jungle_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item Jungle_Axe_Head = registerItems("jungle_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item Jungle_Shovel_Head = registerItems("jungle_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item Jungle_Sword_Head = registerItems("jungle_sword_head",
            new Item(new FabricItemSettings()));
    public static final Item Jungle_Hoe_Head = registerItems("jungle_hoe_head",
            new Item(new FabricItemSettings()));

    public static final Item Mangrove_Pickaxe_Head = registerItems("mangrove_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item Mangrove_Axe_Head = registerItems("mangrove_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item Mangrove_Shovel_Head = registerItems("mangrove_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item Mangrove_Sword_Head = registerItems("mangrove_sword_head",
            new Item(new FabricItemSettings()));
    public static final Item Mangrove_Hoe_Head = registerItems("mangrove_hoe_head",
            new Item(new FabricItemSettings()));

    public static final Item Crimson_Pickaxe_Head = registerItems("crimson_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item Crimson_Axe_Head = registerItems("crimson_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item Crimson_Shovel_Head = registerItems("crimson_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item Crimson_Sword_Head = registerItems("crimson_sword_head",
            new Item(new FabricItemSettings()));
    public static final Item Crimson_Hoe_Head = registerItems("crimson_hoe_head",
            new Item(new FabricItemSettings()));

    public static final Item Warped_Pickaxe_Head = registerItems("warped_pickaxe_head",
            new Item(new FabricItemSettings()));
    public static final Item Warped_Axe_Head = registerItems("warped_axe_head",
            new Item(new FabricItemSettings()));
    public static final Item Warped_Shovel_Head = registerItems("warped_shovel_head",
            new Item(new FabricItemSettings()));
    public static final Item Warped_Sword_Head = registerItems("warped_sword_head",
            new Item(new FabricItemSettings()));
    public static final Item Warped_Hoe_Head = registerItems("warped_hoe_head",
            new Item(new FabricItemSettings()));
    
    //Tools

        //Wooden


    public static final Item Oak_Pickaxe = registerItems("oak_pickaxe",
            new PickaxeItem(ModToolsM.Oak, 1, -2.8f, new FabricItemSettings()));
    public static final Item Oak_Axe = registerItems("oak_axe",
            new AxeItem(ModToolsM.Oak, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Oak_Shovel = registerItems("oak_shovel",
            new ShovelItem(ModToolsM.Oak, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Oak_Sword = registerItems("oak_sword",
            new SwordItem(ModToolsM.Oak, 3, -2.4f, new FabricItemSettings()));
    public static final Item Oak_Hoe = registerItems("oak_hoe",
            new HoeItem(ModToolsM.Oak, 0, -3.0f, new FabricItemSettings()));

    public static final Item DOak_Pickaxe = registerItems("doak_pickaxe",
            new PickaxeItem(ModToolsM.DOak, 1, -2.8f, new FabricItemSettings()));
    public static final Item DOak_Axe = registerItems("doak_axe",
            new AxeItem(ModToolsM.DOak, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item DOak_Shovel = registerItems("doak_shovel",
            new ShovelItem(ModToolsM.DOak, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item DOak_Sword = registerItems("doak_sword",
            new SwordItem(ModToolsM.DOak, 3, -2.4f, new FabricItemSettings()));
    public static final Item DOak_Hoe = registerItems("doak_hoe",
            new HoeItem(ModToolsM.DOak, 0, -3.0f, new FabricItemSettings()));

    public static final Item Acacia_Pickaxe = registerItems("acacia_pickaxe",
            new PickaxeItem(ModToolsM.Acacia, 1, -2.8f, new FabricItemSettings()));
    public static final Item Acacia_Axe = registerItems("acacia_axe",
            new AxeItem(ModToolsM.Acacia, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Acacia_Shovel = registerItems("acacia_shovel",
            new ShovelItem(ModToolsM.Acacia, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Acacia_Sword = registerItems("acacia_sword",
            new SwordItem(ModToolsM.Acacia, 3, -2.4f, new FabricItemSettings()));
    public static final Item Acacia_Hoe = registerItems("acacia_hoe",
            new HoeItem(ModToolsM.Acacia, 0, -3.0f, new FabricItemSettings()));

    public static final Item Spruce_Pickaxe = registerItems("spruce_pickaxe",
            new PickaxeItem(ModToolsM.Spruce, 1, -2.8f, new FabricItemSettings()));
    public static final Item Spruce_Axe = registerItems("spruce_axe",
            new AxeItem(ModToolsM.Spruce, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Spruce_Shovel = registerItems("spruce_shovel",
            new ShovelItem(ModToolsM.Spruce, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Spruce_Sword = registerItems("spruce_sword",
            new SwordItem(ModToolsM.Spruce, 3, -2.4f, new FabricItemSettings()));
    public static final Item Spruce_Hoe = registerItems("spruce_hoe",
            new HoeItem(ModToolsM.Spruce, 0, -3.0f, new FabricItemSettings()));

    public static final Item Birch_Pickaxe = registerItems("birch_pickaxe",
            new PickaxeItem(ModToolsM.Birch, 1, -2.8f, new FabricItemSettings()));
    public static final Item Birch_Axe = registerItems("birch_axe",
            new AxeItem(ModToolsM.Birch, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Birch_Shovel = registerItems("birch_shovel",
            new ShovelItem(ModToolsM.Birch, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Birch_Sword = registerItems("birch_sword",
            new SwordItem(ModToolsM.Birch, 3, -2.4f, new FabricItemSettings()));
    public static final Item Birch_Hoe = registerItems("birch_hoe",
            new HoeItem(ModToolsM.Birch, 0, -3.0f, new FabricItemSettings()));

    public static final Item Azalea_Pickaxe = registerItems("azalea_pickaxe",
            new PickaxeItem(ModToolsM.Oak, 1, -2.8f, new FabricItemSettings()));
    public static final Item Azalea_Axe = registerItems("azalea_axe",
            new AxeItem(ModToolsM.Oak, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Azalea_Shovel = registerItems("azalea_shovel",
            new ShovelItem(ModToolsM.Oak, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Azalea_Sword = registerItems("azalea_sword",
            new SwordItem(ModToolsM.Oak, 3, -2.4f, new FabricItemSettings()));
    public static final Item Azalea_Hoe = registerItems("azalea_hoe",
            new HoeItem(ModToolsM.Oak, 0, -3.0f, new FabricItemSettings()));

    public static final Item Cherry_Pickaxe = registerItems("cherry_pickaxe",
            new PickaxeItem(ModToolsM.Cherry, 1, -2.8f, new FabricItemSettings()));
    public static final Item Cherry_Axe = registerItems("cherry_axe",
            new AxeItem(ModToolsM.Cherry, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Cherry_Shovel = registerItems("cherry_shovel",
            new ShovelItem(ModToolsM.Cherry, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Cherry_Sword = registerItems("cherry_sword",
            new SwordItem(ModToolsM.Cherry, 3, -2.4f, new FabricItemSettings()));
    public static final Item Cherry_Hoe = registerItems("cherry_hoe",
            new HoeItem(ModToolsM.Cherry, 0, -3.0f, new FabricItemSettings()));

    public static final Item Jungle_Pickaxe = registerItems("jungle_pickaxe",
            new PickaxeItem(ModToolsM.Jungle, 1, -2.8f, new FabricItemSettings()));
    public static final Item Jungle_Axe = registerItems("jungle_axe",
            new AxeItem(ModToolsM.Jungle, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Jungle_Shovel = registerItems("jungle_shovel",
            new ShovelItem(ModToolsM.Jungle, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Jungle_Sword = registerItems("jungle_sword",
            new SwordItem(ModToolsM.Jungle, 3, -2.4f, new FabricItemSettings()));
    public static final Item Jungle_Hoe = registerItems("jungle_hoe",
            new HoeItem(ModToolsM.Jungle, 0, -3.0f, new FabricItemSettings()));

    public static final Item Mangrove_Pickaxe = registerItems("mangrove_pickaxe",
            new PickaxeItem(ModToolsM.Mangrove, 1, -2.8f, new FabricItemSettings()));
    public static final Item Mangrove_Axe = registerItems("mangrove_axe",
            new AxeItem(ModToolsM.Mangrove, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Mangrove_Shovel = registerItems("mangrove_shovel",
            new ShovelItem(ModToolsM.Mangrove, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Mangrove_Sword = registerItems("mangrove_sword",
            new SwordItem(ModToolsM.Mangrove, 3, -2.4f, new FabricItemSettings()));
    public static final Item Mangrove_Hoe = registerItems("mangrove_hoe",
            new HoeItem(ModToolsM.Mangrove, 0, -3.0f ,new FabricItemSettings()));

    public static final Item Crimson_Pickaxe = registerItems("crimson_pickaxe",
            new PickaxeItem(ModToolsM.Crimson, 1, -2.8f, new FabricItemSettings()));
    public static final Item Crimson_Axe = registerItems("crimson_axe",
            new AxeItem(ModToolsM.Crimson, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Crimson_Shovel = registerItems("crimson_shovel",
            new ShovelItem(ModToolsM.Crimson, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Crimson_Sword = registerItems("crimson_sword",
            new SwordItem(ModToolsM.Crimson, 3, -2.4f, new FabricItemSettings()));
    public static final Item Crimson_Hoe = registerItems("crimson_hoe",
            new HoeItem(ModToolsM.Crimson, 0, -3.0f, new FabricItemSettings()));

    public static final Item Warped_Pickaxe = registerItems("warped_pickaxe",
            new PickaxeItem(ModToolsM.Warped, 1, -2.8f, new FabricItemSettings()));
    public static final Item Warped_Axe = registerItems("warped_axe",
            new AxeItem(ModToolsM.Warped, 6.0f, 3.2f, new FabricItemSettings()));
    public static final Item Warped_Shovel = registerItems("warped_shovel",
            new ShovelItem(ModToolsM.Warped, 1.5f, 3.0f, new FabricItemSettings()));
    public static final Item Warped_Sword = registerItems("warped_sword",
            new SwordItem(ModToolsM.Warped, 3, -2.4f, new FabricItemSettings()));
    public static final Item Warped_Hoe = registerItems("warped_hoe",
            new HoeItem(ModToolsM.Warped, 0,-3.0f ,new FabricItemSettings()));


    //Stone

    


    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MeliusTools.MOD_ID, name), item);
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
                    ModTools.Cherry_Shovel, ModTools.Cherry_Pickaxe, ModTools.Cherry_Axe, ModTools.Cherry_Hoe,
                    ModTools.Crimson_Shovel, ModTools.Crimson_Pickaxe, ModTools.Crimson_Axe, ModTools.Crimson_Hoe,
                    ModTools.Warped_Shovel, ModTools.Warped_Pickaxe, ModTools.Warped_Axe, ModTools.Warped_Hoe
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
                    ModTools.Cherry_Sword,
                    ModTools.Crimson_Sword,
                    ModTools.Warped_Sword
            );
        });
    }
}
