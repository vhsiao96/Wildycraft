// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAviansie extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer beak;
	private final ModelRenderer beak2;
	private final ModelRenderer beaktip;
	private final ModelRenderer body;
	private final ModelRenderer rightshoulderpad;
	private final ModelRenderer rightuparm;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftshoulderpad;
	private final ModelRenderer leftuparm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightthigh;
	private final ModelRenderer rightleg;
	private final ModelRenderer rightfoot;
	private final ModelRenderer leftthigh;
	private final ModelRenderer leftleg;
	private final ModelRenderer leftfoot;
	private final ModelRenderer cloth;
	private final ModelRenderer tailcoat1;
	private final ModelRenderer tailcoat2;
	private final ModelRenderer rightwingframe1;
	private final ModelRenderer rightwingframe2;
	private final ModelRenderer rightwingframe3;
	private final ModelRenderer rightwingframe4;
	private final ModelRenderer rightwingframe5;
	private final ModelRenderer leftwingframe1;
	private final ModelRenderer leftwingframe2;
	private final ModelRenderer leftwingframe3;
	private final ModelRenderer leftwingframe4;
	private final ModelRenderer leftwingframe5;
	private final ModelRenderer rightwing1;
	private final ModelRenderer rightwing2;
	private final ModelRenderer rightwing3;
	private final ModelRenderer rightwing4;
	private final ModelRenderer rightwing5;
	private final ModelRenderer rightwing6;
	private final ModelRenderer leftwing1;
	private final ModelRenderer leftwing2;
	private final ModelRenderer leftwing3;
	private final ModelRenderer leftwing4;
	private final ModelRenderer leftwing5;
	private final ModelRenderer leftwing6;

	public ModelAviansie() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -6.0F, -2.0F);
		setRotationAngle(head, 0.1222F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 52, 0, -3.5F, -7.0F, -5.0F, 7, 7, 8, 0.0F, true));

		beak = new ModelRenderer(this);
		beak.setRotationPoint(0.0F, -6.0F, -2.0F);
		setRotationAngle(beak, 0.1222F, 0.0F, 0.0F);
		beak.cubeList.add(new ModelBox(beak, 83, 0, -1.5F, -3.0F, -7.0F, 3, 3, 3, 0.0F, true));

		beak2 = new ModelRenderer(this);
		beak2.setRotationPoint(0.0F, -6.0F, -2.0F);
		setRotationAngle(beak2, 0.1222F, 0.0F, 0.0F);
		beak2.cubeList.add(new ModelBox(beak2, 96, 1, -1.0F, -2.0F, -8.2F, 2, 2, 2, 0.0F, true));

		beaktip = new ModelRenderer(this);
		beaktip.setRotationPoint(0.0F, -6.0F, -2.0F);
		setRotationAngle(beaktip, 0.1222F, 0.0F, 0.0F);
		beaktip.cubeList.add(new ModelBox(beaktip, 105, 2, -0.5F, -1.2F, -8.7F, 1, 2, 1, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(body, 0.2094F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 55, 16, -4.0F, -7.0F, -2.0F, 8, 12, 4, 0.0F, true));

		rightshoulderpad = new ModelRenderer(this);
		rightshoulderpad.setRotationPoint(-5.0F, -5.0F, -1.5F);
		setRotationAngle(rightshoulderpad, 0.0F, 0.0F, 0.1222F);
		rightshoulderpad.cubeList.add(new ModelBox(rightshoulderpad, 85, 11, -4.0F, -3.0F, -2.5F, 5, 5, 5, 0.0F, true));

		rightuparm = new ModelRenderer(this);
		rightuparm.setRotationPoint(-5.0F, -5.0F, -1.5F);
		setRotationAngle(rightuparm, 0.0F, 0.0F, 0.2793F);
		rightuparm.cubeList.add(new ModelBox(rightuparm, 90, 23, -3.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F, true));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, -5.0F, -1.5F);
		setRotationAngle(rightarm, 1.2392F, 0.0F, 0.2793F);
		rightarm.cubeList.add(new ModelBox(rightarm, 83, 38, -2.5F, 0.0F, -14.0F, 3, 3, 10, 0.0F, true));

		leftshoulderpad = new ModelRenderer(this);
		leftshoulderpad.setRotationPoint(5.0F, -5.0F, -1.5F);
		setRotationAngle(leftshoulderpad, 0.0F, 0.0F, -0.1222F);
		leftshoulderpad.cubeList.add(new ModelBox(leftshoulderpad, 85, 11, -1.0F, -3.0F, -2.5F, 5, 5, 5, 0.0F, true));

		leftuparm = new ModelRenderer(this);
		leftuparm.setRotationPoint(5.0F, -5.0F, -1.5F);
		setRotationAngle(leftuparm, 0.0F, 0.0F, -0.2793F);
		leftuparm.cubeList.add(new ModelBox(leftuparm, 90, 23, -1.0F, -2.0F, -2.0F, 4, 9, 4, 0.0F, true));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, -5.0F, -1.5F);
		setRotationAngle(leftarm, 1.2392F, 0.0F, -0.2793F);
		leftarm.cubeList.add(new ModelBox(leftarm, 83, 38, -0.5F, 0.0F, -14.0F, 3, 3, 10, 0.0F, true));

		rightthigh = new ModelRenderer(this);
		rightthigh.setRotationPoint(-2.0F, 3.0F, 1.2F);
		setRotationAngle(rightthigh, -0.0873F, 0.0F, 0.3491F);
		rightthigh.cubeList.add(new ModelBox(rightthigh, 60, 35, -2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F, true));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 3.0F, 1.2F);
		setRotationAngle(rightleg, 0.0349F, 0.0F, 0.1222F);
		rightleg.cubeList.add(new ModelBox(rightleg, 63, 49, -3.3F, 6.0F, -2.4F, 3, 10, 3, 0.0F, true));

		rightfoot = new ModelRenderer(this);
		rightfoot.setRotationPoint(-2.0F, 3.0F, 1.2F);
		setRotationAngle(rightfoot, 0.4538F, 0.0F, 0.0F);
		rightfoot.cubeList.add(new ModelBox(rightfoot, 82, 53, -5.7F, 13.0F, -11.8F, 4, 2, 6, 0.0F, true));

		leftthigh = new ModelRenderer(this);
		leftthigh.setRotationPoint(2.0F, 3.0F, 1.2F);
		setRotationAngle(leftthigh, -0.0873F, 0.0F, -0.3491F);
		leftthigh.cubeList.add(new ModelBox(leftthigh, 60, 35, -2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F, true));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 3.0F, 1.2F);
		setRotationAngle(leftleg, 0.0349F, 0.0F, -0.1222F);
		leftleg.cubeList.add(new ModelBox(leftleg, 63, 49, 0.3F, 6.0F, -2.4F, 3, 10, 3, 0.0F, true));

		leftfoot = new ModelRenderer(this);
		leftfoot.setRotationPoint(2.0F, 3.0F, 1.2F);
		setRotationAngle(leftfoot, 0.4538F, 0.0F, 0.0F);
		leftfoot.cubeList.add(new ModelBox(leftfoot, 82, 53, 1.7F, 13.0F, -11.8F, 4, 2, 6, 0.0F, true));

		cloth = new ModelRenderer(this);
		cloth.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(cloth, -0.0175F, 0.0F, 0.0F);
		cloth.cubeList.add(new ModelBox(cloth, 50, 35, -2.0F, 3.5F, -1.0F, 4, 12, 0, 0.0F, true));

		tailcoat1 = new ModelRenderer(this);
		tailcoat1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tailcoat1, 0.2269F, 0.0F, 0.0F);
		tailcoat1.cubeList.add(new ModelBox(tailcoat1, 30, 11, -4.0F, 2.5F, 1.5F, 8, 2, 1, 0.0F, true));

		tailcoat2 = new ModelRenderer(this);
		tailcoat2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tailcoat2, 0.1571F, 0.0F, 0.0F);
		tailcoat2.cubeList.add(new ModelBox(tailcoat2, 29, 14, -4.5F, 4.0F, 2.0F, 9, 11, 1, 0.0F, true));

		rightwingframe1 = new ModelRenderer(this);
		rightwingframe1.setRotationPoint(-1.5F, -4.5F, 1.0F);
		setRotationAngle(rightwingframe1, 0.4014F, -0.5061F, 0.0F);
		rightwingframe1.cubeList.add(new ModelBox(rightwingframe1, 27, 34, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

		rightwingframe2 = new ModelRenderer(this);
		rightwingframe2.setRotationPoint(-1.5F, -4.5F, 1.0F);
		setRotationAngle(rightwingframe2, 0.6981F, -1.1519F, 0.0F);
		rightwingframe2.cubeList.add(new ModelBox(rightwingframe2, 26, 33, 2.2F, 0.3F, 3.6667F, 1, 1, 6, 0.0F, true));

		rightwingframe3 = new ModelRenderer(this);
		rightwingframe3.setRotationPoint(-1.5F, -4.5F, 1.0F);
		setRotationAngle(rightwingframe3, 0.6283F, -1.1519F, 0.0F);
		rightwingframe3.cubeList.add(new ModelBox(rightwingframe3, 22, 29, 2.2F, -0.3F, 9.0F, 1, 1, 10, 0.0F, true));

		rightwingframe4 = new ModelRenderer(this);
		rightwingframe4.setRotationPoint(-1.5F, -4.5F, 1.0F);
		setRotationAngle(rightwingframe4, 0.2443F, 2.0246F, 0.0F);
		rightwingframe4.cubeList.add(new ModelBox(rightwingframe4, 27, 34, -2.8F, -14.6F, -16.9333F, 1, 1, 5, 0.0F, true));

		rightwingframe5 = new ModelRenderer(this);
		rightwingframe5.setRotationPoint(-1.5F, -4.5F, 1.0F);
		setRotationAngle(rightwingframe5, 1.5708F, 0.0F, 0.2793F);
		rightwingframe5.cubeList.add(new ModelBox(rightwingframe5, 27, 33, -18.9F, 9.8F, -0.3F, 1, 1, 5, 0.0F, true));

		leftwingframe1 = new ModelRenderer(this);
		leftwingframe1.setRotationPoint(1.5F, -4.5F, 1.0F);
		setRotationAngle(leftwingframe1, 0.4014F, 0.5061F, 0.0F);
		leftwingframe1.cubeList.add(new ModelBox(leftwingframe1, 27, 33, -0.5F, -0.5333F, 0.0F, 1, 1, 5, 0.0F, true));

		leftwingframe2 = new ModelRenderer(this);
		leftwingframe2.setRotationPoint(1.5F, -4.5F, 1.0F);
		setRotationAngle(leftwingframe2, 0.6981F, 1.1519F, 0.0F);
		leftwingframe2.cubeList.add(new ModelBox(leftwingframe2, 26, 33, -3.2F, 0.3F, 3.7F, 1, 1, 6, 0.0F, true));

		leftwingframe3 = new ModelRenderer(this);
		leftwingframe3.setRotationPoint(1.5F, -4.5F, 1.0F);
		setRotationAngle(leftwingframe3, 0.6283F, 1.1519F, 0.0F);
		leftwingframe3.cubeList.add(new ModelBox(leftwingframe3, 22, 29, -3.2F, -0.3F, 9.0F, 1, 1, 10, 0.0F, true));

		leftwingframe4 = new ModelRenderer(this);
		leftwingframe4.setRotationPoint(1.5F, -4.5F, 1.0F);
		setRotationAngle(leftwingframe4, 0.2443F, -2.0246F, 0.0F);
		leftwingframe4.cubeList.add(new ModelBox(leftwingframe4, 27, 34, 1.8F, -14.6F, -16.9F, 1, 1, 5, 0.0F, true));

		leftwingframe5 = new ModelRenderer(this);
		leftwingframe5.setRotationPoint(1.5F, -4.5F, 1.0F);
		setRotationAngle(leftwingframe5, 1.5708F, 0.0F, -0.2793F);
		leftwingframe5.cubeList.add(new ModelBox(leftwingframe5, 27, 33, 17.8667F, 9.8F, -0.3F, 1, 1, 5, 0.0F, true));

		rightwing1 = new ModelRenderer(this);
		rightwing1.setRotationPoint(-1.5F, -4.5F, 1.0F);
		setRotationAngle(rightwing1, 0.4014F, -0.6632F, 0.0F);
		rightwing1.cubeList.add(new ModelBox(rightwing1, 1, 51, 0.4F, 0.0F, -0.9F, 0, 6, 6, 0.0F, true));

		rightwing2 = new ModelRenderer(this);
		rightwing2.setRotationPoint(-1.5F, -4.5F, 1.0F);
		setRotationAngle(rightwing2, -0.0349F, -1.1694F, 0.0F);
		rightwing2.cubeList.add(new ModelBox(rightwing2, 13, 49, 2.9F, -3.0F, 4.0F, 0, 8, 6, 0.0F, true));

		rightwing3 = new ModelRenderer(this);
		rightwing3.setRotationPoint(-1.5F, -4.5F, 1.0F);
		setRotationAngle(rightwing3, 0.6981F, -1.1345F, 0.0F);
		rightwing3.cubeList.add(new ModelBox(rightwing3, 47, 49, 2.4F, 1.0F, 4.0F, 0, 10, 4, 0.0F, true));

		rightwing4 = new ModelRenderer(this);
		rightwing4.setRotationPoint(-1.5F, -4.5F, 1.0F);
		setRotationAngle(rightwing4, 0.6981F, -1.117F, 0.0F);
		rightwing4.cubeList.add(new ModelBox(rightwing4, 3, 38, 2.4F, 1.0F, 8.0F, 0, 6, 11, 0.0F, true));

		rightwing5 = new ModelRenderer(this);
		rightwing5.setRotationPoint(-1.5F, -4.5F, 1.0F);
		setRotationAngle(rightwing5, 0.0F, -1.1694F, 0.0F);
		rightwing5.cubeList.add(new ModelBox(rightwing5, 2, 2, 3.0F, -10.0F, 13.0F, 0, 7, 7, 0.0F, true));

		rightwing6 = new ModelRenderer(this);
		rightwing6.setRotationPoint(-1.5F, -4.5F, 1.0F);
		setRotationAngle(rightwing6, 0.1745F, -1.1519F, 0.0F);
		rightwing6.cubeList.add(new ModelBox(rightwing6, 25, 41, 2.4F, -4.0F, 10.0F, 0, 11, 11, 0.0F, true));

		leftwing1 = new ModelRenderer(this);
		leftwing1.setRotationPoint(1.5F, -4.5F, 1.0F);
		setRotationAngle(leftwing1, 0.4014F, 0.6632F, 0.0F);
		leftwing1.cubeList.add(new ModelBox(leftwing1, 1, 51, -0.6F, 0.0F, -0.9F, 0, 6, 6, 0.0F, true));

		leftwing2 = new ModelRenderer(this);
		leftwing2.setRotationPoint(1.5F, -4.5F, 1.0F);
		setRotationAngle(leftwing2, -0.0349F, 1.1694F, 0.0F);
		leftwing2.cubeList.add(new ModelBox(leftwing2, 13, 49, -2.9F, -3.0F, 4.0F, 0, 8, 6, 0.0F, true));

		leftwing3 = new ModelRenderer(this);
		leftwing3.setRotationPoint(1.5F, -4.5F, 1.0F);
		setRotationAngle(leftwing3, 0.6981F, 1.1345F, 0.0F);
		leftwing3.cubeList.add(new ModelBox(leftwing3, 47, 49, -3.0F, 1.0F, 4.0F, 0, 10, 4, 0.0F, true));

		leftwing4 = new ModelRenderer(this);
		leftwing4.setRotationPoint(1.5F, -4.5F, 1.0F);
		setRotationAngle(leftwing4, 0.6981F, 1.117F, 0.0F);
		leftwing4.cubeList.add(new ModelBox(leftwing4, 3, 38, -2.6F, 1.0F, 8.0F, 0, 6, 11, 0.0F, true));

		leftwing5 = new ModelRenderer(this);
		leftwing5.setRotationPoint(1.5F, -4.5F, 1.0F);
		setRotationAngle(leftwing5, 0.0F, 1.1694F, 0.0F);
		leftwing5.cubeList.add(new ModelBox(leftwing5, 2, 2, -3.0F, -10.0F, 13.0F, 0, 7, 7, 0.0F, true));

		leftwing6 = new ModelRenderer(this);
		leftwing6.setRotationPoint(1.5F, -4.5F, 1.0F);
		setRotationAngle(leftwing6, 0.1745F, 1.1519F, 0.0F);
		leftwing6.cubeList.add(new ModelBox(leftwing6, 25, 41, -3.0F, -4.0F, 10.0F, 0, 11, 11, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		beak.render(f5);
		beak2.render(f5);
		beaktip.render(f5);
		body.render(f5);
		rightshoulderpad.render(f5);
		rightuparm.render(f5);
		rightarm.render(f5);
		leftshoulderpad.render(f5);
		leftuparm.render(f5);
		leftarm.render(f5);
		rightthigh.render(f5);
		rightleg.render(f5);
		rightfoot.render(f5);
		leftthigh.render(f5);
		leftleg.render(f5);
		leftfoot.render(f5);
		cloth.render(f5);
		tailcoat1.render(f5);
		tailcoat2.render(f5);
		rightwingframe1.render(f5);
		rightwingframe2.render(f5);
		rightwingframe3.render(f5);
		rightwingframe4.render(f5);
		rightwingframe5.render(f5);
		leftwingframe1.render(f5);
		leftwingframe2.render(f5);
		leftwingframe3.render(f5);
		leftwingframe4.render(f5);
		leftwingframe5.render(f5);
		rightwing1.render(f5);
		rightwing2.render(f5);
		rightwing3.render(f5);
		rightwing4.render(f5);
		rightwing5.render(f5);
		rightwing6.render(f5);
		leftwing1.render(f5);
		leftwing2.render(f5);
		leftwing3.render(f5);
		leftwing4.render(f5);
		leftwing5.render(f5);
		leftwing6.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}