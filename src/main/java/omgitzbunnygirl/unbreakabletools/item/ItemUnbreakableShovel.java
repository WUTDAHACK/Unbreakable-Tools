package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import omgitzbunnygirl.unbreakabletools.UnbreakableTools;

public class ItemUnbreakableShovel extends ItemSpade {
    public ItemUnbreakableShovel(Item.ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);

        setMaxDamage(0);
        setTranslationKey(UnbreakableTools.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(UnbreakableTools.UNBREKABLE_TOOLS_TAB);
    }



    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

}

