
package wildycraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGreaterDemon extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer chest;
    ModelRenderer rightuparm;
    ModelRenderer leftuparm;
    ModelRenderer rightthigh;
    ModelRenderer leftthigh;
    ModelRenderer abdomen;
    ModelRenderer right_lowarm;
    ModelRenderer leftlowarm;
    ModelRenderer lefthorn1;
    ModelRenderer lefthorn2;
    ModelRenderer lefthorn3;
    ModelRenderer righthorn1;
    ModelRenderer righthorn2;
    ModelRenderer righthorn3;
    ModelRenderer rightlowerleg;
    ModelRenderer leftlowerleg;
    ModelRenderer tail;
    ModelRenderer tailspike1;
    ModelRenderer tailspike2;
    ModelRenderer tailspiketip;
    ModelRenderer leftankle;
    ModelRenderer lefthoof;
    ModelRenderer rightankle;
    ModelRenderer righthoof;
    ModelRenderer rightwingedge1;
    ModelRenderer leftwingedge1;
    ModelRenderer rightwingedge2;
    ModelRenderer rightwingedge3;
    ModelRenderer rightwingedge4;
    ModelRenderer rightwingsegment1;
    ModelRenderer rightwingspike;
    ModelRenderer rightwingsegment2;
    ModelRenderer rightwingsegment3;
    ModelRenderer leftwingedge2;
    ModelRenderer leftwingedge3;
    ModelRenderer leftwingedge4;
    ModelRenderer leftwingspike;
    ModelRenderer leftwingsegment1;
    ModelRenderer leftwingsegment2;
    ModelRenderer leftwingsegment3;
    ModelRenderer rightwing4;
    ModelRenderer rightwing3;
    ModelRenderer rightwing2;
    ModelRenderer rightwing1;
    ModelRenderer rightwing;
    ModelRenderer leftwing;
    ModelRenderer leftwing1;
    ModelRenderer leftwing2;
    ModelRenderer leftwing3;
    ModelRenderer leftwing4;
  
  public ModelGreaterDemon()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      head = new ModelRenderer(this, 88, 17);
      head.addBox(-7.5F, -14F, -7.5F, 15, 14, 15);
      head.setRotationPoint(1F, -39F, -0.5F);
      head.setTextureSize(256, 256);
      head.mirror = true;
      setRotation(head, 0.1047198F, 0F, 0F);
      chest = new ModelRenderer(this, 71, 58);
      chest.addBox(-12.5F, -39F, -2F, 27, 15, 16);
      chest.setRotationPoint(0F, 0F, 0F);
      chest.setTextureSize(256, 256);
      chest.mirror = true;
      setRotation(chest, 0.1396263F, 0F, 0F);
      rightuparm = new ModelRenderer(this, 180, 58);
      rightuparm.addBox(-10F, -2F, -6F, 10, 19, 10);
      rightuparm.setRotationPoint(-11.5F, -37F, 3F);
      rightuparm.setTextureSize(256, 256);
      rightuparm.mirror = true;
      setRotation(rightuparm, 0F, 0F, 0.0523599F);
      leftuparm = new ModelRenderer(this, 180, 58);
      leftuparm.addBox(0F, -2F, -6F, 10, 19, 10);
      leftuparm.setRotationPoint(13.5F, -37F, 3F);
      leftuparm.setTextureSize(256, 256);
      leftuparm.mirror = true;
      setRotation(leftuparm, 0F, 0F, -0.0523599F);
      rightthigh = new ModelRenderer(this, 90, 143);
      rightthigh.addBox(-5F, 0F, -5F, 10, 19, 10);
      rightthigh.setRotationPoint(-5F, -12F, 2F);
      rightthigh.setTextureSize(256, 256);
      rightthigh.mirror = true;
      setRotation(rightthigh, -0.8726646F, 0F, 0F);
      leftthigh = new ModelRenderer(this, 90, 143);
      leftthigh.addBox(-5F, 0F, -5F, 10, 19, 10);
      leftthigh.setRotationPoint(7F, -12F, 2F);
      leftthigh.setTextureSize(256, 256);
      leftthigh.mirror = true;
      setRotation(leftthigh, -0.8726646F, 0F, 0F);
      abdomen = new ModelRenderer(this, 76, 100);
      abdomen.addBox(-10F, -26F, -4.8F, 22, 20, 14);
      abdomen.setRotationPoint(0F, 0F, 0F);
      abdomen.setTextureSize(256, 256);
      abdomen.mirror = true;
      setRotation(abdomen, 0F, 0F, 0F);
      right_lowarm = new ModelRenderer(this, 183, 97);
      right_lowarm.addBox(-8.5F, -34F, -13F, 7, 24, 7);
      right_lowarm.setRotationPoint(-11.5F, -37F, 3F);
      right_lowarm.setTextureSize(256, 256);
      right_lowarm.mirror = true;
      setRotation(right_lowarm, 2.478368F, 0F, 0.0523599F);
      leftlowarm = new ModelRenderer(this, 183, 97);
      leftlowarm.addBox(1.5F, -34F, -13F, 7, 24, 7);
      leftlowarm.setRotationPoint(13.5F, -37F, 3F);
      leftlowarm.setTextureSize(256, 256);
      leftlowarm.mirror = true;
      setRotation(leftlowarm, 2.478368F, 0F, -0.0523599F);
      lefthorn1 = new ModelRenderer(this, 55, 38);
      lefthorn1.addBox(-12F, -14F, 1F, 4, 8, 4);
      lefthorn1.setRotationPoint(1F, -39F, -0.5F);
      lefthorn1.setTextureSize(256, 256);
      lefthorn1.mirror = true;
      setRotation(lefthorn1, 0.3141593F, 0F, 1.570796F);
      lefthorn2 = new ModelRenderer(this, 56, 23);
      lefthorn2.addBox(-12F, -15F, 10.1F, 3, 9, 3);
      lefthorn2.setRotationPoint(1F, -39F, -0.5F);
      lefthorn2.setTextureSize(256, 256);
      lefthorn2.mirror = true;
      setRotation(lefthorn2, 1.169371F, 0F, 1.570796F);
      lefthorn3 = new ModelRenderer(this, 59, 6);
      lefthorn3.addBox(-11F, -20F, 15.3F, 2, 11, 2);
      lefthorn3.setRotationPoint(1F, -39F, -0.5F);
      lefthorn3.setTextureSize(256, 256);
      lefthorn3.mirror = true;
      setRotation(lefthorn3, 0F, 1.570796F, 1.53589F);
      righthorn1 = new ModelRenderer(this, 55, 38);
      righthorn1.addBox(-12F, 6F, 1F, 4, 8, 4);
      righthorn1.setRotationPoint(1F, -39F, -0.5F);
      righthorn1.setTextureSize(256, 256);
      righthorn1.mirror = true;
      setRotation(righthorn1, -0.3141593F, 0F, 1.570796F);
      righthorn2 = new ModelRenderer(this, 56, 23);
      righthorn2.addBox(8.8F, -15F, 10.1F, 3, 9, 3);
      righthorn2.setRotationPoint(1F, -39F, -0.5F);
      righthorn2.setTextureSize(256, 256);
      righthorn2.mirror = true;
      setRotation(righthorn2, 1.22173F, 0F, -1.570796F);
      righthorn3 = new ModelRenderer(this, 59, 6);
      righthorn3.addBox(9F, -20F, 14.9F, 2, 11, 2);
      righthorn3.setRotationPoint(1F, -39F, -0.5F);
      righthorn3.setTextureSize(256, 256);
      righthorn3.mirror = true;
      setRotation(righthorn3, 0F, -1.570796F, -1.53589F);
      rightlowerleg = new ModelRenderer(this, 95, 181);
      rightlowerleg.addBox(-4F, 3.5F, -18.9F, 8, 15, 8);
      rightlowerleg.setRotationPoint(-5F, -12F, 2F);
      rightlowerleg.setTextureSize(256, 256);
      rightlowerleg.mirror = true;
      setRotation(rightlowerleg, 0.7679449F, 0F, 0F);
      leftlowerleg = new ModelRenderer(this, 95, 181);
      leftlowerleg.addBox(-4F, 3.5F, -18.9F, 8, 15, 8);
      leftlowerleg.setRotationPoint(7F, -12F, 2F);
      leftlowerleg.setTextureSize(256, 256);
      leftlowerleg.mirror = true;
      setRotation(leftlowerleg, 0.7853982F, 0F, 0F);
      tail = new ModelRenderer(this, 18, 98);
      tail.addBox(0.5F, 10F, -3.5F, 2, 38, 2);
      tail.setRotationPoint(0F, 0F, 0F);
      tail.setTextureSize(256, 256);
      tail.mirror = true;
      setRotation(tail, 2.513274F, 0F, 0F);
      tailspike1 = new ModelRenderer(this, 16, 71);
      tailspike1.addBox(-0.5F, 3F, 48F, 4, 3, 4);
      tailspike1.setRotationPoint(0F, 0F, 0F);
      tailspike1.setTextureSize(256, 256);
      tailspike1.mirror = true;
      setRotation(tailspike1, 0.9773844F, 0F, 0F);
      tailspike2 = new ModelRenderer(this, 21, 73);
      tailspike2.addBox(0F, 3.5F, 52F, 3, 2, 2);
      tailspike2.setRotationPoint(0F, 0F, 0F);
      tailspike2.setTextureSize(256, 256);
      tailspike2.mirror = true;
      setRotation(tailspike2, 0.9773844F, 0F, 0F);
      tailspiketip = new ModelRenderer(this, 25, 75);
      tailspiketip.addBox(0.5F, 4F, 54F, 2, 1, 1);
      tailspiketip.setRotationPoint(0F, 0F, 0F);
      tailspiketip.setTextureSize(256, 256);
      tailspiketip.mirror = true;
      setRotation(tailspiketip, 0.9773844F, 0F, 0F);
      leftankle = new ModelRenderer(this, 148, 161);
      leftankle.addBox(-4F, 15F, 10F, 6, 17, 6);
      leftankle.setRotationPoint(8F, -12F, 2F);
      leftankle.setTextureSize(256, 256);
      leftankle.mirror = true;
      setRotation(leftankle, -0.5759587F, 0F, 0F);
      lefthoof = new ModelRenderer(this, 142, 192);
      lefthoof.addBox(-6F, 30F, -13F, 10, 6, 10);
      lefthoof.setRotationPoint(8F, -12F, 2F);
      lefthoof.setTextureSize(256, 256);
      lefthoof.mirror = true;
      setRotation(lefthoof, 0F, 0F, 0F);
      rightankle = new ModelRenderer(this, 148, 161);
      rightankle.addBox(-2F, 15F, 10F, 6, 17, 6);
      rightankle.setRotationPoint(-6F, -12F, 2F);
      rightankle.setTextureSize(256, 256);
      rightankle.mirror = true;
      setRotation(rightankle, -0.5759587F, 0F, 0F);
      righthoof = new ModelRenderer(this, 142, 192);
      righthoof.addBox(-4F, 30F, -13F, 10, 6, 10);
      righthoof.setRotationPoint(-6F, -12F, 2F);
      righthoof.setTextureSize(256, 256);
      righthoof.mirror = true;
      setRotation(righthoof, 0F, 0F, 0F);
      rightwingedge1 = new ModelRenderer(this, 17, 166);
      rightwingedge1.addBox(1F, -33F, 9F, 2, 2, 14);
      rightwingedge1.setRotationPoint(0F, 0F, 0F);
      rightwingedge1.setTextureSize(256, 256);
      rightwingedge1.mirror = true;
      setRotation(rightwingedge1, 0F, -0.2617994F, 0F);
      leftwingedge1 = new ModelRenderer(this, 17, 166);
      leftwingedge1.addBox(1F, -33F, 9F, 2, 2, 14);
      leftwingedge1.setRotationPoint(0F, 0F, 0F);
      leftwingedge1.setTextureSize(256, 256);
      leftwingedge1.mirror = true;
      setRotation(leftwingedge1, 0F, 0.2617994F, 0F);
      rightwingedge2 = new ModelRenderer(this, 14, 163);
      rightwingedge2.addBox(9.8F, -12.4F, 35F, 2, 2, 17);
      rightwingedge2.setRotationPoint(0F, 0F, 0F);
      rightwingedge2.setTextureSize(256, 256);
      rightwingedge2.mirror = true;
      setRotation(rightwingedge2, 0.7330383F, -0.6806784F, 0F);
      rightwingedge3 = new ModelRenderer(this, 15, 165);
      rightwingedge3.addBox(9.8F, -39F, 37F, 2, 2, 16);
      rightwingedge3.setRotationPoint(0F, 0F, 0F);
      rightwingedge3.setTextureSize(256, 256);
      rightwingedge3.mirror = true;
      setRotation(rightwingedge3, 0.1570796F, -0.6806784F, 0F);
      rightwingedge4 = new ModelRenderer(this, 21, 170);
      rightwingedge4.addBox(9.8F, -64.3F, -13F, 2, 2, 10);
      rightwingedge4.setRotationPoint(0F, 0F, 0F);
      rightwingedge4.setTextureSize(256, 256);
      rightwingedge4.mirror = true;
      setRotation(rightwingedge4, -0.9773844F, -0.6806784F, 0F);
      rightwingsegment1 = new ModelRenderer(this, 67, 152);
      rightwingsegment1.addBox(10.5F, -44F, 25F, 1, 23, 1);
      rightwingsegment1.setRotationPoint(0F, 0F, 0F);
      rightwingsegment1.setTextureSize(256, 256);
      rightwingsegment1.mirror = true;
      setRotation(rightwingsegment1, -0.1047198F, -0.6806784F, 0F);
      rightwingspike = new ModelRenderer(this, 18, 150);
      rightwingspike.addBox(10F, -42F, 35F, 2, 3, 2);
      rightwingspike.setRotationPoint(0F, 0F, 0F);
      rightwingspike.setTextureSize(256, 256);
      rightwingspike.mirror = true;
      setRotation(rightwingspike, 0.122173F, -0.6806784F, 0F);
      rightwingsegment2 = new ModelRenderer(this, 67, 152);
      rightwingsegment2.addBox(10.5F, -28F, 48F, 1, 21, 1);
      rightwingsegment2.setRotationPoint(0F, 0F, 0F);
      rightwingsegment2.setTextureSize(256, 256);
      rightwingsegment2.mirror = true;
      setRotation(rightwingsegment2, 0.3665191F, -0.6806784F, 0F);
      rightwingsegment3 = new ModelRenderer(this, 67, 153);
      rightwingsegment3.addBox(10.5F, -27F, 57F, 1, 12, 1);
      rightwingsegment3.setRotationPoint(0F, 0F, 0F);
      rightwingsegment3.setTextureSize(256, 256);
      rightwingsegment3.mirror = true;
      setRotation(rightwingsegment3, 0.2268928F, -0.6806784F, 0F);
      leftwingedge2 = new ModelRenderer(this, 14, 164);
      leftwingedge2.addBox(-8.8F, -10.4F, 37F, 2, 2, 17);
      leftwingedge2.setRotationPoint(0F, 0F, 0F);
      leftwingedge2.setTextureSize(256, 256);
      leftwingedge2.mirror = true;
      setRotation(leftwingedge2, 0.7330383F, 0.6806784F, 0F);
      leftwingedge3 = new ModelRenderer(this, 15, 165);
      leftwingedge3.addBox(-8.8F, -38F, 39F, 2, 2, 16);
      leftwingedge3.setRotationPoint(0F, 0F, 0F);
      leftwingedge3.setTextureSize(256, 256);
      leftwingedge3.mirror = true;
      setRotation(leftwingedge3, 0.1570796F, 0.6806784F, 0F);
      leftwingedge4 = new ModelRenderer(this, 21, 171);
      leftwingedge4.addBox(-8.8F, -65.3F, -11F, 2, 2, 10);
      leftwingedge4.setRotationPoint(0F, 0F, 0F);
      leftwingedge4.setTextureSize(256, 256);
      leftwingedge4.mirror = true;
      setRotation(leftwingedge4, -0.9773844F, 0.6806784F, 0F);
      leftwingspike = new ModelRenderer(this, 18, 150);
      leftwingspike.addBox(-8.8F, -41F, 36.93333F, 2, 3, 2);
      leftwingspike.setRotationPoint(0F, 0F, 0F);
      leftwingspike.setTextureSize(256, 256);
      leftwingspike.mirror = true;
      setRotation(leftwingspike, 0.122173F, 0.6806784F, 0F);
      leftwingsegment1 = new ModelRenderer(this, 67, 152);
      leftwingsegment1.addBox(-8.5F, -44F, 27F, 1, 23, 1);
      leftwingsegment1.setRotationPoint(0F, 0F, 0F);
      leftwingsegment1.setTextureSize(256, 256);
      leftwingsegment1.mirror = true;
      setRotation(leftwingsegment1, -0.1047198F, 0.6806784F, 0F);
      leftwingsegment2 = new ModelRenderer(this, 67, 152);
      leftwingsegment2.addBox(-8.5F, -26F, 49F, 1, 21, 1);
      leftwingsegment2.setRotationPoint(0F, 0F, 0F);
      leftwingsegment2.setTextureSize(256, 256);
      leftwingsegment2.mirror = true;
      setRotation(leftwingsegment2, 0.4014257F, 0.6806784F, 0F);
      leftwingsegment3 = new ModelRenderer(this, 67, 151);
      leftwingsegment3.addBox(-8.5F, -27F, 58F, 1, 12, 1);
      leftwingsegment3.setRotationPoint(0F, 0F, 0F);
      leftwingsegment3.setTextureSize(256, 256);
      leftwingsegment3.mirror = true;
      setRotation(leftwingsegment3, 0.2268928F, 0.6806784F, 0F);
      rightwing4 = new ModelRenderer(this, 96, 215);
      rightwing4.addBox(11F, -27.5F, 48F, 0, 15, 12);
      rightwing4.setRotationPoint(0F, 0F, 0F);
      rightwing4.setTextureSize(256, 256);
      rightwing4.mirror = true;
      setRotation(rightwing4, 0.3665191F, -0.6806784F, 0F);
      rightwing3 = new ModelRenderer(this, 76, 214);
      rightwing3.addBox(11F, -37F, 35F, 0, 18, 10);
      rightwing3.setRotationPoint(0F, 0F, 0F);
      rightwing3.setTextureSize(256, 256);
      rightwing3.mirror = true;
      setRotation(rightwing3, 0.1570796F, -0.6806784F, 0F);
      rightwing2 = new ModelRenderer(this, 48, 214);
      rightwing2.addBox(11F, -11F, 35F, 0, 14, 14);
      rightwing2.setRotationPoint(0F, 0F, 0F);
      rightwing2.setTextureSize(256, 256);
      rightwing2.mirror = true;
      setRotation(rightwing2, 0.7330383F, -0.6806784F, 0F);
      rightwing1 = new ModelRenderer(this, 30, 222);
      rightwing1.addBox(11F, -32F, 19F, 0, 11, 9);
      rightwing1.setRotationPoint(0F, 0F, 0F);
      rightwing1.setTextureSize(256, 256);
      rightwing1.mirror = true;
      setRotation(rightwing1, 0F, -0.6806784F, 0F);
      rightwing = new ModelRenderer(this, 4, 218);
      rightwing.addBox(2F, -32F, 9F, 0, 11, 13);
      rightwing.setRotationPoint(0F, 0F, 0F);
      rightwing.setTextureSize(256, 256);
      rightwing.mirror = true;
      setRotation(rightwing, 0F, -0.2443461F, 0F);
      leftwing = new ModelRenderer(this, 4, 218);
      leftwing.addBox(2F, -32F, 9F, 0, 11, 13);
      leftwing.setRotationPoint(0F, 0F, 0F);
      leftwing.setTextureSize(256, 256);
      leftwing.mirror = true;
      setRotation(leftwing, 0F, 0.2443461F, 0F);
      leftwing1 = new ModelRenderer(this, 30, 222);
      leftwing1.addBox(-7.5F, -32F, 20.8F, 0, 11, 9);
      leftwing1.setRotationPoint(0F, 0F, 0F);
      leftwing1.setTextureSize(256, 256);
      leftwing1.mirror = true;
      setRotation(leftwing1, 0F, 0.6806784F, 0F);
      leftwing2 = new ModelRenderer(this, 48, 214);
      leftwing2.addBox(-7.5F, -9F, 36F, 0, 14, 14);
      leftwing2.setRotationPoint(0F, 0F, 0F);
      leftwing2.setTextureSize(256, 256);
      leftwing2.mirror = true;
      setRotation(leftwing2, 0.7330383F, 0.6806784F, 0F);
      leftwing3 = new ModelRenderer(this, 76, 214);
      leftwing3.addBox(-7.5F, -36F, 36.4F, 0, 18, 10);
      leftwing3.setRotationPoint(0F, 0F, 0F);
      leftwing3.setTextureSize(256, 256);
      leftwing3.mirror = true;
      setRotation(leftwing3, 0.1570796F, 0.6806784F, 0F);
      leftwing4 = new ModelRenderer(this, 96, 215);
      leftwing4.addBox(-7.5F, -25.5F, 49F, 0, 15, 12);
      leftwing4.setRotationPoint(0F, 0F, 0F);
      leftwing4.setTextureSize(256, 256);
      leftwing4.mirror = true;
      setRotation(leftwing4, 0.3665191F, 0.6806784F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.renderWithRotation(f5);
    chest.renderWithRotation(f5);
    rightuparm.renderWithRotation(f5);
    leftuparm.renderWithRotation(f5);
    rightthigh.renderWithRotation(f5);
    leftthigh.renderWithRotation(f5);
    abdomen.renderWithRotation(f5);
    right_lowarm.renderWithRotation(f5);
    leftlowarm.renderWithRotation(f5);
    lefthorn1.render(f5);
    lefthorn2.render(f5);
    lefthorn3.renderWithRotation(f5);
    righthorn1.render(f5);
    righthorn2.render(f5);
    righthorn3.renderWithRotation(f5);
    rightlowerleg.renderWithRotation(f5);
    leftlowerleg.renderWithRotation(f5);
    tail.renderWithRotation(f5);
    tailspike1.renderWithRotation(f5);
    tailspike2.renderWithRotation(f5);
    tailspiketip.renderWithRotation(f5);
    leftankle.renderWithRotation(f5);
    lefthoof.renderWithRotation(f5);
    rightankle.renderWithRotation(f5);
    righthoof.renderWithRotation(f5);
    rightwingedge1.renderWithRotation(f5);
    leftwingedge1.renderWithRotation(f5);
    rightwingedge2.renderWithRotation(f5);
    rightwingedge3.renderWithRotation(f5);
    rightwingedge4.renderWithRotation(f5);
    rightwingsegment1.renderWithRotation(f5);
    rightwingspike.renderWithRotation(f5);
    rightwingsegment2.renderWithRotation(f5);
    rightwingsegment3.renderWithRotation(f5);
    leftwingedge2.renderWithRotation(f5);
    leftwingedge3.renderWithRotation(f5);
    leftwingedge4.renderWithRotation(f5);
    leftwingspike.renderWithRotation(f5);
    leftwingsegment1.renderWithRotation(f5);
    leftwingsegment2.renderWithRotation(f5);
    leftwingsegment3.renderWithRotation(f5);
    rightwing4.renderWithRotation(f5);
    rightwing3.renderWithRotation(f5);
    rightwing2.renderWithRotation(f5);
    rightwing1.renderWithRotation(f5);
    rightwing.renderWithRotation(f5);
    leftwing.renderWithRotation(f5);
    leftwing1.renderWithRotation(f5);
    leftwing2.renderWithRotation(f5);
    leftwing3.renderWithRotation(f5);
    leftwing4.renderWithRotation(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    rightthigh.rotateAngleX = -0.8726646F + MathHelper.cos(f * 0.2662F) * 0.8F * f1;
    leftthigh.rotateAngleX = -0.8726646F + MathHelper.cos(f * 0.2662F + (float)Math.PI) * 0.8F * f1;
    rightlowerleg.rotateAngleX = 0.7679449F + MathHelper.cos(f * 0.2662F) * 0.8F * f1;
    leftlowerleg.rotateAngleX = 0.7679449F + MathHelper.cos(f * 0.2662F + (float)Math.PI) * 0.8F * f1;
    rightankle.rotateAngleX = -0.5759587F + MathHelper.cos(f * 0.2662F) * 0.8F * f1;
    leftankle.rotateAngleX = -0.5759587F + MathHelper.cos(f * 0.2662F + (float)Math.PI) * 0.8F * f1;
    righthoof.rotateAngleX = MathHelper.cos(f * 0.2662F) * 0.8F * f1;
    lefthoof.rotateAngleX = MathHelper.cos(f * 0.2662F + (float)Math.PI) * 0.8F * f1;  
  }

}
