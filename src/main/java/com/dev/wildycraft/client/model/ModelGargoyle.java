// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGargoyle extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightuparm;
	private final ModelRenderer leftuparm;
	private final ModelRenderer rightthigh;
	private final ModelRenderer leftthigh;
	private final ModelRenderer rightwing;
	private final ModelRenderer rightwing2;
	private final ModelRenderer leftwing2;
	private final ModelRenderer leftwing;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer tail;
	private final ModelRenderer tailtip;
	private final ModelRenderer leftankle;
	private final ModelRenderer leftfoot;
	private final ModelRenderer rightankle;
	private final ModelRenderer rightfoot;
	private final ModelRenderer righttalon1;
	private final ModelRenderer righttalon2;
	private final ModelRenderer lefttalon1;
	private final ModelRenderer lefttalon2;
	private final ModelRenderer rightear;
	private final ModelRenderer leftear;
	private final ModelRenderer righthorn;
	private final ModelRenderer lefthorn;
	private final ModelRenderer righthorn2;
	private final ModelRenderer lefthorn2;
	private final ModelRenderer righthorn3;
	private final ModelRenderer Shape1;

	public ModelGargoyle() {
		textureWidth = 256;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, 0.0F);
		setRotationAngle(head, 0.4712F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 84, 7, -3.0F, -6.0F, -5.0F, 6, 6, 7, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(body, 0.8551F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 85, 29, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, true));

		rightuparm = new ModelRenderer(this);
		rightuparm.setRotationPoint(-4.0F, 2.0F, 1.0F);
		setRotationAngle(rightuparm, 0.0F, 0.0F, 0.3491F);
		rightuparm.cubeList.add(new ModelBox(rightuparm, 119, 34, -3.0F, -1.5F, -1.0F, 3, 7, 3, 0.0F, true));

		leftuparm = new ModelRenderer(this);
		leftuparm.setRotationPoint(4.0F, 2.0F, 1.0F);
		setRotationAngle(leftuparm, 0.0F, 0.0F, -0.3491F);
		leftuparm.cubeList.add(new ModelBox(leftuparm, 119, 34, 0.0F, -1.5F, -1.0F, 3, 7, 3, 0.0F, true));

		rightthigh = new ModelRenderer(this);
		rightthigh.setRotationPoint(-2.5F, 6.4F, 8.8F);
		setRotationAngle(rightthigh, -0.0524F, 0.0F, 0.0F);
		rightthigh.cubeList.add(new ModelBox(rightthigh, 87, 49, -1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F, true));

		leftthigh = new ModelRenderer(this);
		leftthigh.setRotationPoint(2.5F, 6.4F, 8.8F);
		setRotationAngle(leftthigh, -0.0524F, 0.0F, 0.0F);
		leftthigh.cubeList.add(new ModelBox(leftthigh, 87, 49, -1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F, true));

		rightwing = new ModelRenderer(this);
		rightwing.setRotationPoint(-2.0F, 2.0F, 5.0F);
		setRotationAngle(rightwing, 0.0F, 0.0F, -2.2515F);
		rightwing.cubeList.add(new ModelBox(rightwing, 20, 100, 0.1F, 0.3F, -3.5F, 8, 0, 8, 0.0F, true));

		rightwing2 = new ModelRenderer(this);
		rightwing2.setRotationPoint(-6.5F, -4.3F, 5.0F);
		setRotationAngle(rightwing2, 0.0F, 0.0F, -2.2515F);
		rightwing2.cubeList.add(new ModelBox(rightwing2, 60, 100, 0.3F, 0.0F, -6.5F, 18, 0, 16, 0.0F, true));

		leftwing2 = new ModelRenderer(this);
		leftwing2.setRotationPoint(6.5F, -4.3F, 5.0F);
		setRotationAngle(leftwing2, 0.0F, 0.0F, -0.8901F);
		leftwing2.cubeList.add(new ModelBox(leftwing2, 60, 100, 0.3F, 0.0F, -6.5F, 18, 0, 16, 0.0F, true));

		leftwing = new ModelRenderer(this);
		leftwing.setRotationPoint(2.0F, 2.0F, 5.0F);
		setRotationAngle(leftwing, 0.0F, 0.0F, -0.8901F);
		leftwing.cubeList.add(new ModelBox(leftwing, 20, 100, 0.0F, -0.5F, -3.5F, 8, 0, 8, 0.0F, true));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-4.0F, 2.0F, 1.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 119, 50, -4.7F, 4.0F, -1.0F, 3, 8, 3, 0.0F, true));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(4.0F, 2.0F, 1.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 119, 50, 1.7F, 4.0F, -1.0F, 3, 8, 3, 0.0F, true));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.5F, 6.4F, 8.8F);
		setRotationAngle(leftleg, -0.0349F, 0.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 87, 65, -1.5F, 5.0F, 1.3F, 3, 3, 3, 0.0F, true));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.5F, 6.4F, 8.8F);
		setRotationAngle(rightleg, -0.0349F, 0.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 87, 65, -1.5F, 5.0F, 1.3F, 3, 3, 3, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 6.3F, 8.0F);
		setRotationAngle(tail, -0.2967F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 57, 37, -1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F, true));

		tailtip = new ModelRenderer(this);
		tailtip.setRotationPoint(0.0F, 7.8F, 12.7F);
		setRotationAngle(tailtip, -0.2967F, 0.0F, 0.0F);
		tailtip.cubeList.add(new ModelBox(tailtip, 33, 32, -1.0F, -1.0F, 0.0F, 2, 2, 10, 0.0F, true));

		leftankle = new ModelRenderer(this);
		leftankle.setRotationPoint(2.5F, 6.4F, 8.8F);
		setRotationAngle(leftankle, -0.0349F, 0.0F, 0.0F);
		leftankle.cubeList.add(new ModelBox(leftankle, 88, 77, -1.5F, 5.0F, 3.0F, 3, 7, 2, 0.0F, true));

		leftfoot = new ModelRenderer(this);
		leftfoot.setRotationPoint(2.5F, 6.4F, 8.8F);
		setRotationAngle(leftfoot, -0.8727F, 0.0F, 0.0F);
		leftfoot.cubeList.add(new ModelBox(leftfoot, 89, 88, -1.5F, 3.6F, 10.6F, 3, 6, 2, 0.0F, true));

		rightankle = new ModelRenderer(this);
		rightankle.setRotationPoint(-2.5F, 6.4F, 8.8F);
		setRotationAngle(rightankle, -0.0349F, 0.0F, 0.0F);
		rightankle.cubeList.add(new ModelBox(rightankle, 88, 77, -1.5F, 5.0F, 3.0F, 3, 7, 2, 0.0F, true));

		rightfoot = new ModelRenderer(this);
		rightfoot.setRotationPoint(-2.5F, 6.4F, 8.8F);
		setRotationAngle(rightfoot, -0.8727F, 0.0F, 0.0F);
		rightfoot.cubeList.add(new ModelBox(rightfoot, 89, 88, -1.5F, 3.6F, 10.6F, 3, 6, 2, 0.0F, true));

		righttalon1 = new ModelRenderer(this);
		righttalon1.setRotationPoint(-2.5F, 6.4F, 8.8F);
		setRotationAngle(righttalon1, -0.8727F, 0.0F, 0.0F);
		righttalon1.cubeList.add(new ModelBox(righttalon1, 103, 92, -1.5F, 9.6F, 10.6F, 1, 1, 2, 0.0F, true));

		righttalon2 = new ModelRenderer(this);
		righttalon2.setRotationPoint(-2.5F, 6.4F, 8.8F);
		setRotationAngle(righttalon2, -0.8727F, 0.0F, 0.0F);
		righttalon2.cubeList.add(new ModelBox(righttalon2, 103, 92, 0.5F, 9.6F, 10.6F, 1, 1, 2, 0.0F, true));

		lefttalon1 = new ModelRenderer(this);
		lefttalon1.setRotationPoint(2.5F, 6.4F, 8.8F);
		setRotationAngle(lefttalon1, -0.8727F, 0.0F, 0.0F);
		lefttalon1.cubeList.add(new ModelBox(lefttalon1, 103, 92, -1.5F, 9.6F, 10.6F, 1, 1, 2, 0.0F, true));

		lefttalon2 = new ModelRenderer(this);
		lefttalon2.setRotationPoint(2.5F, 6.4F, 8.8F);
		setRotationAngle(lefttalon2, -0.8727F, 0.0F, 0.0F);
		lefttalon2.cubeList.add(new ModelBox(lefttalon2, 103, 92, 0.5F, 9.6F, 10.6F, 1, 1, 2, 0.0F, true));

		rightear = new ModelRenderer(this);
		rightear.setRotationPoint(0.0F, 1.0F, 0.0F);
		setRotationAngle(rightear, 0.4712F, 0.0F, 0.0F);
		rightear.cubeList.add(new ModelBox(rightear, 71, 16, -3.0F, -6.0F, 2.0F, 1, 2, 2, 0.0F, true));

		leftear = new ModelRenderer(this);
		leftear.setRotationPoint(0.0F, 1.0F, 0.0F);
		setRotationAngle(leftear, 0.4712F, 0.0F, 0.0F);
		leftear.cubeList.add(new ModelBox(leftear, 71, 16, 2.0F, -6.0F, 2.0F, 1, 2, 2, 0.0F, true));

		righthorn = new ModelRenderer(this);
		righthorn.setRotationPoint(0.0F, 1.0F, 0.0F);
		setRotationAngle(righthorn, 0.2967F, 0.0F, 0.0F);
		righthorn.cubeList.add(new ModelBox(righthorn, 55, 15, -2.0F, -9.0F, -2.0F, 1, 4, 1, 0.0F, true));

		lefthorn = new ModelRenderer(this);
		lefthorn.setRotationPoint(0.0F, 1.0F, 0.0F);
		setRotationAngle(lefthorn, 0.2967F, 0.0F, 0.0F);
		lefthorn.cubeList.add(new ModelBox(lefthorn, 55, 15, 1.0F, -9.0F, -2.0F, 1, 4, 1, 0.0F, true));

		righthorn2 = new ModelRenderer(this);
		righthorn2.setRotationPoint(0.0F, 1.0F, 0.0F);
		setRotationAngle(righthorn2, 0.7679F, 0.0F, 0.0F);
		righthorn2.cubeList.add(new ModelBox(righthorn2, 52, 8, -2.0F, -9.0F, 2.3F, 1, 1, 3, 0.0F, true));

		lefthorn2 = new ModelRenderer(this);
		lefthorn2.setRotationPoint(0.0F, 1.0F, 0.0F);
		setRotationAngle(lefthorn2, 0.7679F, 0.0F, 0.0F);
		lefthorn2.cubeList.add(new ModelBox(lefthorn2, 52, 8, 1.0F, -9.0F, 2.3F, 1, 1, 3, 0.0F, true));

		righthorn3 = new ModelRenderer(this);
		righthorn3.setRotationPoint(0.0F, 1.0F, 0.0F);
		setRotationAngle(righthorn3, 1.2217F, 0.0F, 0.0F);
		righthorn3.cubeList.add(new ModelBox(righthorn3, 54, 0, -2.0F, -5.8F, 7.6F, 1, 2, 1, 0.0F, true));

		Shape1 = new ModelRenderer(this);
		Shape1.setRotationPoint(0.0F, 1.0F, 0.0F);
		setRotationAngle(Shape1, 1.2217F, 0.0F, 0.0F);
		Shape1.cubeList.add(new ModelBox(Shape1, 54, 0, 1.0F, -5.8F, 7.6F, 1, 2, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		rightuparm.render(f5);
		leftuparm.render(f5);
		rightthigh.render(f5);
		leftthigh.render(f5);
		rightwing.render(f5);
		rightwing2.render(f5);
		leftwing2.render(f5);
		leftwing.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		leftleg.render(f5);
		rightleg.render(f5);
		tail.render(f5);
		tailtip.render(f5);
		leftankle.render(f5);
		leftfoot.render(f5);
		rightankle.render(f5);
		rightfoot.render(f5);
		righttalon1.render(f5);
		righttalon2.render(f5);
		lefttalon1.render(f5);
		lefttalon2.render(f5);
		rightear.render(f5);
		leftear.render(f5);
		righthorn.render(f5);
		lefthorn.render(f5);
		righthorn2.render(f5);
		lefthorn2.render(f5);
		righthorn3.render(f5);
		Shape1.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}