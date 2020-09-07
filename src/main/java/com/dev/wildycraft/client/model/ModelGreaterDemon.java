// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGreaterDemon extends ModelBase {
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
	private final ModelRenderer rightwingedge1;
	private final ModelRenderer leftwingedge1;
	private final ModelRenderer rightwingedge2;
	private final ModelRenderer rightwingedge3;
	private final ModelRenderer rightwingedge4;
	private final ModelRenderer rightwingsegment1;
	private final ModelRenderer rightwingspike;
	private final ModelRenderer rightwingsegment2;
	private final ModelRenderer rightwingsegment3;
	private final ModelRenderer leftwingedge2;
	private final ModelRenderer leftwingedge3;
	private final ModelRenderer leftwingedge4;
	private final ModelRenderer leftwingspike;
	private final ModelRenderer leftwingsegment1;
	private final ModelRenderer leftwingsegment2;
	private final ModelRenderer leftwingsegment3;
	private final ModelRenderer rightwing4;
	private final ModelRenderer rightwing3;
	private final ModelRenderer rightwing2;
	private final ModelRenderer rightwing1;
	private final ModelRenderer rightwing;
	private final ModelRenderer leftwing;
	private final ModelRenderer leftwing1;
	private final ModelRenderer leftwing2;
	private final ModelRenderer leftwing3;
	private final ModelRenderer leftwing4;

	public ModelGreaterDemon() {
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
		setRotationAngle(lefthorn2, 1.1694F, 0.0F, 1.5708F);
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
		setRotationAngle(righthorn2, 1.2217F, 0.0F, -1.5708F);
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

		rightwingedge1 = new ModelRenderer(this);
		rightwingedge1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightwingedge1, 0.0F, -0.2618F, 0.0F);
		rightwingedge1.cubeList.add(new ModelBox(rightwingedge1, 17, 166, 1.0F, -33.0F, 9.0F, 2, 2, 14, 0.0F, true));

		leftwingedge1 = new ModelRenderer(this);
		leftwingedge1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftwingedge1, 0.0F, 0.2618F, 0.0F);
		leftwingedge1.cubeList.add(new ModelBox(leftwingedge1, 17, 166, 1.0F, -33.0F, 9.0F, 2, 2, 14, 0.0F, true));

		rightwingedge2 = new ModelRenderer(this);
		rightwingedge2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightwingedge2, 0.733F, -0.6807F, 0.0F);
		rightwingedge2.cubeList.add(new ModelBox(rightwingedge2, 14, 163, 9.8F, -12.4F, 35.0F, 2, 2, 17, 0.0F, true));

		rightwingedge3 = new ModelRenderer(this);
		rightwingedge3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightwingedge3, 0.1571F, -0.6807F, 0.0F);
		rightwingedge3.cubeList.add(new ModelBox(rightwingedge3, 15, 165, 9.8F, -39.0F, 37.0F, 2, 2, 16, 0.0F, true));

		rightwingedge4 = new ModelRenderer(this);
		rightwingedge4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightwingedge4, -0.9774F, -0.6807F, 0.0F);
		rightwingedge4.cubeList.add(new ModelBox(rightwingedge4, 21, 170, 9.8F, -64.3F, -13.0F, 2, 2, 10, 0.0F, true));

		rightwingsegment1 = new ModelRenderer(this);
		rightwingsegment1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightwingsegment1, -0.1047F, -0.6807F, 0.0F);
		rightwingsegment1.cubeList.add(new ModelBox(rightwingsegment1, 67, 152, 10.5F, -44.0F, 25.0F, 1, 23, 1, 0.0F, true));

		rightwingspike = new ModelRenderer(this);
		rightwingspike.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightwingspike, 0.1222F, -0.6807F, 0.0F);
		rightwingspike.cubeList.add(new ModelBox(rightwingspike, 18, 150, 10.0F, -42.0F, 35.0F, 2, 3, 2, 0.0F, true));

		rightwingsegment2 = new ModelRenderer(this);
		rightwingsegment2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightwingsegment2, 0.3665F, -0.6807F, 0.0F);
		rightwingsegment2.cubeList.add(new ModelBox(rightwingsegment2, 67, 152, 10.5F, -28.0F, 48.0F, 1, 21, 1, 0.0F, true));

		rightwingsegment3 = new ModelRenderer(this);
		rightwingsegment3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightwingsegment3, 0.2269F, -0.6807F, 0.0F);
		rightwingsegment3.cubeList.add(new ModelBox(rightwingsegment3, 67, 153, 10.5F, -27.0F, 57.0F, 1, 12, 1, 0.0F, true));

		leftwingedge2 = new ModelRenderer(this);
		leftwingedge2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftwingedge2, 0.733F, 0.6807F, 0.0F);
		leftwingedge2.cubeList.add(new ModelBox(leftwingedge2, 14, 164, -8.8F, -10.4F, 37.0F, 2, 2, 17, 0.0F, true));

		leftwingedge3 = new ModelRenderer(this);
		leftwingedge3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftwingedge3, 0.1571F, 0.6807F, 0.0F);
		leftwingedge3.cubeList.add(new ModelBox(leftwingedge3, 15, 165, -8.8F, -38.0F, 39.0F, 2, 2, 16, 0.0F, true));

		leftwingedge4 = new ModelRenderer(this);
		leftwingedge4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftwingedge4, -0.9774F, 0.6807F, 0.0F);
		leftwingedge4.cubeList.add(new ModelBox(leftwingedge4, 21, 171, -8.8F, -65.3F, -11.0F, 2, 2, 10, 0.0F, true));

		leftwingspike = new ModelRenderer(this);
		leftwingspike.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftwingspike, 0.1222F, 0.6807F, 0.0F);
		leftwingspike.cubeList.add(new ModelBox(leftwingspike, 18, 150, -8.8F, -41.0F, 36.9333F, 2, 3, 2, 0.0F, true));

		leftwingsegment1 = new ModelRenderer(this);
		leftwingsegment1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftwingsegment1, -0.1047F, 0.6807F, 0.0F);
		leftwingsegment1.cubeList.add(new ModelBox(leftwingsegment1, 67, 152, -8.5F, -44.0F, 27.0F, 1, 23, 1, 0.0F, true));

		leftwingsegment2 = new ModelRenderer(this);
		leftwingsegment2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftwingsegment2, 0.4014F, 0.6807F, 0.0F);
		leftwingsegment2.cubeList.add(new ModelBox(leftwingsegment2, 67, 152, -8.5F, -26.0F, 49.0F, 1, 21, 1, 0.0F, true));

		leftwingsegment3 = new ModelRenderer(this);
		leftwingsegment3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftwingsegment3, 0.2269F, 0.6807F, 0.0F);
		leftwingsegment3.cubeList.add(new ModelBox(leftwingsegment3, 67, 151, -8.5F, -27.0F, 58.0F, 1, 12, 1, 0.0F, true));

		rightwing4 = new ModelRenderer(this);
		rightwing4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightwing4, 0.3665F, -0.6807F, 0.0F);
		rightwing4.cubeList.add(new ModelBox(rightwing4, 96, 215, 11.0F, -27.5F, 48.0F, 0, 15, 12, 0.0F, true));

		rightwing3 = new ModelRenderer(this);
		rightwing3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightwing3, 0.1571F, -0.6807F, 0.0F);
		rightwing3.cubeList.add(new ModelBox(rightwing3, 76, 214, 11.0F, -37.0F, 35.0F, 0, 18, 10, 0.0F, true));

		rightwing2 = new ModelRenderer(this);
		rightwing2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightwing2, 0.733F, -0.6807F, 0.0F);
		rightwing2.cubeList.add(new ModelBox(rightwing2, 48, 214, 11.0F, -11.0F, 35.0F, 0, 14, 14, 0.0F, true));

		rightwing1 = new ModelRenderer(this);
		rightwing1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightwing1, 0.0F, -0.6807F, 0.0F);
		rightwing1.cubeList.add(new ModelBox(rightwing1, 30, 222, 11.0F, -32.0F, 19.0F, 0, 11, 9, 0.0F, true));

		rightwing = new ModelRenderer(this);
		rightwing.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightwing, 0.0F, -0.2443F, 0.0F);
		rightwing.cubeList.add(new ModelBox(rightwing, 4, 218, 2.0F, -32.0F, 9.0F, 0, 11, 13, 0.0F, true));

		leftwing = new ModelRenderer(this);
		leftwing.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftwing, 0.0F, 0.2443F, 0.0F);
		leftwing.cubeList.add(new ModelBox(leftwing, 4, 218, 2.0F, -32.0F, 9.0F, 0, 11, 13, 0.0F, true));

		leftwing1 = new ModelRenderer(this);
		leftwing1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftwing1, 0.0F, 0.6807F, 0.0F);
		leftwing1.cubeList.add(new ModelBox(leftwing1, 30, 222, -7.5F, -32.0F, 20.8F, 0, 11, 9, 0.0F, true));

		leftwing2 = new ModelRenderer(this);
		leftwing2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftwing2, 0.733F, 0.6807F, 0.0F);
		leftwing2.cubeList.add(new ModelBox(leftwing2, 48, 214, -7.5F, -9.0F, 36.0F, 0, 14, 14, 0.0F, true));

		leftwing3 = new ModelRenderer(this);
		leftwing3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftwing3, 0.1571F, 0.6807F, 0.0F);
		leftwing3.cubeList.add(new ModelBox(leftwing3, 76, 214, -7.5F, -36.0F, 36.4F, 0, 18, 10, 0.0F, true));

		leftwing4 = new ModelRenderer(this);
		leftwing4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftwing4, 0.3665F, 0.6807F, 0.0F);
		leftwing4.cubeList.add(new ModelBox(leftwing4, 96, 215, -7.5F, -25.5F, 49.0F, 0, 15, 12, 0.0F, true));
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
		rightwingedge1.render(f5);
		leftwingedge1.render(f5);
		rightwingedge2.render(f5);
		rightwingedge3.render(f5);
		rightwingedge4.render(f5);
		rightwingsegment1.render(f5);
		rightwingspike.render(f5);
		rightwingsegment2.render(f5);
		rightwingsegment3.render(f5);
		leftwingedge2.render(f5);
		leftwingedge3.render(f5);
		leftwingedge4.render(f5);
		leftwingspike.render(f5);
		leftwingsegment1.render(f5);
		leftwingsegment2.render(f5);
		leftwingsegment3.render(f5);
		rightwing4.render(f5);
		rightwing3.render(f5);
		rightwing2.render(f5);
		rightwing1.render(f5);
		rightwing.render(f5);
		leftwing.render(f5);
		leftwing1.render(f5);
		leftwing2.render(f5);
		leftwing3.render(f5);
		leftwing4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}