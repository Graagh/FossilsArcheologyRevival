package mods.fossil.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * sarcophagus.tcn - TechneToTabulaImporter
 * Created using Tabula 4.1.1
 */
public class ModelSarcophagus extends ModelBase {
    public ModelRenderer BottomBack;
    public ModelRenderer Shape10;
    public ModelRenderer Shape9;
    public ModelRenderer Shape11;
    public ModelRenderer Shape13;
    public ModelRenderer Shape14;
    public ModelRenderer Shape3;
    public ModelRenderer Shape2;
    public ModelRenderer Shape6;
    public ModelRenderer Shape8;
    public ModelRenderer Shape8_1;
    public ModelRenderer Shape7;
    public ModelRenderer Shape6_1;
    public ModelRenderer Shape2_1;
    public ModelRenderer Shape3_1;
    public ModelRenderer Shape12;
    public ModelRenderer Shape7_1;
    public ModelRenderer hinge;
    public ModelRenderer doorMain;
    public ModelRenderer Shape4;
    public ModelRenderer Shape3_2;
    public ModelRenderer Shape2_2;
    public ModelRenderer Shape6_2;
    public ModelRenderer Shape7_2;
    public ModelRenderer Shape8_2;
    public ModelRenderer Shape8_3;
    public ModelRenderer Shape7_3;
    public ModelRenderer Shape6_3;
    public ModelRenderer Shape2_3;
    public ModelRenderer Shape3_3;
    public ModelRenderer BottomFront;
    public ModelRenderer Shape9_1;
    public ModelRenderer Shape11_1;
    public ModelRenderer Shape12_1;
    public ModelRenderer Shape13_1;
    public ModelRenderer Shape14_1;
    public ModelRenderer Shape5;
    public ModelRenderer Ear1;
    public ModelRenderer Ear1_1;
    public ModelRenderer Snout;
    public ModelRenderer Tooth2;
    public ModelRenderer Tooth2_1;
    public ModelRenderer scarab;
    public ModelRenderer Nose;
    public ModelRenderer leftTusk;
    public ModelRenderer RightTusk;

