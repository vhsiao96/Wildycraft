// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBeaver extends ModelBase {
	private final ModelRenderer teeth;
	private final ModelRenderer tail;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer right_hind_foot;
	private final ModelRenderer left_hind_foot;
	private final ModelRenderer right_foot;
	private final ModelRenderer left_foot;

	public ModelBeaver() {
		textureWidth = 128;
		textureHeight = 128;

		teeth = new ModelRenderer(this);
		teeth.setRotationPoint(0.0F, 14.0F, -6.0F);
		teeth.cubeList.add(new ModelBox(teeth, 6, 12, -1.0F, 4.0F, -8.0F, 2, 1, 0, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 17.0F, 9.0F);
		setRotationAngle(tail, -0.4189F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 53, 25, -3.0F, -1.0F, 0.0F, 6, 2, 12, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 14.0F, -6.0F);
		head.cubeList.add(new ModelBox(head, 14, 0, -4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 13.0F, 3.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 13, 21, -5.0F, -10.0F, -7.0F, 10, 16, 8, 0.0F, true));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-3.0F, 18.0F, 7.0F);
		leg1.cubeList.add(new ModelBox(leg1, 22, 47, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, true));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(3.0F, 18.0F, 7.0F);
		leg2.cubeList.add(new ModelBox(leg2, 22, 47, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, true));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-3.0F, 18.0F, -5.0F);
		leg3.cubeList.add(new ModelBox(leg3, 22, 47, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, true));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(3.0F, 18.0F, -5.0F);
		leg4.cubeList.add(new ModelBox(leg4, 22, 47, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, true));

		right_hind_foot = new ModelRenderer(this);
		right_hind_foot.setRotationPoint(-4.0F, 18.0F, 7.0F);
		right_hind_foot.cubeList.add(new ModelBox(right_hind_foot, 21, 60, -1.0F, 5.0F, -4.0F, 4, 1, 6, 0.0F, true));

		left_hind_foot = new ModelRenderer(this);
		left_hind_foot.setRotationPoint(3.0F, 18.0F, 7.0F);
		left_hind_foot.cubeList.add(new ModelBox(left_hind_foot, 21, 60, -2.0F, 5.0F, -4.0F, 4, 1, 6, 0.0F, true));

		right_foot = new ModelRenderer(this);
		right_foot.setRotationPoint(-3.0F, 18.0F, -5.0F);
		right_foot.cubeList.add(new ModelBox(right_foot, 21, 60, -2.0F, 5.0F, -4.0F, 4, 1, 6, 0.0F, true));

		left_foot = new ModelRenderer(this);
		left_foot.setRotationPoint(3.0F, 18.0F, -5.0F);
		left_foot.cubeList.add(new ModelBox(left_foot, 21, 60, -2.0F, 5.0F, -4.0F, 4, 1, 6, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		teeth.render(f5);
		tail.render(f5);
		head.render(f5);
		body.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		right_hind_foot.render(f5);
		left_hind_foot.render(f5);
		right_foot.render(f5);
		left_foot.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}