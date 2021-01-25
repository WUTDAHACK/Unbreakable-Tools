package omgitzbunnygirl.unbreakabletools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import omgitzbunnygirl.unbreakabletools.item.*;
import omgitzbunnygirl.unbreakabletools.materials.UnbreakableMaterials;

@Mod.EventBusSubscriber(modid = UnbreakableTools.MODID)
public class RegistrationHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final Item[] items = {

                // Wooden
                new ItemUnbreakablePickaxe(UnbreakableMaterials.UNBREAKABLE_WOOD, "unbreakable_wooden_pickaxe", "unbreakable_wooden_pickaxe"),
                new ItemUnbreakableHoe(UnbreakableMaterials.UNBREAKABLE_WOOD, "unbreakable_wooden_hoe", "unbreakable_wooden_hoe"),
                new ItemUnbreakableShovel(UnbreakableMaterials.UNBREAKABLE_WOOD, "unbreakable_wooden_shovel", "unbreakable_wooden_shovel"),
                new ItemUnbreakableSword(UnbreakableMaterials.UNBREAKABLE_WOOD, "unbreakable_wooden_sword", "unbreakable_wooden_sword"),
                new ItemUnbreakableAxe(UnbreakableMaterials.UNBREAKABLE_WOOD, 6.0F, -3.2F).setTranslationKey(UnbreakableTools.MODID + "." + "unbreakable_wooden_axe").setRegistryName("unbreakable_wooden_axe"),

                // Stone
                new ItemUnbreakablePickaxe(UnbreakableMaterials.UNBREAKABLE_STONE, "unbreakable_stone_pickaxe", "unbreakable_stone_pickaxe"),
                new ItemUnbreakableHoe(UnbreakableMaterials.UNBREAKABLE_STONE, "unbreakable_stone_hoe", "unbreakable_stone_hoe"),
                new ItemUnbreakableShovel(UnbreakableMaterials.UNBREAKABLE_STONE, "unbreakable_stone_shovel", "unbreakable_stone_shovel"),
                new ItemUnbreakableSword(UnbreakableMaterials.UNBREAKABLE_STONE, "unbreakable_stone_sword", "unbreakable_stone_sword"),
                new ItemUnbreakableAxe(UnbreakableMaterials.UNBREAKABLE_STONE, 8.0F, -3.2F).setTranslationKey(UnbreakableTools.MODID + "." + "unbreakable_stone_axe").setRegistryName("unbreakable_stone_axe"),

                // Iron
                new ItemUnbreakablePickaxe(UnbreakableMaterials.UNBREAKABLE_IRON, "unbreakable_iron_pickaxe", "unbreakable_iron_pickaxe"),
                new ItemUnbreakableHoe(UnbreakableMaterials.UNBREAKABLE_IRON, "unbreakable_iron_hoe", "unbreakable_iron_hoe"),
                new ItemUnbreakableShovel(UnbreakableMaterials.UNBREAKABLE_IRON, "unbreakable_iron_shovel", "unbreakable_iron_shovel"),
                new ItemUnbreakableSword(UnbreakableMaterials.UNBREAKABLE_IRON, "unbreakable_iron_sword", "unbreakable_iron_sword"),
                new ItemUnbreakableAxe(UnbreakableMaterials.UNBREAKABLE_IRON, 8.0F, -3.1F).setTranslationKey(UnbreakableTools.MODID + "." + "unbreakable_iron_axe").setRegistryName("unbreakable_iron_axe"),

                // Diamond
                new ItemUnbreakablePickaxe(UnbreakableMaterials.UNBREAKABLE_DIAMOND, "unbreakable_diamond_pickaxe", "unbreakable_diamond_pickaxe"),
                new ItemUnbreakableHoe(UnbreakableMaterials.UNBREAKABLE_DIAMOND, "unbreakable_diamond_hoe", "unbreakable_diamond_hoe"),
                new ItemUnbreakableShovel(UnbreakableMaterials.UNBREAKABLE_DIAMOND, "unbreakable_diamond_shovel", "unbreakable_diamond_shovel"),
                new ItemUnbreakableSword(UnbreakableMaterials.UNBREAKABLE_DIAMOND, "unbreakable_diamond_sword", "unbreakable_diamond_sword"),
                new ItemUnbreakableAxe(UnbreakableMaterials.UNBREAKABLE_DIAMOND, 8.0F, -3.0F).setTranslationKey(UnbreakableTools.MODID + "." + "unbreakable_diamond_axe").setRegistryName("unbreakable_diamond_axe"),

                // Gold
                new ItemUnbreakablePickaxe(UnbreakableMaterials.UNBREAKABLE_GOLD, "unbreakable_golden_pickaxe", "unbreakable_golden_pickaxe"),
                new ItemUnbreakableHoe(UnbreakableMaterials.UNBREAKABLE_GOLD, "unbreakable_golden_hoe", "unbreakable_golden_hoe"),
                new ItemUnbreakableShovel(UnbreakableMaterials.UNBREAKABLE_GOLD, "unbreakable_golden_shovel", "unbreakable_golden_shovel"),
                new ItemUnbreakableSword(UnbreakableMaterials.UNBREAKABLE_GOLD, "unbreakable_golden_sword", "unbreakable_golden_sword"),
                new ItemUnbreakableAxe(UnbreakableMaterials.UNBREAKABLE_GOLD, 6.0F, -3.0F).setTranslationKey(UnbreakableTools.MODID + "." + "unbreakable_golden_axe").setRegistryName("unbreakable_golden_axe"),

                // Other Tools
                new ItemUnbreakableShears(),
                new ItemUnbreakableFishingRod(),
                new ItemUnbreakableBow()
        };
        event.getRegistry().registerAll(items);
    }
}
