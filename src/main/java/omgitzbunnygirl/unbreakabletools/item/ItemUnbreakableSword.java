package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import omgitzbunnygirl.unbreakabletools.UnbreakableTools;

public class ItemUnbreakableSword extends ItemSword {
    public ItemUnbreakableSword (Item.ToolMaterial material, String unlocalizedName, String registryName) {
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
