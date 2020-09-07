// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPyrelord extends ModelBase {
	private final ModelRenderer higher_right_leg;
	private final ModelRenderer higher_left_leg;
	private final ModelRenderer lower_right_leg;
	private final ModelRenderer right_foot;
	private final ModelRenderer abdomonen;
	private final ModelRenderer lower_left_leg;
	private final ModelRenderer left_foot;
	private final ModelRenderer chest;
	private final ModelRenderer tail;
	private final ModelRenderer Right_arm;
	private final ModelRenderer Left_arm;
	private final ModelRenderer back_of_head;
	private final ModelRenderer forehead;
	private final ModelRenderer right_jaw_part;
	private final ModelRenderer left_jaw_part;
	private final ModelRenderer lower_jaw;
	private final ModelRenderer top;
	private final ModelRenderer right_tooth;
	private final ModelRenderer bottom_tooth;
	private final ModelRenderer left_tooth;

	public ModelPyrelord() {
		textureWidth = 64;
		textureHeight = 64;

		higher_right_leg = new ModelRenderer(this);
		higher_right_leg.setRotationPoint(-6.5F, 10.0F, 0.0F);
		setRotationAngle(higher_right_leg, 0.0F, -1.5708F, 2.082F);
		higher_right_leg.cubeList.add(new ModelBox(higher_right_leg, 24, 47, 0.0F, -1.0F, -1.0F, 7, 2, 2, 0.0F, true));

		higher_left_leg = new ModelRenderer(this);
		higher_left_leg.setRotationPoint(0.5F, 10.0F, 0.0F);
		setRotationAngle(higher_left_leg, 0.0F, -1.5708F, 2.082F);
		higher_left_leg.cubeList.add(new ModelBox(higher_left_leg, 24, 47, 0.0F, -1.0F, -1.0F, 7, 2, 2, 0.0F, true));

		lower_right_leg = new ModelRenderer(this);
		lower_right_leg.setRotationPoint(-6.5F, 10.0F, 0.0F);
		setRotationAngle(lower_right_leg, 0.0F, -1.5708F, 1.2641F);
		lower_right_leg.cubeList.add(new ModelBox(lower_right_leg, 24, 53, 5.0F, 4.0F, -1.0F, 8, 2, 2, 0.0F, true));

		right_foot = new ModelRenderer(this);
		right_foot.setRotationPoint(-6.5F, 10.0F, 0.0F);
		setRotationAngle(right_foot, 0.0F, -1.5708F, -0.0986F);
		right_foot.cubeList.add(new ModelBox(right_foot, 20, 59, -10.0F, 13.0F, -1.5F, 10, 1, 3, 0.0F, true));

		abdomonen = new ModelRenderer(this);
		abdomonen.setRotationPoint(-3.0F, 3.0F, 0.0F);
		setRotationAngle(abdomonen, 0.0F, -1.5708F, -0.3718F);
		abdomonen.cubeList.add(new ModelBox(abdomonen, 15, 29, -3.0F, 1.0F, -4.0F, 5, 6, 8, 0.0F, true));

		lower_left_leg = new ModelRenderer(this);
		lower_left_leg.setRotationPoint(0.5F, 10.0F, 0.0F);
		setRotationAngle(lower_left_leg, 0.0F, -1.5708F, 1.2641F);
		lower_left_leg.cubeList.add(new ModelBox(lower_left_leg, 24, 53, 5.0F, 4.0F, -1.0F, 8, 2, 2, 0.0F, true));

		left_foot = new ModelRenderer(this);
		left_foot.setRotationPoint(0.5F, 10.0F, 0.0F);
		setRotationAngle(left_foot, 0.0F, -1.5708F, -0.0986F);
		left_foot.cubeList.add(new ModelBox(left_foot, 20, 59, -10.0F, 13.0F, -1.5F, 10, 1, 3, 0.0F, true));

		chest = new ModelRenderer(this);
		chest.setRotationPoint(-3.0F, 3.0F, 0.0F);
		setRotationAngle(chest, 0.0F, -1.5708F, -0.1047F);
		chest.cubeList.add(new ModelBox(chest, 31, 12, -1.0F, -6.5F, -3.5F, 3, 9, 7, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-3.0F, 3.0F, 0.0F);
		setRotationAngle(tail, 0.0F, -1.5708F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 47, 38, 4.0F, 5.0F, -0.5F, 6, 1, 1, 0.0F, true));

		Right_arm = new ModelRenderer(this);
		Right_arm.setRotationPoint(0.0F, -2.0F, 0.0F);
		setRotationAngle(Right_arm, -0.3142F, -1.7612F, -0.1283F);
		Right_arm.cubeList.add(new ModelBox(Right_arm, 4, 28, -1.0F, 0.0F, -2.0F, 2, 12, 2, 0.0F, true));

		Left_arm = new ModelRenderer(this);
		Left_arm.setRotationPoint(-7.0F, -2.0F, 0.0F);
		setRotationAngle(Left_arm, 0.132F, 0.0233F, 0.3142F);
		Left_arm.cubeList.add(new ModelBox(Left_arm, 4, 28, -1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F, true));

		back_of_head = new ModelRenderer(this);
		back_of_head.setRotationPoint(-3.0F, -4.0F, 0.0F);
		setRotationAngle(back_of_head, 0.0F, -1.5708F, 0.0F);
		back_of_head.cubeList.add(new ModelBox(back_of_head, 19, 12, 0.5F, -3.0F, -2.0F, 1, 3, 4, 0.0F, true));

		forehead = new ModelRenderer(this);
		forehead.setRotationPoint(-3.0F, -4.0F, 0.0F);
		setRotationAngle(forehead, 0.0F, -1.5708F, 0.1047F);
		forehead.cubeList.add(new ModelBox(forehead, 7, 6, -4.0F, -4.0F, -2.0F, 5, 1, 4, 0.0F, true));

		right_jaw_part = new ModelRenderer(this);
		right_jaw_part.setRotationPoint(-3.0F, -4.0F, 0.0F);
		setRotationAngle(right_jaw_part, 0.0F, 1.6091F, 0.0F);
		right_jaw_part.cubeList.add(new ModelBox(right_jaw_part, 11, 14, -1.0F, -3.0F, -2.5F, 2, 3, 1, 0.0F, true));

		left_jaw_part = new ModelRenderer(this);
		left_jaw_part.setRotationPoint(-3.0F, -4.0F, 0.0F);
		setRotationAngle(left_jaw_part, 0.0F, -1.5708F, 0.0873F);
		left_jaw_part.cubeList.add(new ModelBox(left_jaw_part, 11, 14, -1.0F, -3.0F, -2.5F, 2, 3, 1, 0.0F, true));

		lower_jaw = new ModelRenderer(this);
		lower_jaw.setRotationPoint(-3.0F, -4.0F, 0.0F);
		setRotationAngle(lower_jaw, 0.0F, -1.5708F, 0.1222F);
		lower_jaw.cubeList.add(new ModelBox(lower_jaw, 4, 20, -4.0F, -0.2F, -2.0F, 5, 1, 4, 0.0F, true));

		top = new ModelRenderer(this);
		top.setRotationPoint(-3.0F, -4.0F, 0.0F);
		setRotationAngle(top, 0.0F, -1.5708F, 0.1047F);
		top.cubeList.add(new ModelBox(top, 10, 0, -2.5F, -5.0F, -1.5F, 3, 2, 3, 0.0F, true));

		right_tooth = new ModelRenderer(this);
		right_tooth.setRotationPoint(-3.0F, -4.0F, 0.0F);
		setRotationAngle(right_tooth, 0.0F, -1.5708F, 0.1047F);
		right_tooth.cubeList.add(new ModelBox(right_tooth, 7, 13, -4.0F, -3.0F, 1.5F, 1, 2, 0, 0.0F, true));

		bottom_tooth = new ModelRenderer(this);
		bottom_tooth.setRotationPoint(-3.0F, -4.0F, 0.0F);
		setRotationAngle(bottom_tooth, 0.0F, -1.5708F, 0.1396F);
		bottom_tooth.cubeList.add(new ModelBox(bottom_tooth, 5, 18, -4.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

		left_tooth = new ModelRenderer(this);
		left_tooth.setRotationPoint(-3.0F, -4.0F, 0.0F);
		setRotationAngle(left_tooth, 0.0F, -1.5708F, 0.1047F);
		left_tooth.cubeList.add(new ModelBox(left_tooth, 7, 13, -4.0F, -3.0F, -1.5F, 1, 2, 0, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		higher_right_leg.render(f5);
		higher_left_leg.render(f5);
		lower_right_leg.render(f5);
		right_foot.render(f5);
		abdomonen.render(f5);
		lower_left_leg.render(f5);
		left_foot.render(f5);
		chest.render(f5);
		tail.render(f5);
		Right_arm.render(f5);
		Left_arm.render(f5);
		back_of_head.render(f5);
		forehead.render(f5);
		right_jaw_part.render(f5);
		left_jaw_part.render(f5);
		lower_jaw.render(f5);
		top.render(f5);
		right_tooth.render(f5);
		bottom_tooth.render(f5);
		left_tooth.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}