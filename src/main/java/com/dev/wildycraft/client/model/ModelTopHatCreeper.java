// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTopHatCreeper extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer Shape1;
	private final ModelRenderer Shape2;

	public ModelTopHatCreeper() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 32, 15, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 6.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 12, 6, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, true));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-2.0F, 18.0F, -4.0F);
		leg3.cubeList.add(new ModelBox(leg3, 0, 0, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, true));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(2.0F, 18.0F, -4.0F);
		leg4.cubeList.add(new ModelBox(leg4, 0, 0, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, true));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-4.0F, 18.0F, 4.0F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 0, 0.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, true));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(2.0F, 18.0F, 4.0F);
		leg2.cubeList.add(new ModelBox(leg2, 0, 0, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, true));

		Shape1 = new ModelRenderer(this);
		Shape1.setRotationPoint(0.0F, 6.0F, 0.0F);
		Shape1.cubeList.add(new ModelBox(Shape1, 0, 22, -5.0F, -9.0F, -5.0F, 10, 1, 10, 0.0F, true));

		Shape2 = new ModelRenderer(this);
		Shape2.setRotationPoint(0.0F, 6.0F, 0.0F);
		Shape2.cubeList.add(new ModelBox(Shape2, 36, 0, -3.0F, -12.0F, -4.0F, 6, 3, 8, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		Shape1.render(f5);
		Shape2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}