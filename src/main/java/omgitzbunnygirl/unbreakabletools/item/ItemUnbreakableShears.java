package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import omgitzbunnygirl.unbreakabletools.UnbreakableTools;

public class ItemUnbreakableShears extends ItemShears {

    public String translationKey = "unbreakable_shears";
    public String registryName = "unbreakable_shears";

    public ItemUnbreakableShears() {

        setMaxDamage(0);
        setTranslationKey(UnbreakableTools.MODID + "." + translationKey);
        setRegistryName(registryName);
        setCreativeTab(UnbreakableTools.UNBREKABLE_TOOLS_TAB);
        setMaxStackSize(1);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

}
