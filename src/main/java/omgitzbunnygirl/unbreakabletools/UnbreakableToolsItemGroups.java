package omgitzbunnygirl.unbreakabletools;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class UnbreakableToolsItemGroups {

    public static final ItemGroup UNBREAKABLE_TOOLS_ITEM_GROUP = new UnbreakableToolsItemGroup(UnbreakableTools.MODID, () -> new ItemStack(Items.ENCHANTED_BOOK.getItem()));

    public static final class UnbreakableToolsItemGroup extends ItemGroup {
        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        public UnbreakableToolsItemGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }

}
