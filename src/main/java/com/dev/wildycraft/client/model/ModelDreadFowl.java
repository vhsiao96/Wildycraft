// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
public class ModelDreadFowl extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer rightWing;
	private final ModelRenderer leftWing;
	private final ModelRenderer bill;
	private final ModelRenderer chin;

	public ModelDreadFowl() {
		textureWidth = 16;
		textureHeight = 16;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 9, -3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F, false));

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightLeg.cubeList.add(new ModelBox(rightLeg, 26, 0, -1.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F, false));

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftLeg.cubeList.add(new ModelBox(leftLeg, 26, 0, -1.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F, false));

		rightWing = new ModelRenderer(this);
		rightWing.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightWing.cubeList.add(new ModelBox(rightWing, 24, 13, 0.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F, false));

		leftWing = new ModelRenderer(this);
		leftWing.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftWing.cubeList.add(new ModelBox(leftWing, 24, 13, -1.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F, false));

		bill = new ModelRenderer(this);
		bill.setRotationPoint(0.0F, 0.0F, 0.0F);
		bill.cubeList.add(new ModelBox(bill, 14, 0, -2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F, false));

		chin = new ModelRenderer(this);
		chin.setRotationPoint(0.0F, 0.0F, 0.0F);
		chin.cubeList.add(new ModelBox(chin, 14, 4, -1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		rightLeg.render(f5);
		leftLeg.render(f5);
		rightWing.render(f5);
		leftWing.render(f5);
		bill.render(f5);
		chin.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}