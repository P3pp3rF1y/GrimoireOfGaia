package gaia.init;

import gaia.Gaia;
import gaia.GaiaReference;
import gaia.entity.passive.EntityGaiaNPCCreeperGirl;
import gaia.entity.passive.EntityGaiaNPCEnderGirl;
import gaia.entity.passive.EntityGaiaNPCHolstaurus;
import gaia.entity.passive.EntityGaiaNPCSlimeGirl;
import gaia.entity.passive.EntityGaiaNPCTrader;
import gaia.entity.passive.EntityGaiaNPCWeresheep;
import gaia.items.ItemAccessoryCursed;
import gaia.items.ItemAccessoryRingHaste;
import gaia.items.ItemAccessoryRingJump;
import gaia.items.ItemAccessoryRingNight;
import gaia.items.ItemAccessoryRingSpeed;
import gaia.items.ItemAccessorySkull;
import gaia.items.ItemAccessoryTrinketLevitation;
import gaia.items.ItemAccessoryTrinketPoison;
import gaia.items.ItemAccessoryTrinketWither;
import gaia.items.ItemBagArrow;
import gaia.items.ItemBagBook;
import gaia.items.ItemBagOre;
import gaia.items.ItemBagRecord;
import gaia.items.ItemBase;
import gaia.items.ItemBox;
import gaia.items.ItemBoxDiamond;
import gaia.items.ItemBoxGold;
import gaia.items.ItemBoxIron;
import gaia.items.ItemBoxOld;
import gaia.items.ItemCard;
import gaia.items.ItemChest;
import gaia.items.ItemFoodBase;
import gaia.items.ItemFoodCoalfish;
import gaia.items.ItemFoodMandrake;
import gaia.items.ItemFoodNetherWart;
import gaia.items.ItemFoodPieAppleGold;
import gaia.items.ItemFoodPieMandrake;
import gaia.items.ItemFoodPieMeat;
import gaia.items.ItemFoodRoot;
import gaia.items.ItemFoodRottenHeart;
import gaia.items.ItemFoodSmallAppleGold;
import gaia.items.ItemFoodWither;
import gaia.items.ItemMiscBook;
import gaia.items.ItemMiscCurrency;
import gaia.items.ItemMiscExperience;
import gaia.items.ItemMiscFurnaceFuel;
import gaia.items.ItemMiscGigaGear;
import gaia.items.ItemMiscRing;
import gaia.items.ItemMiscSoulFiery;
import gaia.items.ItemMiscSoulFire;
import gaia.items.ItemShard;
import gaia.items.ItemShieldProp;
import gaia.items.ItemSpawn;
import gaia.items.ItemSpawnNPC;
import gaia.items.ItemSpawnTame;
import gaia.items.ItemWeaponBook;
import gaia.items.ItemWeaponBookBattle;
import gaia.items.ItemWeaponBookBuff;
import gaia.items.ItemWeaponBookEnder;
import gaia.items.ItemWeaponBookFreezing;
import gaia.items.ItemWeaponBookHunger;
import gaia.items.ItemWeaponBookMetal;
import gaia.items.ItemWeaponBookNature;
import gaia.items.ItemWeaponBookNightmare;
import gaia.items.ItemWeaponBookWither;
import gaia.items.ItemWeaponDebug;
import gaia.items.ItemWeaponFanFire;
import gaia.items.ItemWeaponFanIce;
import gaia.items.ItemWeaponProp;
import gaia.items.ItemWeaponPropEnchanted;
import gaia.items.ItemWeaponPropProjectile;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

