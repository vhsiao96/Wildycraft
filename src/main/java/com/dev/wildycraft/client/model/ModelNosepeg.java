// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNosepeg extends ModelBase {
	private final ModelRenderer LeftPeg;
	private final ModelRenderer RightPeg;

	public ModelNosepeg() {
		textureWidth = 64;
		textureHeight = 32;

		LeftPeg = new ModelRenderer(this);
		LeftPeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(LeftPeg, 0.4461F, -0.4461F, 0.0F);
		LeftPeg.cubeList.add(new ModelBox(LeftPeg, 32, 22, -3.0F, -7.0F, -2.5F, 1, 4, 1, 0.0F, true));

		RightPeg = new ModelRenderer(this);
		RightPeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(RightPeg, 0.4461F, 0.4461F, 0.0F);
		RightPeg.cubeList.add(new ModelBox(RightPeg, 32, 22, 2.0F, -7.0F, -2.5F, 1, 4, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LeftPeg.render(f5);
		RightPeg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}