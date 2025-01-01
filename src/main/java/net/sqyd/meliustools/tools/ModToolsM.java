package net.sqyd.meliustools.tools;

import net.minecraft.block.Blocks;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolsM implements ToolMaterial {


    //Wooden


    Oak(0, 59, 2.0F, 0.0F, 15,
            () -> Ingredient.ofItems(Blocks.OAK_PLANKS)),
    Spruce(0, 59, 2.0F, 0.0F, 15,
            () -> Ingredient.ofItems(Blocks.SPRUCE_PLANKS)),
    Birch(0, 59, 2.0F, 0.0F, 15,
            () -> Ingredient.ofItems(Blocks.BIRCH_PLANKS)),
    Jungle(0, 59, 2.0F, 0.0F, 15,
            () -> Ingredient.ofItems(Blocks.JUNGLE_PLANKS)),
    Acacia(0, 59, 2.0F, 0.0F, 15,
            () -> Ingredient.ofItems(Blocks.ACACIA_PLANKS)),
    DOak(0, 59, 2.0F, 0.0F, 15,
            () -> Ingredient.ofItems(Blocks.DARK_OAK_PLANKS)),
    Mangrove(0, 59, 2.0F, 0.0F, 15,
            () -> Ingredient.ofItems(Blocks.MANGROVE_PLANKS)),
    Cherry(0, 59, 2.0F, 0.0F, 15,
            () -> Ingredient.ofItems(Blocks.CHERRY_PLANKS)),


    //Stone


    Stone(1, 131, 4.0F, 1.0F, 5,
            () -> Ingredient.ofItems(Blocks.STONE)),
    CobbleStone(1, 131, 4.0F, 1.0F, 5,
            () -> Ingredient.ofItems(Blocks.COBBLESTONE)),
    Deepslate(1, 131, 4.0F, 1.0F, 5,
            () -> Ingredient.ofItems(Blocks.DEEPSLATE)),
    Cobble_Deepslate(1, 131, 4.0F, 1.0F, 5,
            () -> Ingredient.ofItems(Blocks.COBBLED_DEEPSLATE)),
    SandStone(1, 131, 4.0F, 1.0F, 5,
            () -> Ingredient.ofItems(Blocks.SANDSTONE)),
    RedSandStone(1, 131, 4.0F, 1.0F, 5,
            () -> Ingredient.ofItems(Blocks.RED_SANDSTONE)),
    Basalt(1, 131, 4.0F, 1.0F, 5,
            () -> Ingredient.ofItems(Blocks.BASALT)),
    BlackStone(1, 131, 4.0F, 1.0F, 5,
            () -> Ingredient.ofItems(Blocks.BLACKSTONE)),
    EndStone(1, 131, 4.0F, 1.0F, 5,
            () -> Ingredient.ofItems(Blocks.END_STONE)),
    Andesite(1, 131, 4.0F, 1.0F, 5,
            () -> Ingredient.ofItems(Blocks.ANDESITE)),
    Granite(1, 131, 4.0F, 1.0F, 5,
            () -> Ingredient.ofItems(Blocks.GRANITE)),
    Diorite(1, 131, 4.0F, 1.0F, 5,
            () -> Ingredient.ofItems(Blocks.DIORITE));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolsM(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attckDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
