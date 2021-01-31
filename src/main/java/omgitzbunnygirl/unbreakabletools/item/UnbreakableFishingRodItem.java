package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;

public class UnbreakableFishingRodItem extends FishingRodItem {
    public UnbreakableFishingRodItem(Properties builder) {
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
