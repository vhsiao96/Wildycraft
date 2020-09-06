// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrawlingHand extends ModelBase {
	private final ModelRenderer metacarpals;
	private final ModelRenderer phalange51;
	private final ModelRenderer phalange21;
	private final ModelRenderer phalange41;
	private final ModelRenderer phalange31;
	private final ModelRenderer phalange52;
	private final ModelRenderer phalange22;
	private final ModelRenderer phalange32;
	private final ModelRenderer phalange42;
	private final ModelRenderer phalange53;
	private final ModelRenderer phalange43;
	private final ModelRenderer phalange33;
	private final ModelRenderer phalange23;
	private final ModelRenderer phalange11;
	private final ModelRenderer phalange12;
	private final ModelRenderer carpals;
	private final ModelRenderer ulna;
	private final ModelRenderer radius;

	public ModelCrawlingHand() {
		textureWidth = 128;
		textureHeight = 64;

		metacarpals = new ModelRenderer(this);
		metacarpals.setRotationPoint(0.0F, 10.0F, 7.0F);
		setRotationAngle(metacarpals, -1.2362F, 0.0F, 0.0F);
		metacarpals.cubeList.add(new ModelBox(metacarpals, 0, 0, -8.0F, 0.0F, -3.0F, 16, 12, 5, 0.0F, true));

		phalange51 = new ModelRenderer(this);
		phalange51.setRotationPoint(-6.0F, 14.0F, -4.0F);
		setRotationAngle(phalange51, -0.5236F, 0.0F, 0.0F);
		phalange51.cubeList.add(new ModelBox(phalange51, 42, 0, -1.5F, -2.0F, -2.0F, 3, 6, 4, 0.0F, true));

		phalange21 = new ModelRenderer(this);
		phalange21.setRotationPoint(6.0F, 14.0F, -4.0F);
		setRotationAngle(phalange21, -0.7854F, 0.0F, 0.0F);
		phalange21.cubeList.add(new ModelBox(phalange21, 56, 0, -1.5F, -1.0F, -2.0F, 3, 7, 4, 0.0F, true));

		phalange41 = new ModelRenderer(this);
		phalange41.setRotationPoint(-2.0F, 14.0F, -4.0F);
		setRotationAngle(phalange41, -0.7854F, 0.0F, 0.0F);
		phalange41.cubeList.add(new ModelBox(phalange41, 56, 0, -1.5F, -1.0F, -2.0F, 3, 7, 4, 0.0F, true));

		phalange31 = new ModelRenderer(this);
		phalange31.setRotationPoint(2.0F, 14.0F, -4.0F);
		setRotationAngle(phalange31, -0.7854F, 0.0F, 0.0F);
		phalange31.cubeList.add(new ModelBox(phalange31, 56, 0, -1.5F, -1.0F, -2.0F, 3, 7, 4, 0.0F, true));

		phalange52 = new ModelRenderer(this);
		phalange52.setRotationPoint(-6.0F, 17.0F, -6.0F);
		setRotationAngle(phalange52, -0.3005F, 0.0F, 0.0F);
		phalange52.cubeList.add(new ModelBox(phalange52, 42, 10, -1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F, true));

		phalange22 = new ModelRenderer(this);
		phalange22.setRotationPoint(6.0F, 17.0F, -8.0F);
		setRotationAngle(phalange22, -0.3005F, 0.0F, 0.0F);
		phalange22.cubeList.add(new ModelBox(phalange22, 42, 10, -1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F, true));

		phalange32 = new ModelRenderer(this);
		phalange32.setRotationPoint(2.0F, 17.0F, -8.0F);
		setRotationAngle(phalange32, -0.3005F, 0.0F, 0.0F);
		phalange32.cubeList.add(new ModelBox(phalange32, 42, 10, -1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F, true));

		phalange42 = new ModelRenderer(this);
		phalange42.setRotationPoint(-2.0F, 17.0F, -8.0F);
		setRotationAngle(phalange42, -0.3005F, 0.0F, 0.0F);
		phalange42.cubeList.add(new ModelBox(phalange42, 42, 10, -1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F, true));

		phalange53 = new ModelRenderer(this);
		phalange53.setRotationPoint(-6.0F, 20.0F, -7.0F);
		phalange53.cubeList.add(new ModelBox(phalange53, 70, 0, -1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F, true));

		phalange43 = new ModelRenderer(this);
		phalange43.setRotationPoint(-2.0F, 20.0F, -9.0F);
		phalange43.cubeList.add(new ModelBox(phalange43, 70, 0, -1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F, true));

		phalange33 = new ModelRenderer(this);
		phalange33.setRotationPoint(2.0F, 20.0F, -9.0F);
		phalange33.cubeList.add(new ModelBox(phalange33, 70, 0, -1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F, true));

		phalange23 = new ModelRenderer(this);
		phalange23.setRotationPoint(6.0F, 20.0F, -9.0F);
		phalange23.cubeList.add(new ModelBox(phalange23, 70, 0, -1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F, true));

		phalange11 = new ModelRenderer(this);
		phalange11.setRotationPoint(6.0F, 11.0F, 5.0F);
		setRotationAngle(phalange11, -0.409F, 0.0F, -1.0782F);
		phalange11.cubeList.add(new ModelBox(phalange11, 82, 0, -2.5F, 0.0F, -2.5F, 5, 8, 5, 0.0F, true));

		phalange12 = new ModelRenderer(this);
		phalange12.setRotationPoint(11.5F, 13.0F, 3.7F);
		setRotationAngle(phalange12, 0.0F, -1.1154F, 0.0F);
		phalange12.cubeList.add(new ModelBox(phalange12, 102, 0, -2.0F, 0.0F, -2.0F, 4, 11, 4, 0.0F, true));

		carpals = new ModelRenderer(this);
		carpals.setRotationPoint(0.0F, 10.0F, 10.0F);
		setRotationAngle(carpals, -1.5336F, 0.0F, 0.0F);
		carpals.cubeList.add(new ModelBox(carpals, 0, 17, -8.0F, 0.0F, -3.0F, 16, 7, 6, 0.0F, true));

		ulna = new ModelRenderer(this);
		ulna.setRotationPoint(-3.0F, 10.0667F, 5.0F);
		setRotationAngle(ulna, 0.0F, 0.0F, 0.7854F);
		ulna.cubeList.add(new ModelBox(ulna, 0, 47, -1.0F, -1.0F, 0.0F, 2, 2, 12, 0.0F, true));

		radius = new ModelRenderer(this);
		radius.setRotationPoint(2.0F, 10.0F, 5.0F);
		setRotationAngle(radius, 0.0F, 0.0F, 0.7854F);
		radius.cubeList.add(new ModelBox(radius, 0, 30, -1.5F, -1.5F, 0.0F, 3, 3, 14, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		metacarpals.render(f5);
		phalange51.render(f5);
		phalange21.render(f5);
		phalange41.render(f5);
		phalange31.render(f5);
		phalange52.render(f5);
		phalange22.render(f5);
		phalange32.render(f5);
		phalange42.render(f5);
		phalange53.render(f5);
		phalange43.render(f5);
		phalange33.render(f5);
		phalange23.render(f5);
		phalange11.render(f5);
		phalange12.render(f5);
		carpals.render(f5);
		ulna.render(f5);
		radius.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}