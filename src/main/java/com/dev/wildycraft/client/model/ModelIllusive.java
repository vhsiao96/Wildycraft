// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelIllusive extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer segment1;
	private final ModelRenderer segment2;
	private final ModelRenderer segment3;
	private final ModelRenderer tail;
	private final ModelRenderer beak;
	private final ModelRenderer righthorn;
	private final ModelRenderer lefthorn;

	public ModelIllusive() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 22.0F, -4.0F);
		head.cubeList.add(new ModelBox(head, 50, 14, -1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F, true));

		segment1 = new ModelRenderer(this);
		segment1.setRotationPoint(0.0F, 22.0F, -2.5F);
		segment1.cubeList.add(new ModelBox(segment1, 33, 12, -2.0F, -2.0F, 0.0F, 4, 4, 4, 0.0F, true));

		segment2 = new ModelRenderer(this);
		segment2.setRotationPoint(0.0F, 22.5F, 1.5F);
		segment2.cubeList.add(new ModelBox(segment2, 20, 14, -1.5F, -1.5F, 0.0F, 3, 3, 3, 0.0F, true));

		segment3 = new ModelRenderer(this);
		segment3.setRotationPoint(0.0F, 23.0F, 4.5F);
		segment3.cubeList.add(new ModelBox(segment3, 9, 15, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 23.5F, 7.0F);
		tail.cubeList.add(new ModelBox(tail, 1, 18, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

		beak = new ModelRenderer(this);
		beak.setRotationPoint(0.0F, 22.0F, -4.0F);
		setRotationAngle(beak, 0.0698F, 0.0F, 0.0F);
		beak.cubeList.add(new ModelBox(beak, 47, 22, -1.0F, -0.5F, -6.5F, 2, 2, 5, 0.0F, true));

		righthorn = new ModelRenderer(this);
		righthorn.setRotationPoint(0.0F, 22.0F, -4.0F);
		setRotationAngle(righthorn, 1.3264F, 0.0F, 0.0F);
		righthorn.cubeList.add(new ModelBox(righthorn, 50, 5, -1.3F, -2.3F, -0.5F, 1, 1, 4, 0.0F, true));

		lefthorn = new ModelRenderer(this);
		lefthorn.setRotationPoint(0.0F, 22.0F, -4.0F);
		setRotationAngle(lefthorn, 1.3264F, 0.0F, 0.0F);
		lefthorn.cubeList.add(new ModelBox(lefthorn, 50, 5, 0.3F, -2.3F, -0.5F, 1, 1, 4, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		segment1.render(f5);
		segment2.render(f5);
		segment3.render(f5);
		tail.render(f5);
		beak.render(f5);
		righthorn.render(f5);
		lefthorn.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}