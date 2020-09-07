// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSuqah extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightthigh;
	private final ModelRenderer leftthigh;
	private final ModelRenderer chestplate;
	private final ModelRenderer helmet;
	private final ModelRenderer helmetrim;
	private final ModelRenderer helmetbit;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftshoulderpad;
	private final ModelRenderer rightshoulderpad;
	private final ModelRenderer leftfoot;
	private final ModelRenderer rightfoot;
	private final ModelRenderer rightear;
	private final ModelRenderer lefttear;

	public ModelSuqah() {
		textureWidth = 256;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -16.0F, -3.0F);
		setRotationAngle(head, 0.0349F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 111, 20, -4.0F, -9.0F, -5.0F, 8, 10, 9, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -4.0F, 0.0F);
		setRotationAngle(body, 0.0524F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 106, 67, -5.5F, -4.0F, -4.0F, 11, 12, 8, 0.0F, true));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-7.0F, -13.0F, 0.0F);
		setRotationAngle(rightarm, -0.0524F, 0.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 160, 45, -7.0F, 2.0F, -2.0F, 5, 17, 5, 0.0F, true));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(7.0F, -13.0F, 0.0F);
		setRotationAngle(leftarm, -0.0524F, 0.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 160, 45, 2.0F, 2.0F, -2.0F, 5, 17, 5, 0.0F, true));

		rightthigh = new ModelRenderer(this);
		rightthigh.setRotationPoint(-3.0F, 2.0F, 0.0F);
		setRotationAngle(rightthigh, -0.4363F, 0.0F, 0.0F);
		rightthigh.cubeList.add(new ModelBox(rightthigh, 115, 90, -2.5F, 0.0F, -3.0F, 5, 12, 6, 0.0F, true));

		leftthigh = new ModelRenderer(this);
		leftthigh.setRotationPoint(3.0F, 2.0F, 0.0F);
		setRotationAngle(leftthigh, -0.4363F, 0.0F, 0.0F);
		leftthigh.cubeList.add(new ModelBox(leftthigh, 115, 90, -2.5F, 0.0F, -3.0F, 5, 12, 6, 0.0F, true));

		chestplate = new ModelRenderer(this);
		chestplate.setRotationPoint(0.0F, -4.0F, 0.0F);
		setRotationAngle(chestplate, 0.0873F, 0.0F, 0.0F);
		chestplate.cubeList.add(new ModelBox(chestplate, 104, 42, -7.0F, -12.0F, -5.2F, 14, 11, 10, 0.0F, true));

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, -16.0F, -3.0F);
		setRotationAngle(helmet, 0.0349F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 110, 5, -4.5F, -9.2F, -5.5F, 9, 3, 10, 0.0F, true));

		helmetrim = new ModelRenderer(this);
		helmetrim.setRotationPoint(0.0F, -16.0F, -3.0F);
		setRotationAngle(helmetrim, 0.0349F, 0.0F, 0.0F);
		helmetrim.cubeList.add(new ModelBox(helmetrim, 152, 5, -4.5F, -6.2F, -5.5F, 9, 1, 10, 0.0F, true));

		helmetbit = new ModelRenderer(this);
		helmetbit.setRotationPoint(0.0F, -16.0F, -3.0F);
		setRotationAngle(helmetbit, 0.0349F, 0.0F, 0.0F);
		helmetbit.cubeList.add(new ModelBox(helmetbit, 152, 21, -0.5F, -6.0F, -5.7F, 1, 3, 1, 0.0F, true));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(3.0F, 2.0F, 0.0F);
		setRotationAngle(leftleg, 0.2618F, 0.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 145, 95, -2.0F, 7.0F, -9.0F, 4, 13, 5, 0.0F, true));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-3.0F, 2.0F, 0.0F);
		setRotationAngle(rightleg, 0.2618F, 0.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 145, 95, -2.0F, 7.0F, -9.0F, 4, 13, 5, 0.0F, true));

		leftshoulderpad = new ModelRenderer(this);
		leftshoulderpad.setRotationPoint(7.0F, -13.0F, 0.0F);
		setRotationAngle(leftshoulderpad, 0.0873F, 0.0F, 0.0F);
		leftshoulderpad.cubeList.add(new ModelBox(leftshoulderpad, 55, 45, 0.0F, -4.0F, -6.5F, 9, 10, 11, 0.0F, true));

		rightshoulderpad = new ModelRenderer(this);
		rightshoulderpad.setRotationPoint(-7.0F, -13.0F, 0.0F);
		setRotationAngle(rightshoulderpad, 0.0873F, 0.0F, 0.0F);
		rightshoulderpad.cubeList.add(new ModelBox(rightshoulderpad, 55, 45, -9.0F, -4.0F, -6.5F, 9, 10, 11, 0.0F, true));

		leftfoot = new ModelRenderer(this);
		leftfoot.setRotationPoint(3.0F, 2.0F, 0.0F);
		leftfoot.cubeList.add(new ModelBox(leftfoot, 170, 100, -2.5F, 20.0F, -6.7F, 5, 2, 8, 0.0F, true));

		rightfoot = new ModelRenderer(this);
		rightfoot.setRotationPoint(-3.0F, 2.0F, 0.0F);
		rightfoot.cubeList.add(new ModelBox(rightfoot, 170, 100, -2.5F, 20.0F, -6.7F, 5, 2, 8, 0.0F, true));

		rightear = new ModelRenderer(this);
		rightear.setRotationPoint(0.0F, -16.0F, -3.0F);
		setRotationAngle(rightear, 0.0349F, -0.5411F, 0.0F);
		rightear.cubeList.add(new ModelBox(rightear, 85, 20, -5.0F, -11.0F, 0.0F, 0, 8, 7, 0.0F, true));

		lefttear = new ModelRenderer(this);
		lefttear.setRotationPoint(0.0F, -16.0F, -3.0F);
		setRotationAngle(lefttear, 0.0349F, 0.5411F, 0.0F);
		lefttear.cubeList.add(new ModelBox(lefttear, 85, 20, 5.0F, -11.0F, 0.0F, 0, 8, 7, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightthigh.render(f5);
		leftthigh.render(f5);
		chestplate.render(f5);
		helmet.render(f5);
		helmetrim.render(f5);
		helmetbit.render(f5);
		leftleg.render(f5);
		rightleg.render(f5);
		leftshoulderpad.render(f5);
		rightshoulderpad.render(f5);
		leftfoot.render(f5);
		rightfoot.render(f5);
		rightear.render(f5);
		lefttear.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}