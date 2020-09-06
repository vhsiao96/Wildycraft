// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDagannoth extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
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

	public ModelDagannoth() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.5F, 2.0F, -3.5F);
		setRotationAngle(head, 0.0F, 3.1416F, 0.0F);
		head.cubeList.add(new ModelBox(head, 24, 0, -4.0F, -8.0F, -1.0F, 7, 6, 5, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, -4.0F);
		setRotationAngle(body, -0.5585F, 3.1416F, 0.0F);
		body.cubeList.add(new ModelBox(body, 14, 17, -4.0F, 0.0F, -2.0F, 8, 14, 4, 0.0F, true));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-4.0F, 2.0F, -4.0F);
		setRotationAngle(rightarm, -0.0349F, -3.1416F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 1, 24, 0.0F, -2.0F, -2.0F, 3, 10, 3, 0.0F, true));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(6.0F, 2.0F, -4.0F);
		setRotationAngle(leftarm, -0.0349F, 3.1416F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 1, 24, -1.0F, -2.0F, -2.0F, 3, 10, 3, 0.0F, true));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-3.0F, 12.0F, 2.0F);
		setRotationAngle(rightleg, 0.8727F, 3.1416F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 24, 37, -2.0F, 0.0F, -2.0F, 3, 7, 4, 0.0F, true));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(3.0F, 12.0F, 2.0F);
		setRotationAngle(leftleg, 0.8727F, 3.1416F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 24, 37, -2.0F, 0.0F, -2.0F, 3, 7, 4, 0.0F, true));

		Shape1 = new ModelRenderer(this);
		Shape1.setRotationPoint(0.0F, 0.0F, -4.0F);
		setRotationAngle(Shape1, -0.0175F, -1.6288F, -0.733F);
		Shape1.cubeList.add(new ModelBox(Shape1, 44, 34, -0.5F, 13.0F, -0.5F, 3, 1, 1, 0.0F, true));

		Shape2 = new ModelRenderer(this);
		Shape2.setRotationPoint(3.0F, 13.0F, 2.0F);
		setRotationAngle(Shape2, -2.1817F, 3.1416F, 0.0F);
		Shape2.cubeList.add(new ModelBox(Shape2, 25, 51, -2.0F, -6.0F, 0.0F, 3, 3, 9, 0.0F, true));

		Shape3 = new ModelRenderer(this);
		Shape3.setRotationPoint(-3.0F, 12.0F, 2.0F);
		setRotationAngle(Shape3, -2.1817F, 3.1416F, 0.0F);
		Shape3.cubeList.add(new ModelBox(Shape3, 25, 51, -2.0F, -7.0F, 0.0F, 3, 3, 9, 0.0F, true));

		Shape4 = new ModelRenderer(this);
		Shape4.setRotationPoint(-0.5F, 2.0F, -3.5F);
		setRotationAngle(Shape4, 0.0F, 3.1416F, 0.0F);
		Shape4.cubeList.add(new ModelBox(Shape4, 1, 2, -2.5F, -6.0F, 4.0F, 4, 4, 5, 0.0F, true));

		Shape5 = new ModelRenderer(this);
		Shape5.setRotationPoint(3.0F, 12.0F, 2.0F);
		setRotationAngle(Shape5, 0.0F, 3.1416F, 0.0F);
		Shape5.cubeList.add(new ModelBox(Shape5, 2, 53, -3.0F, 11.0F, 0.0F, 5, 1, 5, 0.0F, true));

		Shape6 = new ModelRenderer(this);
		Shape6.setRotationPoint(-3.0F, 12.0F, 2.0F);
		setRotationAngle(Shape6, 0.0F, 3.1416F, 0.0F);
		Shape6.cubeList.add(new ModelBox(Shape6, 2, 53, -3.0F, 11.0F, 0.0F, 5, 1, 5, 0.0F, true));

		Shape7 = new ModelRenderer(this);
		Shape7.setRotationPoint(1.5F, 7.0F, 3.6667F);
		setRotationAngle(Shape7, 1.0123F, 3.1416F, 0.0F);
		Shape7.cubeList.add(new ModelBox(Shape7, 39, 22, 0.0F, 0.0F, 0.0F, 3, 1, 10, 0.0F, true));

		Shape8 = new ModelRenderer(this);
		Shape8.setRotationPoint(0.0F, 0.0F, -4.0F);
		setRotationAngle(Shape8, 2.1648F, -0.0155F, 0.0F);
		Shape8.cubeList.add(new ModelBox(Shape8, 45, 14, 0.0F, 2.0F, -6.0F, 0, 5, 1, 0.0F, true));

		Shape9 = new ModelRenderer(this);
		Shape9.setRotationPoint(0.0F, 0.0F, -4.0F);
		setRotationAngle(Shape9, 2.1553F, 0.0175F, 0.0F);
		Shape9.cubeList.add(new ModelBox(Shape9, 52, 10, 0.0F, 2.0F, -4.0F, 0, 8, 1, 0.0F, true));

		Shape10 = new ModelRenderer(this);
		Shape10.setRotationPoint(0.0F, 0.0F, -4.0F);
		setRotationAngle(Shape10, -2.1468F, 3.1416F, 0.0F);
		Shape10.cubeList.add(new ModelBox(Shape10, 59, 13, 0.0F, 2.0F, 1.0F, 0, 5, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
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
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}