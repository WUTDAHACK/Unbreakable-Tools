package omgitzbunnygirl.unbreakabletools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = UnbreakableTools.MODID, version = UnbreakableTools.VERSION, name = UnbreakableTools.NAME)
public class UnbreakableTools
{
    public static final String MODID = "unbreakabletools";
    public static final String VERSION = "0.1.0";
    public static final String NAME = "Unbreakable Tools";

    public static final CreativeTabs UNBREKABLE_TOOLS_TAB = new UnbreakableToolsTab();
}
