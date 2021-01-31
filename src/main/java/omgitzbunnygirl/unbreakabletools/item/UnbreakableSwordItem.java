package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class UnbreakableSwordItem extends SwordItem {
    public UnbreakableSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean isDamageable() {
        return false;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
