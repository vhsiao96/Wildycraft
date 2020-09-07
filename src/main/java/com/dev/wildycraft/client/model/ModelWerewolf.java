// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWerewolf extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer snout;
	private final ModelRenderer leftear;
	private final ModelRenderer rightear;
	private final ModelRenderer tail;
	private final ModelRenderer rightthumb;
	private final ModelRenderer leftthumb;
	private final ModelRenderer rightclaw1;
	private final ModelRenderer rightclaw2;
	private final ModelRenderer rightclaw3;
	private final ModelRenderer leftclaw1;
	private final ModelRenderer leftclaw2;
	private final ModelRenderer leftclaw3;
	private final ModelRenderer upperbody;
	private final ModelRenderer lowerjaw;
	private final ModelRenderer backjaw;

	public ModelWerewolf() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(head, 0.0698F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 96, 16, -4.0F, -8.0F, -7.0F, 8, 8, 8, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(body, 0.0349F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 72, 47, -4.0F, -3.0F, -2.0F, 8, 13, 4, 0.0F, true));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-6.0F, -1.0F, 0.0F);
		setRotationAngle(rightarm, 0.0F, 0.0F, 0.0873F);
		rightarm.cubeList.add(new ModelBox(rightarm, 96, 46, -3.0F, -2.0F, -2.0F, 4, 14, 4, 0.0F, true));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(6.0F, -1.0F, 0.0F);
		setRotationAngle(leftarm, 0.0F, 0.0F, -0.0873F);
		leftarm.cubeList.add(new ModelBox(leftarm, 96, 46, -1.0F, -2.0F, -2.0F, 4, 14, 4, 0.0F, true));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 10.0F, 0.0F);
		setRotationAngle(rightleg, 0.0F, 0.0F, 0.0349F);
		rightleg.cubeList.add(new ModelBox(rightleg, 112, 46, -2.0F, 0.0F, -1.7F, 4, 14, 4, 0.0F, true));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 10.0F, 0.0F);
		setRotationAngle(leftleg, 0.0F, 0.0F, -0.0349F);
		leftleg.cubeList.add(new ModelBox(leftleg, 112, 46, -2.0F, 0.0F, -1.7F, 4, 14, 4, 0.0F, true));

		snout = new ModelRenderer(this);
		snout.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(snout, 0.0698F, 0.0F, 0.0F);
		snout.cubeList.add(new ModelBox(snout, 81, 0, -2.0F, -4.0F, -12.0F, 4, 2, 6, 0.0F, true));

		leftear = new ModelRenderer(this);
		leftear.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(leftear, 0.0698F, 0.0F, 0.0F);
		leftear.cubeList.add(new ModelBox(leftear, 86, 24, 2.0F, -11.0F, -2.0F, 2, 3, 2, 0.0F, true));

		rightear = new ModelRenderer(this);
		rightear.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(rightear, 0.0698F, 0.0F, 0.0F);
		rightear.cubeList.add(new ModelBox(rightear, 86, 24, -4.0F, -11.0F, -2.0F, 2, 3, 2, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 9.0F, 1.5F);
		setRotationAngle(tail, 0.4887F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 80, 16, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, true));

		rightthumb = new ModelRenderer(this);
		rightthumb.setRotationPoint(-5.0F, -1.0F, 0.0F);
		setRotationAngle(rightthumb, -0.6807F, 0.0F, 0.0873F);
		rightthumb.cubeList.add(new ModelBox(rightthumb, 72, 20, -3.5F, 9.0F, 5.0F, 0, 2, 1, 0.0F, true));

		leftthumb = new ModelRenderer(this);
		leftthumb.setRotationPoint(6.0F, -1.0F, 0.0F);
		setRotationAngle(leftthumb, -0.6807F, 0.0F, -0.0873F);
		leftthumb.cubeList.add(new ModelBox(leftthumb, 72, 20, 2.5F, 9.0F, 5.0F, 0, 2, 1, 0.0F, true));

		rightclaw1 = new ModelRenderer(this);
		rightclaw1.setRotationPoint(-5.0F, -1.0F, 0.0F);
		setRotationAngle(rightclaw1, 0.0F, 0.0F, 0.0873F);
		rightclaw1.cubeList.add(new ModelBox(rightclaw1, 72, 31, -4.0F, 11.0F, 1.0F, 1, 6, 0, 0.0F, true));

		rightclaw2 = new ModelRenderer(this);
		rightclaw2.setRotationPoint(-5.0F, -1.0F, 0.0F);
		setRotationAngle(rightclaw2, 0.0F, 0.0F, 0.0873F);
		rightclaw2.cubeList.add(new ModelBox(rightclaw2, 72, 31, -4.0F, 11.0F, 0.0F, 1, 6, 0, 0.0F, true));

		rightclaw3 = new ModelRenderer(this);
		rightclaw3.setRotationPoint(-5.0F, -1.0F, 0.0F);
		setRotationAngle(rightclaw3, 0.0F, 0.0F, 0.0873F);
		rightclaw3.cubeList.add(new ModelBox(rightclaw3, 72, 31, -4.0F, 11.0F, -1.0F, 1, 6, 0, 0.0F, true));

		leftclaw1 = new ModelRenderer(this);
		leftclaw1.setRotationPoint(5.0F, -1.0F, 0.0F);
		setRotationAngle(leftclaw1, 0.0F, 0.0F, -0.0873F);
		leftclaw1.cubeList.add(new ModelBox(leftclaw1, 72, 31, 3.0F, 11.0F, 1.0F, 1, 6, 0, 0.0F, true));

		leftclaw2 = new ModelRenderer(this);
		leftclaw2.setRotationPoint(5.0F, -1.0F, 0.0F);
		setRotationAngle(leftclaw2, 0.0F, 0.0F, -0.0873F);
		leftclaw2.cubeList.add(new ModelBox(leftclaw2, 72, 31, 3.0F, 11.0F, 0.0F, 1, 6, 0, 0.0F, true));

		leftclaw3 = new ModelRenderer(this);
		leftclaw3.setRotationPoint(5.0F, -1.0F, 0.0F);
		setRotationAngle(leftclaw3, 0.0F, 0.0F, -0.0873F);
		leftclaw3.cubeList.add(new ModelBox(leftclaw3, 72, 31, 3.0F, 11.0F, -1.0F, 1, 6, 0, 0.0F, true));

		upperbody = new ModelRenderer(this);
		upperbody.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(upperbody, 0.1047F, 0.0F, 0.0F);
		upperbody.cubeList.add(new ModelBox(upperbody, 80, 32, -9.0F, -4.0F, -3.0F, 18, 8, 6, 0.0F, true));

		lowerjaw = new ModelRenderer(this);
		lowerjaw.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(lowerjaw, 0.0698F, 0.0F, 0.0F);
		lowerjaw.cubeList.add(new ModelBox(lowerjaw, 104, 0, -2.0F, -1.0F, -12.0F, 4, 1, 6, 0.0F, true));

		backjaw = new ModelRenderer(this);
		backjaw.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(backjaw, 0.384F, 0.0F, 0.0F);
		backjaw.cubeList.add(new ModelBox(backjaw, 105, 9, -2.0F, -5.0F, -7.5F, 4, 2, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
		snout.render(f5);
		leftear.render(f5);
		rightear.render(f5);
		tail.render(f5);
		rightthumb.render(f5);
		leftthumb.render(f5);
		rightclaw1.render(f5);
		rightclaw2.render(f5);
		rightclaw3.render(f5);
		leftclaw1.render(f5);
		leftclaw2.render(f5);
		leftclaw3.render(f5);
		upperbody.render(f5);
		lowerjaw.render(f5);
		backjaw.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}