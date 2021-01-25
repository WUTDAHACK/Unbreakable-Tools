package omgitzbunnygirl.unbreakabletools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class UnbreakableToolsTab extends CreativeTabs {

    public UnbreakableToolsTab() {
        super(UnbreakableTools.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.ENCHANTED_BOOK);
    }
}
