// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPackYak extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer horn1;
	private final ModelRenderer horn2;
	private final ModelRenderer snout;
	private final ModelRenderer fur;
	private final ModelRenderer pack;
	private final ModelRenderer white_stripe;
	private final ModelRenderer pack2;
	private final ModelRenderer rope;

	public ModelPackYak() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.0F, -8.0F);
		setRotationAngle(head, 0.4349F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 3, 52, -4.0F, -5.0F, -3.0F, 8, 6, 6, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 5.0F, 2.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 41, 87, -6.0F, -10.0F, -9.0F, 12, 28, 12, 0.0F, true));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-4.0F, 12.0F, 16.0F);
		leg1.cubeList.add(new ModelBox(leg1, 17, 102, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(4.0F, 12.0F, 16.0F);
		leg2.cubeList.add(new ModelBox(leg2, 17, 102, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-4.0F, 12.0F, -5.0F);
		leg3.cubeList.add(new ModelBox(leg3, 17, 102, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(4.0F, 12.0F, -5.0F);
		leg4.cubeList.add(new ModelBox(leg4, 17, 102, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		horn1 = new ModelRenderer(this);
		horn1.setRotationPoint(0.0F, 5.0F, -7.0F);
		setRotationAngle(horn1, 1.4661F, 0.0F, 0.0F);
		horn1.cubeList.add(new ModelBox(horn1, 20, 34, -4.0F, -13.0F, 1.5F, 2, 10, 2, 0.0F, true));

		horn2 = new ModelRenderer(this);
		horn2.setRotationPoint(0.0F, 5.0F, -7.0F);
		setRotationAngle(horn2, 1.4661F, 0.0F, 0.0F);
		horn2.cubeList.add(new ModelBox(horn2, 20, 34, 2.0F, -13.0F, 1.5F, 2, 10, 2, 0.0F, true));

		snout = new ModelRenderer(this);
		snout.setRotationPoint(0.0F, 6.0F, -8.0F);
		setRotationAngle(snout, -1.1359F, 0.0F, 0.0F);
		snout.cubeList.add(new ModelBox(snout, 4, 69, -2.0F, 0.0F, -2.0F, 4, 7, 3, 0.0F, true));

		fur = new ModelRenderer(this);
		fur.setRotationPoint(0.0F, 5.0F, 2.0F);
		fur.cubeList.add(new ModelBox(fur, 33, 41, -8.0F, -4.0F, -9.0F, 16, 14, 25, 0.0F, true));

		pack = new ModelRenderer(this);
		pack.setRotationPoint(0.0F, 5.0F, 2.0F);
		setRotationAngle(pack, -0.1487F, 0.1943F, 0.3346F);
		pack.cubeList.add(new ModelBox(pack, 51, 0, -12.0F, -3.0F, 2.0F, 5, 8, 8, 0.0F, true));

		white_stripe = new ModelRenderer(this);
		white_stripe.setRotationPoint(0.0F, 5.0F, 2.0F);
		white_stripe.cubeList.add(new ModelBox(white_stripe, 0, 0, -4.0F, -6.0F, -8.0F, 8, 4, 17, 0.0F, true));

		pack2 = new ModelRenderer(this);
		pack2.setRotationPoint(0.0F, 5.0F, 2.0F);
		setRotationAngle(pack2, 0.0744F, 3.0858F, 0.4461F);
		pack2.cubeList.add(new ModelBox(pack2, 77, 0, -11.0F, -2.0F, -10.0F, 5, 8, 8, 0.0F, true));

		rope = new ModelRenderer(this);
		rope.setRotationPoint(0.0F, 5.0F, 2.0F);
		rope.cubeList.add(new ModelBox(rope, 51, 18, -7.0F, -5.0F, 9.0F, 13, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		horn1.render(f5);
		horn2.render(f5);
		snout.render(f5);
		fur.render(f5);
		pack.render(f5);
		white_stripe.render(f5);
		pack2.render(f5);
		rope.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}