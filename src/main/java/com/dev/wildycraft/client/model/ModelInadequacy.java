// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelInadequacy extends ModelBase {
	private final ModelRenderer Body2;
	private final ModelRenderer Body1;
	private final ModelRenderer Body3;
	private final ModelRenderer Body4;
	private final ModelRenderer Body5;
	private final ModelRenderer neck1;
	private final ModelRenderer neck2;
	private final ModelRenderer fleshjoint1;
	private final ModelRenderer head;
	private final ModelRenderer headspike1;
	private final ModelRenderer nose;
	private final ModelRenderer lefthorn1;
	private final ModelRenderer righthorn1;
	private final ModelRenderer lefthorn2;
	private final ModelRenderer righthorn2;
	private final ModelRenderer righthorn3;
	private final ModelRenderer leftthorn3;
	private final ModelRenderer frontrightarm1;
	private final ModelRenderer frontrightarm2;
	private final ModelRenderer frontrightarm3;
	private final ModelRenderer frontrightclaw;
	private final ModelRenderer frontleftarm1;
	private final ModelRenderer frontleftarm2;
	private final ModelRenderer frontleftarm3;
	private final ModelRenderer frontleftclaw;
	private final ModelRenderer backleftarm1;
	private final ModelRenderer backleftarm2;
	private final ModelRenderer backleftarm3;
	private final ModelRenderer backleftclaw;
	private final ModelRenderer backrightarm1;
	private final ModelRenderer backrightarm2;
	private final ModelRenderer backrightarm3;
	private final ModelRenderer backrightclaw;
	private final ModelRenderer Shape2;
	private final ModelRenderer Shape6;
	private final ModelRenderer Shape11;
	private final ModelRenderer Shape5;
	private final ModelRenderer Shape12;
	private final ModelRenderer Shape10;
	private final ModelRenderer Shape14;
	private final ModelRenderer Shape9;
	private final ModelRenderer Shape8;
	private final ModelRenderer Shape20;
	private final ModelRenderer Shape18;
	private final ModelRenderer Shape19;
	private final ModelRenderer Shape7;
	private final ModelRenderer Shape16;
	private final ModelRenderer Shape17;
	private final ModelRenderer Shape15;
	private final ModelRenderer Shape13;
	private final ModelRenderer Shape1;
	private final ModelRenderer Shape4;
	private final ModelRenderer Shape3;
	private final ModelRenderer lowerjaw;
	private final ModelRenderer upperjaw;
	private final ModelRenderer teeth1;
	private final ModelRenderer middlejaw;
	private final ModelRenderer lefttusk2;
	private final ModelRenderer righttusk1;
	private final ModelRenderer lefttusk1;
	private final ModelRenderer righttusk2;
	private final ModelRenderer teeth2;

	public ModelInadequacy() {
		textureWidth = 256;
		textureHeight = 256;

		Body2 = new ModelRenderer(this);
		Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body2.cubeList.add(new ModelBox(Body2, 6, 161, -22.0F, -4.0F, -22.0F, 44, 14, 44, 0.0F, true));

		Body1 = new ModelRenderer(this);
		Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body1.cubeList.add(new ModelBox(Body1, 3, 162, -24.0F, 10.0F, -24.0F, 48, 10, 48, 0.0F, true));

		Body3 = new ModelRenderer(this);
		Body3.setRotationPoint(0.0F, -14.0F, 0.0F);
		Body3.cubeList.add(new ModelBox(Body3, 39, 172, -18.0F, 0.0F, -18.0F, 36, 11, 36, 0.0F, true));

		Body4 = new ModelRenderer(this);
		Body4.setRotationPoint(0.0F, -21.0F, 0.0F);
		Body4.cubeList.add(new ModelBox(Body4, 40, 184, -13.0F, 0.0F, -13.0F, 26, 7, 26, 0.0F, true));

		Body5 = new ModelRenderer(this);
		Body5.setRotationPoint(0.0F, -27.0F, 0.0F);
		Body5.cubeList.add(new ModelBox(Body5, 29, 117, -9.0F, 0.0F, -9.0F, 18, 6, 18, 0.0F, true));

		neck1 = new ModelRenderer(this);
		neck1.setRotationPoint(0.0F, -35.0F, 0.0F);
		neck1.cubeList.add(new ModelBox(neck1, 84, 84, -9.5F, 0.0F, -9.5F, 19, 10, 19, 0.0F, true));

		neck2 = new ModelRenderer(this);
		neck2.setRotationPoint(0.0F, -35.0F, 0.0F);
		neck2.cubeList.add(new ModelBox(neck2, 23, 88, -9.0F, -14.0F, -0.5F, 18, 14, 10, 0.0F, true));

		fleshjoint1 = new ModelRenderer(this);
		fleshjoint1.setRotationPoint(0.0F, -35.0F, 0.0F);
		fleshjoint1.cubeList.add(new ModelBox(fleshjoint1, 87, 14, -8.5F, -17.0F, -9.0F, 17, 2, 17, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -35.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 149, 4, -5.0F, -26.0F, -5.5F, 10, 9, 10, 0.0F, true));

		headspike1 = new ModelRenderer(this);
		headspike1.setRotationPoint(0.0F, -35.0F, 0.0F);
		headspike1.cubeList.add(new ModelBox(headspike1, 112, 3, -1.5F, -30.0F, -2.0F, 3, 4, 3, 0.0F, true));

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, -35.0F, 0.0F);
		nose.cubeList.add(new ModelBox(nose, 161, 36, -1.5F, -21.0F, -7.0F, 3, 4, 3, 0.0F, true));

		lefthorn1 = new ModelRenderer(this);
		lefthorn1.setRotationPoint(0.0F, -35.0F, 0.0F);
		setRotationAngle(lefthorn1, 0.0F, 0.0F, 1.1519F);
		lefthorn1.cubeList.add(new ModelBox(lefthorn1, 72, 3, -22.0F, -22.0F, -2.0F, 3, 8, 3, 0.0F, true));

		righthorn1 = new ModelRenderer(this);
		righthorn1.setRotationPoint(0.0F, -35.0F, 0.0F);
		setRotationAngle(righthorn1, 0.0F, 0.0F, -1.1519F);
		righthorn1.cubeList.add(new ModelBox(righthorn1, 72, 3, 19.0F, -21.0F, -2.0F, 3, 8, 3, 0.0F, true));

		lefthorn2 = new ModelRenderer(this);
		lefthorn2.setRotationPoint(0.0F, -35.0F, 0.0F);
		setRotationAngle(lefthorn2, 0.0F, 0.0F, -0.7156F);
		lefthorn2.cubeList.add(new ModelBox(lefthorn2, 62, 3, 25.3F, -15.0F, -1.5F, 2, 13, 2, 0.0F, true));

		righthorn2 = new ModelRenderer(this);
		righthorn2.setRotationPoint(0.0F, -35.0F, 0.0F);
		setRotationAngle(righthorn2, 0.0F, 0.0F, 0.7156F);
		righthorn2.cubeList.add(new ModelBox(righthorn2, 62, 3, -26.3F, -15.0F, -1.5F, 2, 13, 2, 0.0F, true));

		righthorn3 = new ModelRenderer(this);
		righthorn3.setRotationPoint(0.0F, -35.0F, 0.0F);
		setRotationAngle(righthorn3, 0.0F, 0.0F, -1.1345F);
		righthorn3.cubeList.add(new ModelBox(righthorn3, 55, 3, 8.0F, -29.0F, -1.0F, 1, 6, 1, 0.0F, true));

		leftthorn3 = new ModelRenderer(this);
		leftthorn3.setRotationPoint(0.0F, -35.0F, 0.0F);
		setRotationAngle(leftthorn3, 0.0F, 0.0F, 1.1345F);
		leftthorn3.cubeList.add(new ModelBox(leftthorn3, 55, 3, -9.5F, -30.0F, -1.0F, 1, 6, 1, 0.0F, true));

		frontrightarm1 = new ModelRenderer(this);
		frontrightarm1.setRotationPoint(-14.0F, -1.0F, -14.0F);
		setRotationAngle(frontrightarm1, 0.7156F, 0.7854F, 0.0F);
		frontrightarm1.cubeList.add(new ModelBox(frontrightarm1, 9, 22, -3.0F, -22.0F, -3.0F, 6, 22, 6, 0.0F, true));

		frontrightarm2 = new ModelRenderer(this);
		frontrightarm2.setRotationPoint(0.0F, -21.0F, 0.0F);
		frontrightarm1.addChild(frontrightarm2);
		setRotationAngle(frontrightarm2, -0.2967F, 0.0F, 0.0F);
		frontrightarm2.cubeList.add(new ModelBox(frontrightarm2, 42, 22, -3.0F, -24.0F, -3.0F, 6, 24, 6, 0.0F, true));

		frontrightarm3 = new ModelRenderer(this);
		frontrightarm3.setRotationPoint(0.0F, -22.0F, 2.0F);
		frontrightarm2.addChild(frontrightarm3);
		setRotationAngle(frontrightarm3, 1.2043F, 0.0F, 0.0F);
		frontrightarm3.cubeList.add(new ModelBox(frontrightarm3, 11, 55, -3.5F, -16.0F, 0.0F, 7, 16, 7, 0.0F, true));

		frontrightclaw = new ModelRenderer(this);
		frontrightclaw.setRotationPoint(0.0F, -22.0F, 2.0F);
		frontrightarm2.addChild(frontrightclaw);
		setRotationAngle(frontrightclaw, -0.4014F, 0.0F, 0.0F);
		frontrightclaw.cubeList.add(new ModelBox(frontrightclaw, 44, 61, 0.0F, -1.0F, -19.0F, 0, 12, 11, 0.0F, true));

		frontleftarm1 = new ModelRenderer(this);
		frontleftarm1.setRotationPoint(14.0F, -1.0F, -14.0F);
		setRotationAngle(frontleftarm1, 0.7156F, -0.7854F, 0.0F);
		frontleftarm1.cubeList.add(new ModelBox(frontleftarm1, 9, 22, -3.0F, -22.0F, -3.0F, 6, 22, 6, 0.0F, true));

		frontleftarm2 = new ModelRenderer(this);
		frontleftarm2.setRotationPoint(0.0F, -21.0F, 0.0F);
		frontleftarm1.addChild(frontleftarm2);
		setRotationAngle(frontleftarm2, -0.2967F, 0.0F, 0.0F);
		frontleftarm2.cubeList.add(new ModelBox(frontleftarm2, 42, 22, -3.0F, -24.0F, -3.0F, 6, 24, 6, 0.0F, true));

		frontleftarm3 = new ModelRenderer(this);
		frontleftarm3.setRotationPoint(0.0F, -22.0F, 2.0F);
		frontleftarm2.addChild(frontleftarm3);
		setRotationAngle(frontleftarm3, 1.2043F, 0.0F, 0.0F);
		frontleftarm3.cubeList.add(new ModelBox(frontleftarm3, 11, 55, -3.5F, -16.0F, 0.0F, 7, 16, 7, 0.0F, true));

		frontleftclaw = new ModelRenderer(this);
		frontleftclaw.setRotationPoint(0.0F, -22.0F, 2.0F);
		frontleftarm2.addChild(frontleftclaw);
		setRotationAngle(frontleftclaw, -0.4014F, 0.0F, 0.0F);
		frontleftclaw.cubeList.add(new ModelBox(frontleftclaw, 44, 61, 0.0F, -1.0F, -19.0F, 0, 12, 11, 0.0F, true));

		backleftarm1 = new ModelRenderer(this);
		backleftarm1.setRotationPoint(14.0F, -1.0F, 14.0F);
		setRotationAngle(backleftarm1, -0.7156F, 0.7854F, 0.0F);
		backleftarm1.cubeList.add(new ModelBox(backleftarm1, 9, 22, -3.0F, -22.0F, -3.0F, 6, 22, 6, 0.0F, true));

		backleftarm2 = new ModelRenderer(this);
		backleftarm2.setRotationPoint(0.0F, -21.0F, 0.0F);
		backleftarm1.addChild(backleftarm2);
		setRotationAngle(backleftarm2, 0.2967F, 0.0F, 0.0F);
		backleftarm2.cubeList.add(new ModelBox(backleftarm2, 42, 22, -3.0F, -24.0F, -3.0F, 6, 24, 6, 0.0F, true));

		backleftarm3 = new ModelRenderer(this);
		backleftarm3.setRotationPoint(0.0F, -22.0F, -2.0F);
		backleftarm2.addChild(backleftarm3);
		setRotationAngle(backleftarm3, -1.2043F, 0.0F, 0.0F);
		backleftarm3.cubeList.add(new ModelBox(backleftarm3, 11, 55, -3.5F, -16.0F, -7.0F, 7, 16, 7, 0.0F, true));

		backleftclaw = new ModelRenderer(this);
		backleftclaw.setRotationPoint(0.0F, -22.0F, -2.0F);
		backleftarm2.addChild(backleftclaw);
		setRotationAngle(backleftclaw, -0.4014F, 3.1416F, 0.0F);
		backleftclaw.cubeList.add(new ModelBox(backleftclaw, 44, 61, 0.0F, -1.0F, -19.0F, 0, 12, 11, 0.0F, true));

		backrightarm1 = new ModelRenderer(this);
		backrightarm1.setRotationPoint(-14.0F, -1.0F, 14.0F);
		setRotationAngle(backrightarm1, -0.7156F, -0.7854F, 0.0F);
		backrightarm1.cubeList.add(new ModelBox(backrightarm1, 9, 22, -3.0F, -22.0F, -3.0F, 6, 22, 6, 0.0F, true));

		backrightarm2 = new ModelRenderer(this);
		backrightarm2.setRotationPoint(0.0F, -21.0F, 0.0F);
		backrightarm1.addChild(backrightarm2);
		setRotationAngle(backrightarm2, 0.2967F, 0.0F, 0.0F);
		backrightarm2.cubeList.add(new ModelBox(backrightarm2, 42, 22, -3.0F, -24.0F, -3.0F, 6, 24, 6, 0.0F, true));

		backrightarm3 = new ModelRenderer(this);
		backrightarm3.setRotationPoint(0.0F, -22.0F, -2.0F);
		backrightarm2.addChild(backrightarm3);
		setRotationAngle(backrightarm3, -1.2043F, 0.0F, 0.0F);
		backrightarm3.cubeList.add(new ModelBox(backrightarm3, 11, 55, -3.5F, -16.0F, -7.0F, 7, 16, 7, 0.0F, true));

		backrightclaw = new ModelRenderer(this);
		backrightclaw.setRotationPoint(0.0F, -22.0F, -2.0F);
		backrightarm2.addChild(backrightclaw);
		setRotationAngle(backrightclaw, -0.4014F, 3.1416F, 0.0F);
		backrightclaw.cubeList.add(new ModelBox(backrightclaw, 44, 61, 0.0F, -1.0F, -19.0F, 0, 12, 11, 0.0F, true));

		Shape2 = new ModelRenderer(this);
		Shape2.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape2, 0.0F, 0.3346F, -0.0372F);
		Shape2.cubeList.add(new ModelBox(Shape2, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape6 = new ModelRenderer(this);
		Shape6.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape6, 0.0F, 1.673F, -0.0372F);
		Shape6.cubeList.add(new ModelBox(Shape6, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape11 = new ModelRenderer(this);
		Shape11.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape11, 0.0F, -3.1416F, -0.1115F);
		Shape11.cubeList.add(new ModelBox(Shape11, 5, 235, 0.0F, -2.0F, -6.0F, 36, 4, 9, 0.0F, true));

		Shape5 = new ModelRenderer(this);
		Shape5.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape5, 0.0F, 1.3384F, -0.0744F);
		Shape5.cubeList.add(new ModelBox(Shape5, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape12 = new ModelRenderer(this);
		Shape12.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape12, 0.0F, -2.807F, -0.0744F);
		Shape12.cubeList.add(new ModelBox(Shape12, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape10 = new ModelRenderer(this);
		Shape10.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape10, 0.0F, 3.0115F, -0.1115F);
		Shape10.cubeList.add(new ModelBox(Shape10, 8, 236, 0.0F, -2.0F, -3.0F, 36, 4, 9, 0.0F, true));

		Shape14 = new ModelRenderer(this);
		Shape14.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape14, 0.0F, -2.1378F, 0.0F);
		Shape14.cubeList.add(new ModelBox(Shape14, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape9 = new ModelRenderer(this);
		Shape9.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape9, 0.0F, 2.6769F, -0.0744F);
		Shape9.cubeList.add(new ModelBox(Shape9, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape8 = new ModelRenderer(this);
		Shape8.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape8, 0.0F, 2.3423F, -0.0372F);
		Shape8.cubeList.add(new ModelBox(Shape8, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape20 = new ModelRenderer(this);
		Shape20.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape20, 0.0F, -0.1301F, 0.0F);
		Shape20.cubeList.add(new ModelBox(Shape20, 5, 232, 0.0F, -2.0F, -2.0F, 36, 4, 8, 0.0F, true));

		Shape18 = new ModelRenderer(this);
		Shape18.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape18, 0.0F, -0.7993F, -0.0744F);
		Shape18.cubeList.add(new ModelBox(Shape18, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape19 = new ModelRenderer(this);
		Shape19.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape19, 0.0F, -0.4647F, -0.0372F);
		Shape19.cubeList.add(new ModelBox(Shape19, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape7 = new ModelRenderer(this);
		Shape7.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape7, 0.0F, 2.0076F, 0.0F);
		Shape7.cubeList.add(new ModelBox(Shape7, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape16 = new ModelRenderer(this);
		Shape16.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape16, 0.0F, -1.4686F, -0.0744F);
		Shape16.cubeList.add(new ModelBox(Shape16, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape17 = new ModelRenderer(this);
		Shape17.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape17, 0.0F, -1.1339F, -0.1115F);
		Shape17.cubeList.add(new ModelBox(Shape17, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape15 = new ModelRenderer(this);
		Shape15.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape15, 0.0F, -1.8032F, -0.0372F);
		Shape15.cubeList.add(new ModelBox(Shape15, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape13 = new ModelRenderer(this);
		Shape13.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape13, 0.0F, -2.4724F, -0.0372F);
		Shape13.cubeList.add(new ModelBox(Shape13, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape1 = new ModelRenderer(this);
		Shape1.setRotationPoint(0.0F, 22.0F, 0.0F);
		Shape1.cubeList.add(new ModelBox(Shape1, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 9, 0.0F, true));

		Shape4 = new ModelRenderer(this);
		Shape4.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape4, 0.0F, 1.0038F, -0.1115F);
		Shape4.cubeList.add(new ModelBox(Shape4, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		Shape3 = new ModelRenderer(this);
		Shape3.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Shape3, 0.0F, 0.6692F, -0.0744F);
		Shape3.cubeList.add(new ModelBox(Shape3, 5, 232, 0.0F, -2.0F, -6.0F, 36, 4, 12, 0.0F, true));

		lowerjaw = new ModelRenderer(this);
		lowerjaw.setRotationPoint(0.0F, -35.0F, 0.0F);
		lowerjaw.cubeList.add(new ModelBox(lowerjaw, 84, 84, -10.5F, -2.0F, -10.0F, 21, 7, 19, 0.0F, true));

		upperjaw = new ModelRenderer(this);
		upperjaw.setRotationPoint(0.0F, -35.0F, 0.0F);
		upperjaw.cubeList.add(new ModelBox(upperjaw, 84, 34, -11.5F, -15.0F, -10.0F, 23, 8, 19, 0.0F, true));

		teeth1 = new ModelRenderer(this);
		teeth1.setRotationPoint(0.0F, -35.0F, 0.0F);
		teeth1.cubeList.add(new ModelBox(teeth1, 84, 67, -10.0F, -7.0F, -9.5F, 20, 2, 9, 0.0F, true));

		middlejaw = new ModelRenderer(this);
		middlejaw.setRotationPoint(0.0F, -35.0F, 0.0F);
		middlejaw.cubeList.add(new ModelBox(middlejaw, 85, 84, -11.5F, -7.0F, -1.0F, 23, 5, 10, 0.0F, true));

		lefttusk2 = new ModelRenderer(this);
		lefttusk2.setRotationPoint(0.0F, -35.0F, 0.0F);
		setRotationAngle(lefttusk2, 1.309F, 0.0F, 0.0F);
		lefttusk2.cubeList.add(new ModelBox(lefttusk2, 171, 81, 8.5F, -16.6F, -6.0F, 2, 2, 8, 0.0F, true));

		righttusk1 = new ModelRenderer(this);
		righttusk1.setRotationPoint(0.0F, -35.0F, 0.0F);
		setRotationAngle(righttusk1, 0.576F, 0.0F, 0.0F);
		righttusk1.cubeList.add(new ModelBox(righttusk1, 171, 67, -11.0F, -14.0F, -10.0F, 3, 3, 10, 0.0F, true));

		lefttusk1 = new ModelRenderer(this);
		lefttusk1.setRotationPoint(0.0F, -35.0F, 0.0F);
		setRotationAngle(lefttusk1, 0.576F, 0.0F, 0.0F);
		lefttusk1.cubeList.add(new ModelBox(lefttusk1, 171, 67, 8.0F, -14.0F, -10.0F, 3, 3, 10, 0.0F, true));

		righttusk2 = new ModelRenderer(this);
		righttusk2.setRotationPoint(0.0F, -35.0F, 0.0F);
		setRotationAngle(righttusk2, 1.309F, 0.0F, 0.0F);
		righttusk2.cubeList.add(new ModelBox(righttusk2, 171, 81, -10.5F, -16.6F, -6.0F, 2, 2, 8, 0.0F, true));

		teeth2 = new ModelRenderer(this);
		teeth2.setRotationPoint(0.0F, -35.0F, 0.0F);
		teeth2.cubeList.add(new ModelBox(teeth2, 124, 141, -10.0F, -4.0F, -9.5F, 20, 2, 9, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body2.render(f5);
		Body1.render(f5);
		Body3.render(f5);
		Body4.render(f5);
		Body5.render(f5);
		neck1.render(f5);
		neck2.render(f5);
		fleshjoint1.render(f5);
		head.render(f5);
		headspike1.render(f5);
		nose.render(f5);
		lefthorn1.render(f5);
		righthorn1.render(f5);
		lefthorn2.render(f5);
		righthorn2.render(f5);
		righthorn3.render(f5);
		leftthorn3.render(f5);
		frontrightarm1.render(f5);
		frontleftarm1.render(f5);
		backleftarm1.render(f5);
		backrightarm1.render(f5);
		Shape2.render(f5);
		Shape6.render(f5);
		Shape11.render(f5);
		Shape5.render(f5);
		Shape12.render(f5);
		Shape10.render(f5);
		Shape14.render(f5);
		Shape9.render(f5);
		Shape8.render(f5);
		Shape20.render(f5);
		Shape18.render(f5);
		Shape19.render(f5);
		Shape7.render(f5);
		Shape16.render(f5);
		Shape17.render(f5);
		Shape15.render(f5);
		Shape13.render(f5);
		Shape1.render(f5);
		Shape4.render(f5);
		Shape3.render(f5);
		lowerjaw.render(f5);
		upperjaw.render(f5);
		teeth1.render(f5);
		middlejaw.render(f5);
		lefttusk2.render(f5);
		righttusk1.render(f5);
		lefttusk1.render(f5);
		righttusk2.render(f5);
		teeth2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}