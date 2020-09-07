// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKrilTsutsaroth extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer chest;
	private final ModelRenderer rightuparm;
	private final ModelRenderer leftuparm;
	private final ModelRenderer rightthigh;
	private final ModelRenderer leftthigh;
	private final ModelRenderer abdomen;
	private final ModelRenderer rightlowarm;
	private final ModelRenderer leftlowarm;
	private final ModelRenderer lefthorn1;
	private final ModelRenderer lefthorn2;
	private final ModelRenderer righthorn1;
	private final ModelRenderer righthorn2;
	private final ModelRenderer rightlowerleg;
	private final ModelRenderer leftlowerleg;
	private final ModelRenderer leftankle;
	private final ModelRenderer lefthoof;
	private final ModelRenderer rightankle;
	private final ModelRenderer righthoof;
	private final ModelRenderer backcloth;
	private final ModelRenderer frontcloth;
	private final ModelRenderer beltbuckle;
	private final ModelRenderer belt;
	private final ModelRenderer backcloth2;
	private final ModelRenderer leftwing1;
	private final ModelRenderer leftwing2;
	private final ModelRenderer rightwing1;
	private final ModelRenderer rightwing2;
	private final ModelRenderer rightgauntlet;
	private final ModelRenderer leftgauntlet;
	private final ModelRenderer skullcloth;
	private final ModelRenderer skulltop;
	private final ModelRenderer skullmid;

	public ModelKrilTsutsaroth() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, -66.0F, -4.0F);
		setRotationAngle(head, 0.2094F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 88, 17, -8.5F, -15.0F, -8.0F, 16, 15, 16, 0.0F, true));

		chest = new ModelRenderer(this);
		chest.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(chest, 0.2094F, 0.0F, 0.0F);
		chest.cubeList.add(new ModelBox(chest, 71, 58, -17.5F, -66.0F, 1.0F, 35, 21, 18, 0.0F, true));

		rightuparm = new ModelRenderer(this);
		rightuparm.setRotationPoint(-16.5F, -61.0F, -4.0F);
		setRotationAngle(rightuparm, 0.0524F, 0.0F, 0.0873F);
		rightuparm.cubeList.add(new ModelBox(rightuparm, 180, 58, -11.0F, -4.0F, -6.0F, 11, 26, 11, 0.0F, true));

		leftuparm = new ModelRenderer(this);
		leftuparm.setRotationPoint(16.5F, -61.0F, -3.0F);
		setRotationAngle(leftuparm, 0.0524F, 0.0F, -0.0873F);
		leftuparm.cubeList.add(new ModelBox(leftuparm, 180, 58, 0.0F, -4.0F, -6.0F, 11, 26, 11, 0.0F, true));

		rightthigh = new ModelRenderer(this);
		rightthigh.setRotationPoint(-8.4F, -29.0F, 5.0F);
		setRotationAngle(rightthigh, 0.5236F, 3.1416F, 0.0F);
		rightthigh.cubeList.add(new ModelBox(rightthigh, 90, 143, -5.5F, 0.0F, -5.5F, 11, 25, 11, 0.0F, true));

		leftthigh = new ModelRenderer(this);
		leftthigh.setRotationPoint(7.4F, -29.0F, 5.0F);
		setRotationAngle(leftthigh, -0.5236F, 0.0F, 0.0F);
		leftthigh.cubeList.add(new ModelBox(leftthigh, 90, 143, -5.5F, 0.0F, -5.5F, 11, 25, 11, 0.0F, true));

		abdomen = new ModelRenderer(this);
		abdomen.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(abdomen, 0.0873F, 0.0F, 0.0F);
		abdomen.cubeList.add(new ModelBox(abdomen, 95, 100, -14.0F, -47.0F, -2.8F, 27, 22, 15, 0.0F, true));

		rightlowarm = new ModelRenderer(this);
		rightlowarm.setRotationPoint(-16.5F, -61.0F, -4.0F);
		setRotationAngle(rightlowarm, 2.618F, 0.0F, 0.0873F);
		rightlowarm.cubeList.add(new ModelBox(rightlowarm, 183, 97, -10.5F, -41.0F, -15.0F, 10, 27, 10, 0.0F, true));

		leftlowarm = new ModelRenderer(this);
		leftlowarm.setRotationPoint(16.5F, -61.0F, -3.0F);
		setRotationAngle(leftlowarm, 2.618F, 0.0F, -0.0873F);
		leftlowarm.cubeList.add(new ModelBox(leftlowarm, 183, 97, 0.5F, -41.0F, -15.0F, 10, 27, 10, 0.0F, true));

		lefthorn1 = new ModelRenderer(this);
		lefthorn1.setRotationPoint(1.0F, -66.0F, -4.0F);
		setRotationAngle(lefthorn1, 1.3264F, 0.0F, 0.0F);
		lefthorn1.cubeList.add(new ModelBox(lefthorn1, 55, 38, 7.0F, -12.0F, 9.0F, 4, 10, 4, 0.0F, true));

		lefthorn2 = new ModelRenderer(this);
		lefthorn2.setRotationPoint(1.0F, -66.0F, -4.0F);
		setRotationAngle(lefthorn2, 1.6406F, 0.0F, 0.0F);
		lefthorn2.cubeList.add(new ModelBox(lefthorn2, 56, 23, 7.5F, -17.0F, 12.5F, 3, 11, 3, 0.0F, true));

		righthorn1 = new ModelRenderer(this);
		righthorn1.setRotationPoint(1.0F, -66.0F, -4.0F);
		setRotationAngle(righthorn1, 1.3264F, 0.0F, 0.0F);
		righthorn1.cubeList.add(new ModelBox(righthorn1, 55, 38, -12.0F, -12.0F, 9.0F, 4, 10, 4, 0.0F, true));

		righthorn2 = new ModelRenderer(this);
		righthorn2.setRotationPoint(1.0F, -66.0F, -4.0F);
		setRotationAngle(righthorn2, 1.6406F, 0.0F, 0.0F);
		righthorn2.cubeList.add(new ModelBox(righthorn2, 56, 23, -11.5F, -17.0F, 12.5F, 3, 11, 3, 0.0F, true));

		rightlowerleg = new ModelRenderer(this);
		rightlowerleg.setRotationPoint(-8.4F, -29.0F, 5.0F);
		setRotationAngle(rightlowerleg, 0.5236F, 0.0F, 0.0F);
		rightlowerleg.cubeList.add(new ModelBox(rightlowerleg, 95, 181, -4.5F, 8.2F, -24.0F, 9, 19, 9, 0.0F, true));

		leftlowerleg = new ModelRenderer(this);
		leftlowerleg.setRotationPoint(7.4F, -29.0F, 5.0F);
		setRotationAngle(leftlowerleg, 0.5236F, 0.0F, 0.0F);
		leftlowerleg.cubeList.add(new ModelBox(leftlowerleg, 95, 181, -4.5F, 8.2F, -24.0F, 9, 19, 9, 0.0F, true));

		leftankle = new ModelRenderer(this);
		leftankle.setRotationPoint(7.4F, -29.0F, 5.0F);
		setRotationAngle(leftankle, -0.5061F, 0.0F, 0.0F);
		leftankle.cubeList.add(new ModelBox(leftankle, 180, 161, -4.0F, 27.0F, 7.8F, 8, 20, 8, 0.0F, true));

		lefthoof = new ModelRenderer(this);
		lefthoof.setRotationPoint(7.4F, -29.0F, 5.0F);
		lefthoof.cubeList.add(new ModelBox(lefthoof, 142, 192, -7.0F, 45.0F, -22.0F, 14, 9, 15, 0.0F, true));

		rightankle = new ModelRenderer(this);
		rightankle.setRotationPoint(-8.4F, -29.0F, 5.0F);
		setRotationAngle(rightankle, -0.5061F, 0.0F, 0.0F);
		rightankle.cubeList.add(new ModelBox(rightankle, 180, 161, -4.0F, 27.0F, 7.8F, 8, 20, 8, 0.0F, true));

		righthoof = new ModelRenderer(this);
		righthoof.setRotationPoint(-8.4F, -29.0F, 5.0F);
		righthoof.cubeList.add(new ModelBox(righthoof, 142, 192, -7.0F, 45.0F, -22.0F, 14, 8, 15, 0.0F, true));

		backcloth = new ModelRenderer(this);
		backcloth.setRotationPoint(0.0F, 0.0F, 0.0F);
		backcloth.cubeList.add(new ModelBox(backcloth, 54, 140, -5.5F, -26.0F, 10.0F, 10, 31, 1, 0.0F, true));

		frontcloth = new ModelRenderer(this);
		frontcloth.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(frontcloth, -0.3142F, 0.0F, 0.0F);
		frontcloth.cubeList.add(new ModelBox(frontcloth, 148, 145, -5.5F, -23.0F, -13.0F, 10, 27, 1, 0.0F, true));

		beltbuckle = new ModelRenderer(this);
		beltbuckle.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(beltbuckle, 0.0873F, 0.0F, 0.0F);
		beltbuckle.cubeList.add(new ModelBox(beltbuckle, 19, 89, -6.5F, -34.0F, -5.0F, 12, 10, 2, 0.0F, true));

		belt = new ModelRenderer(this);
		belt.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(belt, 0.0873F, 0.0F, 0.0F);
		belt.cubeList.add(new ModelBox(belt, 0, 111, -15.0F, -32.0F, -4.0F, 29, 7, 17, 0.0F, true));

		backcloth2 = new ModelRenderer(this);
		backcloth2.setRotationPoint(0.0F, 0.0F, 0.0F);
		backcloth2.cubeList.add(new ModelBox(backcloth2, 5, 144, -10.5F, -27.0F, 9.0F, 20, 20, 1, 0.0F, true));

		leftwing1 = new ModelRenderer(this);
		leftwing1.setRotationPoint(6.0F, -53.0F, 6.0F);
		leftwing1.cubeList.add(new ModelBox(leftwing1, 0, 186, 0.0F, -9.5333F, 0.0F, 0, 27, 32, 0.0F, true));

		leftwing2 = new ModelRenderer(this);
		leftwing2.setRotationPoint(6.0F, -53.0F, 6.0F);
		leftwing2.cubeList.add(new ModelBox(leftwing2, 155, -46, 0.0F, -59.0F, 8.0F, 0, 50, 50, 0.0F, true));

		rightwing1 = new ModelRenderer(this);
		rightwing1.setRotationPoint(-6.0F, -53.0F, 6.0F);
		rightwing1.cubeList.add(new ModelBox(rightwing1, 0, 186, 0.0F, -9.5F, 0.0F, 0, 27, 32, 0.0F, true));

		rightwing2 = new ModelRenderer(this);
		rightwing2.setRotationPoint(-6.0F, -53.0F, 6.0F);
		rightwing2.cubeList.add(new ModelBox(rightwing2, 155, -46, 0.0F, -59.0F, 8.0F, 0, 50, 50, 0.0F, true));

		rightgauntlet = new ModelRenderer(this);
		rightgauntlet.setRotationPoint(-4.5F, -61.0F, -3.0F);
		setRotationAngle(rightgauntlet, 2.618F, 0.0F, 0.0873F);
		rightgauntlet.cubeList.add(new ModelBox(rightgauntlet, 0, 61, -23.0F, -38.0F, -15.0F, 11, 15, 11, 0.0F, true));

		leftgauntlet = new ModelRenderer(this);
		leftgauntlet.setRotationPoint(-16.5F, -61.0F, -3.0F);
		setRotationAngle(leftgauntlet, 2.618F, 0.0F, -0.0873F);
		leftgauntlet.cubeList.add(new ModelBox(leftgauntlet, 91, 217, 33.0F, -37.0F, -17.0F, 11, 19, 11, 0.0F, true));

		skullcloth = new ModelRenderer(this);
		skullcloth.setRotationPoint(16.5F, -65.0F, -3.0F);
		setRotationAngle(skullcloth, 0.0524F, 0.0F, -0.0873F);
		skullcloth.cubeList.add(new ModelBox(skullcloth, 10, 173, -1.0F, -0.5F, -6.5F, 12, 26, 12, 0.0F, true));

		skulltop = new ModelRenderer(this);
		skulltop.setRotationPoint(16.5F, -65.0F, -3.0F);
		setRotationAngle(skulltop, 0.0524F, 0.0F, -0.0873F);
		skulltop.cubeList.add(new ModelBox(skulltop, 0, 0, 10.0F, -10.0F, -9.4F, 3, 15, 18, 0.0F, true));

		skullmid = new ModelRenderer(this);
		skullmid.setRotationPoint(16.5F, -65.0F, -5.0F);
		setRotationAngle(skullmid, 0.0524F, 0.0F, -0.0873F);
		skullmid.cubeList.add(new ModelBox(skullmid, 0, 33, 11.0F, 5.0F, -3.5F, 2, 12, 10, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		chest.render(f5);
		rightuparm.render(f5);
		leftuparm.render(f5);
		rightthigh.render(f5);
		leftthigh.render(f5);
		abdomen.render(f5);
		rightlowarm.render(f5);
		leftlowarm.render(f5);
		lefthorn1.render(f5);
		lefthorn2.render(f5);
		righthorn1.render(f5);
		righthorn2.render(f5);
		rightlowerleg.render(f5);
		leftlowerleg.render(f5);
		leftankle.render(f5);
		lefthoof.render(f5);
		rightankle.render(f5);
		righthoof.render(f5);
		backcloth.render(f5);
		frontcloth.render(f5);
		beltbuckle.render(f5);
		belt.render(f5);
		backcloth2.render(f5);
		leftwing1.render(f5);
		leftwing2.render(f5);
		rightwing1.render(f5);
		rightwing2.render(f5);
		rightgauntlet.render(f5);
		leftgauntlet.render(f5);
		skullcloth.render(f5);
		skulltop.render(f5);
		skullmid.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}