// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRSGhast extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer tentacles;
	private final ModelRenderer var8;
	private final ModelRenderer var11;

	public ModelRSGhast() {
		textureWidth = 16;
		textureHeight = 16;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, 0.0F, -14.0F, 8, 8, 18, 0.0F, false));

		tentacles = new ModelRenderer(this);
		tentacles.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		var8 = new ModelRenderer(this);
		var8.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		var11 = new ModelRenderer(this);
		var11.setRotationPoint(0.0F, 0.0F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		tentacles.render(f5);
		var8.render(f5);
		var11.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}