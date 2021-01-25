package omgitzbunnygirl.unbreakabletools.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import omgitzbunnygirl.unbreakabletools.UnbreakableTools;
import omgitzbunnygirl.unbreakabletools.init.ModItems;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = UnbreakableTools.MODID)
public class ModelRegistrationHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        // Wooden
        registerModel(ModItems.UNBREAKABLE_WOODEN_PICKAXE, 0);
        registerModel(ModItems.UNBREAKABLE_WOODEN_AXE, 0);
        registerModel(ModItems.UNBREAKABLE_WOODEN_HOE, 0);
        registerModel(ModItems.UNBREAKABLE_WOODEN_SHOVEL, 0);
        registerModel(ModItems.UNBREAKABLE_WOODEN_SWORD, 0);

        // Stone
        registerModel(ModItems.UNBREAKABLE_STONE_PICKAXE, 0);
        registerModel(ModItems.UNBREAKABLE_STONE_AXE, 0);
        registerModel(ModItems.UNBREAKABLE_STONE_HOE, 0);
        registerModel(ModItems.UNBREAKABLE_STONE_SHOVEL, 0);
        registerModel(ModItems.UNBREAKABLE_STONE_SWORD, 0);

        // Iron
        registerModel(ModItems.UNBREAKABLE_IRON_PICKAXE, 0);
        registerModel(ModItems.UNBREAKABLE_IRON_AXE, 0);
        registerModel(ModItems.UNBREAKABLE_IRON_HOE, 0);
        registerModel(ModItems.UNBREAKABLE_IRON_SHOVEL, 0);
        registerModel(ModItems.UNBREAKABLE_IRON_SWORD, 0);

        // Diamond
        registerModel(ModItems.UNBREAKABLE_DIAMOND_PICKAXE, 0);
        registerModel(ModItems.UNBREAKABLE_DIAMOND_AXE, 0);
        registerModel(ModItems.UNBREAKABLE_DIAMOND_HOE, 0);
        registerModel(ModItems.UNBREAKABLE_DIAMOND_SHOVEL, 0);
        registerModel(ModItems.UNBREAKABLE_DIAMOND_SWORD, 0);

        // Gold
        registerModel(ModItems.UNBREAKABLE_GOLDEN_PICKAXE, 0);
        registerModel(ModItems.UNBREAKABLE_GOLDEN_AXE, 0);
        registerModel(ModItems.UNBREAKABLE_GOLDEN_HOE, 0);
        registerModel(ModItems.UNBREAKABLE_GOLDEN_SHOVEL, 0);
        registerModel(ModItems.UNBREAKABLE_GOLDEN_SWORD, 0);

        // Other Tools
        registerModel(ModItems.UNBREAKABLE_SHEARS, 0);
        registerModel(ModItems.UNBREAKABLE_FISHING_ROD, 0);
        registerModel(ModItems.UNBREAKABLE_BOW, 0);
    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
