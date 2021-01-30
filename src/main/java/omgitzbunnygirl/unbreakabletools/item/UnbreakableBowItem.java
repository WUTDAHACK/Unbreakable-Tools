package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;

public class UnbreakableBowItem extends BowItem {
    public UnbreakableBowItem(Properties builder) {
        super(builder);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
