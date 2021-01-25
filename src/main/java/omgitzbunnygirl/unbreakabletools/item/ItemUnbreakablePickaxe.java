package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import omgitzbunnygirl.unbreakabletools.UnbreakableTools;

public class ItemUnbreakablePickaxe extends ItemPickaxe {

    public ItemUnbreakablePickaxe(ToolMaterial material, String translationKey, String registryName) {
        super(material);

        setTranslationKey(UnbreakableTools.MODID + "." + translationKey);
        setRegistryName(registryName);
        setCreativeTab(UnbreakableTools.UNBREKABLE_TOOLS_TAB);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

}
