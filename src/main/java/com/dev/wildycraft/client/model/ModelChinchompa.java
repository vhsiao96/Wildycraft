// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelChinchompa extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer Head;
	private final ModelRenderer Leg1;
	private final ModelRenderer Ear1;
	private final ModelRenderer Ear2;
	private final ModelRenderer Leg2;
	private final ModelRenderer Leg3;
	private final ModelRenderer Leg4;
	private final ModelRenderer Tail;

	public ModelChinchompa() {
		textureWidth = 64;
		textureHeight = 32;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 21.5F, -2.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -2.0F, -1.5F, 0.0F, 4, 3, 5, 0.0F, true));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 21.0F, -1.0F);
		Head.cubeList.add(new ModelBox(Head, 18, 0, -1.5F, -1.5F, -3.0F, 3, 3, 3, 0.0F, true));

		Leg1 = new ModelRenderer(this);
		Leg1.setRotationPoint(1.0F, 22.0F, 2.5F);
		Leg1.cubeList.add(new ModelBox(Leg1, 0, 8, 0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

		Ear1 = new ModelRenderer(this);
		Ear1.setRotationPoint(0.0F, 21.0F, -1.0F);
		Ear1.cubeList.add(new ModelBox(Ear1, 36, 0, -1.5F, -2.5F, -1.0F, 1, 1, 1, 0.0F, true));

		Ear2 = new ModelRenderer(this);
		Ear2.setRotationPoint(0.0F, 21.0F, -1.0F);
		Ear2.cubeList.add(new ModelBox(Ear2, 40, 0, 0.5F, -2.5F, -1.0F, 1, 1, 1, 0.0F, true));

		Leg2 = new ModelRenderer(this);
		Leg2.setRotationPoint(-1.0F, 22.0F, 2.5F);
		Leg2.cubeList.add(new ModelBox(Leg2, 0, 8, -1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

		Leg3 = new ModelRenderer(this);
		Leg3.setRotationPoint(1.0F, 22.0F, -1.5F);
		Leg3.cubeList.add(new ModelBox(Leg3, 0, 8, 0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

		Leg4 = new ModelRenderer(this);
		Leg4.setRotationPoint(-1.0F, 22.0F, -1.5F);
		Leg4.cubeList.add(new ModelBox(Leg4, 0, 8, -1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 21.0F, 3.0F);
		Tail.cubeList.add(new ModelBox(Tail, 30, 0, -1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		Head.render(f5);
		Leg1.render(f5);
		Ear1.render(f5);
		Ear2.render(f5);
		Leg2.render(f5);
		Leg3.render(f5);
		Leg4.render(f5);
		Tail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}