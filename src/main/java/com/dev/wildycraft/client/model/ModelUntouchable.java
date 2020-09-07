// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelUntouchable extends ModelBase {
	private final ModelRenderer ring;
	private final ModelRenderer abdomen;
	private final ModelRenderer torso;
	private final ModelRenderer rightarm1;
	private final ModelRenderer rightarm2;
	private final ModelRenderer righthand;
	private final ModelRenderer leftarm1;
	private final ModelRenderer lefttarm2;
	private final ModelRenderer lefthand;
	private final ModelRenderer head;
	private final ModelRenderer clasp;
	private final ModelRenderer loop1;
	private final ModelRenderer loop2;
	private final ModelRenderer spike1;
	private final ModelRenderer spike2;
	private final ModelRenderer spike3;
	private final ModelRenderer spike4;

	public ModelUntouchable() {
		textureWidth = 256;
		textureHeight = 128;

		ring = new ModelRenderer(this);
		ring.setRotationPoint(0.0F, 5.0F, 0.0F);
		ring.cubeList.add(new ModelBox(ring, 59, 88, -16.0F, 15.0F, -16.0F, 32, 4, 32, 0.0F, true));

		abdomen = new ModelRenderer(this);
		abdomen.setRotationPoint(0.0F, 5.0F, 0.0F);
		abdomen.cubeList.add(new ModelBox(abdomen, 76, 52, -11.5F, 8.0F, -11.5F, 23, 10, 23, 0.0F, true));

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 5.0F, 0.0F);
		torso.cubeList.add(new ModelBox(torso, 90, 11, -8.5F, -8.0F, -8.5F, 17, 19, 17, 0.0F, true));

		rightarm1 = new ModelRenderer(this);
		rightarm1.setRotationPoint(-8.0F, 2.0F, 0.0F);
		rightarm1.cubeList.add(new ModelBox(rightarm1, 175, 42, -14.0F, -4.5F, -4.5F, 14, 9, 9, 0.0F, true));

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(-8.0F, 2.0F, 0.0F);
		rightarm2.cubeList.add(new ModelBox(rightarm2, 175, 65, -13.0F, -4.0F, -14.0F, 8, 8, 10, 0.0F, true));

		righthand = new ModelRenderer(this);
		righthand.setRotationPoint(-8.0F, 2.0F, 0.0F);
		righthand.cubeList.add(new ModelBox(righthand, 209, 89, -13.5F, -6.0F, -22.0F, 9, 12, 9, 0.0F, true));

		leftarm1 = new ModelRenderer(this);
		leftarm1.setRotationPoint(8.0F, 2.0F, 0.0F);
		leftarm1.cubeList.add(new ModelBox(leftarm1, 175, 42, 0.0F, -4.5F, -4.5F, 14, 9, 9, 0.0F, true));

		lefttarm2 = new ModelRenderer(this);
		lefttarm2.setRotationPoint(8.0F, 2.0F, 0.0F);
		lefttarm2.cubeList.add(new ModelBox(lefttarm2, 175, 65, 5.0F, -4.0F, -14.0F, 8, 8, 10, 0.0F, true));

		lefthand = new ModelRenderer(this);
		lefthand.setRotationPoint(8.0F, 2.0F, 0.0F);
		lefthand.cubeList.add(new ModelBox(lefthand, 209, 89, 4.5F, -6.0F, -22.0F, 9, 12, 9, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 168, 4, -4.5F, -8.0F, -10.0F, 9, 8, 19, 0.0F, true));

		clasp = new ModelRenderer(this);
		clasp.setRotationPoint(0.0F, 5.0F, 0.0F);
		clasp.cubeList.add(new ModelBox(clasp, 30, 43, -3.5F, -5.0F, -10.0F, 7, 6, 2, 0.0F, true));

		loop1 = new ModelRenderer(this);
		loop1.setRotationPoint(0.0F, 5.0F, 0.0F);
		setRotationAngle(loop1, 0.0F, 0.0F, 0.9774F);
		loop1.cubeList.add(new ModelBox(loop1, 11, 56, -4.0F, -12.0F, -9.4F, 3, 21, 19, 0.0F, true));

		loop2 = new ModelRenderer(this);
		loop2.setRotationPoint(0.0F, 5.0F, 0.0F);
		setRotationAngle(loop2, 0.0F, 0.0F, -0.9774F);
		loop2.cubeList.add(new ModelBox(loop2, 11, 56, 1.0F, -12.0F, -9.4F, 3, 21, 19, 0.0F, true));

		spike1 = new ModelRenderer(this);
		spike1.setRotationPoint(0.0F, -1.0F, 0.0F);
		spike1.cubeList.add(new ModelBox(spike1, 21, 22, -1.5F, -12.0F, -4.0F, 3, 4, 3, 0.0F, true));

		spike2 = new ModelRenderer(this);
		spike2.setRotationPoint(0.0F, -1.0F, 0.0F);
		spike2.cubeList.add(new ModelBox(spike2, 51, 22, -1.5F, -11.5F, 1.5F, 3, 4, 3, 0.0F, true));

		spike3 = new ModelRenderer(this);
		spike3.setRotationPoint(0.0F, -1.0F, 0.0F);
		spike3.cubeList.add(new ModelBox(spike3, 21, 6, -1.0F, -10.0F, -8.0F, 2, 3, 2, 0.0F, true));

		spike4 = new ModelRenderer(this);
		spike4.setRotationPoint(0.0F, -1.0F, 0.0F);
		spike4.cubeList.add(new ModelBox(spike4, 45, 6, -1.0F, -9.0F, 6.0F, 2, 3, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ring.render(f5);
		abdomen.render(f5);
		torso.render(f5);
		rightarm1.render(f5);
		rightarm2.render(f5);
		righthand.render(f5);
		leftarm1.render(f5);
		lefttarm2.render(f5);
		lefthand.render(f5);
		head.render(f5);
		clasp.render(f5);
		loop1.render(f5);
		loop2.render(f5);
		spike1.render(f5);
		spike2.render(f5);
		spike3.render(f5);
		spike4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}