// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRSDragon extends ModelBase {
	private final ModelRenderer WingWeb11;
	private final ModelRenderer WingWeb22;
	private final ModelRenderer WingMidBone1;
	private final ModelRenderer WingJoint1;
	private final ModelRenderer WingJoint2;
	private final ModelRenderer Belly;
	private final ModelRenderer Body1;
	private final ModelRenderer Body2;
	private final ModelRenderer Body3;
	private final ModelRenderer Rear;
	private final ModelRenderer Spine1;
	private final ModelRenderer Spine2;
	private final ModelRenderer Spine3;
	private final ModelRenderer Spine4;
	private final ModelRenderer Spine5;
	private final ModelRenderer Spine6;
	private final ModelRenderer SideNeck1;
	private final ModelRenderer SideNeck2;
	private final ModelRenderer Neck1;
	private final ModelRenderer Neck2;
	private final ModelRenderer Head;
	private final ModelRenderer UpperJaw;
	private final ModelRenderer LowerJaw;
	private final ModelRenderer Nose;
	private final ModelRenderer NoseTop;
	private final ModelRenderer SideNoseAndFrontTeeth1;
	private final ModelRenderer SideNoseAndFrontTeeth2;
	private final ModelRenderer BackTeeth1;
	private final ModelRenderer BackTeeth2;
	private final ModelRenderer Eye1;
	private final ModelRenderer Eye2;
	private final ModelRenderer EyeTop;
	private final ModelRenderer FaceWeb12;
	private final ModelRenderer FaceWeb22;
	private final ModelRenderer FaceWeb11;
	private final ModelRenderer FaceWeb21;
	private final ModelRenderer FaceWebMiddle;
	private final ModelRenderer UpperLeg21;
	private final ModelRenderer LowerLeg21;
	private final ModelRenderer FootBase21;
	private final ModelRenderer FootTop21;
	private final ModelRenderer UpperLeg11;
	private final ModelRenderer LowerLeg11;
	private final ModelRenderer FootBase11;
	private final ModelRenderer FootTop11;
	private final ModelRenderer UpperLeg12;
	private final ModelRenderer LowerLeg12;
	private final ModelRenderer FootBase12;
	private final ModelRenderer FootTop12;
	private final ModelRenderer UpperLeg22;
	private final ModelRenderer LowerLeg22;
	private final ModelRenderer FootBase22;
	private final ModelRenderer FootTop22;
	private final ModelRenderer WingMidBone2;
	private final ModelRenderer WingWeb12;
	private final ModelRenderer WingWeb21;
	private final ModelRenderer Tail1;
	private final ModelRenderer Tail2;
	private final ModelRenderer Tail3;
	private final ModelRenderer Tail4;
	private final ModelRenderer Tail5;
	private final ModelRenderer Tail6;

	public ModelRSDragon() {
		textureWidth = 512;
		textureHeight = 128;

		WingWeb11 = new ModelRenderer(this);
		WingWeb11.setRotationPoint(26.0F, 2.0F, -11.0F);
		WingWeb11.cubeList.add(new ModelBox(WingWeb11, 113, 97, 0.0F, 0.0F, 0.0F, 31, 0, 25, 0.0F, true));

		WingWeb22 = new ModelRenderer(this);
		WingWeb22.setRotationPoint(-8.0F, 2.0F, -8.0F);
		WingWeb22.cubeList.add(new ModelBox(WingWeb22, 390, 65, -18.0F, 0.0F, -3.0F, 18, 0, 24, 0.0F, true));

		WingMidBone1 = new ModelRenderer(this);
		WingMidBone1.setRotationPoint(-26.0F, 2.5F, -11.0F);
		WingMidBone1.cubeList.add(new ModelBox(WingMidBone1, 285, 100, -0.5F, -0.5F, 0.0F, 1, 0, 24, 0.0F, true));

		WingJoint1 = new ModelRenderer(this);
		WingJoint1.setRotationPoint(8.5F, 3.0F, -3.0F);
		setRotationAngle(WingJoint1, -2.4166F, 0.0F, 0.0F);
		WingJoint1.cubeList.add(new ModelBox(WingJoint1, 205, 0, -1.5F, 0.0F, 0.0F, 3, 4, 8, 0.0F, true));

		WingJoint2 = new ModelRenderer(this);
		WingJoint2.setRotationPoint(-8.0F, 4.0F, -8.0F);
		setRotationAngle(WingJoint2, -2.4166F, 0.0F, 0.0F);
		WingJoint2.cubeList.add(new ModelBox(WingJoint2, 205, 0, -2.0F, -3.0F, -5.0F, 3, 4, 8, 0.0F, true));

		Belly = new ModelRenderer(this);
		Belly.setRotationPoint(0.0F, 10.0F, -12.0F);
		Belly.cubeList.add(new ModelBox(Belly, 111, 0, -8.0F, 0.0F, 0.0F, 16, 3, 30, 0.0F, true));

		Body1 = new ModelRenderer(this);
		Body1.setRotationPoint(0.0F, 5.0F, -14.0F);
		Body1.cubeList.add(new ModelBox(Body1, 230, 0, -10.0F, 0.0F, 0.0F, 20, 5, 32, 0.0F, true));

		Body2 = new ModelRenderer(this);
		Body2.setRotationPoint(0.0F, 1.0F, -11.0F);
		Body2.cubeList.add(new ModelBox(Body2, 340, 0, -8.0F, 0.0F, 0.0F, 16, 4, 28, 0.0F, true));

		Body3 = new ModelRenderer(this);
		Body3.setRotationPoint(0.0F, -1.0F, -12.0F);
		Body3.cubeList.add(new ModelBox(Body3, 430, 0, -5.0F, 0.0F, 0.0F, 10, 2, 28, 0.0F, true));

		Rear = new ModelRenderer(this);
		Rear.setRotationPoint(0.0F, 7.0F, 16.0F);
		setRotationAngle(Rear, -0.1115F, 0.0F, 0.0F);
		Rear.cubeList.add(new ModelBox(Rear, 0, 40, -6.0F, -5.0F, 0.0F, 12, 10, 5, 0.0F, true));

		Spine1 = new ModelRenderer(this);
		Spine1.setRotationPoint(0.0F, 0.0F, -11.0F);
		setRotationAngle(Spine1, -2.4166F, 0.0F, 0.0F);
		Spine1.cubeList.add(new ModelBox(Spine1, 205, 15, -0.5F, 0.0F, 0.0F, 1, 4, 3, 0.0F, true));

		Spine2 = new ModelRenderer(this);
		Spine2.setRotationPoint(0.0F, 0.0F, -4.0F);
		setRotationAngle(Spine2, -2.4166F, 0.0F, 0.0F);
		Spine2.cubeList.add(new ModelBox(Spine2, 205, 15, -0.5F, 0.0F, 0.0F, 1, 4, 4, 0.0F, true));

		Spine3 = new ModelRenderer(this);
		Spine3.setRotationPoint(0.0F, 0.0F, 2.0F);
		setRotationAngle(Spine3, -2.4166F, 0.0F, 0.0F);
		Spine3.cubeList.add(new ModelBox(Spine3, 205, 15, -0.5F, 0.0F, 0.0F, 1, 4, 4, 0.0F, true));

		Spine4 = new ModelRenderer(this);
		Spine4.setRotationPoint(0.0F, 0.0F, 8.0F);
		setRotationAngle(Spine4, -2.4166F, 0.0F, 0.0F);
		Spine4.cubeList.add(new ModelBox(Spine4, 205, 15, -0.5F, 0.0F, 0.0F, 1, 4, 4, 0.0F, true));

		Spine5 = new ModelRenderer(this);
		Spine5.setRotationPoint(0.0F, 0.0F, 14.0F);
		setRotationAngle(Spine5, -2.4166F, 0.0F, 0.0F);
		Spine5.cubeList.add(new ModelBox(Spine5, 205, 15, -0.5F, 0.0F, 0.0F, 1, 4, 4, 0.0F, true));

		Spine6 = new ModelRenderer(this);
		Spine6.setRotationPoint(0.0F, 3.0F, 19.0F);
		setRotationAngle(Spine6, -2.9743F, 0.0F, 0.0F);
		Spine6.cubeList.add(new ModelBox(Spine6, 205, 15, -0.5F, 0.0F, 0.0F, 1, 4, 4, 0.0F, true));

		SideNeck1 = new ModelRenderer(this);
		SideNeck1.setRotationPoint(4.0F, 1.0F, -14.0F);
		SideNeck1.cubeList.add(new ModelBox(SideNeck1, 205, 27, 0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F, true));

		SideNeck2 = new ModelRenderer(this);
		SideNeck2.setRotationPoint(-4.0F, 1.0F, -14.0F);
		SideNeck2.cubeList.add(new ModelBox(SideNeck2, 205, 27, -1.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F, true));

		Neck1 = new ModelRenderer(this);
		Neck1.setRotationPoint(0.0F, 3.0F, -13.0F);
		setRotationAngle(Neck1, 2.5656F, 0.0F, 0.0F);
		Neck1.cubeList.add(new ModelBox(Neck1, 40, 40, -4.0F, -3.0F, 0.0F, 8, 6, 12, 0.0F, true));

		Neck2 = new ModelRenderer(this);
		Neck2.setRotationPoint(0.0F, -2.5F, -22.0F);
		setRotationAngle(Neck2, 2.8999F, 0.0F, 0.0F);
		Neck2.cubeList.add(new ModelBox(Neck2, 85, 40, -3.0F, -2.5F, 0.0F, 6, 5, 12, 0.0F, true));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -5.5F, -30.0F);
		setRotationAngle(Head, 3.1416F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 125, 40, -2.0F, -2.5F, 0.0F, 4, 5, 7, 0.0F, true));

		UpperJaw = new ModelRenderer(this);
		UpperJaw.setRotationPoint(0.0F, -5.0F, -35.5F);
		setRotationAngle(UpperJaw, -3.1416F, 0.0F, 0.0F);
		UpperJaw.cubeList.add(new ModelBox(UpperJaw, 150, 40, -2.0F, -0.5F, 0.0F, 4, 2, 5, 0.0F, true));

		LowerJaw = new ModelRenderer(this);
		LowerJaw.setRotationPoint(0.0F, -3.5F, -35.8F);
		setRotationAngle(LowerJaw, -2.9929F, 0.0F, 0.0F);
		LowerJaw.cubeList.add(new ModelBox(LowerJaw, 150, 50, -1.5F, -0.5F, 0.0F, 3, 1, 7, 0.0F, true));

		Nose = new ModelRenderer(this);
		Nose.setRotationPoint(0.0F, -5.0F, -40.0F);
		setRotationAngle(Nose, -2.9929F, 0.0F, 0.0F);
		Nose.cubeList.add(new ModelBox(Nose, 215, 30, -1.5F, -0.5F, 0.0F, 3, 1, 3, 0.0F, true));

		NoseTop = new ModelRenderer(this);
		NoseTop.setRotationPoint(0.0F, -6.4F, -39.3F);
		setRotationAngle(NoseTop, -2.807F, 0.0F, 0.0F);
		NoseTop.cubeList.add(new ModelBox(NoseTop, 215, 25, -1.5F, 0.0F, 0.0F, 3, 0, 4, 0.0F, true));

		SideNoseAndFrontTeeth1 = new ModelRenderer(this);
		SideNoseAndFrontTeeth1.setRotationPoint(1.4F, -4.2F, -39.5F);
		setRotationAngle(SideNoseAndFrontTeeth1, -2.807F, 0.0F, 0.0F);
		SideNoseAndFrontTeeth1.cubeList.add(new ModelBox(SideNoseAndFrontTeeth1, 220, 15, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, true));

		SideNoseAndFrontTeeth2 = new ModelRenderer(this);
		SideNoseAndFrontTeeth2.setRotationPoint(-1.4F, -4.2F, -39.5F);
		setRotationAngle(SideNoseAndFrontTeeth2, -2.807F, 0.0F, 0.0F);
		SideNoseAndFrontTeeth2.cubeList.add(new ModelBox(SideNoseAndFrontTeeth2, 220, 15, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, true));

		BackTeeth1 = new ModelRenderer(this);
		BackTeeth1.setRotationPoint(1.7F, -4.0F, -37.0F);
		setRotationAngle(BackTeeth1, -3.1416F, 0.0F, 0.0F);
		BackTeeth1.cubeList.add(new ModelBox(BackTeeth1, 75, 30, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, true));

		BackTeeth2 = new ModelRenderer(this);
		BackTeeth2.setRotationPoint(-1.4F, -4.0F, -37.0F);
		setRotationAngle(BackTeeth2, -3.1416F, 0.0F, 0.0F);
		BackTeeth2.cubeList.add(new ModelBox(BackTeeth2, 75, 30, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, true));

		Eye1 = new ModelRenderer(this);
		Eye1.setRotationPoint(1.9F, -7.0F, -35.8F);
		setRotationAngle(Eye1, -2.7697F, 0.1859F, -0.4636F);
		Eye1.cubeList.add(new ModelBox(Eye1, 85, 30, 0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F, true));

		Eye2 = new ModelRenderer(this);
		Eye2.setRotationPoint(-1.9F, -7.0F, -35.8F);
		setRotationAngle(Eye2, -2.7697F, -0.1859F, 0.4636F);
		Eye2.cubeList.add(new ModelBox(Eye2, 85, 30, 0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F, true));

		EyeTop = new ModelRenderer(this);
		EyeTop.setRotationPoint(0.0F, -7.6F, -36.7F);
		setRotationAngle(EyeTop, -2.807F, 0.0F, 0.0F);
		EyeTop.cubeList.add(new ModelBox(EyeTop, 75, 25, -1.5F, 0.0F, 0.0F, 3, 0, 4, 0.0F, true));

		FaceWeb12 = new ModelRenderer(this);
		FaceWeb12.setRotationPoint(1.9F, -8.0F, -33.0F);
		setRotationAngle(FaceWeb12, -0.4274F, 0.2603F, -0.5379F);
		FaceWeb12.cubeList.add(new ModelBox(FaceWeb12, 175, 40, 0.0F, 0.0F, 0.0F, 0, 4, 6, 0.0F, true));

		FaceWeb22 = new ModelRenderer(this);
		FaceWeb22.setRotationPoint(-1.9F, -8.0F, -33.0F);
		setRotationAngle(FaceWeb22, -0.4274F, -0.2602F, 0.5379F);
		FaceWeb22.cubeList.add(new ModelBox(FaceWeb22, 175, 40, 0.0F, 0.0F, 0.0F, 0, 4, 6, 0.0F, true));

		FaceWeb11 = new ModelRenderer(this);
		FaceWeb11.setRotationPoint(3.9F, -6.0F, -29.0F);
		setRotationAngle(FaceWeb11, -2.7697F, 0.2603F, -0.5379F);
		FaceWeb11.cubeList.add(new ModelBox(FaceWeb11, 190, 40, 0.0F, 0.0F, 0.0F, 0, 4, 6, 0.0F, true));

		FaceWeb21 = new ModelRenderer(this);
		FaceWeb21.setRotationPoint(-3.9F, -6.0F, -29.0F);
		setRotationAngle(FaceWeb21, -2.7697F, -0.2602F, 0.5379F);
		FaceWeb21.cubeList.add(new ModelBox(FaceWeb21, 190, 40, 0.0F, 0.0F, 0.0F, 0, 4, 6, 0.0F, true));

		FaceWebMiddle = new ModelRenderer(this);
		FaceWebMiddle.setRotationPoint(0.0F, -7.0F, -33.0F);
		setRotationAngle(FaceWebMiddle, 0.2602F, -0.7482F, -0.2504F);
		FaceWebMiddle.cubeList.add(new ModelBox(FaceWebMiddle, 190, 35, 0.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, true));

		UpperLeg21 = new ModelRenderer(this);
		UpperLeg21.setRotationPoint(-8.5F, 11.0F, -13.0F);
		setRotationAngle(UpperLeg21, -0.8179F, 0.0F, 0.0F);
		UpperLeg21.cubeList.add(new ModelBox(UpperLeg21, 205, 40, -1.5F, -2.0F, 0.0F, 3, 4, 10, 0.0F, true));

		LowerLeg21 = new ModelRenderer(this);
		LowerLeg21.setRotationPoint(-8.5F, 11.0F, -13.0F);
		setRotationAngle(LowerLeg21, -2.4166F, 0.0F, 0.0F);
		LowerLeg21.cubeList.add(new ModelBox(LowerLeg21, 235, 40, -1.5F, -10.0F, -2.0F, 3, 3, 9, 0.0F, true));

		FootBase21 = new ModelRenderer(this);
		FootBase21.setRotationPoint(-8.5F, 11.0F, -13.0F);
		FootBase21.cubeList.add(new ModelBox(FootBase21, 260, 40, -1.5F, 11.0F, -5.0F, 3, 1, 7, 0.0F, true));

		FootTop21 = new ModelRenderer(this);
		FootTop21.setRotationPoint(-8.5F, 11.0F, -13.0F);
		FootTop21.cubeList.add(new ModelBox(FootTop21, 260, 50, -1.5F, 10.0F, -3.0F, 3, 1, 5, 0.0F, true));

		UpperLeg11 = new ModelRenderer(this);
		UpperLeg11.setRotationPoint(8.5F, 11.0F, -13.0F);
		setRotationAngle(UpperLeg11, -0.8179F, 0.0F, 0.0F);
		UpperLeg11.cubeList.add(new ModelBox(UpperLeg11, 205, 40, -1.5F, -2.0F, 0.0F, 3, 4, 10, 0.0F, true));

		LowerLeg11 = new ModelRenderer(this);
		LowerLeg11.setRotationPoint(8.5F, 11.0F, -13.0F);
		setRotationAngle(LowerLeg11, -2.4166F, 0.0F, 0.0F);
		LowerLeg11.cubeList.add(new ModelBox(LowerLeg11, 235, 40, -1.5F, -10.0F, -2.0F, 3, 3, 9, 0.0F, true));

		FootBase11 = new ModelRenderer(this);
		FootBase11.setRotationPoint(8.5F, 11.0F, -13.0F);
		FootBase11.cubeList.add(new ModelBox(FootBase11, 260, 40, -1.5F, 11.0F, -5.0F, 3, 1, 7, 0.0F, true));

		FootTop11 = new ModelRenderer(this);
		FootTop11.setRotationPoint(8.5F, 11.0F, -13.0F);
		FootTop11.cubeList.add(new ModelBox(FootTop11, 260, 50, -1.5F, 10.0F, -3.0F, 3, 1, 5, 0.0F, true));

		UpperLeg12 = new ModelRenderer(this);
		UpperLeg12.setRotationPoint(10.0F, 10.0F, 15.5F);
		setRotationAngle(UpperLeg12, 1.1019F, 0.0F, 0.0F);
		UpperLeg12.cubeList.add(new ModelBox(UpperLeg12, 285, 40, -2.0F, -2.5F, -10.0F, 4, 5, 10, 0.0F, true));

		LowerLeg12 = new ModelRenderer(this);
		LowerLeg12.setRotationPoint(10.0F, 10.0F, 15.5F);
		setRotationAngle(LowerLeg12, -0.4786F, 0.0F, 0.0F);
		LowerLeg12.cubeList.add(new ModelBox(LowerLeg12, 320, 40, -1.5F, 5.0F, -2.0F, 3, 4, 11, 0.0F, true));

		FootBase12 = new ModelRenderer(this);
		FootBase12.setRotationPoint(10.0F, 10.0F, 15.5F);
		FootBase12.cubeList.add(new ModelBox(FootBase12, 350, 40, -1.5F, 12.0F, -4.0F, 3, 1, 9, 0.0F, true));

		FootTop12 = new ModelRenderer(this);
		FootTop12.setRotationPoint(10.0F, 10.0F, 15.5F);
		FootTop12.cubeList.add(new ModelBox(FootTop12, 350, 51, -1.5F, 11.0F, -2.0F, 3, 1, 7, 0.0F, true));

		UpperLeg22 = new ModelRenderer(this);
		UpperLeg22.setRotationPoint(-10.0F, 10.0F, 15.5F);
		setRotationAngle(UpperLeg22, 1.1019F, 0.0F, 0.0F);
		UpperLeg22.cubeList.add(new ModelBox(UpperLeg22, 285, 40, -2.0F, -2.5F, -10.0F, 4, 5, 10, 0.0F, true));

		LowerLeg22 = new ModelRenderer(this);
		LowerLeg22.setRotationPoint(-10.0F, 10.0F, 15.5F);
		setRotationAngle(LowerLeg22, -0.4786F, 0.0F, 0.0F);
		LowerLeg22.cubeList.add(new ModelBox(LowerLeg22, 320, 40, -1.5F, 6.0F, -2.0F, 3, 4, 11, 0.0F, true));

		FootBase22 = new ModelRenderer(this);
		FootBase22.setRotationPoint(-10.0F, 10.0F, 15.5F);
		FootBase22.cubeList.add(new ModelBox(FootBase22, 350, 40, -1.5F, 12.0F, -4.0F, 3, 1, 9, 0.0F, true));

		FootTop22 = new ModelRenderer(this);
		FootTop22.setRotationPoint(-10.0F, 10.0F, 15.5F);
		FootTop22.cubeList.add(new ModelBox(FootTop22, 350, 51, -1.5F, 11.0F, -2.0F, 3, 1, 7, 0.0F, true));

		WingMidBone2 = new ModelRenderer(this);
		WingMidBone2.setRotationPoint(26.0F, 2.5F, -11.0F);
		WingMidBone2.cubeList.add(new ModelBox(WingMidBone2, 230, 100, -0.5F, -0.5F, 0.0F, 1, 0, 24, 0.0F, true));

		WingWeb12 = new ModelRenderer(this);
		WingWeb12.setRotationPoint(8.0F, 2.0F, -8.0F);
		WingWeb12.cubeList.add(new ModelBox(WingWeb12, 390, 36, 0.0F, 0.0F, -3.0F, 18, 0, 24, 0.0F, true));

		WingWeb21 = new ModelRenderer(this);
		WingWeb21.setRotationPoint(-26.0F, 2.0F, -11.0F);
		WingWeb21.cubeList.add(new ModelBox(WingWeb21, 0, 93, -31.0F, 0.0F, 0.0F, 31, 0, 25, 0.0F, true));

		Tail1 = new ModelRenderer(this);
		Tail1.setRotationPoint(0.0F, 3.0F, 17.0F);
		setRotationAngle(Tail1, -0.5056F, 0.0F, 0.0F);
		Tail1.cubeList.add(new ModelBox(Tail1, 0, 0, -4.0F, 0.0F, 0.0F, 8, 6, 11, 0.0F, true));

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(0.0F, 10.9667F, 24.0F);
		setRotationAngle(Tail2, -0.4634F, 0.0F, 0.0F);
		Tail2.cubeList.add(new ModelBox(Tail2, 40, 0, -2.5F, -2.5F, 0.0F, 5, 5, 10, 0.0F, true));

		Tail3 = new ModelRenderer(this);
		Tail3.setRotationPoint(0.0F, 15.0F, 32.0F);
		setRotationAngle(Tail3, -0.6741F, 0.0F, 0.0F);
		Tail3.cubeList.add(new ModelBox(Tail3, 75, 0, -2.0F, -2.0F, 0.0F, 4, 4, 11, 0.0F, true));

		Tail4 = new ModelRenderer(this);
		Tail4.setRotationPoint(0.0F, 21.0F, 39.0F);
		setRotationAngle(Tail4, -0.4213F, 0.0F, 0.0F);
		Tail4.cubeList.add(new ModelBox(Tail4, 0, 19, -1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F, true));

		Tail5 = new ModelRenderer(this);
		Tail5.setRotationPoint(0.0F, 23.0F, 44.0F);
		setRotationAngle(Tail5, -0.2107F, 0.0F, 0.0F);
		Tail5.cubeList.add(new ModelBox(Tail5, 20, 19, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, true));

		Tail6 = new ModelRenderer(this);
		Tail6.setRotationPoint(0.0F, 24.0F, 48.0F);
		setRotationAngle(Tail6, -0.2107F, 0.0F, 0.0F);
		Tail6.cubeList.add(new ModelBox(Tail6, 0, 31, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		WingWeb11.render(f5);
		WingWeb22.render(f5);
		WingMidBone1.render(f5);
		WingJoint1.render(f5);
		WingJoint2.render(f5);
		Belly.render(f5);
		Body1.render(f5);
		Body2.render(f5);
		Body3.render(f5);
		Rear.render(f5);
		Spine1.render(f5);
		Spine2.render(f5);
		Spine3.render(f5);
		Spine4.render(f5);
		Spine5.render(f5);
		Spine6.render(f5);
		SideNeck1.render(f5);
		SideNeck2.render(f5);
		Neck1.render(f5);
		Neck2.render(f5);
		Head.render(f5);
		UpperJaw.render(f5);
		LowerJaw.render(f5);
		Nose.render(f5);
		NoseTop.render(f5);
		SideNoseAndFrontTeeth1.render(f5);
		SideNoseAndFrontTeeth2.render(f5);
		BackTeeth1.render(f5);
		BackTeeth2.render(f5);
		Eye1.render(f5);
		Eye2.render(f5);
		EyeTop.render(f5);
		FaceWeb12.render(f5);
		FaceWeb22.render(f5);
		FaceWeb11.render(f5);
		FaceWeb21.render(f5);
		FaceWebMiddle.render(f5);
		UpperLeg21.render(f5);
		LowerLeg21.render(f5);
		FootBase21.render(f5);
		FootTop21.render(f5);
		UpperLeg11.render(f5);
		LowerLeg11.render(f5);
		FootBase11.render(f5);
		FootTop11.render(f5);
		UpperLeg12.render(f5);
		LowerLeg12.render(f5);
		FootBase12.render(f5);
		FootTop12.render(f5);
		UpperLeg22.render(f5);
		LowerLeg22.render(f5);
		FootBase22.render(f5);
		FootTop22.render(f5);
		WingMidBone2.render(f5);
		WingWeb12.render(f5);
		WingWeb21.render(f5);
		Tail1.render(f5);
		Tail2.render(f5);
		Tail3.render(f5);
		Tail4.render(f5);
		Tail5.render(f5);
		Tail6.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}