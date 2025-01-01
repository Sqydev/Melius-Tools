package net.sqyd.meliustools.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Rarity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public abstract class RarityChange {

    @Inject(method = "getRarity", at = @At("HEAD"), cancellable = true)
    private void modifyRarity(ItemStack stack, CallbackInfoReturnable<Rarity> cir) {
        if (stack.isOf(Items.WOODEN_AXE)) {
            cir.setReturnValue(Rarity.EPIC);
        }
        if (stack.isOf(Items.WOODEN_HOE)) {
            cir.setReturnValue(Rarity.EPIC);
        }
        if (stack.isOf(Items.WOODEN_SHOVEL)) {
            cir.setReturnValue(Rarity.EPIC);
        }
        if (stack.isOf(Items.WOODEN_PICKAXE)) {
            cir.setReturnValue(Rarity.EPIC);
        }
        if (stack.isOf(Items.WOODEN_SWORD)) {
            cir.setReturnValue(Rarity.EPIC);
        }
    }
}
