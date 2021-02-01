package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;

public class UnbreakableHoeItem extends HoeItem {


    public UnbreakableHoeItem(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, attackSpeedIn, builder);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
