// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelUnicorn extends ModelBase {
	private final ModelRenderer Horn;
	private final ModelRenderer Mane;
	private final ModelRenderer tail;
	private final ModelRenderer TailHair;
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer Ear1;
	private final ModelRenderer Ear2;
	private final ModelRenderer Head;
	private final ModelRenderer Neck;
	private final ModelRenderer Nose;

	public ModelUnicorn() {
		textureWidth = 256;
		textureHeight = 256;

		Horn = new ModelRenderer(this);
		Horn.setRotationPoint(0.0F, 7.0F, -11.0F);
		setRotationAngle(Horn, 0.4538F, 0.0F, 0.0F);
		Horn.cubeList.add(new ModelBox(Horn, 110, 0, -0.4667F, -12.0F, -7.0F, 1, 5, 1, 0.0F, true));

		Mane = new ModelRenderer(this);
		Mane.setRotationPoint(0.0F, 7.0F, -11.0F);
		setRotationAngle(Mane, -0.6283F, 0.0F, 0.0F);
		Mane.cubeList.add(new ModelBox(Mane, 120, 16, -1.0F, -4.0F, -7.0F, 2, 4, 15, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 7.5F, 10.0F);
		setRotationAngle(tail, -1.0472F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 31, 0, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, true));

		TailHair = new ModelRenderer(this);
		TailHair.setRotationPoint(0.0F, 7.5F, 10.0F);
		setRotationAngle(TailHair, -1.0472F, 0.0F, 0.0F);
		TailHair.cubeList.add(new ModelBox(TailHair, 0, 0, -1.5F, -1.0F, 2.0F, 3, 3, 7, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(1.0F, 7.0F, -1.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 53, 4, -5.0F, -10.0F, -9.0F, 8, 21, 9, 0.0F, true));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-3.0F, 12.0F, 7.0F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 16, -1.5F, 0.0F, -2.0F, 3, 12, 4, 0.0F, true));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(3.0F, 12.0F, 7.0F);
		leg2.cubeList.add(new ModelBox(leg2, 0, 16, -1.5F, 0.0F, -2.0F, 3, 12, 4, 0.0F, true));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-3.0F, 12.0F, -9.0F);
		leg3.cubeList.add(new ModelBox(leg3, 0, 16, -1.5F, 0.0F, -2.0F, 3, 12, 4, 0.0F, true));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(3.0F, 12.0F, -9.0F);
		leg4.cubeList.add(new ModelBox(leg4, 0, 16, -1.5F, 0.0F, -2.0F, 3, 12, 4, 0.0F, true));

		Ear1 = new ModelRenderer(this);
		Ear1.setRotationPoint(0.0F, 7.0F, -11.0F);
		setRotationAngle(Ear1, 0.4538F, 0.0F, 0.0F);
		Ear1.cubeList.add(new ModelBox(Ear1, 102, 0, -2.0F, -9.0F, -1.0F, 1, 2, 1, 0.0F, true));

		Ear2 = new ModelRenderer(this);
		Ear2.setRotationPoint(0.0F, 7.0F, -11.0F);
		setRotationAngle(Ear2, 0.4538F, 0.0F, 0.0F);
		Ear2.cubeList.add(new ModelBox(Ear2, 96, 0, 1.0F, -9.0F, -1.0F, 1, 2, 1, 0.0F, true));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 7.0F, -11.0F);
		setRotationAngle(Head, 0.4538F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 128, 0, -2.0F, -7.0F, -8.0F, 4, 4, 8, 0.0F, true));

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(0.0F, 8.0F, -11.0F);
		setRotationAngle(Neck, -0.6283F, 0.0F, 0.0F);
		Neck.cubeList.add(new ModelBox(Neck, 90, 20, -2.0F, -3.0F, -5.0F, 4, 4, 10, 0.0F, true));

		Nose = new ModelRenderer(this);
		Nose.setRotationPoint(0.0F, 7.0F, -11.0F);
		setRotationAngle(Nose, 0.4538F, 0.0F, 0.0F);
		Nose.cubeList.add(new ModelBox(Nose, 117, 0, -1.5F, -6.7F, -8.7F, 3, 2, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Horn.render(f5);
		Mane.render(f5);
		tail.render(f5);
		TailHair.render(f5);
		body.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		Ear1.render(f5);
		Ear2.render(f5);
		Head.render(f5);
		Neck.render(f5);
		Nose.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}