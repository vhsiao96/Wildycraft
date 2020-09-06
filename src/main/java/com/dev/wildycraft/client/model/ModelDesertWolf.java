// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
public class ModelDesertWolf extends ModelBase {
	private final ModelRenderer wolfHeadMain;
	private final ModelRenderer wolfBody;
	private final ModelRenderer wolfLeg1;
	private final ModelRenderer wolfLeg2;
	private final ModelRenderer wolfLeg3;
	private final ModelRenderer wolfLeg4;
	private final ModelRenderer wolfTail;
	private final ModelRenderer wolfMane;

	public ModelDesertWolf() {
		textureWidth = 16;
		textureHeight = 16;

		wolfHeadMain = new ModelRenderer(this);
		wolfHeadMain.setRotationPoint(0.0F, 0.0F, 0.0F);
		wolfHeadMain.cubeList.add(new ModelBox(wolfHeadMain, 0, 0, -3.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F, false));

		wolfBody = new ModelRenderer(this);
		wolfBody.setRotationPoint(0.0F, 14.0F, 2.0F);
		wolfBody.cubeList.add(new ModelBox(wolfBody, 18, 14, -4.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F, false));

		wolfLeg1 = new ModelRenderer(this);
		wolfLeg1.setRotationPoint(-2.5F, 16.0F, 7.0F);
		wolfLeg1.cubeList.add(new ModelBox(wolfLeg1, 0, 18, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, false));

		wolfLeg2 = new ModelRenderer(this);
		wolfLeg2.setRotationPoint(0.5F, 16.0F, 7.0F);
		wolfLeg2.cubeList.add(new ModelBox(wolfLeg2, 0, 18, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, false));

		wolfLeg3 = new ModelRenderer(this);
		wolfLeg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
		wolfLeg3.cubeList.add(new ModelBox(wolfLeg3, 0, 18, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, false));

		wolfLeg4 = new ModelRenderer(this);
		wolfLeg4.setRotationPoint(0.5F, 16.0F, -4.0F);
		wolfLeg4.cubeList.add(new ModelBox(wolfLeg4, 0, 18, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, false));

		wolfTail = new ModelRenderer(this);
		wolfTail.setRotationPoint(-1.0F, 12.0F, 8.0F);
		wolfTail.cubeList.add(new ModelBox(wolfTail, 9, 18, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, false));

		wolfMane = new ModelRenderer(this);
		wolfMane.setRotationPoint(-1.0F, 14.0F, 2.0F);
		wolfMane.cubeList.add(new ModelBox(wolfMane, 21, 0, -4.0F, -3.0F, -3.0F, 8, 6, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		wolfHeadMain.render(f5);
		wolfBody.render(f5);
		wolfLeg1.render(f5);
		wolfLeg2.render(f5);
		wolfLeg3.render(f5);
		wolfLeg4.render(f5);
		wolfTail.render(f5);
		wolfMane.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}