//Modify ClientProxy when adding metadata items
@GameRegistry.ObjectHolder(GaiaReference.MOD_ID)
public class GaiaItems {
	public static final Item SHARD = Items.AIR;
	public static final Item WEAPON_PROP_PROJECTILE = Items.AIR;
	public static final Item MISC_BOOK = Items.AIR;
	public static final Item BOX = Items.AIR;
	public static final Item WEAPON_PROP = Items.AIR;
	public static final Item BAG_BOOK = Items.AIR;
	public static final Item WEAPON_BOOK_ENDER = Items.AIR;
	public static final Item SPAWN_ENDER_GIRL = Items.AIR;
	public static final Item FOOD_MEAT = Items.AIR;
	public static final Item BOX_IRON = Items.AIR;
	public static final Item BAG_ARROW = Items.AIR;
	public static final Item BOX_GOLD = Items.AIR;
	public static final Item MISC_SOUL_FIERY = Items.AIR;
	public static final Item WEAPON_BOOK_NIGHTMARE = Items.AIR;
	public static final Item SHIELD_PROP = Items.AIR;
	public static final Item CHEST = Items.AIR;
	public static final Item SPAWN_CREEPER_GIRL = Items.AIR;
	public static final Item FOOD_ROOT = Items.AIR;
	public static final Item MISC_FUR = Items.AIR;
	public static final Item FOOD_COALFISH = Items.AIR;
	public static final Item BOX_OLD = Items.AIR;
	public static final Item SPAWN_TAME = Items.AIR;
	public static final Item MISC_GIGA_GEAR = Items.AIR;
	public static final Item WEAPON_BOOK_WITHER = Items.AIR;
	public static final Item SPAWN = Items.AIR;
	public static final Item SPAWN_HOLSTAURUS = Items.AIR;
	public static final Item WEAPON_BOOK_HUNGER = Items.AIR;
	public static final Item SPAWN_TRADER = Items.AIR;
	public static final Item BAG_RECORD = Items.AIR;
	public static final Item MISC_FURNACE_FUEL = Items.AIR;
	public static final Item FOOD_NETHER_WART = Items.AIR;
	public static final Item SPAWN_SLIME_GIRL = Items.AIR;
	public static final Item ACCESSORY_TRINKET_WITHER = Items.AIR;
	public static final Item MISC_CURRENCY = Items.AIR;
	public static final Item FOOD_ROTTEN_HEART = Items.AIR;
	public static final Item FOOD_MANDRAKE = Items.AIR;
	public static final Item WEAPON_PROP_ENCHANTED = Items.AIR;
	public static final Item FOOD_SMALL_APPLE_GOLD = Items.AIR;
	public static final Item BOX_DIAMOND = Items.AIR;
	public static final Item ACCESSORY_CURSED = Items.AIR;
	public static final Item MISC_RING = Items.AIR;
	public static final Item WEAPON_BOOK_BATTLE = Items.AIR;
	public static final Item WEAPON_FAN_FIRE = Items.AIR;
	public static final Item WEAPON_BOOK_NATURE = Items.AIR;
	public static final Item ACCESSORY_TRINKET_POISON = Items.AIR;
	public static final Item FOOD_WITHER = Items.AIR;
	public static final Item WEAPON_BOOK_FREEZING = Items.AIR;
	public static final Item WEAPON_FAN_ICE = Items.AIR;
	public static final Item SPAWN_WERESHEEP = Items.AIR;
	@SuppressWarnings("WeakerAccess") //needs to be public static final for objectholder code to work
	public static final Item MISC_EXPERIENCE = Items.AIR;
	public static final Item MISC_QUILL = Items.AIR;
	public static final Item MISC_SOUL_FIRE = Items.AIR;
	public static final Item BOOK_BUFF = Items.AIR;
	public static final Item BAG_ORE = Items.AIR;
	public static final Item WEAPON_BOOK = Items.AIR;
	public static final Item WEAPON_BOOK_METAL = Items.AIR;
	public static final Item ACCESSORY_TRINKET_LEVITATION = Items.AIR;
	public static final Item FOOD_PIE_MANDRAKE = Items.AIR;
	public static final Item FOOD_PIE_MEAT = Items.AIR;
	public static final Item FOOD_PIE_APPLE_GOLD = Items.AIR;
	public static final Item ACCESSORY_RING_SPEED = Items.AIR;
	public static final Item ACCESSORY_RING_HASTE = Items.AIR;
	public static final Item ACCESSORY_RING_JUMP = Items.AIR;
	public static final Item ACCESSORY_RING_NIGHT = Items.AIR;
	public static final Item ACCESSORY_SKULL = Items.AIR;

	private GaiaItems() {}

	@Mod.EventBusSubscriber(modid = GaiaReference.MOD_ID)
	@SuppressWarnings("unused")
	public static class RegistrationHandler {
		private RegistrationHandler() {}

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			Gaia.LOGGER.info("Registering items...");

			final IForgeRegistry<Item> registry = event.getRegistry();

