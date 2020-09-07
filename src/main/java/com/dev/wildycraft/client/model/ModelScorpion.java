// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScorpion extends ModelBase {
	private final ModelRenderer Clawarm1;
	private final ModelRenderer Clawarm2;
	private final ModelRenderer tailsegment1;
	private final ModelRenderer Shape1;
	private final ModelRenderer Shape2;
	private final ModelRenderer Shape3;
	private final ModelRenderer Shape4;
	private final ModelRenderer Shape5;
	private final ModelRenderer Shape6;
	private final ModelRenderer Shape7;
	private final ModelRenderer Shape8;
	private final ModelRenderer Shape9;
	private final ModelRenderer Shape10;
	private final ModelRenderer Body;
	private final ModelRenderer RearEnd;
	private final ModelRenderer spiderLeg8;
	private final ModelRenderer spiderLeg7;
	private final ModelRenderer spiderHead;
	private final ModelRenderer spiderLeg6;
	private final ModelRenderer spiderLeg4;
	private final ModelRenderer spiderLeg2;
	private final ModelRenderer spiderLeg5;
	private final ModelRenderer spiderLeg3;
	private final ModelRenderer spiderLeg1;

	public ModelScorpion() {
		textureWidth = 64;
		textureHeight = 64;

		Clawarm1 = new ModelRenderer(this);
		Clawarm1.setRotationPoint(11.0F, 16.1F, -6.0F);
		setRotationAngle(Clawarm1, 0.0349F, 1.7453F, -0.0698F);
		Clawarm1.cubeList.add(new ModelBox(Clawarm1, 1, 49, 0.0F, 0.0F, 0.0F, 9, 2, 2, 0.0F, false));

		Clawarm2 = new ModelRenderer(this);
		Clawarm2.setRotationPoint(-14.0F, 15.2667F, -6.0F);
		setRotationAngle(Clawarm2, 0.0175F, 1.6232F, 0.0F);
		Clawarm2.cubeList.add(new ModelBox(Clawarm2, 1, 49, 0.0F, 0.0F, 0.0F, 9, 2, 2, 0.0F, true));

		tailsegment1 = new ModelRenderer(this);
		tailsegment1.setRotationPoint(0.0F, 18.0F, 14.0F);
		setRotationAngle(tailsegment1, -0.0873F, 1.3614F, -2.2166F);
		tailsegment1.cubeList.add(new ModelBox(tailsegment1, 27, 10, 0.0F, -2.0F, -2.0F, 14, 3, 4, 0.0F, true));

		Shape1 = new ModelRenderer(this);
		Shape1.setRotationPoint(-0.4667F, 9.6667F, 21.0F);
		setRotationAngle(Shape1, 0.0698F, -1.6406F, -2.4784F);
		Shape1.cubeList.add(new ModelBox(Shape1, 30, 3, 0.0F, 0.0F, 0.0F, 14, 3, 2, 0.0F, true));

		Shape2 = new ModelRenderer(this);
		Shape2.setRotationPoint(-2.0F, 0.0F, 11.0F);
		setRotationAngle(Shape2, 0.0F, 1.4661F, 0.6458F);
		Shape2.cubeList.add(new ModelBox(Shape2, 38, 41, 0.0F, 0.0F, 0.0F, 10, 2, 2, 0.0F, true));

		Shape3 = new ModelRenderer(this);
		Shape3.setRotationPoint(-1.0F, 6.0F, 3.0F);
		setRotationAngle(Shape3, 0.0873F, 0.0F, 0.0F);
		Shape3.cubeList.add(new ModelBox(Shape3, 39, 35, 0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, true));

		Shape4 = new ModelRenderer(this);
		Shape4.setRotationPoint(-1.0F, 7.0F, 1.0F);
		setRotationAngle(Shape4, 0.1047F, 0.0F, 0.0F);
		Shape4.cubeList.add(new ModelBox(Shape4, 39, 29, 0.0F, 0.0F, 1.0F, 2, 3, 1, 0.0F, true));

		Shape5 = new ModelRenderer(this);
		Shape5.setRotationPoint(-1.0F, 8.0F, 1.0F);
		setRotationAngle(Shape5, 0.1222F, 0.0F, 0.0F);
		Shape5.cubeList.add(new ModelBox(Shape5, 39, 24, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, true));

		Shape6 = new ModelRenderer(this);
		Shape6.setRotationPoint(0.0F, 7.4F, 0.0F);
		setRotationAngle(Shape6, 0.5585F, 0.0349F, 0.0F);
		Shape6.cubeList.add(new ModelBox(Shape6, 41, 19, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, true));

		Shape7 = new ModelRenderer(this);
		Shape7.setRotationPoint(-13.0F, 14.0F, -14.0F);
		setRotationAngle(Shape7, 0.1571F, 3.0194F, 0.0F);
		Shape7.cubeList.add(new ModelBox(Shape7, 47, 19, 0.0F, 0.0F, 0.0F, 1, 2, 7, 0.0F, true));

		Shape8 = new ModelRenderer(this);
		Shape8.setRotationPoint(11.1333F, 14.0F, -14.0F);
		setRotationAngle(Shape8, 0.1571F, 3.1521F, 0.0F);
		Shape8.cubeList.add(new ModelBox(Shape8, 47, 19, 0.0F, 0.0F, 0.0F, 1, 2, 7, 0.0F, true));

		Shape9 = new ModelRenderer(this);
		Shape9.setRotationPoint(11.0F, 15.0F, -14.0F);
		setRotationAngle(Shape9, -0.1571F, 3.1416F, 0.0F);
		Shape9.cubeList.add(new ModelBox(Shape9, 47, 19, 0.0F, 0.0F, 0.0F, 1, 2, 7, 0.0F, true));

		Shape10 = new ModelRenderer(this);
		Shape10.setRotationPoint(-13.0F, 15.0F, -14.0F);
		setRotationAngle(Shape10, -0.2443F, -3.1521F, 0.0F);
		Shape10.cubeList.add(new ModelBox(Shape10, 47, 19, 0.0F, 0.0F, 0.0F, 1, 2, 7, 0.0F, true));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 20.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F, true));

		RearEnd = new ModelRenderer(this);
		RearEnd.setRotationPoint(2.0F, 21.0F, 9.0F);
		RearEnd.cubeList.add(new ModelBox(RearEnd, 0, 28, -5.0F, -4.0F, -6.0F, 6, 6, 12, 0.0F, true));

		spiderLeg8 = new ModelRenderer(this);
		spiderLeg8.setRotationPoint(4.0F, 19.0F, -2.0F);
		setRotationAngle(spiderLeg8, 0.0F, 0.5585F, -0.2094F);
		spiderLeg8.cubeList.add(new ModelBox(spiderLeg8, 1, 57, 0.0F, -1.0F, -1.0F, 11, 2, 2, 0.0F, true));

		spiderLeg7 = new ModelRenderer(this);
		spiderLeg7.setRotationPoint(0.0F, 19.0F, -1.0F);
		setRotationAngle(spiderLeg7, 0.0175F, -0.4014F, 0.1745F);
		spiderLeg7.cubeList.add(new ModelBox(spiderLeg7, 1, 57, -15.0F, -1.0F, -1.0F, 11, 2, 2, 0.0F, true));

		spiderHead = new ModelRenderer(this);
		spiderHead.setRotationPoint(0.0F, 20.0F, -3.0F);
		spiderHead.cubeList.add(new ModelBox(spiderHead, 32, 48, -4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F, true));

		spiderLeg6 = new ModelRenderer(this);
		spiderLeg6.setRotationPoint(4.0F, 20.0F, 0.0F);
		setRotationAngle(spiderLeg6, 0.0F, 0.2793F, 0.192F);
		spiderLeg6.cubeList.add(new ModelBox(spiderLeg6, 1, 19, -1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F, true));

		spiderLeg4 = new ModelRenderer(this);
		spiderLeg4.setRotationPoint(4.0F, 20.0F, 4.0F);
		setRotationAngle(spiderLeg4, 0.0F, -0.2618F, 0.192F);
		spiderLeg4.cubeList.add(new ModelBox(spiderLeg4, 1, 19, -1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F, false));

		spiderLeg2 = new ModelRenderer(this);
		spiderLeg2.setRotationPoint(4.0F, 20.0F, 8.0F);
		setRotationAngle(spiderLeg2, 0.0F, -0.576F, 0.192F);
		spiderLeg2.cubeList.add(new ModelBox(spiderLeg2, 1, 19, -1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F, true));

		spiderLeg5 = new ModelRenderer(this);
		spiderLeg5.setRotationPoint(-4.0F, 20.0F, 0.0F);
		setRotationAngle(spiderLeg5, 0.0F, -0.2793F, -0.192F);
		spiderLeg5.cubeList.add(new ModelBox(spiderLeg5, 1, 19, -15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F, true));

		spiderLeg3 = new ModelRenderer(this);
		spiderLeg3.setRotationPoint(-4.0F, 20.0F, 4.0F);
		setRotationAngle(spiderLeg3, 0.0F, 0.0698F, -0.192F);
		spiderLeg3.cubeList.add(new ModelBox(spiderLeg3, 1, 19, -15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F, true));

		spiderLeg1 = new ModelRenderer(this);
		spiderLeg1.setRotationPoint(-4.0F, 20.0F, 8.0F);
		setRotationAngle(spiderLeg1, 0.0F, 0.576F, -0.192F);
		spiderLeg1.cubeList.add(new ModelBox(spiderLeg1, 1, 19, -15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Clawarm1.render(f5);
		Clawarm2.render(f5);
		tailsegment1.render(f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Body.render(f5);
		RearEnd.render(f5);
		spiderLeg8.render(f5);
		spiderLeg7.render(f5);
		spiderHead.render(f5);
		spiderLeg6.render(f5);
		spiderLeg4.render(f5);
		spiderLeg2.render(f5);
		spiderLeg5.render(f5);
		spiderLeg3.render(f5);
		spiderLeg1.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}