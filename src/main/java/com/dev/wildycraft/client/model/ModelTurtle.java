// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

package com.dev.wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTurtle extends ModelBase {
	private final ModelRenderer Shell1;
	private final ModelRenderer Shell2;
	private final ModelRenderer ShellBase1;
	private final ModelRenderer ShellBase2;
	private final ModelRenderer Belly;
	private final ModelRenderer BellySide1;
	private final ModelRenderer BellySide2;
	private final ModelRenderer Neck;
	private final ModelRenderer Head;
	private final ModelRenderer FrontLeg2;
	private final ModelRenderer FrontLeg1;
	private final ModelRenderer BackLeg2;
	private final ModelRenderer BackLeg1;
	private final ModelRenderer Tail;

	public ModelTurtle() {
		textureWidth = 64;
		textureHeight = 32;

		Shell1 = new ModelRenderer(this);
		Shell1.setRotationPoint(-5.0F, 19.0F, -6.0F);
		Shell1.cubeList.add(new ModelBox(Shell1, 0, 19, 1.0F, 0.0F, 0.0F, 8, 2, 11, 0.0F, true));

		Shell2 = new ModelRenderer(this);
		Shell2.setRotationPoint(-3.0F, 18.0F, -5.0F);
		Shell2.cubeList.add(new ModelBox(Shell2, 27, 20, 0.0F, 0.0F, 0.0F, 6, 1, 9, 0.0F, true));

		ShellBase1 = new ModelRenderer(this);
		ShellBase1.setRotationPoint(1.0F, 21.0F, -7.0F);
		ShellBase1.cubeList.add(new ModelBox(ShellBase1, 8, 0, 0.0F, 0.0F, 0.0F, 4, 1, 13, 0.0F, true));

		ShellBase2 = new ModelRenderer(this);
		ShellBase2.setRotationPoint(-5.0F, 21.0F, -7.0F);
		ShellBase2.cubeList.add(new ModelBox(ShellBase2, 8, 0, 0.0F, 0.0F, 0.0F, 4, 1, 13, 0.0F, true));

		Belly = new ModelRenderer(this);
		Belly.setRotationPoint(-3.0F, 22.0F, -6.0F);
		Belly.cubeList.add(new ModelBox(Belly, 30, 0, 0.0F, 0.0F, 0.0F, 6, 1, 11, 0.0F, true));

		BellySide1 = new ModelRenderer(this);
		BellySide1.setRotationPoint(3.0F, 22.0F, -5.0F);
		BellySide1.cubeList.add(new ModelBox(BellySide1, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, true));

		BellySide2 = new ModelRenderer(this);
		BellySide2.setRotationPoint(-4.0F, 22.0F, -5.0F);
		BellySide2.cubeList.add(new ModelBox(BellySide2, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, true));

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(1.0F, 21.0F, -6.0F);
		setRotationAngle(Neck, 0.3718F, 3.1416F, 0.0F);
		Neck.cubeList.add(new ModelBox(Neck, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, true));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 21.0F, -8.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 3, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, true));

		FrontLeg2 = new ModelRenderer(this);
		FrontLeg2.setRotationPoint(3.0F, 22.0F, -6.0F);
		FrontLeg2.cubeList.add(new ModelBox(FrontLeg2, 11, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		FrontLeg1 = new ModelRenderer(this);
		FrontLeg1.setRotationPoint(-4.0F, 22.0F, -6.0F);
		FrontLeg1.cubeList.add(new ModelBox(FrontLeg1, 11, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		BackLeg2 = new ModelRenderer(this);
		BackLeg2.setRotationPoint(3.0F, 22.0F, 4.0F);
		BackLeg2.cubeList.add(new ModelBox(BackLeg2, 11, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		BackLeg1 = new ModelRenderer(this);
		BackLeg1.setRotationPoint(-4.0F, 22.0F, 4.0F);
		BackLeg1.cubeList.add(new ModelBox(BackLeg1, 11, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(1.0F, 22.0F, 8.0F);
		setRotationAngle(Tail, 0.3718F, 3.1416F, 0.0F);
		Tail.cubeList.add(new ModelBox(Tail, 11, 3, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Shell1.render(f5);
		Shell2.render(f5);
		ShellBase1.render(f5);
		ShellBase2.render(f5);
		Belly.render(f5);
		BellySide1.render(f5);
		BellySide2.render(f5);
		Neck.render(f5);
		Head.render(f5);
		FrontLeg2.render(f5);
		FrontLeg1.render(f5);
		BackLeg2.render(f5);
		BackLeg1.render(f5);
		Tail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}