package omgitzbunnygirl.unbreakabletools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import omgitzbunnygirl.unbreakabletools.item.*;

@Mod.EventBusSubscriber(modid = UnbreakableTools.MODID)
public class RegistrationHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnbreakableTools.MODID);

    // Tools
    // Wooden
    public static final RegistryObject<Item> UNBREAKABLE_WOODEN_PICKAXE = ITEMS.register("unbreakable_wooden_pickaxe", () -> new UnbreakablePickaxeItem(ItemTier.WOOD, 1, -2.8F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_WOODEN_AXE = ITEMS.register("unbreakable_wooden_axe", () -> new UnbreakableAxeItem(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_WOODEN_HOE = ITEMS.register("unbreakable_wooden_hoe", () -> new UnbreakableHoeItem(ItemTier.WOOD,  0, -3.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_WOODEN_SHOVEL = ITEMS.register("unbreakable_wooden_shovel", () -> new UnbreakableShovelItem(ItemTier.WOOD, 1.5F, -3.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_WOODEN_SWORD = ITEMS.register("unbreakable_wooden_sword", () -> new UnbreakableSwordItem(ItemTier.WOOD, 3, -2.4F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));

    // Stone
    public static final RegistryObject<Item> UNBREAKABLE_STONE_PICKAXE = ITEMS.register("unbreakable_stone_pickaxe", () -> new UnbreakablePickaxeItem(ItemTier.STONE, 1, -2.8F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_STONE_AXE = ITEMS.register("unbreakable_stone_axe", () -> new UnbreakableAxeItem(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_STONE_HOE = ITEMS.register("unbreakable_stone_hoe", () -> new UnbreakableHoeItem(ItemTier.STONE,  1, -2.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_STONE_SHOVEL = ITEMS.register("unbreakable_stone_shovel", () -> new UnbreakableShovelItem(ItemTier.STONE, 1.5F, -3.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_STONE_SWORD = ITEMS.register("unbreakable_stone_sword", () -> new UnbreakableSwordItem(ItemTier.STONE, 3, -2.4F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));

    // Iron
    public static final RegistryObject<Item> UNBREAKABLE_IRON_PICKAXE = ITEMS.register("unbreakable_iron_pickaxe", () -> new UnbreakablePickaxeItem(ItemTier.IRON, 1, -2.8F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_IRON_AXE = ITEMS.register("unbreakable_iron_axe", () -> new UnbreakableAxeItem(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_IRON_HOE = ITEMS.register("unbreakable_iron_hoe", () -> new UnbreakableHoeItem(ItemTier.IRON,  -2, -1.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_IRON_SHOVEL = ITEMS.register("unbreakable_iron_shovel", () -> new UnbreakableShovelItem(ItemTier.IRON, 1.5F, -3.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_IRON_SWORD = ITEMS.register("unbreakable_iron_sword", () -> new UnbreakableSwordItem(ItemTier.IRON, 3, -2.4F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));

    // Diamond
    public static final RegistryObject<Item> UNBREAKABLE_DIAMOND_PICKAXE = ITEMS.register("unbreakable_diamond_pickaxe", () -> new UnbreakablePickaxeItem(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_DIAMOND_AXE = ITEMS.register("unbreakable_diamond_axe", () -> new UnbreakableAxeItem(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_DIAMOND_HOE = ITEMS.register("unbreakable_diamond_hoe", () -> new UnbreakableHoeItem(ItemTier.DIAMOND,  -3, -0.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_DIAMOND_SHOVEL = ITEMS.register("unbreakable_diamond_shovel", () -> new UnbreakableShovelItem(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_DIAMOND_SWORD = ITEMS.register("unbreakable_diamond_sword", () -> new UnbreakableSwordItem(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));

    // Gold
    public static final RegistryObject<Item> UNBREAKABLE_GOLDEN_PICKAXE = ITEMS.register("unbreakable_golden_pickaxe", () -> new UnbreakablePickaxeItem(ItemTier.GOLD, 1, -2.8F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_GOLDEN_AXE = ITEMS.register("unbreakable_golden_axe", () -> new UnbreakableAxeItem(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_GOLDEN_HOE = ITEMS.register("unbreakable_golden_hoe", () -> new UnbreakableHoeItem(ItemTier.GOLD,  0, -3.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_GOLDEN_SHOVEL = ITEMS.register("unbreakable_golden_shovel", () -> new UnbreakableShovelItem(ItemTier.GOLD, 1.5F, -3.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_GOLDEN_SWORD = ITEMS.register("unbreakable_golden_sword", () -> new UnbreakableSwordItem(ItemTier.GOLD, 3, -2.4F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));

    // Netherite
    public static final RegistryObject<Item> UNBREAKABLE_NETHERITE_PICKAXE = ITEMS.register("unbreakable_netherite_pickaxe", () -> new UnbreakablePickaxeItem(ItemTier.NETHERITE, 1, -2.8F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_NETHERITE_AXE = ITEMS.register("unbreakable_netherite_axe", () -> new UnbreakableAxeItem(ItemTier.NETHERITE, 5.0F, -3.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_NETHERITE_HOE = ITEMS.register("unbreakable_netherite_hoe", () -> new UnbreakableHoeItem(ItemTier.NETHERITE,  -4, 0.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_NETHERITE_SHOVEL = ITEMS.register("unbreakable_netherite_shovel", () -> new UnbreakableShovelItem(ItemTier.NETHERITE, 1.5F, -3.0F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));
    public static final RegistryObject<Item> UNBREAKABLE_NETHERITE_SWORD = ITEMS.register("unbreakable_netherite_sword", () -> new UnbreakableSwordItem(ItemTier.NETHERITE, 3, -2.4F, (new Item.Properties()).group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP)));

    // Other Tools
    public static final RegistryObject<Item> UNBREAKABLE_BOW = ITEMS.register("unbreakable_bow", () -> new UnbreakableBowItem((new Item.Properties().group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP).maxDamage(2147483647))));
    public static final RegistryObject<Item> UNBREAKABLE_FISHING_ROD = ITEMS.register("unbreakable_fishing_rod", () -> new UnbreakableFishingRodItem(new Item.Properties().group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP).maxDamage(2147483647)));
    public static final RegistryObject<Item> UNBREAKABLE_SHEARS = ITEMS.register("unbreakable_shears", () -> new UnbreakableShearsItem(new Item.Properties().group(UnbreakableToolsItemGroups.UNBREAKABLE_TOOLS_ITEM_GROUP).maxDamage(2147483647)));
}
