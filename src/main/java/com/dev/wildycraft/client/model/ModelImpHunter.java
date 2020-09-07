// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelImpHunter extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer body;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer arm_pad_1;
	private final ModelRenderer Shape1;
	private final ModelRenderer Shape2;
	private final ModelRenderer imp_hood_horn_1;
	private final ModelRenderer imp_hood_horn_2;
	private final ModelRenderer arm_pad_2;
	private final ModelRenderer arm_spike_1;
	private final ModelRenderer arm_spike_2;

	public ModelImpHunter() {
		textureWidth = 64;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 17, 6, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 35, 25, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, true));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 13, 25, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 13, 25, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 22, 46, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 22, 46, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		arm_pad_1 = new ModelRenderer(this);
		arm_pad_1.setRotationPoint(5.0F, 2.0F, 0.0F);
		arm_pad_1.cubeList.add(new ModelBox(arm_pad_1, 1, 27, 3.0F, -1.0F, -2.0F, 1, 5, 4, 0.0F, true));

		Shape1 = new ModelRenderer(this);
		Shape1.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(Shape1, 0.0F, 0.0F, 0.5061F);
		Shape1.cubeList.add(new ModelBox(Shape1, 4, 23, -5.0F, 2.0F, 0.0F, 2, 1, 0, 0.0F, true));

		Shape2 = new ModelRenderer(this);
		Shape2.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(Shape2, 0.0F, 0.0F, 0.5061F);
		Shape2.cubeList.add(new ModelBox(Shape2, 4, 23, -4.0F, 3.8F, 0.0F, 2, 1, 0, 0.0F, true));

		imp_hood_horn_1 = new ModelRenderer(this);
		imp_hood_horn_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(imp_hood_horn_1, 0.8901F, 0.0F, 0.0F);
		imp_hood_horn_1.cubeList.add(new ModelBox(imp_hood_horn_1, 22, 0, 3.5F, -10.7F, 3.0F, 0, 3, 1, 0.0F, true));

		imp_hood_horn_2 = new ModelRenderer(this);
		imp_hood_horn_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(imp_hood_horn_2, 0.8901F, 0.0F, 0.0F);
		imp_hood_horn_2.cubeList.add(new ModelBox(imp_hood_horn_2, 22, 0, -3.5F, -10.7F, 3.0F, 0, 3, 1, 0.0F, true));

		arm_pad_2 = new ModelRenderer(this);
		arm_pad_2.setRotationPoint(-5.0F, 2.0F, 0.0F);
		arm_pad_2.cubeList.add(new ModelBox(arm_pad_2, 1, 27, -4.0F, -1.0F, -2.0F, 1, 5, 4, 0.0F, true));

		arm_spike_1 = new ModelRenderer(this);
		arm_spike_1.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(arm_spike_1, 0.0F, 0.0F, -0.5061F);
		arm_spike_1.cubeList.add(new ModelBox(arm_spike_1, 4, 23, 3.0F, 2.0F, 0.0F, 2, 1, 0, 0.0F, true));

		arm_spike_2 = new ModelRenderer(this);
		arm_spike_2.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(arm_spike_2, 0.0F, 0.0F, -0.5061F);
		arm_spike_2.cubeList.add(new ModelBox(arm_spike_2, 4, 23, 2.0F, 3.8F, 0.0F, 2, 1, 0, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedHead.render(f5);
		body.render(f5);
		bipedRightArm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
		arm_pad_1.render(f5);
		Shape1.render(f5);
		Shape2.render(f5);
		imp_hood_horn_1.render(f5);
		imp_hood_horn_2.render(f5);
		arm_pad_2.render(f5);
		arm_spike_1.render(f5);
		arm_spike_2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}