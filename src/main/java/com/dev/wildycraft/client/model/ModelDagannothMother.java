// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
public class ModelDagannothMother extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer abdomen;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer rightthigh;
	private final ModelRenderer leftthigh;
	private final ModelRenderer tailspike;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer snout;
	private final ModelRenderer leftfoot;
	private final ModelRenderer rightfoot;
	private final ModelRenderer spine;
	private final ModelRenderer firstspike;
	private final ModelRenderer secondspike;
	private final ModelRenderer thirdspike;
	private final ModelRenderer torso;
	private final ModelRenderer spine2;
	private final ModelRenderer rightarm2;
	private final ModelRenderer leftarm2;
	private final ModelRenderer spine4;
	private final ModelRenderer Spike5;

	public ModelDagannothMother() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.5F, -21.0F, -10.5F);
		head.cubeList.add(new ModelBox(head, 36, 0, -6.0F, -6.0F, -12.0F, 12, 12, 12, 0.0F, true));

		abdomen = new ModelRenderer(this);
		abdomen.setRotationPoint(0.0F, 4.0F, 0.0F);
		setRotationAngle(abdomen, 0.3316F, 0.0F, 0.0F);
		abdomen.cubeList.add(new ModelBox(abdomen, 39, 70, -7.5F, -14.0F, 6.0F, 14, 17, 11, 0.0F, true));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(7.0F, -21.0F, 1.0F);
		setRotationAngle(leftarm, -0.0873F, 0.0F, -0.2443F);
		leftarm.cubeList.add(new ModelBox(leftarm, 92, 21, -0.5F, -2.0F, -3.0F, 7, 26, 6, 0.0F, true));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-8.0F, -21.0F, 1.0F);
		setRotationAngle(rightarm, 0.0F, 3.1416F, -0.2443F);
		rightarm.cubeList.add(new ModelBox(rightarm, 92, 21, 0.0F, -2.0F, -3.0F, 7, 26, 6, 0.0F, true));

		rightthigh = new ModelRenderer(this);
		rightthigh.setRotationPoint(-5.0F, 1.0F, 8.0F);
		setRotationAngle(rightthigh, 0.9599F, 3.1649F, 0.0F);
		rightthigh.cubeList.add(new ModelBox(rightthigh, 11, 78, -3.0F, 0.0F, -3.0F, 6, 11, 6, 0.0F, true));

		leftthigh = new ModelRenderer(this);
		leftthigh.setRotationPoint(4.0F, 1.0F, 8.0F);
		setRotationAngle(leftthigh, 0.9599F, 3.1416F, 0.0F);
		leftthigh.cubeList.add(new ModelBox(leftthigh, 11, 78, -3.0F, 0.0F, -3.0F, 6, 11, 6, 0.0F, true));

		tailspike = new ModelRenderer(this);
		tailspike.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tailspike, 0.0F, 1.5708F, -2.618F);
		tailspike.cubeList.add(new ModelBox(tailspike, 11, 69, 14.0F, -10.0F, -2.0F, 5, 3, 3, 0.0F, true));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(4.0F, 1.0F, 8.0F);
		setRotationAngle(leftleg, -2.1817F, 3.1416F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 80, 102, -2.5F, -11.0F, 3.0F, 5, 5, 17, 0.0F, true));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-5.0F, 1.0F, 8.0F);
		setRotationAngle(rightleg, -2.1817F, 3.1416F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 80, 102, -2.5F, -11.0F, 3.0F, 5, 5, 17, 0.0F, true));

		snout = new ModelRenderer(this);
		snout.setRotationPoint(-0.5F, -21.0F, -10.5F);
		snout.cubeList.add(new ModelBox(snout, 87, 2, -4.0F, -2.0F, -20.0F, 8, 8, 8, 0.0F, true));

		leftfoot = new ModelRenderer(this);
		leftfoot.setRotationPoint(4.0F, 1.0F, 8.0F);
		setRotationAngle(leftfoot, 0.0F, 3.1416F, 0.0F);
		leftfoot.cubeList.add(new ModelBox(leftfoot, 90, 86, -4.0F, 21.0F, -2.0F, 8, 2, 9, 0.0F, true));

		rightfoot = new ModelRenderer(this);
		rightfoot.setRotationPoint(-5.0F, 1.0F, 8.0F);
		setRotationAngle(rightfoot, 0.0F, 3.1416F, 0.0F);
		rightfoot.cubeList.add(new ModelBox(rightfoot, 90, 86, -4.0F, 21.0F, -2.0F, 8, 2, 9, 0.0F, true));

		spine = new ModelRenderer(this);
		spine.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(spine, 0.2618F, 3.1416F, 0.0175F);
		spine.cubeList.add(new ModelBox(spine, 4, 101, -2.5F, -25.0F, -7.0F, 5, 1, 24, 0.0F, true));

		firstspike = new ModelRenderer(this);
		firstspike.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(firstspike, 0.3142F, 3.1416F, 0.0F);
		firstspike.cubeList.add(new ModelBox(firstspike, 3, 24, 0.5F, -28.0F, 15.0F, 0, 4, 1, 0.0F, true));

		secondspike = new ModelRenderer(this);
		secondspike.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(secondspike, 0.3316F, 3.1416F, 0.0F);
		secondspike.cubeList.add(new ModelBox(secondspike, 8, 21, 0.5F, -31.0F, 12.0F, 0, 7, 1, 0.0F, true));

		thirdspike = new ModelRenderer(this);
		thirdspike.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(thirdspike, 0.3316F, 3.1416F, 0.0F);
		thirdspike.cubeList.add(new ModelBox(thirdspike, 13, 18, 0.5F, -34.0F, 8.0F, 0, 10, 1, 0.0F, true));

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(torso, 1.3264F, 0.0F, 0.0F);
		torso.cubeList.add(new ModelBox(torso, 34, 29, -7.5F, -17.0F, 11.0F, 14, 24, 13, 0.0F, true));

		spine2 = new ModelRenderer(this);
		spine2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(spine2, -0.2443F, 0.0F, 0.0F);
		spine2.cubeList.add(new ModelBox(spine2, 14, 49, -3.0F, -25.0F, 7.0F, 5, 8, 1, 0.0F, true));

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(-8.0F, -21.0F, 1.0F);
		setRotationAngle(rightarm2, -1.5883F, 0.0F, 0.2443F);
		rightarm2.cubeList.add(new ModelBox(rightarm2, 92, 56, -7.0F, -3.0F, 18.0F, 7, 21, 6, 0.0F, false));

		leftarm2 = new ModelRenderer(this);
		leftarm2.setRotationPoint(7.0F, -21.0F, 1.0F);
		setRotationAngle(leftarm2, -1.6755F, 0.0F, -0.2443F);
		leftarm2.cubeList.add(new ModelBox(leftarm2, 92, 56, -0.5F, -3.0F, 18.0F, 7, 21, 6, 0.0F, false));

		spine4 = new ModelRenderer(this);
		spine4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(spine4, 0.3316F, 3.1416F, 0.0F);
		spine4.cubeList.add(new ModelBox(spine4, 18, 20, 0.0F, -32.0F, 4.0F, 0, 8, 1, 0.0F, true));

		Spike5 = new ModelRenderer(this);
		Spike5.setRotationPoint(0.0F, 1.0F, 2.0F);
		setRotationAngle(Spike5, 0.3142F, 3.1416F, 0.0F);
		Spike5.cubeList.add(new ModelBox(Spike5, 26, 24, 0.5F, -29.0F, 0.0F, 0, 4, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		abdomen.render(f5);
		leftarm.render(f5);
		rightarm.render(f5);
		rightthigh.render(f5);
		leftthigh.render(f5);
		tailspike.render(f5);
		leftleg.render(f5);
		rightleg.render(f5);
		snout.render(f5);
		leftfoot.render(f5);
		rightfoot.render(f5);
		spine.render(f5);
		firstspike.render(f5);
		secondspike.render(f5);
		thirdspike.render(f5);
		torso.render(f5);
		spine2.render(f5);
		rightarm2.render(f5);
		leftarm2.render(f5);
		spine4.render(f5);
		Spike5.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}