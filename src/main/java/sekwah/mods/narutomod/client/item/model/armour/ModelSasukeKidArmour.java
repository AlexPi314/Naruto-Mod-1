package sekwah.mods.narutomod.client.item.model.armour;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import sekwah.mods.narutomod.client.player.models.ModelNinjaBiped;

public class ModelSasukeKidArmour extends ModelNinjaBiped implements IRenderFirstPerson {

    private ModelRenderer UpperBody;
    private ModelRenderer UpperLeftArm;
    private ModelRenderer UpperRightArm;
    private ModelRenderer UpperRightLeg;
    private ModelRenderer UpperLeftLeg;
    private ModelRenderer LowerBody;
    private ModelRenderer UchihaCrest1;
    private ModelRenderer UchihaCrest2;
    private ModelRenderer UchihaCrest3;
    private ModelRenderer UchihaCrest4;
    private ModelRenderer UchihaCrest5;
    private ModelRenderer UchihaCrest6;
    private ModelRenderer UchihaCrest7;
    private ModelRenderer UchihaCrest8;
    private ModelRenderer UchihaCrest9;
    private ModelRenderer UchihaCrest10;
    private ModelRenderer UchihaCrest11;
    private ModelRenderer Jacket1;
    private ModelRenderer Jacket2;
    private ModelRenderer Jacket3;
    private ModelRenderer Jacket4;
    private ModelRenderer Jacket5;
    private ModelRenderer UchihaCrest17;
    private ModelRenderer UchihaCrest14;
    private ModelRenderer UchihaCrest15;
    private ModelRenderer UchihaCrest16;
    private ModelRenderer Jacket6;
    private ModelRenderer Jacket7;
    private ModelRenderer Jacket8;
    private ModelRenderer LowerLeftArm;
    private ModelRenderer ArmJacket1;
    private ModelRenderer ArmJacket2;
    private ModelRenderer ArmJacket3;
    private ModelRenderer ArmJacket4;
    private ModelRenderer Pink3;
    private ModelRenderer Pink2;
    private ModelRenderer Pink4;
    private ModelRenderer Pink1;
    private ModelRenderer LowerRightArm;
    private ModelRenderer ArmJacket1_1;
    private ModelRenderer ArmJacket2_1;
    private ModelRenderer ArmJacket3_1;
    private ModelRenderer ArmJacket4_1;
    private ModelRenderer Pink1_1;
    private ModelRenderer Pink3_1;
    private ModelRenderer Pink2_1;
    private ModelRenderer Pink4_1;
    private ModelRenderer LowerRightLeg;
    private ModelRenderer WhiteStrap3;
    private ModelRenderer WhiteStrap1;
    private ModelRenderer WhiteStrap4;
    private ModelRenderer WhiteStrap2;
    private ModelRenderer KunaiBag;
    private ModelRenderer KunaiBagStrap1;
    private ModelRenderer KunaiBagStrap3;
    private ModelRenderer KunaiBagStrap4;
    private ModelRenderer KunaiBagStrap2;
    private ModelRenderer Leg5;
    private ModelRenderer Leg6;
    private ModelRenderer Leg7;
    private ModelRenderer Leg8;
    private ModelRenderer WhiteStrap5;
    private ModelRenderer WhiteStrap7;
    private ModelRenderer WhiteStrap9;
    private ModelRenderer WhiteStrap11;
    private ModelRenderer Shoe1;
    private ModelRenderer Shoe2;
    private ModelRenderer Shoe3;
    private ModelRenderer Leg1;
    private ModelRenderer Leg3;
    private ModelRenderer Leg2;
    private ModelRenderer Leg4;
    private ModelRenderer Leg5_1;
    private ModelRenderer Leg6_1;
    private ModelRenderer Leg7_1;
    private ModelRenderer Leg8_1;
    private ModelRenderer WhiteStrip6;
    private ModelRenderer WhiteStrip8;
    private ModelRenderer WhiteStrip10;
    private ModelRenderer WhiteStrip12;
    private ModelRenderer LowerLeftLeg;
    private ModelRenderer Leg5_2;
    private ModelRenderer Leg6_2;
    private ModelRenderer Leg7_2;
    private ModelRenderer Leg8_2;
    private ModelRenderer WhiteStrap5_1;
    private ModelRenderer WhiteStrap11_1;
    private ModelRenderer WhiteStrap9_1;
    private ModelRenderer WhiteStrap11_2;
    private ModelRenderer Shoe1_1;
    private ModelRenderer Shoe3_1;
    private ModelRenderer Shoe2_1;
    private ModelRenderer Leg1_1;
    private ModelRenderer Leg3_1;
    private ModelRenderer Leg2_1;
    private ModelRenderer Leg4_1;
    private ModelRenderer Leg5_3;
    private ModelRenderer WhiteStrip6_1;
    private ModelRenderer WhiteStrip12_1;
    private ModelRenderer WhiteStrip10_1;
    private ModelRenderer Leg6_3;
    private ModelRenderer WhiteStrip12_2;
    private ModelRenderer Leg8_3;
    private ModelRenderer Leg7_3;

