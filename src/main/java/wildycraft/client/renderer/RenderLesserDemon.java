package wildycraft.client.renderer;

import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import wildycraft.Wildycraft;
import wildycraft.client.model.ModelLesserDemon;
import wildycraft.entity.EntityDelrith;
import wildycraft.entity.EntityLesserDemon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLesserDemon extends RenderLiving
{
	public static ResourceLocation texture = new ResourceLocation(Wildycraft.modid + ":" + "textures/mobs/LesserDemon.png");
	public static ResourceLocation texture2 = new ResourceLocation(Wildycraft.modid + ":" + "textures/mobs/Delrith.png");
	public RenderLesserDemon()
    {
        super(new ModelLesserDemon(), 0.5F);
    }

    protected void func_82438_a(EntityLesserDemon par1EntitySkeleton, float par2)
    {
          GL11.glScalef(1F, 1F, 1F);
    }

    protected void func_82422_c()
    {
        GL11.glTranslatef(0.09375F, 0.1875F, 0.0F);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLiving par1EntityLiving, float par2)
    {
        this.func_82438_a((EntityLesserDemon)par1EntityLiving, par2);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		if(entity instanceof EntityDelrith){
			return texture2;
		}
		return texture;
	}
}
