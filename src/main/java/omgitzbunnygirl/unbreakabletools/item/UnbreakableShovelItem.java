package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;

public class UnbreakableShovelItem extends ShovelItem {
    public UnbreakableShovelItem(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
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
