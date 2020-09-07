// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHellhound extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer mane;
	private final ModelRenderer rightbackleg;
	private final ModelRenderer leftbackleg;
	private final ModelRenderer rightfrontleg;
	private final ModelRenderer leftfrontleg;
	private final ModelRenderer tail;
	private final ModelRenderer rightear;
	private final ModelRenderer leftear;
	private final ModelRenderer snout;
	private final ModelRenderer righthorn;
	private final ModelRenderer lefthorn;

	public ModelHellhound() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 10.5F, -5.0F);
		head.cubeList.add(new ModelBox(head, 15, 0, -4.0F, -4.0F, -5.0F, 8, 8, 6, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 18, 34, -4.0F, 0.0F, -15.0F, 8, 13, 8, 0.0F, true));

		mane = new ModelRenderer(this);
		mane.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(mane, 1.5708F, 0.0F, 0.0F);
		mane.cubeList.add(new ModelBox(mane, 14, 15, -5.0F, -5.0F, -15.0F, 10, 8, 9, 0.0F, true));

		rightbackleg = new ModelRenderer(this);
		rightbackleg.setRotationPoint(-2.5F, 15.0F, 11.0F);
		rightbackleg.cubeList.add(new ModelBox(rightbackleg, 4, 48, -1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F, true));

		leftbackleg = new ModelRenderer(this);
		leftbackleg.setRotationPoint(2.5F, 15.0F, 11.0F);
		leftbackleg.cubeList.add(new ModelBox(leftbackleg, 4, 48, -1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F, true));

		rightfrontleg = new ModelRenderer(this);
		rightfrontleg.setRotationPoint(-2.5F, 15.0F, -1.0F);
		rightfrontleg.cubeList.add(new ModelBox(rightfrontleg, 4, 48, -1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F, true));

		leftfrontleg = new ModelRenderer(this);
		leftfrontleg.setRotationPoint(2.5F, 15.0F, -1.0F);
		leftfrontleg.cubeList.add(new ModelBox(leftfrontleg, 4, 48, -1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 8.0F, 12.0F);
		setRotationAngle(tail, 1.1301F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 5, 29, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, true));

		rightear = new ModelRenderer(this);
		rightear.setRotationPoint(0.0F, 10.5F, -5.0F);
		rightear.cubeList.add(new ModelBox(rightear, 8, 5, -3.6F, -7.0F, -1.0F, 2, 3, 1, 0.0F, true));

		leftear = new ModelRenderer(this);
		leftear.setRotationPoint(0.0F, 10.5F, -5.0F);
		leftear.cubeList.add(new ModelBox(leftear, 8, 5, 1.6F, -7.0F, -1.0F, 2, 3, 1, 0.0F, true));

		snout = new ModelRenderer(this);
		snout.setRotationPoint(0.0F, 10.5F, -5.0F);
		snout.cubeList.add(new ModelBox(snout, 44, 2, -2.0F, -1.0F, -9.0F, 4, 4, 5, 0.0F, true));

		righthorn = new ModelRenderer(this);
		righthorn.setRotationPoint(0.0F, 10.5F, -5.0F);
		setRotationAngle(righthorn, 0.0524F, 0.0F, 0.0F);
		righthorn.cubeList.add(new ModelBox(righthorn, 0, 0, -3.0F, -5.5F, -3.0F, 1, 2, 1, 0.0F, true));

		lefthorn = new ModelRenderer(this);
		lefthorn.setRotationPoint(0.0F, 10.5F, -5.0F);
		setRotationAngle(lefthorn, 0.0524F, 0.0F, 0.0F);
		lefthorn.cubeList.add(new ModelBox(lefthorn, 0, 0, 2.0F, -5.5F, -3.0F, 1, 2, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		mane.render(f5);
		rightbackleg.render(f5);
		leftbackleg.render(f5);
		rightfrontleg.render(f5);
		leftfrontleg.render(f5);
		tail.render(f5);
		rightear.render(f5);
		leftear.render(f5);
		snout.render(f5);
		righthorn.render(f5);
		lefthorn.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}