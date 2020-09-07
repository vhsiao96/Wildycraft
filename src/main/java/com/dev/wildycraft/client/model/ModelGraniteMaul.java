// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGraniteMaul extends ModelBase {
	private final ModelRenderer Shape1;
	private final ModelRenderer Shape2;

	public ModelGraniteMaul() {
		textureWidth = 128;
		textureHeight = 64;

		Shape1 = new ModelRenderer(this);
		Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shape1.cubeList.add(new ModelBox(Shape1, 0, 12, -0.5F, 6.5F, -20.0F, 1, 1, 25, 0.0F, true));

		Shape2 = new ModelRenderer(this);
		Shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shape2.cubeList.add(new ModelBox(Shape2, 0, 0, -3.0F, 3.0F, -19.0F, 6, 8, 4, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Shape1.render(f5);
		Shape2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}