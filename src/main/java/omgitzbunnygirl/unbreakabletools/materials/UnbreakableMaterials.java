package omgitzbunnygirl.unbreakabletools.materials;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import omgitzbunnygirl.unbreakabletools.UnbreakableTools;

public class UnbreakableMaterials {

    public static final Item.ToolMaterial UNBREAKABLE_WOOD = EnumHelper.addToolMaterial(UnbreakableTools.MODID + "." + "unbreakable_wood", 0, 2147483647, 2.0F, 0.0F, 15);
    public static final Item.ToolMaterial UNBREAKABLE_STONE = EnumHelper.addToolMaterial(UnbreakableTools.MODID + "." + "unbreakable_stone", 1, 2147483647, 4.0F, 1.0F, 5);
    public static final Item.ToolMaterial UNBREAKABLE_IRON = EnumHelper.addToolMaterial(UnbreakableTools.MODID + "." + "unbreakable_iron", 2, 2147483647, 6.0F, 2.0F, 14);
    public static final Item.ToolMaterial UNBREAKABLE_DIAMOND = EnumHelper.addToolMaterial(UnbreakableTools.MODID + "." + "unbreakable_diamond", 3, 2147483647, 8.0F, 3.0F, 10);
    public static final Item.ToolMaterial UNBREAKABLE_GOLD = EnumHelper.addToolMaterial(UnbreakableTools.MODID + "." + "unbreakable_gold", 5, 2147483647, 12.0F, 0.0F, 22);

}
