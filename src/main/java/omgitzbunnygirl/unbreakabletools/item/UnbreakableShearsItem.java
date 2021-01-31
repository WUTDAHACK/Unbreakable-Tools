package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;

public class UnbreakableShearsItem extends ShearsItem {
    public UnbreakableShearsItem(Properties builder) {
        super(builder);
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
