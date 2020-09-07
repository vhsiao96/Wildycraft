// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEverlasting extends ModelBase {
	private final ModelRenderer face;
	private final ModelRenderer body;
	private final ModelRenderer rightleg1;
	private final ModelRenderer leftleg1;
	private final ModelRenderer righthorn2;
	private final ModelRenderer lefthorn2;
	private final ModelRenderer righthorn1;
	private final ModelRenderer lefthorn1;
	private final ModelRenderer rump;
	private final ModelRenderer shell;
	private final ModelRenderer shell2;
	private final ModelRenderer rightleg2;
	private final ModelRenderer midhorn1;
	private final ModelRenderer midhorn2;
	private final ModelRenderer leftleg2;
	private final ModelRenderer leftfoot;
	private final ModelRenderer rightfoot;
	private final ModelRenderer tail1;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;
	private final ModelRenderer claw;
	private final ModelRenderer belly;

	public ModelEverlasting() {
		textureWidth = 256;
		textureHeight = 128;

		face = new ModelRenderer(this);
		face.setRotationPoint(0.0F, 3.0F, 2.0F);
		face.cubeList.add(new ModelBox(face, 195, 48, -5.5F, -4.0F, -17.0F, 11, 10, 4, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 3.0F, 2.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 114, 42, -10.0F, -15.0F, 0.0F, 20, 28, 2, 0.0F, true));

		rightleg1 = new ModelRenderer(this);
		rightleg1.setRotationPoint(-6.0F, 9.0F, 5.0F);
		setRotationAngle(rightleg1, 0.1222F, 0.0F, 0.0F);
		rightleg1.cubeList.add(new ModelBox(rightleg1, 135, 113, -7.0F, -3.0F, -3.5F, 7, 6, 7, 0.0F, true));

		leftleg1 = new ModelRenderer(this);
		leftleg1.setRotationPoint(6.0F, 9.0F, 5.0F);
		setRotationAngle(leftleg1, 0.1222F, 0.0F, 0.0F);
		leftleg1.cubeList.add(new ModelBox(leftleg1, 135, 113, 0.0F, -3.0F, -3.5F, 7, 6, 7, 0.0F, true));

		righthorn2 = new ModelRenderer(this);
		righthorn2.setRotationPoint(0.0F, 3.0F, 2.0F);
		setRotationAngle(righthorn2, -1.4486F, 0.0F, 0.0F);
		righthorn2.cubeList.add(new ModelBox(righthorn2, 200, 5, -10.1F, -9.4F, -9.3F, 2, 12, 2, 0.0F, true));

		lefthorn2 = new ModelRenderer(this);
		lefthorn2.setRotationPoint(0.0F, 3.0F, 2.0F);
		setRotationAngle(lefthorn2, -1.4486F, 0.0F, 0.0F);
		lefthorn2.cubeList.add(new ModelBox(lefthorn2, 200, 5, 7.9F, -9.4F, -9.3F, 2, 12, 2, 0.0F, true));

		righthorn1 = new ModelRenderer(this);
		righthorn1.setRotationPoint(0.0F, 3.0F, 2.0F);
		setRotationAngle(righthorn1, -0.5061F, 0.0F, 0.0F);
		righthorn1.cubeList.add(new ModelBox(righthorn1, 200, 25, -10.6F, -6.0F, -7.7F, 3, 8, 3, 0.0F, true));

		lefthorn1 = new ModelRenderer(this);
		lefthorn1.setRotationPoint(0.0F, 3.0F, 2.0F);
		setRotationAngle(lefthorn1, -0.5061F, 0.0F, 0.0F);
		lefthorn1.cubeList.add(new ModelBox(lefthorn1, 200, 25, 7.4F, -6.0F, -7.7F, 3, 8, 3, 0.0F, true));

		rump = new ModelRenderer(this);
		rump.setRotationPoint(-1.0F, 3.0F, 2.0F);
		rump.cubeList.add(new ModelBox(rump, 58, 53, -8.0F, -1.0F, 12.0F, 18, 3, 6, 0.0F, true));

		shell = new ModelRenderer(this);
		shell.setRotationPoint(0.0F, 3.0F, 2.0F);
		setRotationAngle(shell, 1.5533F, 0.0F, 0.0F);
		shell.cubeList.add(new ModelBox(shell, 118, 6, -7.5F, -14.0F, 0.0F, 15, 24, 8, 0.0F, true));

		shell2 = new ModelRenderer(this);
		shell2.setRotationPoint(0.0F, 3.0F, 2.0F);
		setRotationAngle(shell2, 1.5533F, 0.0F, 0.0F);
		shell2.cubeList.add(new ModelBox(shell2, 79, 14, -4.5F, -14.0F, 8.0F, 9, 19, 4, 0.0F, true));

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(-6.0F, 9.0F, 5.0F);
		setRotationAngle(rightleg2, -0.2967F, 0.0F, 0.0F);
		rightleg2.cubeList.add(new ModelBox(rightleg2, 170, 93, -6.0F, 1.0F, -1.0F, 5, 12, 5, 0.0F, true));

		midhorn1 = new ModelRenderer(this);
		midhorn1.setRotationPoint(0.0F, 3.0F, 2.0F);
		setRotationAngle(midhorn1, 1.6755F, 0.0F, 0.0F);
		midhorn1.cubeList.add(new ModelBox(midhorn1, 225, 25, -2.0F, -22.0F, 7.0F, 4, 10, 4, 0.0F, true));

		midhorn2 = new ModelRenderer(this);
		midhorn2.setRotationPoint(0.0F, 3.0F, 2.0F);
		setRotationAngle(midhorn2, 1.5533F, 0.0F, 0.0F);
		midhorn2.cubeList.add(new ModelBox(midhorn2, 226, 7, -1.5F, -31.0F, 5.0F, 3, 10, 3, 0.0F, true));

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(6.0F, 9.0F, 5.0F);
		setRotationAngle(leftleg2, -0.2967F, 0.0F, 0.0F);
		leftleg2.cubeList.add(new ModelBox(leftleg2, 170, 92, 1.0F, 1.0F, -1.0F, 5, 12, 5, 0.0F, true));

		leftfoot = new ModelRenderer(this);
		leftfoot.setRotationPoint(6.0F, 9.0F, 5.0F);
		leftfoot.cubeList.add(new ModelBox(leftfoot, 195, 95, -1.5F, 10.0F, -11.0F, 10, 5, 12, 0.0F, true));

		rightfoot = new ModelRenderer(this);
		rightfoot.setRotationPoint(-6.0F, 9.0F, 5.0F);
		rightfoot.cubeList.add(new ModelBox(rightfoot, 195, 95, -8.5F, 10.0F, -11.0F, 10, 5, 12, 0.0F, true));

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 3.0F, 15.0F);
		setRotationAngle(tail1, 0.5411F, 0.0F, 0.0F);
		tail1.cubeList.add(new ModelBox(tail1, 12, 45, -3.0F, -2.0F, 0.0F, 6, 4, 9, 0.0F, true));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, -0.4F, 21.9F);
		setRotationAngle(tail2, 1.3264F, 0.0F, 0.0F);
		tail2.cubeList.add(new ModelBox(tail2, 12, 45, -3.0F, -2.0F, 0.0F, 6, 4, 9, 0.0F, true));

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, -8.0F, 24.0F);
		setRotationAngle(tail3, 1.885F, 0.0F, 0.0F);
		tail3.cubeList.add(new ModelBox(tail3, 12, 45, -3.0F, -2.0F, 0.0F, 6, 4, 9, 0.0F, true));

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.0F, -15.0F, 23.0F);
		setRotationAngle(tail4, 3.0194F, 0.0F, 0.0F);
		tail4.cubeList.add(new ModelBox(tail4, 13, 71, -2.5F, -2.0F, 0.0F, 5, 4, 17, 0.0F, true));

		claw = new ModelRenderer(this);
		claw.setRotationPoint(0.0F, -15.0F, 23.0F);
		setRotationAngle(claw, 3.0194F, 0.0F, 0.0F);
		claw.cubeList.add(new ModelBox(claw, 70, 71, 0.0F, -6.5F, 11.0F, 0, 13, 14, 0.0F, true));

		belly = new ModelRenderer(this);
		belly.setRotationPoint(0.0F, 3.0F, 2.0F);
		setRotationAngle(belly, 1.5708F, 0.0F, 0.0F);
		belly.cubeList.add(new ModelBox(belly, 114, 75, -9.0F, -14.5F, -7.0F, 18, 27, 7, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		face.render(f5);
		body.render(f5);
		rightleg1.render(f5);
		leftleg1.render(f5);
		righthorn2.render(f5);
		lefthorn2.render(f5);
		righthorn1.render(f5);
		lefthorn1.render(f5);
		rump.render(f5);
		shell.render(f5);
		shell2.render(f5);
		rightleg2.render(f5);
		midhorn1.render(f5);
		midhorn2.render(f5);
		leftleg2.render(f5);
		leftfoot.render(f5);
		rightfoot.render(f5);
		tail1.render(f5);
		tail2.render(f5);
		tail3.render(f5);
		tail4.render(f5);
		claw.render(f5);
		belly.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}