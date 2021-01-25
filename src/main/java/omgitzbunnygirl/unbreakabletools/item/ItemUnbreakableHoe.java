package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import omgitzbunnygirl.unbreakabletools.UnbreakableTools;

public class ItemUnbreakableHoe extends ItemHoe {
    public ItemUnbreakableHoe(Item.ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);

        setTranslationKey(UnbreakableTools.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(UnbreakableTools.UNBREKABLE_TOOLS_TAB);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

}
