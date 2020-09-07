// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGeneralGraador extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer plateskirt;
	private final ModelRenderer shoulderguard2;
	private final ModelRenderer shoulderguard1;
	private final ModelRenderer shoulderspike1;
	private final ModelRenderer shoulderspike2;
	private final ModelRenderer plateskirt2;
	private final ModelRenderer shoulderspike3;
	private final ModelRenderer lefthorn1;
	private final ModelRenderer lefthorn2;
	private final ModelRenderer lefthorn3;
	private final ModelRenderer righthorn1;
	private final ModelRenderer righthorn2;
	private final ModelRenderer righthorn3;
	private final ModelRenderer string;

	public ModelGeneralGraador() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -40.0F, -0.5F);
		head.cubeList.add(new ModelBox(head, 88, 17, -7.0F, -15.0F, -7.5F, 15, 15, 15, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 68, 69, -13.0F, -40.0F, -10.0F, 28, 33, 19, 0.0F, true));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-13.0F, -38.0F, 0.0F);
		setRotationAngle(rightarm, 0.0F, 0.0F, 0.0698F);
		rightarm.cubeList.add(new ModelBox(rightarm, 180, 119, -10.0F, -2.0F, -6.0F, 10, 33, 10, 0.0F, true));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(15.0F, -38.0F, 0.0F);
		setRotationAngle(leftarm, 0.0F, 0.0F, -0.0698F);
		leftarm.cubeList.add(new ModelBox(leftarm, 180, 119, 0.0F, -2.0F, -6.0F, 10, 33, 10, 0.0F, true));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-7.0F, -7.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 83, 194, -5.0F, 0.0F, -5.0F, 10, 31, 10, 0.0F, true));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(8.0F, -7.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 83, 194, -5.0F, 0.0F, -5.0F, 10, 31, 10, 0.0F, true));

		plateskirt = new ModelRenderer(this);
		plateskirt.setRotationPoint(0.0F, 0.0F, 0.0F);
		plateskirt.cubeList.add(new ModelBox(plateskirt, 60, 142, -14.0F, -19.0F, -11.0F, 30, 20, 21, 0.0F, true));

		shoulderguard2 = new ModelRenderer(this);
		shoulderguard2.setRotationPoint(15.0F, -38.0F, 0.0F);
		shoulderguard2.cubeList.add(new ModelBox(shoulderguard2, 171, 92, 0.0F, -3.0F, -7.0F, 20, 6, 12, 0.0F, true));

		shoulderguard1 = new ModelRenderer(this);
		shoulderguard1.setRotationPoint(0.0F, 0.0F, 0.0F);
		shoulderguard1.cubeList.add(new ModelBox(shoulderguard1, 172, 55, 9.0F, -43.0F, -10.0F, 17, 8, 19, 0.0F, true));

		shoulderspike1 = new ModelRenderer(this);
		shoulderspike1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(shoulderspike1, 0.0F, 0.0F, 1.0123F);
		shoulderspike1.cubeList.add(new ModelBox(shoulderspike1, 173, 34, -28.0F, -50.0F, 3.0F, 2, 14, 2, 0.0F, true));

		shoulderspike2 = new ModelRenderer(this);
		shoulderspike2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(shoulderspike2, 0.0F, 0.0F, 1.0123F);
		shoulderspike2.cubeList.add(new ModelBox(shoulderspike2, 173, 34, -28.0F, -50.0F, -7.0F, 2, 14, 2, 0.0F, true));

		plateskirt2 = new ModelRenderer(this);
		plateskirt2.setRotationPoint(0.0F, 0.0F, 0.0F);
		plateskirt2.cubeList.add(new ModelBox(plateskirt2, 17, 146, -4.0F, -20.0F, -12.0F, 10, 27, 1, 0.0F, true));

		shoulderspike3 = new ModelRenderer(this);
		shoulderspike3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(shoulderspike3, 0.0F, 0.0F, 1.1519F);
		shoulderspike3.cubeList.add(new ModelBox(shoulderspike3, 188, 35, -29.0F, -52.0F, -2.0F, 2, 12, 2, 0.0F, true));

		lefthorn1 = new ModelRenderer(this);
		lefthorn1.setRotationPoint(0.0F, -40.0F, -0.5F);
		setRotationAngle(lefthorn1, 0.3142F, 0.0F, 1.5708F);
		lefthorn1.cubeList.add(new ModelBox(lefthorn1, 55, 38, -11.0F, -15.0F, 1.0F, 4, 8, 4, 0.0F, true));

		lefthorn2 = new ModelRenderer(this);
		lefthorn2.setRotationPoint(0.0F, -40.0F, -0.5F);
		setRotationAngle(lefthorn2, 0.0F, 0.2967F, 0.733F);
		lefthorn2.cubeList.add(new ModelBox(lefthorn2, 56, 23, 3.3F, -22.0F, 1.1F, 3, 7, 3, 0.0F, true));

		lefthorn3 = new ModelRenderer(this);
		lefthorn3.setRotationPoint(0.0F, -40.0F, -0.5F);
		setRotationAngle(lefthorn3, 0.0F, 0.3665F, 0.3316F);
		lefthorn3.cubeList.add(new ModelBox(lefthorn3, 56, 2, 12.0F, -28.0F, 2.9F, 2, 11, 2, 0.0F, true));

		righthorn1 = new ModelRenderer(this);
		righthorn1.setRotationPoint(0.0F, -40.0F, -0.5F);
		setRotationAngle(righthorn1, -0.3142F, 0.0F, 1.5708F);
		righthorn1.cubeList.add(new ModelBox(righthorn1, 55, 38, -11.0F, 5.0F, 1.0F, 4, 8, 4, 0.0F, true));

		righthorn2 = new ModelRenderer(this);
		righthorn2.setRotationPoint(0.0F, -40.0F, -0.5F);
		setRotationAngle(righthorn2, 0.0F, -0.2967F, -0.733F);
		righthorn2.cubeList.add(new ModelBox(righthorn2, 56, 23, -5.3F, -21.0F, 1.1F, 3, 7, 3, 0.0F, true));

		righthorn3 = new ModelRenderer(this);
		righthorn3.setRotationPoint(0.0F, -40.0F, -0.5F);
		setRotationAngle(righthorn3, 0.0F, -0.3665F, -0.3316F);
		righthorn3.cubeList.add(new ModelBox(righthorn3, 27, 4, -13.0F, -28.0F, 2.9F, 2, 11, 2, 0.0F, true));

		string = new ModelRenderer(this);
		string.setRotationPoint(0.0F, -40.0F, -0.5F);
		setRotationAngle(string, 0.0F, -0.3665F, 0.0F);
		string.cubeList.add(new ModelBox(string, 27, 23, -19.3F, -16.0F, 3.2F, 1, 8, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
		plateskirt.render(f5);
		shoulderguard2.render(f5);
		shoulderguard1.render(f5);
		shoulderspike1.render(f5);
		shoulderspike2.render(f5);
		plateskirt2.render(f5);
		shoulderspike3.render(f5);
		lefthorn1.render(f5);
		lefthorn2.render(f5);
		lefthorn3.render(f5);
		righthorn1.render(f5);
		righthorn2.render(f5);
		righthorn3.render(f5);
		string.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}