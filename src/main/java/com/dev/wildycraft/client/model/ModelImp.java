// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelImp extends ModelBase {
	private final ModelRenderer Hron2;
	private final ModelRenderer Shape1;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private final ModelRenderer Horn1;
	private final ModelRenderer Shape2;
	private final ModelRenderer Shape3;
	private final ModelRenderer Shape4;

	public ModelImp() {
		textureWidth = 64;
		textureHeight = 64;

		Hron2 = new ModelRenderer(this);
		Hron2.setRotationPoint(-1.0F, 12.0F, -1.0F);
		Hron2.cubeList.add(new ModelBox(Hron2, 31, 2, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

		Shape1 = new ModelRenderer(this);
		Shape1.setRotationPoint(-2.0F, 19.0F, 1.0F);
		setRotationAngle(Shape1, 0.0F, -1.5708F, 0.4189F);
		Shape1.cubeList.add(new ModelBox(Shape1, 39, 19, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 21.0F, 2.0F);
		head.cubeList.add(new ModelBox(head, 27, 5, -4.0F, -8.0F, -4.0F, 3, 3, 3, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 14.0F, 1.0F);
		setRotationAngle(body, 0.2618F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 29, 15, -4.0F, 0.0F, -2.0F, 3, 6, 1, 0.0F, true));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 17.5F, 2.0F);
		setRotationAngle(rightarm, 0.192F, 0.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 22, 16, 0.0F, -2.0F, -2.0F, 1, 3, 1, 0.0F, true));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(0.0F, 19.0F, -1.0F);
		setRotationAngle(leftarm, -1.1868F, 0.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 22, 16, -1.0F, -2.0F, -2.0F, 1, 3, 1, 0.0F, true));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 20.0F, 1.5F);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 32, 24, -2.0F, 0.0F, -1.0F, 1, 4, 1, 0.0F, true));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(0.0F, 20.0F, 1.5F);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 32, 24, -2.0F, 0.0F, -1.0F, 1, 4, 1, 0.0F, true));

		Horn1 = new ModelRenderer(this);
		Horn1.setRotationPoint(-4.0F, 12.0F, -1.0F);
		Horn1.cubeList.add(new ModelBox(Horn1, 31, 2, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

		Shape2 = new ModelRenderer(this);
		Shape2.setRotationPoint(-2.0F, 20.5F, 3.5F);
		setRotationAngle(Shape2, 0.0F, -1.6581F, -0.6283F);
		Shape2.cubeList.add(new ModelBox(Shape2, 51, 19, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, true));

		Shape3 = new ModelRenderer(this);
		Shape3.setRotationPoint(-0.7F, 19.0F, -0.5F);
		setRotationAngle(Shape3, -0.0698F, 1.4486F, -0.9425F);
		Shape3.cubeList.add(new ModelBox(Shape3, 4, 18, 0.0F, 0.0F, 0.0F, 7, 1, 0, 0.0F, true));

		Shape4 = new ModelRenderer(this);
		Shape4.setRotationPoint(-2.0F, 17.5F, -2.9F);
		setRotationAngle(Shape4, 0.5585F, 0.0F, 0.0F);
		Shape4.cubeList.add(new ModelBox(Shape4, 10, 15, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Hron2.render(f5);
		Shape1.render(f5);
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		bipedRightLeg.render(f5);
		bipedLeftLeg.render(f5);
		Horn1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}