			registry.register(new ItemShard());
			registry.register(new ItemFoodBase("food_meat", 6, 0.6F, true));
			registry.register(new ItemFoodRottenHeart());
			registry.register(new ItemFoodRoot());
			registry.register(new ItemFoodCoalfish());
			registry.register(new ItemFoodNetherWart());
			registry.register(new ItemFoodSmallAppleGold());
			registry.register(new ItemFoodMandrake());
			registry.register(new ItemFoodWither());
			registry.register(new ItemFoodPieMandrake());
			registry.register(new ItemFoodPieMeat());
			registry.register(new ItemFoodPieAppleGold());
			registry.register(new ItemMiscSoulFire());
			registry.register(new ItemMiscSoulFiery());
			registry.register(new ItemMiscGigaGear());
			registry.register(new ItemBase("misc_fur"));
			registry.register(new ItemMiscExperience());
			registry.register(new ItemMiscBook());
			registry.register(new ItemBase("misc_quill"));
			registry.register(new ItemMiscRing());
			registry.register(new ItemMiscFurnaceFuel());
			registry.register(new ItemMiscCurrency());
			registry.register(new ItemSpawn());
			registry.register(new ItemSpawnNPC("spawn_creeper_girl", EnumRarity.RARE, EntityGaiaNPCCreeperGirl::new));
			registry.register(new ItemSpawnNPC("spawn_slime_girl", EnumRarity.RARE, EntityGaiaNPCSlimeGirl::new));
			registry.register(new ItemSpawnNPC("spawn_ender_girl", EnumRarity.RARE, EntityGaiaNPCEnderGirl::new));
			registry.register(new ItemSpawnNPC("spawn_trader", EnumRarity.RARE, EntityGaiaNPCTrader::new));
			registry.register(new ItemSpawnNPC("spawn_holstaurus", EnumRarity.RARE, EntityGaiaNPCHolstaurus::new));
			registry.register(new ItemSpawnNPC("spawn_weresheep", EnumRarity.EPIC, EntityGaiaNPCWeresheep::new));
			registry.register(new ItemSpawnTame());
			registry.register(new ItemBoxIron());
			registry.register(new ItemBoxGold());
			registry.register(new ItemBoxDiamond());
			registry.register(new ItemBox());
			registry.register(new ItemBagOre());
			registry.register(new ItemBagBook());
			registry.register(new ItemBagRecord());
			registry.register(new ItemBagArrow());
			registry.register(new ItemBoxOld());
			registry.register(new ItemChest());
			registry.register(new ItemWeaponProp());
			registry.register(new ItemWeaponPropProjectile());
			registry.register(new ItemWeaponPropEnchanted());
			registry.register(new ItemShieldProp());
			registry.register(new ItemWeaponFanIce());
			registry.register(new ItemWeaponFanFire());
			registry.register(new ItemWeaponBook("weapon_book"));
			registry.register(new ItemWeaponBookFreezing());
			registry.register(new ItemWeaponBookNightmare());
			registry.register(new ItemWeaponBookMetal());
			registry.register(new ItemWeaponBookEnder());
			registry.register(new ItemWeaponBookHunger());
			registry.register(new ItemWeaponBookBattle());
			registry.register(new ItemWeaponBookNature());
			registry.register(new ItemWeaponBookWither());
			registry.register(new ItemWeaponBookBuff());
			registry.register(new ItemWeaponDebug());
			registry.register(new ItemAccessoryRingSpeed());
			registry.register(new ItemAccessoryRingHaste());
			registry.register(new ItemAccessoryRingJump());
			registry.register(new ItemAccessoryRingNight());
			registry.register(new ItemAccessoryTrinketPoison());
			registry.register(new ItemAccessoryTrinketWither());
			registry.register(new ItemAccessoryTrinketLevitation());
			registry.register(new ItemAccessoryCursed());
			registry.register(new ItemCard());
			registry.register(new ItemAccessorySkull());

			Gaia.LOGGER.info("Item registration complete.");
		}

		public static void registerOres() {
			OreDictionary.registerOre("nuggetIron", new ItemStack(SHARD, 1, 0));
			OreDictionary.registerOre("nuggetGold", new ItemStack(SHARD, 1, 1));
			OreDictionary.registerOre("nuggetDiamond", new ItemStack(SHARD, 1, 2));
			OreDictionary.registerOre("nuggetEmerald", new ItemStack(SHARD, 1, 3));
			OreDictionary.registerOre("nuggetCopper", new ItemStack(SHARD, 1, 4));
			OreDictionary.registerOre("nuggetSilver", new ItemStack(SHARD, 1, 5));
			OreDictionary.registerOre("cropNetherWart", FOOD_NETHER_WART);
		}
	}
}
