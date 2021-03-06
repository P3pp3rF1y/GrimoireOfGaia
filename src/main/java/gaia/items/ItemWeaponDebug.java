package gaia.items;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

import javax.annotation.Nullable;
import java.util.List;

public class ItemWeaponDebug extends ItemBase {
	public ItemWeaponDebug() {
		super("weapon_debug");
		maxStackSize = 1;
		setMaxDamage(780);
		setCreativeTab(null);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.UNCOMMON;
	}

	/**
	 * https://github.com/Flaxbeard/Cyberware/blob/4bae328ee0a714900094d3f203b3281af3e048c4/src/main/java/flaxbeard/cyberware/common/handler/CyberwareMenuHandler.java
	 **/
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		boolean shiftPressed = Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT);
		tooltip.add(TextFormatting.YELLOW + (I18n.format("text.grimoireofgaia.Debug.tag")));
		if (shiftPressed) {
			tooltip.add(I18n.format("item.grimoireofgaia.weapon_debug.desc"));
		} else {
			tooltip.add(TextFormatting.ITALIC + (I18n.format("text.grimoireofgaia.HoldShift")));
		}
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
		EntityPlayer player = (EntityPlayer) entityIn;

		for (int i = 0; i < 9; ++i) {
			if (player.inventory.getStackInSlot(i) == stack) {
				doEffect(player);
				break;
			}
		}
	}

	public void doEffect(EntityPlayer player) {
		if (!player.isPotionActive(MobEffects.REGENERATION)) {
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 10 * 20, 4, true, false));
		}
	}
}
