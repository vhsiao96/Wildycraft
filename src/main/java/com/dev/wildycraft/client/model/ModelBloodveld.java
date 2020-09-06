// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBloodveld extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer Leg11;
	private final ModelRenderer Neck;
	private final ModelRenderer Mouth1;
	private final ModelRenderer Leg21;
	private final ModelRenderer Leg31;
	private final ModelRenderer Leg41;
	private final ModelRenderer Leg12;
	private final ModelRenderer Leg22;
	private final ModelRenderer Leg42;
	private final ModelRenderer Leg32;
	private final ModelRenderer Mouth2;
	private final ModelRenderer Mouth3;
	private final ModelRenderer Mouth4;
	private final ModelRenderer Tongue1;
	private final ModelRenderer Tongue2;
	private final ModelRenderer Tongue3;
	private final ModelRenderer Tongue4;

	public ModelBloodveld() {
		textureWidth = 128;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 11.0F, -13.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -11.0F, -6.0F, 0.0F, 22, 12, 26, 0.0F, true));

		Leg11 = new ModelRenderer(this);
		Leg11.setRotationPoint(10.0F, 11.0F, -9.0F);
		setRotationAngle(Leg11, 0.0F, 0.0F, 0.5236F);
		Leg11.cubeList.add(new ModelBox(Leg11, 96, 0, 0.0F, -2.5F, -2.5F, 9, 5, 5, 0.0F, true));

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(0.0F, 11.0F, -13.0F);
		Neck.cubeList.add(new ModelBox(Neck, 0, 38, -9.0F, -5.0F, -2.0F, 18, 10, 2, 0.0F, true));

		Mouth1 = new ModelRenderer(this);
		Mouth1.setRotationPoint(0.0F, 11.0F, -15.0F);
		Mouth1.cubeList.add(new ModelBox(Mouth1, 40, 38, -4.0F, -3.0F, -2.0F, 8, 1, 2, 0.0F, true));

		Leg21 = new ModelRenderer(this);
		Leg21.setRotationPoint(10.0F, 11.0F, 8.0F);
		setRotationAngle(Leg21, 0.0F, 0.0F, 0.5236F);
		Leg21.cubeList.add(new ModelBox(Leg21, 96, 0, 0.0F, -2.5F, -2.5F, 9, 5, 5, 0.0F, true));

		Leg31 = new ModelRenderer(this);
		Leg31.setRotationPoint(-10.0F, 11.0F, -9.0F);
		setRotationAngle(Leg31, 0.0F, 0.0F, -0.5236F);
		Leg31.cubeList.add(new ModelBox(Leg31, 96, 0, -9.0F, -2.5F, -2.5F, 9, 5, 5, 0.0F, true));

		Leg41 = new ModelRenderer(this);
		Leg41.setRotationPoint(-10.0F, 11.0F, 8.0F);
		setRotationAngle(Leg41, 0.0F, 0.0F, -0.5236F);
		Leg41.cubeList.add(new ModelBox(Leg41, 96, 0, -9.0F, -2.5F, -2.5F, 9, 5, 5, 0.0F, true));

		Leg12 = new ModelRenderer(this);
		Leg12.setRotationPoint(10.0F, 11.0F, -9.0F);
		Leg12.cubeList.add(new ModelBox(Leg12, 96, 10, 5.0F, 2.3F, -2.5F, 4, 11, 5, 0.0F, true));

		Leg22 = new ModelRenderer(this);
		Leg22.setRotationPoint(10.0F, 11.0F, 8.0F);
		Leg22.cubeList.add(new ModelBox(Leg22, 96, 10, 5.0F, 2.3F, -2.5F, 4, 11, 5, 0.0F, true));

		Leg42 = new ModelRenderer(this);
		Leg42.setRotationPoint(-10.0F, 11.0F, 8.0F);
		Leg42.cubeList.add(new ModelBox(Leg42, 96, 10, -9.0F, 2.3F, -2.5F, 4, 11, 5, 0.0F, true));

		Leg32 = new ModelRenderer(this);
		Leg32.setRotationPoint(-10.0F, 11.0F, -9.0F);
		Leg32.cubeList.add(new ModelBox(Leg32, 96, 10, -9.0F, 2.3F, -2.5F, 4, 11, 5, 0.0F, true));

		Mouth2 = new ModelRenderer(this);
		Mouth2.setRotationPoint(0.0F, 11.0F, -15.0F);
		Mouth2.cubeList.add(new ModelBox(Mouth2, 40, 41, -4.0F, 2.0F, -2.0F, 8, 1, 2, 0.0F, true));

		Mouth3 = new ModelRenderer(this);
		Mouth3.setRotationPoint(0.0F, 11.0F, -15.0F);
		Mouth3.cubeList.add(new ModelBox(Mouth3, 46, 44, -5.0F, -3.0F, -2.0F, 1, 6, 2, 0.0F, true));

		Mouth4 = new ModelRenderer(this);
		Mouth4.setRotationPoint(0.0F, 11.0F, -15.0F);
		Mouth4.cubeList.add(new ModelBox(Mouth4, 40, 44, 4.0F, -3.0F, -2.0F, 1, 6, 2, 0.0F, true));

		Tongue1 = new ModelRenderer(this);
		Tongue1.setRotationPoint(0.0F, 11.0F, -15.0F);
		Tongue1.cubeList.add(new ModelBox(Tongue1, 0, 50, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, true));

		Tongue2 = new ModelRenderer(this);
		Tongue2.setRotationPoint(0.0F, 11.0F, -17.0F);
		Tongue2.cubeList.add(new ModelBox(Tongue2, 0, 50, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, true));

		Tongue3 = new ModelRenderer(this);
		Tongue3.setRotationPoint(0.0F, 11.0F, -19.0F);
		Tongue3.cubeList.add(new ModelBox(Tongue3, 0, 55, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

		Tongue4 = new ModelRenderer(this);
		Tongue4.setRotationPoint(0.0F, 11.0F, -22.0F);
		Tongue4.cubeList.add(new ModelBox(Tongue4, 0, 59, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		Leg11.render(f5);
		Neck.render(f5);
		Mouth1.render(f5);
		Leg21.render(f5);
		Leg31.render(f5);
		Leg41.render(f5);
		Leg12.render(f5);
		Leg22.render(f5);
		Leg42.render(f5);
		Leg32.render(f5);
		Mouth2.render(f5);
		Mouth3.render(f5);
		Mouth4.render(f5);
		Tongue1.render(f5);
		Tongue2.render(f5);
		Tongue3.render(f5);
		Tongue4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}