    public ModelSasukeKidArmour() {

        float expandValue = 0.005f;
        this.textureWidth = 150;
        this.textureHeight = 100;
        this.WhiteStrap2 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap2.addBox(-2.98F, 1.4F, -1.98F, 1, 2, 4, expandValue);
        this.UpperLeftArm = new ModelRenderer(this, 40, 16);
        this.UpperLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 6, 4, expandValue);
        this.Leg2 = new ModelRenderer(this, 0, 47);
        this.Leg2.setRotationPoint(0.0F, 0.0F, expandValue);
        this.Leg2.addBox(-7.98F, -3.7F, 1.02F, 4, 1, 1, expandValue);
        this.UchihaCrest11 = new ModelRenderer(this, 0, 70);
        this.UchihaCrest11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest11.addBox(2.65F, 4.44F, 1.1F, 1, 1, 1, expandValue);
        this.setRotateAngle(UchihaCrest11, 0.0F, 0.0F, 0.4363323129985824F);
        this.UpperRightArm = new ModelRenderer(this, 40, 16);
        this.UpperRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 6, 4, expandValue);
        this.UchihaCrest1 = new ModelRenderer(this, 0, 50);
        this.UchihaCrest1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest1.addBox(-0.87F, 2.71F, 1.1F, 1, 1, 1, expandValue);
        this.Pink4 = new ModelRenderer(this, 0, 57);
        this.Pink4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pink4.addBox(-6.11F, 1.15F, -2.05F, 1, 5, 4, expandValue);
        this.Pink1_1 = new ModelRenderer(this, 0, 56);
        this.Pink1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pink1_1.addBox(2.11F, 1.15F, -2.06F, 4, 5, 1, expandValue);
        this.UchihaCrest6 = new ModelRenderer(this, 0, 50);
        this.UchihaCrest6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest6.addBox(-2.69F, 3.6F, 1.1F, 2, 1, 1, expandValue);
        this.setRotateAngle(UchihaCrest6, 0.0F, 0.0F, -0.2617993877991494F);
        this.WhiteStrap11_2 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap11_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap11_2.addBox(-2.03F, 5.0F, -1.98F, 1, 1, 4, expandValue);
        this.Leg5_3 = new ModelRenderer(this, 0, 47);
        this.Leg5_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg5_3.addBox(-4.01F, -5.4F, -2.01F, 4, 1, 1, expandValue);
        this.WhiteStrap11 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap11.addBox(-2.97F, 5.0F, -2.02F, 1, 1, 4, expandValue);
        this.Leg7_1 = new ModelRenderer(this, 0, 47);
        this.Leg7_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg7_1.addBox(-7.99F, -5.4F, 1.01F, 4, 1, 1, expandValue);
        this.Leg4_1 = new ModelRenderer(this, 0, 43);
        this.Leg4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg4_1.addBox(-4.02F, -3.7F, -2.01F, 1, 1, 4, expandValue);
        this.UpperRightLeg = new ModelRenderer(this, 0, 16);
        this.UpperRightLeg.addBox(-6.0F, 0.0F, -2.0F, 4, 6, 4, expandValue);
        this.ArmJacket1_1 = new ModelRenderer(this, 100, 50);
        this.ArmJacket1_1.setRotationPoint(0.0F, 0.0F, expandValue);
        this.ArmJacket1_1.addBox(-3.03F, -2.0F, -2.04F, 4, 3, 1, expandValue);
        this.Leg5_1 = new ModelRenderer(this, 0, 47);
        this.Leg5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg5_1.addBox(-8.01F, -5.4F, -2.01F, 4, 1, 1, expandValue);
        this.WhiteStrap1 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap1.addBox(-6.02F, 1.4F, -2.01F, 1, 2, 4, expandValue);
        this.UchihaCrest5 = new ModelRenderer(this, 0, 50);
        this.UchihaCrest5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest5.addBox(0.63F, 3.36F, 1.1F, 1, 1, 1, expandValue);
        this.Jacket7 = new ModelRenderer(this, 70, 50);
        this.Jacket7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jacket7.addBox(3.02F, 6.01F, -2.0F, 1, 6, 4, expandValue);
        this.Pink1 = new ModelRenderer(this, 0, 56);
        this.Pink1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pink1.addBox(-5.91F, 1.15F, -2.06F, 4, 5, 1, expandValue);
        this.LowerBody = new ModelRenderer(this, 16, 28);
        this.LowerBody.addBox(-4.0F, 6.0F, -2.0F, 8, 6, 4, expandValue);
        this.UchihaCrest9 = new ModelRenderer(this, 0, 70);
        this.UchihaCrest9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest9.addBox(-0.5F, 5.15F, 1.1F, 1, 1, 1, expandValue);
        this.setRotateAngle(UchihaCrest9, 0.0F, 0.0F, -0.004537856055185257F);
        this.Leg3_1 = new ModelRenderer(this, 0, 43);
        this.Leg3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg3_1.addBox(-0.98F, -3.7F, -1.99F, 1, 1, 4, expandValue);
        this.Leg5 = new ModelRenderer(this, 0, 47);
        this.Leg5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg5.addBox(-6.01F, 4.5F, -2.02F, 4, 1, 1, expandValue);
        this.LowerRightArm = new ModelRenderer(this, 40, 28);
        this.LowerRightArm.addBox(2.0F, 2.0F, -2.0F, 4, 6, 4, expandValue);
        this.Leg7_3 = new ModelRenderer(this, 0, 47);
        this.Leg7_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg7_3.addBox(-3.99F, -5.4F, 1.01F, 4, 1, 1, expandValue);
        this.WhiteStrip8 = new ModelRenderer(this, 0, 80);
        this.WhiteStrip8.mirror = true;
        this.WhiteStrip8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrip8.addBox(-8.03F, -6.0F, -1.98F, 1, 1, 4, expandValue);
        this.Jacket4 = new ModelRenderer(this, 70, 20);
        this.Jacket4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jacket4.addBox(-4.02F, 0.01F, -2.0F, 1, 6, 4, expandValue);
        this.Leg4 = new ModelRenderer(this, 0, 43);
        this.Leg4.mirror = true;
        this.Leg4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg4.addBox(-4.98F, -3.7F, -2.01F, 1, 1, 4, expandValue);
        this.LowerLeftLeg = new ModelRenderer(this, 0, 28);
        this.LowerLeftLeg.addBox(-4.0F, -6.0F, -2.0F, 4, 6, 4, expandValue);
        this.UchihaCrest2 = new ModelRenderer(this, 0, 50);
        this.UchihaCrest2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest2.addBox(-3.41F, 1.52F, 1.1F, 1, 1, 1, expandValue);
        this.setRotateAngle(UchihaCrest2, 0.0F, 0.0F, -0.6981317007977318F);
        this.Leg6_3 = new ModelRenderer(this, 0, 43);
        this.Leg6_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg6_3.addBox(-4.01F, -5.4F, -1.99F, 1, 1, 4, expandValue);
        this.UchihaCrest4 = new ModelRenderer(this, 0, 50);
        this.UchihaCrest4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest4.addBox(-1.63F, 3.36F, 1.1F, 1, 1, 1, expandValue);
        this.Pink3 = new ModelRenderer(this, 0, 57);
        this.Pink3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pink3.addBox(-2.9F, 1.15F, -1.95F, 1, 5, 4, expandValue);
        this.Leg2_1 = new ModelRenderer(this, 0, 43);
        this.Leg2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg2_1.addBox(-3.99F, -3.7F, 1.02F, 4, 1, 1, expandValue);
        this.Jacket3 = new ModelRenderer(this, 70, 20);
        this.Jacket3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jacket3.addBox(3.02F, 0.01F, -2.0F, 1, 6, 4, expandValue);
        this.WhiteStrap7 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap7.addBox(-6.03F, 5.0F, -1.98F, 1, 1, 4, expandValue);
        this.WhiteStrip12_1 = new ModelRenderer(this, 0, 80);
        this.WhiteStrip12_1.mirror = true;
        this.WhiteStrip12_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrip12_1.addBox(-0.97F, -6.0F, -2.02F, 1, 1, 4, expandValue);
        this.WhiteStrap9 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap9.mirror = true;
        this.WhiteStrap9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap9.addBox(-5.98F, 5.0F, 1.03F, 4, 1, 1, expandValue);
        this.WhiteStrap11_1 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap11_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap11_1.addBox(1.03F, 5.0F, -2.02F, 1, 1, 4, expandValue);
        this.LowerLeftArm = new ModelRenderer(this, 40, 28);
        this.LowerLeftArm.addBox(-6.0F, 2.0F, -2.0F, 4, 6, 4, expandValue);
        this.UchihaCrest7 = new ModelRenderer(this, 0, 50);
        this.UchihaCrest7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest7.addBox(-1.0F, 2.85F, 1.1F, 2, 2, 1, expandValue);
        this.UpperLeftLeg = new ModelRenderer(this, 0, 16);
        this.UpperLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, expandValue);
        this.Leg8_2 = new ModelRenderer(this, 0, 43);
        this.Leg8_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg8_2.addBox(1.01F, 4.5F, -2.01F, 1, 1, 4, expandValue);
        this.ArmJacket3_1 = new ModelRenderer(this, 100, 50);
        this.ArmJacket3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmJacket3_1.addBox(-2.97F, -2.0F, 1.04F, 4, 3, 1, expandValue);
        this.Leg1_1 = new ModelRenderer(this, 0, 47);
        this.Leg1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg1_1.addBox(-4.01F, -3.7F, -2.02F, 4, 1, 1, expandValue);
        this.WhiteStrip10_1 = new ModelRenderer(this, 0, 80);
        this.WhiteStrip10_1.mirror = true;
        this.WhiteStrip10_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrip10_1.addBox(-3.98F, -6.0F, 1.03F, 4, 1, 1, expandValue);
        this.Leg3 = new ModelRenderer(this, 0, 43);
        this.Leg3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg3.addBox(-8.02F, -3.7F, -1.99F, 1, 1, 4, expandValue);
        this.Jacket5 = new ModelRenderer(this, 70, 35);
        this.Jacket5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jacket5.addBox(-4.0F, 0.01F, -2.06F, 8, 6, 1, expandValue);
        this.ArmJacket2 = new ModelRenderer(this, 100, 50);
        this.ArmJacket2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmJacket2.addBox(2.04F, -2.0F, -1.97F, 1, 3, 4, expandValue);
        this.KunaiBagStrap1 = new ModelRenderer(this, 20, 60);
        this.KunaiBagStrap1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KunaiBagStrap1.addBox(-6.1F, 1.8F, -2.1F, 1, 1, 4, expandValue);
        this.Leg6_2 = new ModelRenderer(this, 0, 43);
        this.Leg6_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg6_2.addBox(-2.01F, 4.5F, -2.01F, 1, 1, 4, expandValue);
        this.WhiteStrip10 = new ModelRenderer(this, 0, 80);
        this.WhiteStrip10.mirror = true;
        this.WhiteStrip10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrip10.addBox(-7.98F, -6.0F, 1.03F, 4, 1, 1, expandValue);
        this.Pink3_1 = new ModelRenderer(this, 0, 57);
        this.Pink3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pink3_1.addBox(1.9F, 1.15F, -2.05F, 1, 5, 4, expandValue);
        this.KunaiBagStrap4 = new ModelRenderer(this, 20, 60);
        this.KunaiBagStrap4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KunaiBagStrap4.addBox(-6.1F, 1.8F, 1.1F, 4, 1, 1, expandValue);
        this.LowerRightLeg = new ModelRenderer(this, 0, 28);
        this.LowerRightLeg.addBox(-8.0F, -6.0F, -2.0F, 4, 6, 4, expandValue);
        this.UchihaCrest10 = new ModelRenderer(this, 0, 70);
        this.UchihaCrest10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest10.addBox(-3.61F, 4.47F, 1.1F, 1, 1, 1, expandValue);
        this.setRotateAngle(UchihaCrest10, 0.0F, 0.0F, -0.4363323129985824F);
        this.Shoe2_1 = new ModelRenderer(this, 0, 43);
        this.Shoe2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoe2_1.addBox(-3.99F, -1.1F, -2.9F, 1, 2, 1, expandValue);
        this.setRotateAngle(Shoe2_1, -0.5235987755982988F, 0.0F, 0.0F);
        this.Jacket8 = new ModelRenderer(this, 70, 35);
        this.Jacket8.mirror = true;
        this.Jacket8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jacket8.addBox(-4.0F, 6.01F, -2.06F, 8, 6, 1, expandValue);
        this.ArmJacket2_1 = new ModelRenderer(this, 100, 50);
        this.ArmJacket2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmJacket2_1.addBox(-3.04F, -2.0F, -1.97F, 1, 3, 4, expandValue);
        this.Pink2 = new ModelRenderer(this, 0, 56);
        this.Pink2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pink2.addBox(-6.11F, 1.15F, 1.06F, 4, 5, 1, expandValue);
        this.Leg8_3 = new ModelRenderer(this, 0, 43);
        this.Leg8_3.mirror = true;
        this.Leg8_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg8_3.addBox(-0.98F, -5.4F, -2.01F, 1, 1, 4, expandValue);
        this.Shoe1 = new ModelRenderer(this, 0, 43);
        this.Shoe1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoe1.addBox(-8.0F, -1.0F, -3.0F, 4, 1, 1, expandValue);
        this.WhiteStrip12_2 = new ModelRenderer(this, 0, 80);
        this.WhiteStrip12_2.mirror = true;
        this.WhiteStrip12_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrip12_2.addBox(-4.03F, -6.0F, -1.98F, 1, 1, 4, expandValue);
        this.Leg7 = new ModelRenderer(this, 0, 47);
        this.Leg7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg7.addBox(-6.01F, 4.5F, 1.01F, 4, 1, 1, expandValue);
        this.Pink4_1 = new ModelRenderer(this, 0, 57);
        this.Pink4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pink4_1.addBox(5.12F, 1.15F, -1.95F, 1, 5, 4, expandValue);
        this.Leg6 = new ModelRenderer(this, 0, 43);
        this.Leg6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg6.addBox(-6.01F, 4.5F, -2.01F, 1, 1, 4, expandValue);
        this.Shoe2 = new ModelRenderer(this, 0, 43);
        this.Shoe2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoe2.addBox(-7.99F, -1.1F, -2.9F, 1, 2, 1, expandValue);
        this.setRotateAngle(Shoe2, -0.5235987755982988F, 0.0F, 0.0F);
        this.KunaiBagStrap3 = new ModelRenderer(this, 20, 60);
        this.KunaiBagStrap3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KunaiBagStrap3.addBox(-5.9F, 1.8F, -2.1F, 4, 1, 1, expandValue);
        this.Pink2_1 = new ModelRenderer(this, 0, 56);
        this.Pink2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pink2_1.addBox(1.91F, 1.15F, 1.06F, 4, 5, 1, expandValue);
        this.Jacket2 = new ModelRenderer(this, 70, 70);
        this.Jacket2.mirror = true;
        this.Jacket2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jacket2.addBox(-4.0F, 6.01F, 1.06F, 8, 6, 1, expandValue);
        this.ArmJacket3 = new ModelRenderer(this, 100, 50);
        this.ArmJacket3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmJacket3.addBox(-1.03F, -2.0F, 1.04F, 4, 3, 1, expandValue);
        this.KunaiBagStrap2 = new ModelRenderer(this, 20, 60);
        this.KunaiBagStrap2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KunaiBagStrap2.addBox(-2.9F, 1.8F, -1.9F, 1, 1, 4, expandValue);
        this.WhiteStrip6 = new ModelRenderer(this, 0, 80);
        this.WhiteStrip6.mirror = true;
        this.WhiteStrip6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrip6.addBox(-8.02F, -6.0F, -2.03F, 4, 1, 1, expandValue);
        this.Leg7_2 = new ModelRenderer(this, 0, 47);
        this.Leg7_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg7_2.addBox(-2.01F, 4.5F, 1.01F, 4, 1, 1, expandValue);
        this.WhiteStrap9_1 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap9_1.mirror = true;
        this.WhiteStrap9_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap9_1.addBox(-1.98F, 5.0F, 1.03F, 4, 1, 1, expandValue);
        this.UchihaCrest17 = new ModelRenderer(this, 0, 50);
        this.UchihaCrest17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest17.addBox(-0.13F, 2.71F, 1.1F, 1, 1, 1, expandValue);
        this.WhiteStrip12 = new ModelRenderer(this, 0, 80);
        this.WhiteStrip12.mirror = true;
        this.WhiteStrip12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrip12.addBox(-4.97F, -6.0F, -2.02F, 1, 1, 4, expandValue);
        this.ArmJacket4_1 = new ModelRenderer(this, 100, 50);
        this.ArmJacket4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmJacket4_1.addBox(0.04F, -2.0F, -2.03F, 1, 3, 4, expandValue);
        this.ArmJacket1 = new ModelRenderer(this, 100, 50);
        this.ArmJacket1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmJacket1.addBox(-0.97F, -2.0F, -2.04F, 4, 3, 1, expandValue);
        this.WhiteStrip6_1 = new ModelRenderer(this, 0, 80);
        this.WhiteStrip6_1.mirror = true;
        this.WhiteStrip6_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrip6_1.addBox(-4.02F, -6.0F, -2.03F, 4, 1, 1, expandValue);
        this.Shoe3 = new ModelRenderer(this, 0, 43);
        this.Shoe3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoe3.addBox(-5.01F, -1.1F, -2.9F, 1, 2, 1, expandValue);
        this.setRotateAngle(Shoe3, -0.5235987755982988F, 0.0F, 0.0F);
        this.UchihaCrest15 = new ModelRenderer(this, 0, 70);
        this.UchihaCrest15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest15.addBox(-3.88F, 4.88F, 1.1F, 1, 1, 1, expandValue);
        this.setRotateAngle(UchihaCrest15, 0.0F, 0.0F, -0.6108652381980153F);
        this.UchihaCrest3 = new ModelRenderer(this, 0, 50);
        this.UchihaCrest3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest3.addBox(2.41F, 1.52F, 1.1F, 1, 1, 1, expandValue);
        this.setRotateAngle(UchihaCrest3, 0.0F, 0.0F, 0.6981317007977318F);
        this.UchihaCrest16 = new ModelRenderer(this, 0, 70);
        this.UchihaCrest16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest16.addBox(-0.5F, 5.95F, 1.1F, 1, 2, 1, expandValue);
        this.WhiteStrap4 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap4.addBox(-6.01F, 1.4F, 1.02F, 4, 2, 1, expandValue);
        this.Jacket6 = new ModelRenderer(this, 70, 50);
        this.Jacket6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jacket6.addBox(-4.02F, 6.01F, -2.0F, 1, 6, 4, expandValue);
        this.Shoe1_1 = new ModelRenderer(this, 0, 43);
        this.Shoe1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoe1_1.addBox(-4.0F, -1.0F, -3.0F, 4, 1, 1, expandValue);
        this.WhiteStrap5 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap5.addBox(-6.02F, 5.0F, -2.03F, 4, 1, 1, expandValue);
        this.Jacket1 = new ModelRenderer(this, 70, 20);
        this.Jacket1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jacket1.addBox(-4.0F, 0.01F, 1.06F, 8, 6, 1, expandValue);
        this.Leg6_1 = new ModelRenderer(this, 0, 43);
        this.Leg6_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg6_1.addBox(-8.01F, -5.4F, -1.99F, 1, 1, 4, expandValue);
        this.Leg8 = new ModelRenderer(this, 0, 43);
        this.Leg8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg8.addBox(-2.99F, 4.5F, -2.01F, 1, 1, 4, expandValue);
        this.KunaiBag = new ModelRenderer(this, 20, 50);
        this.KunaiBag.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KunaiBag.addBox(-6.6F, 1.0F, -0.5F, 1, 3, 1, expandValue);
        this.ArmJacket4 = new ModelRenderer(this, 100, 50);
        this.ArmJacket4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmJacket4.addBox(-1.04F, -2.0F, -2.03F, 1, 3, 4, expandValue);
        this.Leg1 = new ModelRenderer(this, 0, 47);
        this.Leg1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg1.addBox(-8.01F, -3.7F, -2.02F, 4, 1, 1, expandValue);
        this.Shoe3_1 = new ModelRenderer(this, 0, 43);
        this.Shoe3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoe3_1.addBox(-1.01F, -1.1F, -2.9F, 1, 2, 1, expandValue);
        this.setRotateAngle(Shoe3_1, -0.5235987755982988F, 0.0F, 0.0F);
        this.UchihaCrest8 = new ModelRenderer(this, 0, 50);
        this.UchihaCrest8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest8.addBox(0.69F, 3.6F, 1.1F, 2, 1, 1, expandValue);
        this.setRotateAngle(UchihaCrest8, 0.0F, 0.0F, 0.2617993877991494F);
        this.UpperBody = new ModelRenderer(this, 16, 16);
        this.UpperBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UpperBody.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4, expandValue);
        this.WhiteStrap3 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap3.addBox(-5.98F, 1.4F, -2.02F, 4, 2, 1, expandValue);
        this.WhiteStrap5_1 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap5_1.addBox(-2.02F, 5.0F, -2.03F, 4, 1, 1, expandValue);
        this.Leg5_2 = new ModelRenderer(this, 0, 47);
        this.Leg5_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg5_2.addBox(-2.01F, 4.5F, -2.02F, 4, 1, 1, expandValue);
        this.UchihaCrest14 = new ModelRenderer(this, 0, 70);
        this.UchihaCrest14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UchihaCrest14.addBox(2.93F, 4.86F, 1.1F, 1, 1, 1, expandValue);
        this.setRotateAngle(UchihaCrest14, 0.0F, 0.0F, 0.6108652381980153F);
        this.Leg8_1 = new ModelRenderer(this, 0, 43);
        this.Leg8_1.mirror = true;
        this.Leg8_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg8_1.addBox(-4.98F, -5.4F, -2.01F, 1, 1, 4, expandValue);
        this.UpperRightLeg.addChild(this.WhiteStrap2);
        this.LowerRightLeg.addChild(this.Leg2);
        this.UpperBody.addChild(this.UchihaCrest11);
        this.UpperBody.addChild(this.UchihaCrest1);
        this.LowerLeftArm.addChild(this.Pink4);
        this.LowerRightArm.addChild(this.Pink1_1);
        this.UpperBody.addChild(this.UchihaCrest6);
        this.UpperLeftLeg.addChild(this.WhiteStrap11_2);
        this.LowerLeftLeg.addChild(this.Leg5_3);
        this.UpperRightLeg.addChild(this.WhiteStrap11);
        this.LowerRightLeg.addChild(this.Leg7_1);
        this.LowerLeftLeg.addChild(this.Leg4_1);
        this.UpperRightArm.addChild(this.ArmJacket1_1);
        this.LowerRightLeg.addChild(this.Leg5_1);
        this.UpperRightLeg.addChild(this.WhiteStrap1);
        this.UpperBody.addChild(this.UchihaCrest5);
        this.LowerBody.addChild(this.Jacket7);
        this.LowerLeftArm.addChild(this.Pink1);
        this.UpperBody.addChild(this.UchihaCrest9);
        this.LowerLeftLeg.addChild(this.Leg3_1);
        this.UpperRightLeg.addChild(this.Leg5);
        this.LowerLeftLeg.addChild(this.Leg7_3);
        this.LowerRightLeg.addChild(this.WhiteStrip8);
        this.UpperBody.addChild(this.Jacket4);
        this.LowerRightLeg.addChild(this.Leg4);
        this.UpperBody.addChild(this.UchihaCrest2);
        this.LowerLeftLeg.addChild(this.Leg6_3);
        this.UpperBody.addChild(this.UchihaCrest4);
        this.LowerLeftArm.addChild(this.Pink3);
        this.LowerLeftLeg.addChild(this.Leg2_1);
        this.UpperBody.addChild(this.Jacket3);
        this.UpperRightLeg.addChild(this.WhiteStrap7);
        this.LowerLeftLeg.addChild(this.WhiteStrip12_1);
        this.UpperRightLeg.addChild(this.WhiteStrap9);
        this.UpperLeftLeg.addChild(this.WhiteStrap11_1);
        this.UpperBody.addChild(this.UchihaCrest7);
        this.UpperLeftLeg.addChild(this.Leg8_2);
        this.UpperRightArm.addChild(this.ArmJacket3_1);
        this.LowerLeftLeg.addChild(this.Leg1_1);
        this.LowerLeftLeg.addChild(this.WhiteStrip10_1);
        this.LowerRightLeg.addChild(this.Leg3);
        this.UpperBody.addChild(this.Jacket5);
        this.UpperLeftArm.addChild(this.ArmJacket2);
        this.UpperRightLeg.addChild(this.KunaiBagStrap1);
        this.UpperLeftLeg.addChild(this.Leg6_2);
        this.LowerRightLeg.addChild(this.WhiteStrip10);
        this.LowerRightArm.addChild(this.Pink3_1);
        this.UpperRightLeg.addChild(this.KunaiBagStrap4);
        this.UpperBody.addChild(this.UchihaCrest10);
        this.LowerLeftLeg.addChild(this.Shoe2_1);
        this.LowerBody.addChild(this.Jacket8);
        this.UpperRightArm.addChild(this.ArmJacket2_1);
        this.LowerLeftArm.addChild(this.Pink2);
        this.LowerLeftLeg.addChild(this.Leg8_3);
        this.LowerRightLeg.addChild(this.Shoe1);
        this.LowerLeftLeg.addChild(this.WhiteStrip12_2);
        this.UpperRightLeg.addChild(this.Leg7);
        this.LowerRightArm.addChild(this.Pink4_1);
        this.UpperRightLeg.addChild(this.Leg6);
        this.LowerRightLeg.addChild(this.Shoe2);
        this.UpperRightLeg.addChild(this.KunaiBagStrap3);
        this.LowerRightArm.addChild(this.Pink2_1);
        this.LowerBody.addChild(this.Jacket2);
        this.UpperLeftArm.addChild(this.ArmJacket3);
        this.UpperRightLeg.addChild(this.KunaiBagStrap2);
        this.LowerRightLeg.addChild(this.WhiteStrip6);
        this.UpperLeftLeg.addChild(this.Leg7_2);
        this.UpperLeftLeg.addChild(this.WhiteStrap9_1);
        this.UpperBody.addChild(this.UchihaCrest17);
        this.LowerRightLeg.addChild(this.WhiteStrip12);
        this.UpperRightArm.addChild(this.ArmJacket4_1);
        this.UpperLeftArm.addChild(this.ArmJacket1);
        this.LowerLeftLeg.addChild(this.WhiteStrip6_1);
        this.LowerRightLeg.addChild(this.Shoe3);
        this.LowerBody.addChild(this.UchihaCrest15);
        this.UpperBody.addChild(this.UchihaCrest3);
        this.LowerBody.addChild(this.UchihaCrest16);
        this.UpperRightLeg.addChild(this.WhiteStrap4);
        this.LowerBody.addChild(this.Jacket6);
        this.LowerLeftLeg.addChild(this.Shoe1_1);
        this.UpperRightLeg.addChild(this.WhiteStrap5);
        this.UpperBody.addChild(this.Jacket1);
        this.LowerRightLeg.addChild(this.Leg6_1);
        this.UpperRightLeg.addChild(this.Leg8);
        this.UpperRightLeg.addChild(this.KunaiBag);
        this.UpperLeftArm.addChild(this.ArmJacket4);
        this.LowerRightLeg.addChild(this.Leg1);
        this.LowerLeftLeg.addChild(this.Shoe3_1);
        this.UpperBody.addChild(this.UchihaCrest8);
        this.UpperRightLeg.addChild(this.WhiteStrap3);
        this.UpperLeftLeg.addChild(this.WhiteStrap5_1);
        this.UpperLeftLeg.addChild(this.Leg5_2);
        this.LowerBody.addChild(this.UchihaCrest14);
        this.LowerRightLeg.addChild(this.Leg8_1);

        this.LowerBody.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.UpperLeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLeftArm.setRotationPoint(4.0F, -1.0F, 0.0F);
        this.UpperRightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerRightArm.setRotationPoint(-4.0F, -1.0F, 0.0F);

        this.UpperLeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLeftLeg.setRotationPoint(2.0F, 6.0F, 0.0F);
        this.UpperRightLeg.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.LowerRightLeg.setRotationPoint(6.0F, 6.0F, 0.0F);

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        this.renderTracked(this.UpperLeftArm, f5, this.bipedLeftArmUpper);
        this.renderTracked(this.LowerLeftArm, f5, this.bipedLeftArmUpper, this.bipedLeftArmLower);
        this.renderTracked(this.UpperRightArm, f5, this.bipedRightArmUpper);
        this.renderTracked(this.LowerRightArm, f5, this.bipedRightArmUpper, this.bipedRightArmLower);
        this.renderTracked(this.UpperLeftLeg, f5, this.bipedLeftLegUpper);
        this.renderTracked(this.LowerLeftLeg, f5, this.bipedLeftLegUpper, this.bipedLeftLegLower);
        this.renderTracked(this.UpperRightLeg, f5, this.bipedRightLegUpper);
        this.renderTracked(this.LowerRightLeg, f5, this.bipedRightLegUpper, this.bipedRightLegLower);
        this.renderTracked(this.UpperBody, f5, this.bipedBody);
        this.renderTracked(this.LowerBody, f5, this.bipedLowerBody);

    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderFirstPersonArm(float scale) {
        this.bipedRightArmUpper.rotateAngleX = this.bipedRightArmUpper.rotateAngleY = this.bipedRightArmUpper.rotateAngleZ = 0;
        this.bipedRightArmLower.rotateAngleX = this.bipedRightArmLower.rotateAngleY = this.bipedRightArmUpper.rotateAngleZ = 0;
        this.renderTracked(this.UpperRightArm, scale, this.bipedRightArmUpper);
        this.renderTracked(this.LowerRightArm, scale, this.bipedRightArmUpper, this.bipedRightArmLower);
    }
}
