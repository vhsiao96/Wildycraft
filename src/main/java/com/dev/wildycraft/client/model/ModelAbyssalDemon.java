// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAbyssalDemon extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer middle;
	private final ModelRenderer neck;
	private final ModelRenderer back_of_head;
	private final ModelRenderer segment_1;
	private final ModelRenderer segment_2;
	private final ModelRenderer Segment_3;
	private final ModelRenderer segment_4;
	private final ModelRenderer foot_3;
	private final ModelRenderer foot_4;
	private final ModelRenderer arm_1;
	private final ModelRenderer arm_2;
	private final ModelRenderer foot_1;
	private final ModelRenderer foot2;
	private final ModelRenderer hand_1;
	private final ModelRenderer Hand_2;
	private final ModelRenderer claw_1;
	private final ModelRenderer claw_2;

	public ModelAbyssalDemon() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(-1.0F, 5.0F, 0.0F);
		setRotationAngle(head, 0.0F, 3.1416F, 0.0F);
		head.cubeList.add(new ModelBox(head, 15, 0, -4.0F, -7.0F, -2.0F, 6, 5, 9, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 13.0F, -3.0F);
		body.cubeList.add(new ModelBox(body, 29, 46, -4.0F, 0.0F, -2.0F, 8, 5, 9, 0.0F, true));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(0.0F, 13.0F, -3.0F);
		setRotationAngle(leg3, 2.4086F, -2.5482F, 0.0F);
		leg3.cubeList.add(new ModelBox(leg3, 19, 47, 1.0F, -1.0F, -6.0F, 2, 10, 2, 0.0F, true));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(0.0F, 13.0F, -3.0F);
		setRotationAngle(leg4, -2.4086F, -0.9076F, 0.0F);
		leg4.cubeList.add(new ModelBox(leg4, 19, 47, 0.0F, -1.0F, 4.0F, 2, 10, 2, 0.0F, true));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.0F, 13.0F, -3.0F);
		setRotationAngle(leg1, 2.4086F, -0.8552F, 0.0F);
		leg1.cubeList.add(new ModelBox(leg1, 19, 47, 1.5F, 1.0F, -8.0F, 2, 10, 2, 0.0F, true));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(0.0F, 13.0F, -3.0F);
		setRotationAngle(leg2, 2.4086F, 0.5585F, 0.0F);
		leg2.cubeList.add(new ModelBox(leg2, 19, 47, -1.0F, 1.0F, -8.0F, 2, 10, 2, 0.0F, true));

		middle = new ModelRenderer(this);
		middle.setRotationPoint(0.0F, 13.0F, -3.0F);
		middle.cubeList.add(new ModelBox(middle, 24, 26, -2.0F, -8.0F, 0.0F, 4, 8, 5, 0.0F, true));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(-1.0F, 6.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 27, 18, 0.0F, -3.0F, -2.0F, 2, 2, 3, 0.0F, true));

		back_of_head = new ModelRenderer(this);
		back_of_head.setRotationPoint(-1.0F, 5.0F, 0.0F);
		back_of_head.cubeList.add(new ModelBox(back_of_head, 46, 0, -2.0F, -7.0F, 2.0F, 6, 1, 3, 0.0F, true));

		segment_1 = new ModelRenderer(this);
		segment_1.setRotationPoint(-8.0F, 10.0F, 7.0F);
		setRotationAngle(segment_1, 0.0F, -0.8552F, 0.0F);
		segment_1.cubeList.add(new ModelBox(segment_1, 9, 47, -0.7F, 0.0F, -1.0F, 2, 12, 2, 0.0F, true));

		segment_2 = new ModelRenderer(this);
		segment_2.setRotationPoint(6.4F, 10.0F, 7.0F);
		setRotationAngle(segment_2, 0.0F, 0.5236F, 0.0F);
		segment_2.cubeList.add(new ModelBox(segment_2, 9, 47, -1.0F, 0.0F, 0.0F, 2, 12, 2, 0.0F, true));

		Segment_3 = new ModelRenderer(this);
		Segment_3.setRotationPoint(-8.0F, 10.0F, -11.0F);
		setRotationAngle(Segment_3, 0.0F, 0.6458F, 0.0F);
		Segment_3.cubeList.add(new ModelBox(Segment_3, 9, 47, -1.0F, 0.0F, 0.0F, 2, 12, 2, 0.0F, true));

		segment_4 = new ModelRenderer(this);
		segment_4.setRotationPoint(8.0F, 10.0F, -8.0F);
		setRotationAngle(segment_4, 0.0F, 0.5934F, 0.0F);
		segment_4.cubeList.add(new ModelBox(segment_4, 9, 47, 0.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F, true));

		foot_3 = new ModelRenderer(this);
		foot_3.setRotationPoint(-8.0F, 10.0F, -11.0F);
		setRotationAngle(foot_3, 0.0F, -2.6005F, 0.0F);
		foot_3.cubeList.add(new ModelBox(foot_3, 3, 49, 0.0F, 12.0F, -1.5F, 0, 2, 1, 0.0F, true));

		foot_4 = new ModelRenderer(this);
		foot_4.setRotationPoint(8.0F, 10.0F, -8.0F);
		setRotationAngle(foot_4, 0.0F, 2.1293F, 0.0F);
		foot_4.cubeList.add(new ModelBox(foot_4, 3, 49, 0.0F, 12.0F, 0.5F, 0, 2, 1, 0.0F, true));

		arm_1 = new ModelRenderer(this);
		arm_1.setRotationPoint(2.0F, 8.0F, -1.0F);
		setRotationAngle(arm_1, 0.0F, 0.0F, -1.5708F);
		arm_1.cubeList.add(new ModelBox(arm_1, 15, 28, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, true));

		arm_2 = new ModelRenderer(this);
		arm_2.setRotationPoint(-1.0F, 7.0F, -1.0F);
		setRotationAngle(arm_2, 0.0F, 0.0F, 1.5708F);
		arm_2.cubeList.add(new ModelBox(arm_2, 15, 28, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, true));

		foot_1 = new ModelRenderer(this);
		foot_1.setRotationPoint(-8.0F, 10.0F, 7.0F);
		setRotationAngle(foot_1, 0.0F, -0.8378F, 0.0F);
		foot_1.cubeList.add(new ModelBox(foot_1, 3, 49, 0.3F, 12.0F, -0.5F, 0, 2, 1, 0.0F, true));

		foot2 = new ModelRenderer(this);
		foot2.setRotationPoint(6.4F, 10.0F, 7.0F);
		setRotationAngle(foot2, 0.0F, 0.4538F, 0.0F);
		foot2.cubeList.add(new ModelBox(foot2, 3, 49, 0.0F, 12.0F, 0.0F, 0, 2, 1, 0.0F, true));

		hand_1 = new ModelRenderer(this);
		hand_1.setRotationPoint(2.0F, 8.1F, -1.0F);
		setRotationAngle(hand_1, -1.5708F, 0.0F, 0.0F);
		hand_1.cubeList.add(new ModelBox(hand_1, 8, 31, 7.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, true));

		Hand_2 = new ModelRenderer(this);
		Hand_2.setRotationPoint(-1.0F, 7.0F, -1.0F);
		setRotationAngle(Hand_2, -1.5708F, 0.0F, 0.0F);
		Hand_2.cubeList.add(new ModelBox(Hand_2, 8, 31, -8.0F, 0.0F, 0.1F, 1, 2, 1, 0.0F, true));

		claw_1 = new ModelRenderer(this);
		claw_1.setRotationPoint(2.0F, 8.0F, -1.0F);
		setRotationAngle(claw_1, -1.5708F, 0.0F, 0.0F);
		claw_1.cubeList.add(new ModelBox(claw_1, 2, 31, 7.5F, 2.0F, -0.9F, 0, 1, 1, 0.0F, true));

		claw_2 = new ModelRenderer(this);
		claw_2.setRotationPoint(-1.0F, 7.0F, -1.0F);
		setRotationAngle(claw_2, -1.5708F, 0.0F, 0.0F);
		claw_2.cubeList.add(new ModelBox(claw_2, 2, 31, -7.5F, 2.0F, 0.1F, 0, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		middle.render(f5);
		neck.render(f5);
		back_of_head.render(f5);
		segment_1.render(f5);
		segment_2.render(f5);
		Segment_3.render(f5);
		segment_4.render(f5);
		foot_3.render(f5);
		foot_4.render(f5);
		arm_1.render(f5);
		arm_2.render(f5);
		foot_1.render(f5);
		foot2.render(f5);
		hand_1.render(f5);
		Hand_2.render(f5);
		claw_1.render(f5);
		claw_2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}