    public ModelSarcophagus() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Shape3 = new ModelRenderer(this, 57, 55);
        this.Shape3.setRotationPoint(7.0F, 13.0F, 0.0F);
        this.Shape3.addBox(0.24F, -12.0F, 0.0F, 1, 23, 8, 0.0F);
        this.setRotateAngle(Shape3, 0.0F, -0.0F, 0.017453292519943295F);
        this.Shape8 = new ModelRenderer(this, 40, 0);
        this.Shape8.setRotationPoint(4.4F, -16.3F, 0.0F);
        this.Shape8.addBox(0.0F, -5.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(Shape8, 0.0F, -0.0F, -1.2224286080968285F);
        this.hinge = new ModelRenderer(this, 0, 0);
        this.hinge.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.hinge.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.Shape5 = new ModelRenderer(this, 24, 38);
        this.Shape5.setRotationPoint(0.0F, -5.0F, -3.0F);
        this.Shape5.addBox(-4.0F, -8.0F, -7.6F, 8, 8, 3, 0.0F);
        this.Shape3_1 = new ModelRenderer(this, 57, 55);
        this.Shape3_1.mirror = true;
        this.Shape3_1.setRotationPoint(-7.0F, 24.0F, 0.0F);
        this.Shape3_1.addBox(-1.0F, -23.0F, 0.0F, 1, 23, 8, 0.0F);
        this.setRotateAngle(Shape3_1, 0.0F, -0.0F, -0.017453292519943295F);
        this.Shape9 = new ModelRenderer(this, 81, 44);
        this.Shape9.mirror = true;
        this.Shape9.setRotationPoint(0.0F, -8.0F, 6.9F);
        this.Shape9.addBox(-7.5F, -4.0F, 0.0F, 15, 4, 1, 0.0F);
        this.Tooth2 = new ModelRenderer(this, 24, 32);
        this.Tooth2.mirror = true;
        this.Tooth2.setRotationPoint(1.5F, -13.0F, -12.5F);
        this.Tooth2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.BottomFront = new ModelRenderer(this, 0, 94);
        this.BottomFront.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.BottomFront.addBox(-7.0F, 0.0F, -7.0F, 14, 1, 7, 0.0F);
        this.Nose = new ModelRenderer(this, 65, 0);
        this.Nose.setRotationPoint(0.0F, -1.0F, -7.5F);
        this.Nose.addBox(-3.0F, -2.0F, -2.0F, 6, 3, 2, 0.0F);
        this.Shape2_2 = new ModelRenderer(this, 0, 37);
        this.Shape2_2.mirror = true;
        this.Shape2_2.setRotationPoint(7.4F, 1.0F, 0.0F);
        this.Shape2_2.addBox(0.0F, -9.0F, -8.0F, 1, 9, 8, 0.0F);
        this.setRotateAngle(Shape2_2, 0.0F, -0.0F, -0.017453292519943295F);
        this.Shape8_2 = new ModelRenderer(this, 20, 0);
        this.Shape8_2.setRotationPoint(4.4F, -16.3F, 0.0F);
        this.Shape8_2.addBox(0.0F, -5.0F, -8.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(Shape8_2, 0.0F, 0.0F, -1.2224286080968285F);
        this.Shape9_1 = new ModelRenderer(this, 81, 44);
        this.Shape9_1.setRotationPoint(0.0F, -8.0F, -6.9F);
        this.Shape9_1.addBox(-7.5F, -4.0F, -1.0F, 15, 4, 1, 0.0F);
        this.Ear1_1 = new ModelRenderer(this, 24, 17);
        this.Ear1_1.setRotationPoint(3.0F, -13.0F, -8.6F);
        this.Ear1_1.addBox(-1.0F, -6.0F, -0.5F, 2, 6, 1, 0.0F);
        this.Shape10 = new ModelRenderer(this, 80, 53);
        this.Shape10.setRotationPoint(0.0F, 24.0F, 5.9F);
        this.Shape10.addBox(-8.0F, -32.0F, 1.0F, 16, 32, 1, 0.0F);
        this.Shape11 = new ModelRenderer(this, 83, 40);
        this.Shape11.mirror = true;
        this.Shape11.setRotationPoint(0.0F, -12.0F, 6.9F);
        this.Shape11.addBox(-6.5F, -2.0F, 0.0F, 13, 2, 1, 0.0F);
        this.Shape6_3 = new ModelRenderer(this, 0, 23);
        this.Shape6_3.mirror = true;
        this.Shape6_3.setRotationPoint(-7.2F, -7.9F, 0.0F);
        this.Shape6_3.addBox(-1.0F, -5.0F, -8.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(Shape6_3, 0.0F, 0.0F, 0.15707963267948966F);
        this.Shape7_1 = new ModelRenderer(this, 57, 10);
        this.Shape7_1.setRotationPoint(6.6F, -12.5F, 0.0F);
        this.Shape7_1.addBox(0.0F, -5.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(Shape7_1, 0.0F, -0.0F, -0.5759586531581287F);
        this.BottomBack = new ModelRenderer(this, 0, 105);
        this.BottomBack.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.BottomBack.addBox(-7.0F, 0.0F, 0.0F, 14, 1, 7, 0.0F);
        this.Shape3_3 = new ModelRenderer(this, 0, 55);
        this.Shape3_3.setRotationPoint(-7.0F, 24.0F, 0.0F);
        this.Shape3_3.addBox(-1.0F, -23.0F, -8.0F, 1, 23, 8, 0.0F);
        this.setRotateAngle(Shape3_3, 0.0F, -0.0F, -0.017453292519943295F);
        this.Shape2_3 = new ModelRenderer(this, 0, 37);
        this.Shape2_3.setRotationPoint(-7.4F, 3.0F, 0.0F);
        this.Shape2_3.addBox(-1.0F, -11.0F, -8.0F, 1, 9, 8, 0.0F);
        this.setRotateAngle(Shape2_3, 0.0F, -0.0F, 0.017453292519943295F);
        this.Shape13_1 = new ModelRenderer(this, 87, 33);
        this.Shape13_1.setRotationPoint(0.0F, -15.0F, -6.9F);
        this.Shape13_1.addBox(-4.5F, -2.0F, -1.0F, 9, 1, 1, 0.0F);
        this.Shape14_1 = new ModelRenderer(this, 91, 30);
        this.Shape14_1.setRotationPoint(0.0F, -17.0F, -6.9F);
        this.Shape14_1.addBox(-2.5F, -1.0F, -1.0F, 5, 1, 1, 0.0F);
        this.Tooth2_1 = new ModelRenderer(this, 24, 32);
        this.Tooth2_1.setRotationPoint(-1.5F, -13.0F, -12.5F);
        this.Tooth2_1.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.Shape2 = new ModelRenderer(this, 57, 37);
        this.Shape2.setRotationPoint(7.4F, 1.0F, 0.0F);
        this.Shape2.addBox(0.0F, -9.0F, 0.0F, 1, 9, 8, 0.0F);
        this.setRotateAngle(Shape2, 0.0F, -0.0F, -0.017453292519943295F);
        this.RightTusk = new ModelRenderer(this, 0, 0);
        this.RightTusk.setRotationPoint(-2.5F, -2.0F, -1.5F);
        this.RightTusk.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.scarab = new ModelRenderer(this, 116, 0);
        this.scarab.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.scarab.addBox(-2.0F, -2.8F, -2.0F, 4, 6, 2, 0.0F);
        this.Snout = new ModelRenderer(this, 24, 24);
        this.Snout.setRotationPoint(0.0F, -13.0F, -4.0F);
        this.Snout.addBox(-2.0F, -3.0F, -9.0F, 4, 3, 5, 0.0F);
        this.Shape2_1 = new ModelRenderer(this, 57, 37);
        this.Shape2_1.mirror = true;
        this.Shape2_1.setRotationPoint(-7.4F, 3.0F, 0.0F);
        this.Shape2_1.addBox(-1.0F, -11.0F, 0.0F, 1, 9, 8, 0.0F);
        this.setRotateAngle(Shape2_1, 0.0F, -0.0F, 0.017453292519943295F);
        this.Shape7_3 = new ModelRenderer(this, 0, 10);
        this.Shape7_3.mirror = true;
        this.Shape7_3.setRotationPoint(-6.6F, -12.5F, 0.0F);
        this.Shape7_3.addBox(-1.0F, -5.0F, -8.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(Shape7_3, 0.0F, -0.0F, 0.5759586531581287F);
        this.Shape11_1 = new ModelRenderer(this, 83, 40);
        this.Shape11_1.setRotationPoint(0.0F, -12.0F, -6.9F);
        this.Shape11_1.addBox(-6.5F, -2.0F, -1.0F, 13, 2, 1, 0.0F);
        this.Shape7_2 = new ModelRenderer(this, 0, 10);
        this.Shape7_2.setRotationPoint(6.6F, -12.5F, 0.0F);
        this.Shape7_2.addBox(0.0F, -5.0F, -8.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(Shape7_2, 0.0F, -0.0F, -0.5759586531581287F);
        this.Shape6 = new ModelRenderer(this, 57, 23);
        this.Shape6.setRotationPoint(7.2F, -7.9F, 0.0F);
        this.Shape6.addBox(0.0F, -5.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(Shape6, 0.0F, -0.0F, -0.15707963267948966F);
        this.Shape8_1 = new ModelRenderer(this, 40, 0);
        this.Shape8_1.mirror = true;
        this.Shape8_1.setRotationPoint(-4.4F, -16.3F, 0.0F);
        this.Shape8_1.addBox(-1.0F, -5.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(Shape8_1, 0.0F, -0.0F, 1.2224286080968285F);
        this.Shape14 = new ModelRenderer(this, 91, 30);
        this.Shape14.mirror = true;
        this.Shape14.setRotationPoint(0.0F, -17.0F, 6.9F);
        this.Shape14.addBox(-2.5F, -1.0F, 0.0F, 5, 1, 1, 0.0F);
        this.Shape12 = new ModelRenderer(this, 85, 36);
        this.Shape12.setRotationPoint(0.0F, -14.0F, 6.9F);
        this.Shape12.addBox(-5.5F, -2.0F, 0.0F, 11, 2, 1, 0.0F);
        this.Shape3_2 = new ModelRenderer(this, 0, 55);
        this.Shape3_2.mirror = true;
        this.Shape3_2.setRotationPoint(7.0F, 13.0F, 0.0F);
        this.Shape3_2.addBox(0.24F, -12.0F, -8.0F, 1, 23, 8, 0.0F);
        this.setRotateAngle(Shape3_2, 0.0F, -0.0F, 0.017453292519943295F);
        this.doorMain = new ModelRenderer(this, 0, 0);
        this.doorMain.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.doorMain.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.Shape7 = new ModelRenderer(this, 57, 10);
        this.Shape7.mirror = true;
        this.Shape7.setRotationPoint(-6.6F, -12.5F, 0.0F);
        this.Shape7.addBox(-1.0F, -5.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(Shape7, 0.0F, -0.0F, 0.5759586531581287F);
        this.Shape6_1 = new ModelRenderer(this, 57, 23);
        this.Shape6_1.mirror = true;
        this.Shape6_1.setRotationPoint(-7.2F, -7.9F, 0.0F);
        this.Shape6_1.addBox(-1.0F, -5.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(Shape6_1, 0.0F, -0.0F, 0.15707963267948966F);
        this.Shape4 = new ModelRenderer(this, 20, 55);
        this.Shape4.setRotationPoint(0.0F, 24.0F, -6.9F);
        this.Shape4.addBox(-8.0F, -32.0F, -1.0F, 16, 32, 1, 0.0F);
        this.leftTusk = new ModelRenderer(this, 0, 0);
        this.leftTusk.setRotationPoint(2.5F, -2.0F, -1.5F);
        this.leftTusk.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.Shape6_2 = new ModelRenderer(this, 0, 23);
        this.Shape6_2.setRotationPoint(7.2F, -7.9F, 0.0F);
        this.Shape6_2.addBox(0.0F, -5.0F, -8.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(Shape6_2, 0.0F, -0.0F, -0.15707963267948966F);
        this.Shape8_3 = new ModelRenderer(this, 20, 0);
        this.Shape8_3.mirror = true;
        this.Shape8_3.setRotationPoint(-4.4F, -16.3F, 0.0F);
        this.Shape8_3.addBox(-1.0F, -5.0F, -8.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(Shape8_3, 0.0F, -0.0F, 1.2224286080968285F);
        this.Shape12_1 = new ModelRenderer(this, 85, 36);
        this.Shape12_1.setRotationPoint(0.0F, -14.0F, -6.9F);
        this.Shape12_1.addBox(-5.5F, -2.0F, -1.0F, 11, 2, 1, 0.0F);
        this.Ear1 = new ModelRenderer(this, 24, 17);
        this.Ear1.mirror = true;
        this.Ear1.setRotationPoint(-3.0F, -13.0F, -8.6F);
        this.Ear1.addBox(-1.0F, -6.0F, -0.5F, 2, 6, 1, 0.0F);
        this.Shape13 = new ModelRenderer(this, 87, 33);
        this.Shape13.mirror = true;
        this.Shape13.setRotationPoint(0.0F, -15.0F, 6.9F);
        this.Shape13.addBox(-4.5F, -2.0F, 0.0F, 9, 1, 1, 0.0F);
        this.doorMain.addChild(this.Shape5);
        this.doorMain.addChild(this.Tooth2);
        this.doorMain.addChild(this.BottomFront);
        this.Shape5.addChild(this.Nose);
        this.doorMain.addChild(this.Shape2_2);
        this.doorMain.addChild(this.Shape8_2);
        this.doorMain.addChild(this.Shape9_1);
        this.doorMain.addChild(this.Ear1_1);
        this.doorMain.addChild(this.Shape6_3);
        this.doorMain.addChild(this.Shape3_3);
        this.doorMain.addChild(this.Shape2_3);
        this.doorMain.addChild(this.Shape13_1);
        this.doorMain.addChild(this.Shape14_1);
        this.doorMain.addChild(this.Tooth2_1);
        this.Nose.addChild(this.RightTusk);
        this.doorMain.addChild(this.scarab);
        this.doorMain.addChild(this.Snout);
        this.doorMain.addChild(this.Shape7_3);
        this.doorMain.addChild(this.Shape11_1);
        this.doorMain.addChild(this.Shape7_2);
        this.doorMain.addChild(this.Shape3_2);
        this.hinge.addChild(this.doorMain);
        this.doorMain.addChild(this.Shape4);
        this.Nose.addChild(this.leftTusk);
        this.doorMain.addChild(this.Shape6_2);
        this.doorMain.addChild(this.Shape8_3);
        this.doorMain.addChild(this.Shape12_1);
        this.doorMain.addChild(this.Ear1);
    }

    
    public void renderBlock(float f5) { 
        this.Shape3.render(f5);
        this.Shape8.render(f5);
        this.hinge.render(f5);
        this.Shape3_1.render(f5);
        this.Shape9.render(f5);
        this.Shape10.render(f5);
        this.Shape11.render(f5);
        this.Shape7_1.render(f5);
        this.BottomBack.render(f5);
        this.Shape2.render(f5);
        this.Shape2_1.render(f5);
        this.Shape6.render(f5);
        this.Shape8_1.render(f5);
        this.Shape14.render(f5);
        this.Shape12.render(f5);
        this.Shape7.render(f5);
        this.Shape6_1.render(f5);
        this.Shape13.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
