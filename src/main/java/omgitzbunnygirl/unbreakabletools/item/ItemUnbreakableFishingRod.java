package omgitzbunnygirl.unbreakabletools.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import omgitzbunnygirl.unbreakabletools.UnbreakableTools;

import javax.annotation.Nullable;

public class ItemUnbreakableFishingRod extends ItemFishingRod {
    public String translationKey = "unbreakable_fishing_rod";
    public String registryName = "unbreakable_fishing_rod";

    public ItemUnbreakableFishingRod() {

        setTranslationKey(UnbreakableTools.MODID + "." + translationKey);
        setRegistryName(registryName);
        setCreativeTab(UnbreakableTools.UNBREKABLE_TOOLS_TAB);
        setMaxDamage(2147483647);
        setMaxStackSize(1);
        this.addPropertyOverride(new ResourceLocation("cast"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                if (entityIn == null)
                {
                    return 0.0F;
                }
                else
                {
                    boolean flag = entityIn.getHeldItemMainhand() == stack;
                    boolean flag1 = entityIn.getHeldItemOffhand() == stack;

                    if (entityIn.getHeldItemMainhand().getItem() instanceof ItemUnbreakableFishingRod)
                    {
                        flag1 = false;
                    }

                    return (flag || flag1) && entityIn instanceof EntityPlayer && ((EntityPlayer)entityIn).fishEntity != null ? 1.0F : 0.0F;
                }
            }
        });

    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
