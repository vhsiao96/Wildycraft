// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLesserDemon extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer chest;
	private final ModelRenderer rightuparm;
	private final ModelRenderer leftuparm;
	private final ModelRenderer rightthigh;
	private final ModelRenderer leftthigh;
	private final ModelRenderer abdomen;
	private final ModelRenderer right_lowarm;
	private final ModelRenderer leftlowarm;
	private final ModelRenderer lefthorn1;
	private final ModelRenderer lefthorn2;
	private final ModelRenderer lefthorn3;
	private final ModelRenderer righthorn1;
	private final ModelRenderer righthorn2;
	private final ModelRenderer righthorn3;
	private final ModelRenderer rightlowerleg;
	private final ModelRenderer leftlowerleg;
	private final ModelRenderer tail;
	private final ModelRenderer tailspike1;
	private final ModelRenderer tailspike2;
	private final ModelRenderer tailspiketip;
	private final ModelRenderer leftankle;
	private final ModelRenderer lefthoof;
	private final ModelRenderer rightankle;
	private final ModelRenderer righthoof;

	public ModelLesserDemon() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, -39.0F, -0.5F);
		setRotationAngle(head, 0.1047F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 88, 17, -7.5F, -14.0F, -7.5F, 15, 14, 15, 0.0F, true));

		chest = new ModelRenderer(this);
		chest.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(chest, 0.1396F, 0.0F, 0.0F);
		chest.cubeList.add(new ModelBox(chest, 71, 58, -12.5F, -39.0F, -2.0F, 27, 15, 16, 0.0F, true));

		rightuparm = new ModelRenderer(this);
		rightuparm.setRotationPoint(-11.5F, -37.0F, 3.0F);
		setRotationAngle(rightuparm, 0.0F, 0.0F, 0.0524F);
		rightuparm.cubeList.add(new ModelBox(rightuparm, 180, 58, -10.0F, -2.0F, -6.0F, 10, 19, 10, 0.0F, true));

		leftuparm = new ModelRenderer(this);
		leftuparm.setRotationPoint(13.5F, -37.0F, 3.0F);
		setRotationAngle(leftuparm, 0.0F, 0.0F, -0.0524F);
		leftuparm.cubeList.add(new ModelBox(leftuparm, 180, 58, 0.0F, -2.0F, -6.0F, 10, 19, 10, 0.0F, true));

		rightthigh = new ModelRenderer(this);
		rightthigh.setRotationPoint(-5.0F, -12.0F, 2.0F);
		setRotationAngle(rightthigh, -0.8727F, 0.0F, 0.0F);
		rightthigh.cubeList.add(new ModelBox(rightthigh, 90, 143, -5.0F, 0.0F, -5.0F, 10, 19, 10, 0.0F, true));

		leftthigh = new ModelRenderer(this);
		leftthigh.setRotationPoint(7.0F, -12.0F, 2.0F);
		setRotationAngle(leftthigh, -0.8727F, 0.0F, 0.0F);
		leftthigh.cubeList.add(new ModelBox(leftthigh, 90, 143, -5.0F, 0.0F, -5.0F, 10, 19, 10, 0.0F, true));

		abdomen = new ModelRenderer(this);
		abdomen.setRotationPoint(0.0F, 0.0F, 0.0F);
		abdomen.cubeList.add(new ModelBox(abdomen, 76, 100, -10.0F, -26.0F, -4.8F, 22, 20, 14, 0.0F, true));

		right_lowarm = new ModelRenderer(this);
		right_lowarm.setRotationPoint(-11.5F, -37.0F, 3.0F);
		setRotationAngle(right_lowarm, 2.4784F, 0.0F, 0.0524F);
		right_lowarm.cubeList.add(new ModelBox(right_lowarm, 183, 97, -8.5F, -34.0F, -13.0F, 7, 24, 7, 0.0F, true));

		leftlowarm = new ModelRenderer(this);
		leftlowarm.setRotationPoint(13.5F, -37.0F, 3.0F);
		setRotationAngle(leftlowarm, 2.4784F, 0.0F, -0.0524F);
		leftlowarm.cubeList.add(new ModelBox(leftlowarm, 183, 97, 1.5F, -34.0F, -13.0F, 7, 24, 7, 0.0F, true));

		lefthorn1 = new ModelRenderer(this);
		lefthorn1.setRotationPoint(1.0F, -39.0F, -0.5F);
		setRotationAngle(lefthorn1, 0.3142F, 0.0F, 1.5708F);
		lefthorn1.cubeList.add(new ModelBox(lefthorn1, 55, 38, -12.0F, -14.0F, 1.0F, 4, 8, 4, 0.0F, true));

		lefthorn2 = new ModelRenderer(this);
		lefthorn2.setRotationPoint(1.0F, -39.0F, -0.5F);
		setRotationAngle(lefthorn2, 1.1694F, 0.0F, 1.5908F);
		lefthorn2.cubeList.add(new ModelBox(lefthorn2, 56, 23, -12.0F, -15.0F, 10.1F, 3, 9, 3, 0.0F, true));

		lefthorn3 = new ModelRenderer(this);
		lefthorn3.setRotationPoint(1.0F, -39.0F, -0.5F);
		setRotationAngle(lefthorn3, 0.0F, 1.5708F, 1.5359F);
		lefthorn3.cubeList.add(new ModelBox(lefthorn3, 59, 6, -11.0F, -20.0F, 15.3F, 2, 11, 2, 0.0F, true));

		righthorn1 = new ModelRenderer(this);
		righthorn1.setRotationPoint(1.0F, -39.0F, -0.5F);
		setRotationAngle(righthorn1, -0.3142F, 0.0F, 1.5708F);
		righthorn1.cubeList.add(new ModelBox(righthorn1, 55, 38, -12.0F, 6.0F, 1.0F, 4, 8, 4, 0.0F, true));

		righthorn2 = new ModelRenderer(this);
		righthorn2.setRotationPoint(1.0F, -39.0F, -0.5F);
		setRotationAngle(righthorn2, 1.2043F, 0.0F, -1.5708F);
		righthorn2.cubeList.add(new ModelBox(righthorn2, 56, 23, 8.8F, -15.0F, 10.1F, 3, 9, 3, 0.0F, true));

		righthorn3 = new ModelRenderer(this);
		righthorn3.setRotationPoint(1.0F, -39.0F, -0.5F);
		setRotationAngle(righthorn3, 0.0F, -1.5708F, -1.5359F);
		righthorn3.cubeList.add(new ModelBox(righthorn3, 59, 6, 9.0F, -20.0F, 14.9F, 2, 11, 2, 0.0F, true));

		rightlowerleg = new ModelRenderer(this);
		rightlowerleg.setRotationPoint(-5.0F, -12.0F, 2.0F);
		setRotationAngle(rightlowerleg, 0.7679F, 0.0F, 0.0F);
		rightlowerleg.cubeList.add(new ModelBox(rightlowerleg, 95, 181, -4.0F, 3.5F, -18.9F, 8, 15, 8, 0.0F, true));

		leftlowerleg = new ModelRenderer(this);
		leftlowerleg.setRotationPoint(7.0F, -12.0F, 2.0F);
		setRotationAngle(leftlowerleg, 0.7854F, 0.0F, 0.0F);
		leftlowerleg.cubeList.add(new ModelBox(leftlowerleg, 95, 181, -4.0F, 3.5F, -18.9F, 8, 15, 8, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tail, 2.5133F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 18, 98, 0.5F, 10.0F, -3.5F, 2, 38, 2, 0.0F, true));

		tailspike1 = new ModelRenderer(this);
		tailspike1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tailspike1, 0.9774F, 0.0F, 0.0F);
		tailspike1.cubeList.add(new ModelBox(tailspike1, 16, 71, -0.5F, 3.0F, 48.0F, 4, 3, 4, 0.0F, true));

		tailspike2 = new ModelRenderer(this);
		tailspike2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tailspike2, 0.9774F, 0.0F, 0.0F);
		tailspike2.cubeList.add(new ModelBox(tailspike2, 21, 73, 0.0F, 3.5F, 52.0F, 3, 2, 2, 0.0F, true));

		tailspiketip = new ModelRenderer(this);
		tailspiketip.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tailspiketip, 0.9774F, 0.0F, 0.0F);
		tailspiketip.cubeList.add(new ModelBox(tailspiketip, 25, 75, 0.5F, 4.0F, 54.0F, 2, 1, 1, 0.0F, true));

		leftankle = new ModelRenderer(this);
		leftankle.setRotationPoint(8.0F, -12.0F, 2.0F);
		setRotationAngle(leftankle, -0.576F, 0.0F, 0.0F);
		leftankle.cubeList.add(new ModelBox(leftankle, 148, 161, -4.0F, 15.0F, 10.0F, 6, 17, 6, 0.0F, true));

		lefthoof = new ModelRenderer(this);
		lefthoof.setRotationPoint(8.0F, -12.0F, 2.0F);
		lefthoof.cubeList.add(new ModelBox(lefthoof, 142, 192, -6.0F, 30.0F, -13.0F, 10, 6, 10, 0.0F, true));

		rightankle = new ModelRenderer(this);
		rightankle.setRotationPoint(-6.0F, -12.0F, 2.0F);
		setRotationAngle(rightankle, -0.576F, 0.0F, 0.0F);
		rightankle.cubeList.add(new ModelBox(rightankle, 148, 161, -2.0F, 15.0F, 10.0F, 6, 17, 6, 0.0F, true));

		righthoof = new ModelRenderer(this);
		righthoof.setRotationPoint(-6.0F, -12.0F, 2.0F);
		righthoof.cubeList.add(new ModelBox(righthoof, 142, 192, -4.0F, 30.0F, -13.0F, 10, 6, 10, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		chest.render(f5);
		rightuparm.render(f5);
		leftuparm.render(f5);
		rightthigh.render(f5);
		leftthigh.render(f5);
		abdomen.render(f5);
		right_lowarm.render(f5);
		leftlowarm.render(f5);
		lefthorn1.render(f5);
		lefthorn2.render(f5);
		lefthorn3.render(f5);
		righthorn1.render(f5);
		righthorn2.render(f5);
		righthorn3.render(f5);
		rightlowerleg.render(f5);
		leftlowerleg.render(f5);
		tail.render(f5);
		tailspike1.render(f5);
		tailspike2.render(f5);
		tailspiketip.render(f5);
		leftankle.render(f5);
		lefthoof.render(f5);
		rightankle.render(f5);
		righthoof.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}