package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;

public class UnbreakableHoeItem extends HoeItem {
    public UnbreakableHoeItem(IItemTier itemTier, int attackDamage, float attackSpeed, Properties properties) {
        super(itemTier, attackDamage, attackSpeed, properties);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
