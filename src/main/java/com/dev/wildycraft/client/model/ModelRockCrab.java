// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRockCrab extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Rock;
	private final ModelRenderer arm_1;
	private final ModelRenderer arm_2;
	private final ModelRenderer spiderLeg6;
	private final ModelRenderer spiderLeg4;
	private final ModelRenderer spiderLeg2;
	private final ModelRenderer spiderLeg5;
	private final ModelRenderer spiderLeg3;
	private final ModelRenderer spiderLeg1;

	public ModelRockCrab() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 20.0F, -1.0F);
		Head.cubeList.add(new ModelBox(Head, 17, 12, -4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F, true));

		Rock = new ModelRenderer(this);
		Rock.setRotationPoint(-3.0F, 12.0F, -2.0F);
		Rock.cubeList.add(new ModelBox(Rock, 0, 31, -5.0F, -4.0F, -6.0F, 16, 16, 16, 0.0F, true));

		arm_1 = new ModelRenderer(this);
		arm_1.setRotationPoint(0.0F, 20.0F, -1.0F);
		setRotationAngle(arm_1, 0.0F, 1.5708F, 0.0F);
		arm_1.cubeList.add(new ModelBox(arm_1, 23, 6, 3.0F, 1.0F, 5.0F, 9, 2, 2, 0.0F, true));

		arm_2 = new ModelRenderer(this);
		arm_2.setRotationPoint(0.0F, 20.0F, -1.0F);
		setRotationAngle(arm_2, 0.0F, 1.5708F, 0.0F);
		arm_2.cubeList.add(new ModelBox(arm_2, 23, 6, 3.0F, 1.0F, -7.0F, 9, 2, 2, 0.0F, true));

		spiderLeg6 = new ModelRenderer(this);
		spiderLeg6.setRotationPoint(4.0F, 20.0F, 0.0F);
		setRotationAngle(spiderLeg6, 0.0F, 0.2793F, 0.192F);
		spiderLeg6.cubeList.add(new ModelBox(spiderLeg6, 18, 0, -1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F, true));

		spiderLeg4 = new ModelRenderer(this);
		spiderLeg4.setRotationPoint(4.0F, 20.0F, 1.0F);
		setRotationAngle(spiderLeg4, 0.0F, -0.2793F, 0.192F);
		spiderLeg4.cubeList.add(new ModelBox(spiderLeg4, 18, 0, -1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F, true));

		spiderLeg2 = new ModelRenderer(this);
		spiderLeg2.setRotationPoint(4.0F, 20.0F, 2.0F);
		setRotationAngle(spiderLeg2, 0.0F, -0.576F, 0.192F);
		spiderLeg2.cubeList.add(new ModelBox(spiderLeg2, 18, 0, -1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F, true));

		spiderLeg5 = new ModelRenderer(this);
		spiderLeg5.setRotationPoint(-4.0F, 20.0F, 0.0F);
		setRotationAngle(spiderLeg5, 0.0F, -0.2793F, -0.192F);
		spiderLeg5.cubeList.add(new ModelBox(spiderLeg5, 18, 0, -15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F, true));

		spiderLeg3 = new ModelRenderer(this);
		spiderLeg3.setRotationPoint(-4.0F, 20.0F, 1.0F);
		setRotationAngle(spiderLeg3, 0.0F, 0.2793F, -0.192F);
		spiderLeg3.cubeList.add(new ModelBox(spiderLeg3, 18, 0, -15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F, true));

		spiderLeg1 = new ModelRenderer(this);
		spiderLeg1.setRotationPoint(-4.0F, 20.0F, 2.0F);
		setRotationAngle(spiderLeg1, 0.0F, 0.576F, -0.192F);
		spiderLeg1.cubeList.add(new ModelBox(spiderLeg1, 18, 0, -15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
		Rock.render(f5);
		arm_1.render(f5);
		arm_2.render(f5);
		spiderLeg6.render(f5);
		spiderLeg4.render(f5);
		spiderLeg2.render(f5);
		spiderLeg5.render(f5);
		spiderLeg3.render(f5);
		spiderLeg1.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}