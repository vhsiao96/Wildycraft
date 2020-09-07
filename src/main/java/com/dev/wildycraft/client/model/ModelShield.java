// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelShield extends ModelBase {
	private final ModelRenderer shieldP1;
	private final ModelRenderer shieldP2;

	public ModelShield() {
		textureWidth = 64;
		textureHeight = 64;

		shieldP1 = new ModelRenderer(this);
		shieldP1.setRotationPoint(5.0F, 2.0F, 0.0F);
		shieldP1.cubeList.add(new ModelBox(shieldP1, 0, 0, 3.0F, 3.0F, -8.0F, 1, 11, 16, 0.0F, true));

		shieldP2 = new ModelRenderer(this);
		shieldP2.setRotationPoint(5.0F, 2.0F, 0.0F);
		shieldP2.cubeList.add(new ModelBox(shieldP2, 0, 32, 3.5F, 4.0F, -8.0F, 1, 9, 16, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		shieldP1.render(f5);
		shieldP2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}