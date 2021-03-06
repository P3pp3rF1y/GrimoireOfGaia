package gaia.renderer.entity;

import gaia.GaiaReference;
import gaia.model.ModelGaiaPropFlowerCyan;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaPropFlowerCyan extends RenderLiving<EntityLiving> {
	private static final ResourceLocation texture = new ResourceLocation(GaiaReference.MOD_ID, "textures/models/prop_flower_cyan.png");

	public RenderGaiaPropFlowerCyan(RenderManager renderManager) {
		super(renderManager, new ModelGaiaPropFlowerCyan(), 0.0F);
	}

	@Override
	protected void preRenderCallback(EntityLiving living, float par2) {
		shadowSize = 0.0F;
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLiving entity) {
		return texture;
	}
}
