// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBrazier extends ModelBase {
	private final ModelRenderer Base1;
	private final ModelRenderer Side11;
	private final ModelRenderer Side12;
	private final ModelRenderer Side13;
	private final ModelRenderer Side14;
	private final ModelRenderer Leg11;
	private final ModelRenderer Leg12;
	private final ModelRenderer Base2;
	private final ModelRenderer Leg13;
	private final ModelRenderer Leg21;
	private final ModelRenderer Leg22;
	private final ModelRenderer Leg23;
	private final ModelRenderer Leg31;
	private final ModelRenderer Leg32;
	private final ModelRenderer Leg33;
	private final ModelRenderer Leg41;
	private final ModelRenderer Leg42;
	private final ModelRenderer Leg43;
	private final ModelRenderer Side21;
	private final ModelRenderer Side22;
	private final ModelRenderer Side23;
	private final ModelRenderer Side24;
	private final ModelRenderer Stick1;
	private final ModelRenderer Stick2;
	private final ModelRenderer Stick3;
	private final ModelRenderer Stick4;
	private final ModelRenderer Stick5;
	private final ModelRenderer Stick6;

	public ModelBrazier() {
		textureWidth = 128;
		textureHeight = 64;

		Base1 = new ModelRenderer(this);
		Base1.setRotationPoint(0.0F, 13.0F, 0.0F);
		Base1.cubeList.add(new ModelBox(Base1, 60, 0, -8.0F, -1.0F, -8.0F, 16, 1, 16, 0.0F, true));

		Side11 = new ModelRenderer(this);
		Side11.setRotationPoint(0.0F, 8.0F, -8.0F);
		Side11.cubeList.add(new ModelBox(Side11, 0, 30, -8.0F, 0.0F, 0.0F, 16, 4, 1, 0.0F, true));

		Side12 = new ModelRenderer(this);
		Side12.setRotationPoint(0.0F, 8.0F, 7.0F);
		Side12.cubeList.add(new ModelBox(Side12, 0, 30, -8.0F, 0.0F, 0.0F, 16, 4, 1, 0.0F, true));

		Side13 = new ModelRenderer(this);
		Side13.setRotationPoint(7.0F, 8.0F, 0.0F);
		Side13.cubeList.add(new ModelBox(Side13, 64, 36, 0.0F, 0.0F, -8.0F, 1, 4, 16, 0.0F, true));

		Side14 = new ModelRenderer(this);
		Side14.setRotationPoint(-8.0F, 8.0F, 0.0F);
		Side14.cubeList.add(new ModelBox(Side14, 64, 36, 0.0F, 0.0F, -8.0F, 1, 4, 16, 0.0F, true));

		Leg11 = new ModelRenderer(this);
		Leg11.setRotationPoint(4.5F, 18.7F, 4.5F);
		setRotationAngle(Leg11, 0.3491F, 0.0F, -0.3491F);
		Leg11.cubeList.add(new ModelBox(Leg11, 0, 0, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, true));

		Leg12 = new ModelRenderer(this);
		Leg12.setRotationPoint(4.5F, 16.0F, 4.5F);
		Leg12.cubeList.add(new ModelBox(Leg12, 0, 0, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, true));

		Base2 = new ModelRenderer(this);
		Base2.setRotationPoint(0.0F, 13.0F, 0.0F);
		Base2.cubeList.add(new ModelBox(Base2, 64, 18, -7.0F, 0.0F, -7.0F, 14, 1, 14, 0.0F, true));

		Leg13 = new ModelRenderer(this);
		Leg13.setRotationPoint(4.5F, 16.0F, 4.5F);
		setRotationAngle(Leg13, -0.4363F, 0.0F, 0.4363F);
		Leg13.cubeList.add(new ModelBox(Leg13, 0, 0, -0.5F, -6.7F, -0.5F, 1, 7, 1, 0.0F, true));

		Leg21 = new ModelRenderer(this);
		Leg21.setRotationPoint(4.5F, 18.7F, -4.5F);
		setRotationAngle(Leg21, -0.3491F, 0.0F, -0.3491F);
		Leg21.cubeList.add(new ModelBox(Leg21, 0, 0, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, true));

		Leg22 = new ModelRenderer(this);
		Leg22.setRotationPoint(4.5F, 16.0F, -4.5F);
		Leg22.cubeList.add(new ModelBox(Leg22, 0, 0, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, true));

		Leg23 = new ModelRenderer(this);
		Leg23.setRotationPoint(4.5F, 16.0F, -4.5F);
		setRotationAngle(Leg23, 0.4363F, 0.0F, 0.4363F);
		Leg23.cubeList.add(new ModelBox(Leg23, 0, 0, -0.5F, -6.7F, -0.5F, 1, 7, 1, 0.0F, true));

		Leg31 = new ModelRenderer(this);
		Leg31.setRotationPoint(-4.5F, 18.7F, 4.5F);
		setRotationAngle(Leg31, 0.3491F, 0.0F, 0.3491F);
		Leg31.cubeList.add(new ModelBox(Leg31, 0, 0, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, true));

		Leg32 = new ModelRenderer(this);
		Leg32.setRotationPoint(-4.5F, 16.0F, 4.5F);
		Leg32.cubeList.add(new ModelBox(Leg32, 0, 0, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, true));

		Leg33 = new ModelRenderer(this);
		Leg33.setRotationPoint(-4.5F, 16.0F, 4.5F);
		setRotationAngle(Leg33, -0.4363F, 0.0F, -0.4363F);
		Leg33.cubeList.add(new ModelBox(Leg33, 0, 0, -0.5F, -6.7F, -0.5F, 1, 7, 1, 0.0F, true));

		Leg41 = new ModelRenderer(this);
		Leg41.setRotationPoint(-4.5F, 18.7F, -4.5F);
		setRotationAngle(Leg41, -0.3491F, 0.0F, 0.3491F);
		Leg41.cubeList.add(new ModelBox(Leg41, 0, 0, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, true));

		Leg42 = new ModelRenderer(this);
		Leg42.setRotationPoint(-4.5F, 16.0F, -4.5F);
		Leg42.cubeList.add(new ModelBox(Leg42, 0, 0, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, true));

		Leg43 = new ModelRenderer(this);
		Leg43.setRotationPoint(-4.5F, 16.0F, -4.5F);
		setRotationAngle(Leg43, 0.4363F, 0.0F, -0.4363F);
		Leg43.cubeList.add(new ModelBox(Leg43, 0, 0, -0.5F, -6.7F, -0.5F, 1, 7, 1, 0.0F, true));

		Side21 = new ModelRenderer(this);
		Side21.setRotationPoint(-9.0F, 6.0F, 0.0F);
		Side21.cubeList.add(new ModelBox(Side21, 0, 40, 0.0F, 0.0F, -9.0F, 1, 4, 18, 0.0F, true));

		Side22 = new ModelRenderer(this);
		Side22.setRotationPoint(8.0F, 6.0F, 0.0F);
		Side22.cubeList.add(new ModelBox(Side22, 0, 40, 0.0F, 0.0F, -9.0F, 1, 4, 18, 0.0F, true));

		Side23 = new ModelRenderer(this);
		Side23.setRotationPoint(0.0F, 6.0F, 8.0F);
		Side23.cubeList.add(new ModelBox(Side23, 0, 24, -9.0F, 0.0F, 0.0F, 18, 4, 1, 0.0F, true));

		Side24 = new ModelRenderer(this);
		Side24.setRotationPoint(0.0F, 6.0F, -9.0F);
		Side24.cubeList.add(new ModelBox(Side24, 0, 24, -9.0F, 0.0F, 0.0F, 18, 4, 1, 0.0F, true));

		Stick1 = new ModelRenderer(this);
		Stick1.setRotationPoint(4.0F, 12.0F, 4.0F);
		setRotationAngle(Stick1, -2.6943F, 0.0F, -1.3384F);
		Stick1.cubeList.add(new ModelBox(Stick1, 40, 40, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, true));

		Stick2 = new ModelRenderer(this);
		Stick2.setRotationPoint(2.0F, 12.0F, -4.0F);
		setRotationAngle(Stick2, 1.9147F, 0.0F, -0.1859F);
		Stick2.cubeList.add(new ModelBox(Stick2, 40, 40, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, true));

		Stick3 = new ModelRenderer(this);
		Stick3.setRotationPoint(-3.0F, 12.0F, 4.0F);
		setRotationAngle(Stick3, -0.7993F, 0.0F, -2.1935F);
		Stick3.cubeList.add(new ModelBox(Stick3, 40, 40, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, true));

		Stick4 = new ModelRenderer(this);
		Stick4.setRotationPoint(-2.0F, 12.0F, -3.0F);
		setRotationAngle(Stick4, 0.6878F, 0.0F, -2.1935F);
		Stick4.cubeList.add(new ModelBox(Stick4, 40, 40, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, true));

		Stick5 = new ModelRenderer(this);
		Stick5.setRotationPoint(1.0F, 12.0F, -4.0F);
		setRotationAngle(Stick5, 2.2493F, 0.0F, -0.9666F);
		Stick5.cubeList.add(new ModelBox(Stick5, 40, 40, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, true));

		Stick6 = new ModelRenderer(this);
		Stick6.setRotationPoint(4.0F, 12.0F, -2.0F);
		setRotationAngle(Stick6, 2.9557F, 0.0F, -1.041F);
		Stick6.cubeList.add(new ModelBox(Stick6, 40, 40, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Base1.render(f5);
		Side11.render(f5);
		Side12.render(f5);
		Side13.render(f5);
		Side14.render(f5);
		Leg11.render(f5);
		Leg12.render(f5);
		Base2.render(f5);
		Leg13.render(f5);
		Leg21.render(f5);
		Leg22.render(f5);
		Leg23.render(f5);
		Leg31.render(f5);
		Leg32.render(f5);
		Leg33.render(f5);
		Leg41.render(f5);
		Leg42.render(f5);
		Leg43.render(f5);
		Side21.render(f5);
		Side22.render(f5);
		Side23.render(f5);
		Side24.render(f5);
		Stick1.render(f5);
		Stick2.render(f5);
		Stick3.render(f5);
		Stick4.render(f5);
		Stick5.render(f5);
		Stick6.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}