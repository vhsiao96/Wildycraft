// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBoxTrap extends ModelBase {
	private final ModelRenderer Center;
	private final ModelRenderer Side1;
	private final ModelRenderer Side2;
	private final ModelRenderer Side3;
	private final ModelRenderer Side4;
	private final ModelRenderer Pillar1;
	private final ModelRenderer Pillar2;
	private final ModelRenderer Pillar3;
	private final ModelRenderer Pillar4;
	private final ModelRenderer Stick;
	private final ModelRenderer Rock;
	private final ModelRenderer Support1;
	private final ModelRenderer Support2;
	private final ModelRenderer Base;
	private final ModelRenderer String1;
	private final ModelRenderer String2;
	private final ModelRenderer String3;
	private final ModelRenderer String4;
	private final ModelRenderer String5;
	private final ModelRenderer String6;
	private final ModelRenderer String7;
	private final ModelRenderer String8;

	public ModelBoxTrap() {
		textureWidth = 64;
		textureHeight = 32;

		Center = new ModelRenderer(this);
		Center.setRotationPoint(0.0F, 10.0F, 0.0F);
		Center.cubeList.add(new ModelBox(Center, 0, 0, -7.0F, 0.0F, -7.0F, 14, 1, 14, 0.0F, true));

		Side1 = new ModelRenderer(this);
		Side1.setRotationPoint(0.0F, 10.0F, 7.0F);
		Side1.cubeList.add(new ModelBox(Side1, 0, 0, -7.0F, 0.0F, 0.0F, 14, 1, 14, 0.0F, true));

		Side2 = new ModelRenderer(this);
		Side2.setRotationPoint(-7.0F, 10.0F, 0.0F);
		setRotationAngle(Side2, 0.0F, 1.5708F, 0.0F);
		Side2.cubeList.add(new ModelBox(Side2, 0, 0, -7.0F, 0.0F, -14.0F, 14, 1, 14, 0.0F, true));

		Side3 = new ModelRenderer(this);
		Side3.setRotationPoint(7.0F, 10.0F, 0.0F);
		setRotationAngle(Side3, 0.0F, 1.5708F, 0.0F);
		Side3.cubeList.add(new ModelBox(Side3, 0, 0, -7.0F, 0.0F, 0.0F, 14, 1, 14, 0.0F, true));

		Side4 = new ModelRenderer(this);
		Side4.setRotationPoint(0.0F, 10.0F, -7.0F);
		Side4.cubeList.add(new ModelBox(Side4, 0, 0, -7.0F, 0.0F, -14.0F, 14, 1, 14, 0.0F, true));

		Pillar1 = new ModelRenderer(this);
		Pillar1.setRotationPoint(-6.9F, 10.0F, -6.9F);
		Pillar1.cubeList.add(new ModelBox(Pillar1, 56, 0, 0.0F, 0.1F, 0.0F, 1, 14, 1, 0.0F, true));

		Pillar2 = new ModelRenderer(this);
		Pillar2.setRotationPoint(5.9F, 10.0F, -6.9F);
		Pillar2.cubeList.add(new ModelBox(Pillar2, 56, 0, 0.0F, 0.1F, 0.0F, 1, 14, 1, 0.0F, true));

		Pillar3 = new ModelRenderer(this);
		Pillar3.setRotationPoint(-7.0F, 10.0F, 6.1333F);
		Pillar3.cubeList.add(new ModelBox(Pillar3, 56, 0, 0.0F, 0.0F, 0.0F, 1, 14, 1, 0.0F, true));

		Pillar4 = new ModelRenderer(this);
		Pillar4.setRotationPoint(5.9F, 10.0F, 5.9F);
		Pillar4.cubeList.add(new ModelBox(Pillar4, 56, 0, 0.0F, 0.1F, 0.0F, 1, 14, 1, 0.0F, true));

		Stick = new ModelRenderer(this);
		Stick.setRotationPoint(-3.0F, -4.0F, 3.0F);
		Stick.cubeList.add(new ModelBox(Stick, 60, 0, 0.0F, 0.0F, 0.0F, 1, 14, 1, 0.0F, true));

		Rock = new ModelRenderer(this);
		Rock.setRotationPoint(-2.0F, -3.0F, 3.0F);
		setRotationAngle(Rock, 0.0F, 0.9666F, 0.0F);
		Rock.cubeList.add(new ModelBox(Rock, 0, 17, 0.0F, -1.5F, -1.5F, 3, 3, 3, 0.0F, true));

		Support1 = new ModelRenderer(this);
		Support1.setRotationPoint(-3.0F, 8.0F, 3.3F);
		setRotationAngle(Support1, 0.0F, -0.2231F, 0.3543F);
		Support1.cubeList.add(new ModelBox(Support1, 0, 15, 0.2F, -0.5F, -0.5F, 7, 1, 1, 0.0F, true));

		Support2 = new ModelRenderer(this);
		Support2.setRotationPoint(-2.5F, 8.0F, 3.3F);
		setRotationAngle(Support2, 0.0F, 1.8961F, 0.3718F);
		Support2.cubeList.add(new ModelBox(Support2, 0, 15, 0.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F, true));

		Base = new ModelRenderer(this);
		Base.setRotationPoint(0.0F, 23.7F, 0.0F);
		Base.cubeList.add(new ModelBox(Base, 2, 15, -7.0F, 0.0F, -7.0F, 14, 0, 14, 0.0F, true));

		String1 = new ModelRenderer(this);
		String1.setRotationPoint(7.0F, 23.0F, -6.5F);
		setRotationAngle(String1, 0.0F, 0.0F, -0.7808F);
		String1.cubeList.add(new ModelBox(String1, 0, 29, -1.0F, -0.5F, 0.0F, 19, 1, 0, 0.0F, true));

		String2 = new ModelRenderer(this);
		String2.setRotationPoint(7.0F, 23.0F, 6.5F);
		setRotationAngle(String2, 0.0F, 0.0F, -0.7808F);
		String2.cubeList.add(new ModelBox(String2, 0, 29, -1.0F, -0.5F, 0.0F, 19, 1, 0, 0.0F, true));

		String3 = new ModelRenderer(this);
		String3.setRotationPoint(6.5F, 23.0F, -7.0F);
		setRotationAngle(String3, 0.0F, 1.5708F, -0.7808F);
		String3.cubeList.add(new ModelBox(String3, 0, 29, -1.0F, -0.5F, 0.0F, 19, 1, 0, 0.0F, true));

		String4 = new ModelRenderer(this);
		String4.setRotationPoint(-6.5F, 23.0F, -7.0F);
		setRotationAngle(String4, 0.0F, 1.5708F, -0.7808F);
		String4.cubeList.add(new ModelBox(String4, 0, 29, -1.0F, -0.5F, 0.0F, 19, 1, 0, 0.0F, true));

		String5 = new ModelRenderer(this);
		String5.setRotationPoint(6.5F, 23.0F, 7.0F);
		setRotationAngle(String5, 0.0F, -1.5708F, -0.7808F);
		String5.cubeList.add(new ModelBox(String5, 0, 29, -1.0F, -0.5F, 0.0F, 19, 1, 0, 0.0F, true));

		String6 = new ModelRenderer(this);
		String6.setRotationPoint(-6.5F, 23.0F, 7.0F);
		setRotationAngle(String6, 0.0F, -1.5708F, -0.7808F);
		String6.cubeList.add(new ModelBox(String6, 0, 29, -1.0F, -0.5F, 0.0F, 19, 1, 0, 0.0F, true));

		String7 = new ModelRenderer(this);
		String7.setRotationPoint(-7.0F, 23.0F, 6.5F);
		setRotationAngle(String7, 0.0F, 3.1416F, -0.7808F);
		String7.cubeList.add(new ModelBox(String7, 0, 29, -1.0F, -0.5F, 0.0F, 19, 1, 0, 0.0F, true));

		String8 = new ModelRenderer(this);
		String8.setRotationPoint(-7.0F, 23.0F, -6.5F);
		setRotationAngle(String8, 0.0F, 3.1416F, -0.7808F);
		String8.cubeList.add(new ModelBox(String8, 0, 29, -1.0F, -0.5F, 0.0F, 19, 1, 0, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Center.render(f5);
		Side1.render(f5);
		Side2.render(f5);
		Side3.render(f5);
		Side4.render(f5);
		Pillar1.render(f5);
		Pillar2.render(f5);
		Pillar3.render(f5);
		Pillar4.render(f5);
		Stick.render(f5);
		Rock.render(f5);
		Support1.render(f5);
		Support2.render(f5);
		Base.render(f5);
		String1.render(f5);
		String2.render(f5);
		String3.render(f5);
		String4.render(f5);
		String5.render(f5);
		String6.render(f5);
		String7.render(f5);
		String8.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}