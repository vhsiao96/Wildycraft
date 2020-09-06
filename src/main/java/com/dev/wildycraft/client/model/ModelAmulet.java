// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAmulet extends ModelBase {
	private final ModelRenderer String;
	private final ModelRenderer Amulet;

	public ModelAmulet() {
		textureWidth = 64;
		textureHeight = 64;

		String = new ModelRenderer(this);
		String.setRotationPoint(0.0F, 0.0F, 0.0F);
		String.cubeList.add(new ModelBox(String, 6, 32, -3.0F, 0.0F, -2.1F, 6, 3, 0, 0.0F, true));

		Amulet = new ModelRenderer(this);
		Amulet.setRotationPoint(0.0F, 0.0F, 0.0F);
		Amulet.cubeList.add(new ModelBox(Amulet, 0, 32, -1.0F, 2.0F, -2.9F, 2, 2, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		String.render(f5);
		Amulet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}