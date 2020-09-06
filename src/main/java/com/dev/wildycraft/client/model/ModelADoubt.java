// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelADoubt extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm1;
	private final ModelRenderer leftarm1;
	private final ModelRenderer mouth;
	private final ModelRenderer body2;
	private final ModelRenderer rightarm2;
	private final ModelRenderer leftarm2;
	private final ModelRenderer rightclaw2;
	private final ModelRenderer rightclaw1;
	private final ModelRenderer rightclaw3;
	private final ModelRenderer leftclaw1;
	private final ModelRenderer leftclaw2;
	private final ModelRenderer leftclaw3;
	private final ModelRenderer rightfang;
	private final ModelRenderer leftfang;
	private final ModelRenderer tail1;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;

	public ModelADoubt() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 4.0F, -1.0F);
		head.cubeList.add(new ModelBox(head, 41, 1, -3.0F, -6.0F, -3.5F, 6, 6, 7, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 0.0F);
		setRotationAngle(body, 0.0349F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 41, 17, -4.0F, 0.0F, 0.0F, 8, 10, 2, 0.0F, true));

		rightarm1 = new ModelRenderer(this);
		rightarm1.setRotationPoint(-2.5F, 3.0F, 0.0F);
		setRotationAngle(rightarm1, 0.0F, 0.0F, 1.2217F);
		rightarm1.cubeList.add(new ModelBox(rightarm1, 91, 16, -1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F, true));

		leftarm1 = new ModelRenderer(this);
		leftarm1.setRotationPoint(2.5F, 3.0F, 0.0F);
		setRotationAngle(leftarm1, 0.0F, 0.0F, -1.2217F);
		leftarm1.cubeList.add(new ModelBox(leftarm1, 91, 16, -1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F, true));

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 9.5F, 1.0F);
		setRotationAngle(mouth, 1.1519F, 0.0F, 0.0F);
		mouth.cubeList.add(new ModelBox(mouth, 66, 20, -4.5F, -8.0F, -1.0F, 9, 8, 2, 0.0F, true));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 4.0F, 0.0F);
		setRotationAngle(body2, 0.0349F, 0.0F, 0.0F);
		body2.cubeList.add(new ModelBox(body2, 41, 32, -4.0F, 5.0F, -2.0F, 8, 5, 2, 0.0F, true));

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(-2.5F, 3.0F, 0.0F);
		setRotationAngle(rightarm2, 0.0F, 0.0F, 0.0524F);
		rightarm2.cubeList.add(new ModelBox(rightarm2, 102, 16, -7.0F, 1.9F, -1.5F, 3, 8, 3, 0.0F, true));

		leftarm2 = new ModelRenderer(this);
		leftarm2.setRotationPoint(2.5F, 3.0F, 0.0F);
		setRotationAngle(leftarm2, 0.0F, 0.0F, -0.0524F);
		leftarm2.cubeList.add(new ModelBox(leftarm2, 102, 16, 4.0F, 1.9F, -1.5F, 3, 8, 3, 0.0F, true));

		rightclaw2 = new ModelRenderer(this);
		rightclaw2.setRotationPoint(-2.5F, 3.0F, 0.0F);
		setRotationAngle(rightclaw2, 0.0F, 0.0F, 0.0524F);
		rightclaw2.cubeList.add(new ModelBox(rightclaw2, 117, 16, -7.0F, 9.9F, -1.5F, 1, 5, 1, 0.0F, true));

		rightclaw1 = new ModelRenderer(this);
		rightclaw1.setRotationPoint(-2.5F, 3.0F, 0.0F);
		setRotationAngle(rightclaw1, 0.0F, 0.0F, 0.0524F);
		rightclaw1.cubeList.add(new ModelBox(rightclaw1, 117, 16, -7.0F, 9.9F, 0.5F, 1, 5, 1, 0.0F, true));

		rightclaw3 = new ModelRenderer(this);
		rightclaw3.setRotationPoint(-2.5F, 3.0F, 0.0F);
		setRotationAngle(rightclaw3, -0.5585F, 0.0F, 0.0524F);
		rightclaw3.cubeList.add(new ModelBox(rightclaw3, 123, 16, -6.7F, 8.0F, 3.5F, 1, 3, 0, 0.0F, true));

		leftclaw1 = new ModelRenderer(this);
		leftclaw1.setRotationPoint(2.5F, 3.0F, 0.0F);
		setRotationAngle(leftclaw1, 0.0F, 0.0F, -0.0524F);
		leftclaw1.cubeList.add(new ModelBox(leftclaw1, 117, 16, 6.0F, 9.9F, 0.5F, 1, 5, 1, 0.0F, true));

		leftclaw2 = new ModelRenderer(this);
		leftclaw2.setRotationPoint(2.5F, 3.0F, 0.0F);
		setRotationAngle(leftclaw2, 0.0F, 0.0F, -0.0524F);
		leftclaw2.cubeList.add(new ModelBox(leftclaw2, 117, 16, 6.0F, 9.9F, -1.5F, 1, 5, 1, 0.0F, true));

		leftclaw3 = new ModelRenderer(this);
		leftclaw3.setRotationPoint(2.5F, 3.0F, 0.0F);
		setRotationAngle(leftclaw3, -0.5585F, 0.0F, -0.0524F);
		leftclaw3.cubeList.add(new ModelBox(leftclaw3, 123, 16, 5.7F, 8.0F, 3.5F, 1, 3, 0, 0.0F, true));

		rightfang = new ModelRenderer(this);
		rightfang.setRotationPoint(0.0F, 9.5F, 1.0F);
		setRotationAngle(rightfang, 0.2094F, 0.0F, 0.0F);
		rightfang.cubeList.add(new ModelBox(rightfang, 117, 16, -3.0F, -9.5F, -5.4F, 1, 5, 1, 0.0F, true));

		leftfang = new ModelRenderer(this);
		leftfang.setRotationPoint(0.0F, 9.5F, 1.0F);
		setRotationAngle(leftfang, 0.2094F, 0.0F, 0.0F);
		leftfang.cubeList.add(new ModelBox(leftfang, 117, 16, 2.0F, -9.5F, -5.4F, 1, 5, 1, 0.0F, true));

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 13.5F, 0.4F);
		setRotationAngle(tail1, -0.1396F, 0.0F, 0.0F);
		tail1.cubeList.add(new ModelBox(tail1, 44, 41, -3.5F, 0.0F, -2.0F, 7, 7, 4, 0.0F, true));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 17.5F, -0.3F);
		setRotationAngle(tail2, 1.0123F, 0.0F, 0.0F);
		tail2.cubeList.add(new ModelBox(tail2, 44, 41, -3.5F, -0.5F, -3.5F, 7, 7, 4, 0.0F, true));

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, 22.5F, 3.3F);
		setRotationAngle(tail3, 1.5708F, 0.0F, 0.0F);
		tail3.cubeList.add(new ModelBox(tail3, 68, 41, -3.0F, 0.0F, -1.5F, 6, 9, 3, 0.0F, true));

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.0F, 23.0F, 12.0F);
		setRotationAngle(tail4, 1.5708F, 0.0F, 0.0F);
		tail4.cubeList.add(new ModelBox(tail4, 90, 41, -2.0F, 0.0F, -1.0F, 4, 8, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		rightarm1.render(f5);
		leftarm1.render(f5);
		mouth.render(f5);
		body2.render(f5);
		rightarm2.render(f5);
		leftarm2.render(f5);
		rightclaw2.render(f5);
		rightclaw1.render(f5);
		rightclaw3.render(f5);
		leftclaw1.render(f5);
		leftclaw2.render(f5);
		leftclaw3.render(f5);
		rightfang.render(f5);
		leftfang.render(f5);
		tail1.render(f5);
		tail2.render(f5);
		tail3.render(f5);
		tail4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}