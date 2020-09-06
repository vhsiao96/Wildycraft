// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
public class ModelDesertLizard extends ModelBase {
	private final ModelRenderer torso;
	private final ModelRenderer tail1;
	private final ModelRenderer neck;
	private final ModelRenderer head;
	private final ModelRenderer snout1;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;
	private final ModelRenderer rightarm1;
	private final ModelRenderer rightarm2;
	private final ModelRenderer righthand;
	private final ModelRenderer leftarm1;
	private final ModelRenderer leftarm2;
	private final ModelRenderer lefthand;
	private final ModelRenderer leftleg1;
	private final ModelRenderer leftleg2;
	private final ModelRenderer leftfoot;
	private final ModelRenderer rightleg1;
	private final ModelRenderer rightleg2;
	private final ModelRenderer rightoot;

	public ModelDesertLizard() {
		textureWidth = 128;
		textureHeight = 64;

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 17.0F, 0.0F);
		torso.cubeList.add(new ModelBox(torso, 0, 0, -6.0F, -4.0F, -10.0F, 12, 8, 20, 0.0F, true));

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 17.0F, 10.0F);
		tail1.cubeList.add(new ModelBox(tail1, 64, 15, -4.0F, -3.0F, 0.0F, 8, 6, 7, 0.0F, true));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 18.0F, -10.0F);
		neck.cubeList.add(new ModelBox(neck, 93, 49, -4.0F, -4.0F, -2.0F, 8, 6, 2, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 18.0F, -10.0F);
		head.cubeList.add(new ModelBox(head, 23, 46, -5.0F, -5.0F, -9.5F, 10, 7, 8, 0.0F, true));

		snout1 = new ModelRenderer(this);
		snout1.setRotationPoint(0.0F, 18.0F, -10.0F);
		snout1.cubeList.add(new ModelBox(snout1, 61, 47, -3.5F, -2.0F, -17.0F, 7, 4, 8, 0.0F, true));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 18.0F, 17.0F);
		tail2.cubeList.add(new ModelBox(tail2, 64, 0, -3.5F, -3.0F, 0.0F, 7, 5, 10, 0.0F, true));

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, 18.0F, 27.0F);
		tail3.cubeList.add(new ModelBox(tail3, 0, 28, -2.5F, -2.0F, 0.0F, 5, 4, 11, 0.0F, true));

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.0F, 18.5F, 38.0F);
		tail4.cubeList.add(new ModelBox(tail4, 0, 43, -1.5F, -1.5F, 0.0F, 3, 3, 7, 0.0F, true));

		rightarm1 = new ModelRenderer(this);
		rightarm1.setRotationPoint(-6.0F, 18.0F, -6.0F);
		setRotationAngle(rightarm1, -0.1541F, -1.8F, 0.0F);
		rightarm1.cubeList.add(new ModelBox(rightarm1, 32, 28, -2.0F, -2.0F, -2.0F, 4, 4, 11, 0.0F, true));

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(-14.0F, 19.5F, -7.5F);
		setRotationAngle(rightarm2, 0.5577F, 0.3346F, 0.0F);
		rightarm2.cubeList.add(new ModelBox(rightarm2, 62, 28, -1.5F, -1.5F, -7.0F, 3, 3, 7, 0.0F, true));

		righthand = new ModelRenderer(this);
		righthand.setRotationPoint(-16.0F, 23.0F, -11.5F);
		righthand.cubeList.add(new ModelBox(righthand, 98, 7, -3.0F, -1.0F, -5.0F, 6, 2, 5, 0.0F, true));

		leftarm1 = new ModelRenderer(this);
		leftarm1.setRotationPoint(6.0F, 18.0F, -6.0F);
		setRotationAngle(leftarm1, -0.1541F, 1.8F, 0.0F);
		leftarm1.cubeList.add(new ModelBox(leftarm1, 32, 28, -2.0F, -2.0F, -2.0F, 4, 4, 11, 0.0F, true));

		leftarm2 = new ModelRenderer(this);
		leftarm2.setRotationPoint(14.0F, 19.5F, -7.5F);
		setRotationAngle(leftarm2, 0.5577F, -0.3346F, 0.0F);
		leftarm2.cubeList.add(new ModelBox(leftarm2, 62, 28, -1.5F, -1.5F, -7.0F, 3, 3, 7, 0.0F, true));

		lefthand = new ModelRenderer(this);
		lefthand.setRotationPoint(16.0F, 23.0F, -11.5F);
		lefthand.cubeList.add(new ModelBox(lefthand, 98, 0, -3.0F, -1.0F, -5.0F, 6, 2, 5, 0.0F, true));

		leftleg1 = new ModelRenderer(this);
		leftleg1.setRotationPoint(5.0F, 18.0F, 10.0F);
		setRotationAngle(leftleg1, -0.1541F, 0.9077F, 0.0F);
		leftleg1.cubeList.add(new ModelBox(leftleg1, 32, 28, -2.0F, -2.0F, -2.0F, 4, 4, 11, 0.0F, true));

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(11.0F, 19.0F, 15.0F);
		setRotationAngle(leftleg2, 0.5577F, -2.082F, 0.0F);
		leftleg2.cubeList.add(new ModelBox(leftleg2, 62, 28, -1.5F, -1.5F, -7.0F, 3, 3, 7, 0.0F, true));

		leftfoot = new ModelRenderer(this);
		leftfoot.setRotationPoint(16.0F, 23.0F, 18.0F);
		leftfoot.cubeList.add(new ModelBox(leftfoot, 98, 14, -2.0F, -1.0F, -3.0F, 5, 2, 6, 0.0F, true));

		rightleg1 = new ModelRenderer(this);
		rightleg1.setRotationPoint(-5.0F, 18.0F, 10.0F);
		setRotationAngle(rightleg1, -0.1541F, -0.9077F, 0.0F);
		rightleg1.cubeList.add(new ModelBox(rightleg1, 32, 28, -2.0F, -2.0F, -2.0F, 4, 4, 11, 0.0F, true));

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(-11.0F, 19.0F, 15.0F);
		setRotationAngle(rightleg2, 0.5577F, 2.082F, 0.0F);
		rightleg2.cubeList.add(new ModelBox(rightleg2, 62, 28, -1.5F, -1.5F, -7.0F, 3, 3, 7, 0.0F, true));

		rightoot = new ModelRenderer(this);
		rightoot.setRotationPoint(-16.0F, 23.0F, 18.0F);
		rightoot.cubeList.add(new ModelBox(rightoot, 98, 21, -3.0F, -1.0F, -3.0F, 5, 2, 6, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		torso.render(f5);
		tail1.render(f5);
		neck.render(f5);
		head.render(f5);
		snout1.render(f5);
		tail2.render(f5);
		tail3.render(f5);
		tail4.render(f5);
		rightarm1.render(f5);
		rightarm2.render(f5);
		righthand.render(f5);
		leftarm1.render(f5);
		leftarm2.render(f5);
		lefthand.render(f5);
		leftleg1.render(f5);
		leftleg2.render(f5);
		leftfoot.render(f5);
		rightleg1.render(f5);
		rightleg2.render(f5);
		rightoot.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}