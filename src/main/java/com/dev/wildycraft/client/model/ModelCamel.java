// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCamel extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer Neck;
	private final ModelRenderer Shape1;
	private final ModelRenderer Shape2;
	private final ModelRenderer Shape3;
	private final ModelRenderer Shape4;
	private final ModelRenderer Shape5;
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;

	public ModelCamel() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -8.0F, -18.0F);
		head.cubeList.add(new ModelBox(head, 26, 29, -4.0F, -4.0F, 0.0F, 8, 7, 10, 0.0F, true));

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(-3.0F, -8.0F, -13.0F);
		Neck.cubeList.add(new ModelBox(Neck, 1, 44, 0.0F, 0.0F, 0.0F, 6, 14, 5, 0.0F, true));

		Shape1 = new ModelRenderer(this);
		Shape1.setRotationPoint(-2.0F, -8.0F, -21.0F);
		Shape1.cubeList.add(new ModelBox(Shape1, 10, 34, 0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F, true));

		Shape2 = new ModelRenderer(this);
		Shape2.setRotationPoint(-4.0F, -14.0F, -10.0F);
		Shape2.cubeList.add(new ModelBox(Shape2, 55, 23, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, true));

		Shape3 = new ModelRenderer(this);
		Shape3.setRotationPoint(3.0F, -14.0F, -10.0F);
		Shape3.cubeList.add(new ModelBox(Shape3, 55, 23, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, true));

		Shape4 = new ModelRenderer(this);
		Shape4.setRotationPoint(-2.5F, -5.0F, -5.0F);
		Shape4.cubeList.add(new ModelBox(Shape4, 43, 48, 0.0F, 0.0F, 0.0F, 5, 7, 5, 0.0F, true));

		Shape5 = new ModelRenderer(this);
		Shape5.setRotationPoint(-2.5F, -5.0F, 3.0F);
		Shape5.cubeList.add(new ModelBox(Shape5, 43, 48, 0.0F, 0.0F, 0.0F, 5, 7, 5, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 5.0F, 2.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 1, 0, -6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F, true));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-3.0F, 12.0F, 7.0F);
		leg1.cubeList.add(new ModelBox(leg1, 25, 47, -3.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(3.0F, 12.0F, 7.0F);
		leg2.cubeList.add(new ModelBox(leg2, 25, 47, -1.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-3.0F, 12.0F, -5.0F);
		leg3.cubeList.add(new ModelBox(leg3, 25, 47, -3.0F, 0.0F, -3.0F, 4, 12, 4, 0.0F, true));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(3.0F, 12.0F, -5.0F);
		leg4.cubeList.add(new ModelBox(leg4, 25, 47, -1.0F, 0.0F, -3.0F, 4, 12, 4, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		Neck.render(f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		body.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}