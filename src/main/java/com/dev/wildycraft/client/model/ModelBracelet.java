// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBracelet extends ModelBase {
	private final ModelRenderer Shape1;

	public ModelBracelet() {
		textureWidth = 32;
		textureHeight = 32;

		Shape1 = new ModelRenderer(this);
		Shape1.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Shape1.cubeList.add(new ModelBox(Shape1, 0, 0, -3.5F, 5.0F, -2.5F, 5, 1, 5, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Shape1.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}