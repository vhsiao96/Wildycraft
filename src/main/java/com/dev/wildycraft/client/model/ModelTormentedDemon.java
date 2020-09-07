// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTormentedDemon extends ModelBase {
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
	private final ModelRenderer leftgauntlet;
	private final ModelRenderer righthorn1;
	private final ModelRenderer righthorn2;
	private final ModelRenderer rightgauntlet;
	private final ModelRenderer rightlowerleg;
	private final ModelRenderer leftlowerleg;
	private final ModelRenderer leftankle;
	private final ModelRenderer lefthoof;
	private final ModelRenderer rightankle;
	private final ModelRenderer righthoof;
	private final ModelRenderer rightshoulderplate;
	private final ModelRenderer leftshoulderplate;
	private final ModelRenderer rightclaw2;
	private final ModelRenderer rightclaw1;
	private final ModelRenderer leftclaw1;
	private final ModelRenderer leftclaw2;
	private final ModelRenderer toprib;
	private final ModelRenderer bottomchestpiece;
	private final ModelRenderer ribsegment;
	private final ModelRenderer rib2;
	private final ModelRenderer rightrib3;
	private final ModelRenderer leftrib3;
	private final ModelRenderer rib3segment;
	private final ModelRenderer tail;
	private final ModelRenderer mageIcon;
	private final ModelRenderer meleeIcon;
	private final ModelRenderer rangeIcon;

	public ModelTormentedDemon() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, -45.0F, -0.5F);
		setRotationAngle(head, 0.1047F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 88, 17, -7.5F, -14.0F, -7.5F, 15, 14, 15, 0.0F, true));

		chest = new ModelRenderer(this);
		chest.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(chest, 0.1396F, 0.0F, 0.0F);
		chest.cubeList.add(new ModelBox(chest, 67, 58, -12.5F, -45.0F, -2.0F, 27, 11, 16, 0.0F, true));

		rightuparm = new ModelRenderer(this);
		rightuparm.setRotationPoint(-12.5F, -43.0F, 0.0F);
		setRotationAngle(rightuparm, 0.0F, 0.0F, 0.0524F);
		rightuparm.cubeList.add(new ModelBox(rightuparm, 196, 82, -6.0F, -1.0F, -3.0F, 6, 18, 6, 0.0F, true));

		leftuparm = new ModelRenderer(this);
		leftuparm.setRotationPoint(14.5F, -43.0F, 0.0F);
		setRotationAngle(leftuparm, 0.0F, 0.0F, -0.0524F);
		leftuparm.cubeList.add(new ModelBox(leftuparm, 159, 78, 0.0F, -2.0F, -3.0F, 8, 19, 8, 0.0F, true));

		rightthigh = new ModelRenderer(this);
		rightthigh.setRotationPoint(-5.0F, -18.0F, 2.0F);
		setRotationAngle(rightthigh, -0.2618F, -0.192F, 0.0F);
		rightthigh.cubeList.add(new ModelBox(rightthigh, 43, 143, -5.0F, 0.0F, -5.0F, 8, 19, 8, 0.0F, true));

		leftthigh = new ModelRenderer(this);
		leftthigh.setRotationPoint(7.0F, -18.0F, 2.0F);
		setRotationAngle(leftthigh, -0.4014F, 0.0F, 0.0F);
		leftthigh.cubeList.add(new ModelBox(leftthigh, 90, 143, -4.5F, 0.0F, -5.0F, 7, 19, 7, 0.0F, true));

		abdomen = new ModelRenderer(this);
		abdomen.setRotationPoint(0.0F, 0.0F, 0.0F);
		abdomen.cubeList.add(new ModelBox(abdomen, 91, 100, -7.0F, -36.0F, -4.8F, 16, 19, 14, 0.0F, true));

		right_lowarm = new ModelRenderer(this);
		right_lowarm.setRotationPoint(-12.5F, -43.0F, 0.0F);
		setRotationAngle(right_lowarm, 2.9322F, 0.0F, 0.0524F);
		right_lowarm.cubeList.add(new ModelBox(right_lowarm, 196, 112, -6.0F, -35.0F, -7.0F, 6, 19, 6, 0.0F, true));

		leftlowarm = new ModelRenderer(this);
		leftlowarm.setRotationPoint(13.5F, -43.0F, 0.0F);
		setRotationAngle(leftlowarm, 2.5656F, 0.0F, -0.0524F);
		leftlowarm.cubeList.add(new ModelBox(leftlowarm, 161, 109, 1.5F, -35.0F, -13.0F, 7, 24, 7, 0.0F, true));

		lefthorn1 = new ModelRenderer(this);
		lefthorn1.setRotationPoint(1.0F, -45.0F, -0.5F);
		setRotationAngle(lefthorn1, 0.2094F, 0.0F, 1.5708F);
		lefthorn1.cubeList.add(new ModelBox(lefthorn1, 55, 38, -12.0F, -14.0F, 1.0F, 4, 8, 4, 0.0F, true));

		lefthorn2 = new ModelRenderer(this);
		lefthorn2.setRotationPoint(1.0F, -45.0F, -0.5F);
		setRotationAngle(lefthorn2, 0.192F, 0.0F, 1.5708F);
		lefthorn2.cubeList.add(new ModelBox(lefthorn2, 56, 23, -12.0F, -23.0F, 1.1F, 3, 9, 3, 0.0F, true));

		leftgauntlet = new ModelRenderer(this);
		leftgauntlet.setRotationPoint(14.5F, -43.0F, 0.0F);
		setRotationAngle(leftgauntlet, 2.5656F, 0.0F, -0.0524F);
		leftgauntlet.cubeList.add(new ModelBox(leftgauntlet, 200, 150, -0.5F, -38.0F, -14.0F, 9, 12, 9, 0.0F, true));

		righthorn1 = new ModelRenderer(this);
		righthorn1.setRotationPoint(1.0F, -45.0F, -0.5F);
		setRotationAngle(righthorn1, -0.2094F, 0.0F, 1.5708F);
		righthorn1.cubeList.add(new ModelBox(righthorn1, 55, 38, -12.0F, 6.0F, 1.0F, 4, 8, 4, 0.0F, true));

		righthorn2 = new ModelRenderer(this);
		righthorn2.setRotationPoint(1.0F, -45.0F, -0.5F);
		setRotationAngle(righthorn2, 0.192F, 0.0F, -1.5708F);
		righthorn2.cubeList.add(new ModelBox(righthorn2, 56, 23, 8.8F, -21.0F, 1.1F, 3, 9, 3, 0.0F, true));

		rightgauntlet = new ModelRenderer(this);
		rightgauntlet.setRotationPoint(-12.5F, -43.0F, 0.0F);
		setRotationAngle(rightgauntlet, 2.9322F, 0.0F, 0.0524F);
		rightgauntlet.cubeList.add(new ModelBox(rightgauntlet, 152, 145, -7.5F, -42.0F, -8.5F, 9, 12, 9, 0.0F, true));

		rightlowerleg = new ModelRenderer(this);
		rightlowerleg.setRotationPoint(-5.0F, -18.0F, 2.0F);
		setRotationAngle(rightlowerleg, 0.7679F, -0.192F, 0.0873F);
		rightlowerleg.cubeList.add(new ModelBox(rightlowerleg, 47, 175, -3.5F, 5.5F, -18.9F, 7, 15, 7, 0.0F, true));

		leftlowerleg = new ModelRenderer(this);
		leftlowerleg.setRotationPoint(7.0F, -18.0F, 2.0F);
		setRotationAngle(leftlowerleg, 0.576F, 0.0F, 0.0F);
		leftlowerleg.cubeList.add(new ModelBox(leftlowerleg, 95, 175, -4.0F, 6.5F, -17.9F, 6, 12, 6, 0.0F, true));

		leftankle = new ModelRenderer(this);
		leftankle.setRotationPoint(8.0F, -18.0F, 2.0F);
		setRotationAngle(leftankle, -0.192F, 0.0F, 0.0F);
		leftankle.cubeList.add(new ModelBox(leftankle, 103, 197, -4.0F, 21.0F, -2.0F, 4, 17, 4, 0.0F, true));

		lefthoof = new ModelRenderer(this);
		lefthoof.setRotationPoint(8.0F, -18.0F, 2.0F);
		lefthoof.cubeList.add(new ModelBox(lefthoof, 92, 226, -7.0F, 37.0F, -13.0F, 10, 5, 10, 0.0F, true));

		rightankle = new ModelRenderer(this);
		rightankle.setRotationPoint(-6.0F, -18.0F, 2.0F);
		setRotationAngle(rightankle, -0.2443F, -0.0873F, 0.0698F);
		rightankle.cubeList.add(new ModelBox(rightankle, 57, 201, -2.0F, 20.0F, 4.0F, 5, 17, 5, 0.0F, true));

		righthoof = new ModelRenderer(this);
		righthoof.setRotationPoint(-6.0F, -18.0F, 2.0F);
		setRotationAngle(righthoof, 0.0F, -0.1047F, 0.0F);
		righthoof.cubeList.add(new ModelBox(righthoof, 49, 229, -7.0F, 36.0F, -10.0F, 10, 6, 10, 0.0F, true));

		rightshoulderplate = new ModelRenderer(this);
		rightshoulderplate.setRotationPoint(-12.5F, -43.0F, 0.0F);
		setRotationAngle(rightshoulderplate, 0.0F, 0.0F, 0.0524F);
		rightshoulderplate.cubeList.add(new ModelBox(rightshoulderplate, 164, 36, -12.0F, -2.0F, -5.0F, 12, 10, 10, 0.0F, true));

		leftshoulderplate = new ModelRenderer(this);
		leftshoulderplate.setRotationPoint(14.5F, -43.0F, 0.0F);
		setRotationAngle(leftshoulderplate, 0.0F, 0.0F, -0.0524F);
		leftshoulderplate.cubeList.add(new ModelBox(leftshoulderplate, 164, 36, 0.0F, -3.0F, -4.0F, 17, 10, 10, 0.0F, true));

		rightclaw2 = new ModelRenderer(this);
		rightclaw2.setRotationPoint(-12.5F, -43.0F, 0.0F);
		setRotationAngle(rightclaw2, 2.9322F, 0.0F, 0.0524F);
		rightclaw2.cubeList.add(new ModelBox(rightclaw2, 200, 177, -10.5F, -52.0F, -2.0F, 3, 15, 0, 0.0F, true));

		rightclaw1 = new ModelRenderer(this);
		rightclaw1.setRotationPoint(-12.5F, -43.0F, 0.0F);
		setRotationAngle(rightclaw1, 2.9322F, 0.0F, 0.0524F);
		rightclaw1.cubeList.add(new ModelBox(rightclaw1, 200, 177, -10.5F, -52.0F, -6.0F, 3, 15, 0, 0.0F, true));

		leftclaw1 = new ModelRenderer(this);
		leftclaw1.setRotationPoint(14.5F, -43.0F, 0.0F);
		setRotationAngle(leftclaw1, 2.5656F, 0.0F, -0.0524F);
		leftclaw1.cubeList.add(new ModelBox(leftclaw1, 200, 177, 8.5F, -49.0F, -8.0F, 3, 15, 0, 0.0F, true));

		leftclaw2 = new ModelRenderer(this);
		leftclaw2.setRotationPoint(14.5F, -43.0F, 0.0F);
		setRotationAngle(leftclaw2, 2.5656F, 0.0F, -0.0524F);
		leftclaw2.cubeList.add(new ModelBox(leftclaw2, 200, 177, 8.5F, -49.0F, -12.0F, 3, 15, 0, 0.0F, true));

		toprib = new ModelRenderer(this);
		toprib.setRotationPoint(0.0F, 0.0F, 0.0F);
		toprib.cubeList.add(new ModelBox(toprib, 10, 105, -8.0F, -34.0F, -6.0F, 18, 2, 16, 0.0F, true));

		bottomchestpiece = new ModelRenderer(this);
		bottomchestpiece.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bottomchestpiece, 0.0F, 0.0F, -0.2793F);
		bottomchestpiece.cubeList.add(new ModelBox(bottomchestpiece, 67, 87, -2.3F, -38.0F, -7.0F, 11, 8, 2, 0.0F, true));

		ribsegment = new ModelRenderer(this);
		ribsegment.setRotationPoint(0.0F, 0.0F, 0.0F);
		ribsegment.cubeList.add(new ModelBox(ribsegment, 11, 104, 0.0F, -33.3F, -7.0F, 2, 6, 1, 0.0F, true));

		rib2 = new ModelRenderer(this);
		rib2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rib2.cubeList.add(new ModelBox(rib2, 10, 104, -8.0F, -29.3F, -6.0F, 18, 2, 16, 0.0F, true));

		rightrib3 = new ModelRenderer(this);
		rightrib3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightrib3.cubeList.add(new ModelBox(rightrib3, 10, 104, -8.0F, -25.3F, -6.0F, 8, 2, 16, 0.0F, true));

		leftrib3 = new ModelRenderer(this);
		leftrib3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftrib3.cubeList.add(new ModelBox(leftrib3, 30, 105, 2.0F, -25.3F, -6.0F, 8, 2, 16, 0.0F, true));

		rib3segment = new ModelRenderer(this);
		rib3segment.setRotationPoint(0.0F, 0.0F, 0.0F);
		rib3segment.cubeList.add(new ModelBox(rib3segment, 43, 118, 0.0F, -25.3F, 9.0F, 2, 2, 1, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tail, -0.5585F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 160, 211, 0.0F, -21.0F, -4.0F, 2, 2, 26, 0.0F, true));

		mageIcon = new ModelRenderer(this);
		mageIcon.setRotationPoint(0.0F, 0.0F, 0.0F);
		mageIcon.cubeList.add(new ModelBox(mageIcon, 0, 24, -5.0F, -76.0F, 0.0F, 12, 12, 0, 0.0F, true));

		meleeIcon = new ModelRenderer(this);
		meleeIcon.setRotationPoint(0.0F, 0.0F, 0.0F);
		meleeIcon.cubeList.add(new ModelBox(meleeIcon, 0, 0, -5.0F, -76.0F, 0.0F, 12, 12, 0, 0.0F, true));

		rangeIcon = new ModelRenderer(this);
		rangeIcon.setRotationPoint(0.0F, 0.0F, 0.0F);
		rangeIcon.cubeList.add(new ModelBox(rangeIcon, 0, 12, -5.0F, -76.0F, 0.0F, 12, 12, 0, 0.0F, true));
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
		leftgauntlet.render(f5);
		righthorn1.render(f5);
		righthorn2.render(f5);
		rightgauntlet.render(f5);
		rightlowerleg.render(f5);
		leftlowerleg.render(f5);
		leftankle.render(f5);
		lefthoof.render(f5);
		rightankle.render(f5);
		righthoof.render(f5);
		rightshoulderplate.render(f5);
		leftshoulderplate.render(f5);
		rightclaw2.render(f5);
		rightclaw1.render(f5);
		leftclaw1.render(f5);
		leftclaw2.render(f5);
		toprib.render(f5);
		bottomchestpiece.render(f5);
		ribsegment.render(f5);
		rib2.render(f5);
		rightrib3.render(f5);
		leftrib3.render(f5);
		rib3segment.render(f5);
		tail.render(f5);
		mageIcon.render(f5);
		meleeIcon.render(f5);
		rangeIcon.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}