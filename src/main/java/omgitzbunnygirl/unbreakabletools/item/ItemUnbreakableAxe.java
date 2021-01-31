package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import omgitzbunnygirl.unbreakabletools.UnbreakableTools;

public class ItemUnbreakableAxe extends ItemAxe {
    public ItemUnbreakableAxe(Item.ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setCreativeTab(UnbreakableTools.UNBREKABLE_TOOLS_TAB);
        setMaxDamage(0);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
