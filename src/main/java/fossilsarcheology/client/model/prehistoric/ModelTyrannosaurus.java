package fossilsarcheology.client.model.prehistoric;

import fossilsarcheology.server.entity.EntityPrehistoric;
import fossilsarcheology.server.entity.mob.EntityTyrannosaurus;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTyrannosaurus extends ModelPrehistoric {
    public AdvancedModelRenderer lowerBody;
    public AdvancedModelRenderer rightThigh;
    public AdvancedModelRenderer leftThigh;
    public AdvancedModelRenderer tail1;
    public AdvancedModelRenderer upperBody;
    public AdvancedModelRenderer tail2;
    public AdvancedModelRenderer tail3;
    public AdvancedModelRenderer leftTailFeather;
    public AdvancedModelRenderer rightTailFeather;
    public AdvancedModelRenderer middleTailFrontFeather;
    public AdvancedModelRenderer middleTailBackFeather;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer leftUpperArm;
    public AdvancedModelRenderer rightUpperArm;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer headPivot;
    public AdvancedModelRenderer leftCrest;
    public AdvancedModelRenderer rightCrest;
    public AdvancedModelRenderer middleCrest;
    public AdvancedModelRenderer upperJaw;
    public AdvancedModelRenderer lowerJaw;
    public AdvancedModelRenderer teeth;
    public AdvancedModelRenderer leftLowerArm;
    public AdvancedModelRenderer rightLowerArm;
    public AdvancedModelRenderer rightLeg;
    public AdvancedModelRenderer rightFoot;
    public AdvancedModelRenderer leftLeg;
    public AdvancedModelRenderer leftFoot;
    private ModelAnimator animator;

    public ModelTyrannosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.middleCrest = new AdvancedModelRenderer(this, 10, 53);
        this.middleCrest.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.middleCrest.addBox(-0.5F, -2.0F, 0.0F, 1, 4, 6, 0.0F);
        ModelUtils.setRotateAngle(middleCrest, 0.16074482410867777F, -0.0F, 0.0F);
        this.tail1 = new AdvancedModelRenderer(this, 36, 47);
        this.tail1.setRotationPoint(0.0F, 0.2F, 11.0F);
        this.tail1.addBox(-3.0F, 0.0F, 0.0F, 6, 7, 10, 0.0F);
        this.leftTailFeather = new AdvancedModelRenderer(this, 10, 53);
        this.leftTailFeather.setRotationPoint(1.0F, 1.7F, 0.0F);
        this.leftTailFeather.addBox(-0.5F, -2.0F, 0.0F, 1, 4, 6, 0.0F);
        ModelUtils.setRotateAngle(leftTailFeather, 0.1038470904936626F, -0.0F, 0.0F);
        this.tail3 = new AdvancedModelRenderer(this, 103, 49);
        this.tail3.setRotationPoint(0.0F, 0.7F, 10.0F);
        this.tail3.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 8, 0.0F);
        ModelUtils.setRotateAngle(tail3, -0.14800392056911915F, -0.0F, 0.0F);
        this.rightCrest = new AdvancedModelRenderer(this, 10, 53);
        this.rightCrest.setRotationPoint(-2.5F, -0.8F, -0.5F);
        this.rightCrest.addBox(-0.5F, -2.0F, 0.0F, 1, 4, 6, 0.0F);
        ModelUtils.setRotateAngle(rightCrest, -0.07068583470577035F, -0.0F, 0.0F);
        this.leftThigh = new AdvancedModelRenderer(this, 2, 17);
        this.leftThigh.mirror = true;
        this.leftThigh.setRotationPoint(2.5F, 9.6F, 7.5F);
        this.leftThigh.addBox(0.0F, -1.0F, -3.0F, 4, 8, 6, 0.0F);
        this.tail2 = new AdvancedModelRenderer(this, 74, 48);
        this.tail2.setRotationPoint(0.0F, 0.6F, 9.0F);
        this.tail2.addBox(-2.0F, 0.0F, 0.0F, 4, 5, 10, 0.0F);
        ModelUtils.setRotateAngle(tail2, 0.03717551306747922F, -0.0F, 0.0F);
        this.leftLeg = new AdvancedModelRenderer(this, 98, 31);
        this.leftLeg.setRotationPoint(2.5F, 4.5F, 1.5F);
        this.leftLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 3, 0.0F);
        ModelUtils.setRotateAngle(leftLeg, -0.3270747018237373F, -0.0F, 0.0F);
        this.neck = new AdvancedModelRenderer(this, 52, 0);
        this.neck.setRotationPoint(0.0F, -0.1F, -7.5F);
        this.neck.addBox(-2.5F, -3.0F, -9.0F, 5, 7, 9, 0.0F);
        ModelUtils.setRotateAngle(neck, -0.5895722213236846F, -0.0F, 0.0F);
        this.middleTailFrontFeather = new AdvancedModelRenderer(this, 10, 53);
        this.middleTailFrontFeather.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.middleTailFrontFeather.addBox(-0.5F, -2.0F, 0.0F, 1, 4, 6, 0.0F);
        ModelUtils.setRotateAngle(middleTailFrontFeather, 0.3269001688985379F, -0.0F, 0.0F);
        this.leftUpperArm = new AdvancedModelRenderer(this, 35, 26);
        this.leftUpperArm.setRotationPoint(3.0F, 2.3F, -9.0F);
        this.leftUpperArm.addBox(0.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        ModelUtils.setRotateAngle(leftUpperArm, 0.2617993877991494F, -0.0F, 0.0F);
        this.leftFoot = new AdvancedModelRenderer(this, 3, 45);
        this.leftFoot.setRotationPoint(0.0F, 8.0F, 1.0F);
        this.leftFoot.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 5, 0.0F);
        ModelUtils.setRotateAngle(leftFoot, 0.33161255787892263F, -0.0F, 0.0F);
        this.rightLeg = new AdvancedModelRenderer(this, 98, 31);
        this.rightLeg.setRotationPoint(-2.5F, 4.5F, 1.5F);
        this.rightLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 3, 0.0F);
        ModelUtils.setRotateAngle(rightLeg, -0.3270747018237373F, -0.0F, 0.0F);
        this.rightTailFeather = new AdvancedModelRenderer(this, 10, 53);
        this.rightTailFeather.setRotationPoint(-1.0F, 1.7F, 0.0F);
        this.rightTailFeather.addBox(-0.5F, -2.0F, 0.0F, 1, 4, 6, 0.0F);
        ModelUtils.setRotateAngle(rightTailFeather, 0.1038470904936626F, -0.0F, 0.0F);
        this.rightUpperArm = new AdvancedModelRenderer(this, 35, 26);
        this.rightUpperArm.mirror = true;
        this.rightUpperArm.setRotationPoint(-3.0F, 2.3F, -9.0F);
        this.rightUpperArm.addBox(-2.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        ModelUtils.setRotateAngle(rightUpperArm, 0.2617993877991494F, -0.0F, 0.0F);
        this.leftLowerArm = new AdvancedModelRenderer(this, 34, 33);
        this.leftLowerArm.setRotationPoint(1.01F, 2.5F, -0.4F);
        this.leftLowerArm.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        ModelUtils.setRotateAngle(leftLowerArm, -0.5235987755982988F, -0.0F, 0.0F);
        this.lowerJaw = new AdvancedModelRenderer(this, 27, 12);
        this.lowerJaw.setRotationPoint(0.0F, 2.5F, -7.0F);
        this.lowerJaw.addBox(-2.0F, 0.0F, -6.0F, 4, 2, 6, 0.0F);
        ModelUtils.setRotateAngle(lowerJaw, 0.02199114857512855F, -0.0F, 0.0F);
        this.lowerBody = new AdvancedModelRenderer(this, 57, 20);
        this.lowerBody.setRotationPoint(0.0F, 4.6F, -1.0F);
        this.lowerBody.addBox(-4.0F, 0.0F, 0.0F, 8, 11, 12, 0.0F);
        ModelUtils.setRotateAngle(lowerBody, -0.03490658503988659F, -0.0F, 0.0F);
        this.rightThigh = new AdvancedModelRenderer(this, 2, 17);
        this.rightThigh.setRotationPoint(-2.5F, 9.6F, 7.5F);
        this.rightThigh.addBox(-4.0F, -1.0F, -3.0F, 4, 8, 6, 0.0F);
        this.rightFoot = new AdvancedModelRenderer(this, 3, 45);
        this.rightFoot.setRotationPoint(0.0F, 8.0F, 1.0F);
        this.rightFoot.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 5, 0.0F);
        ModelUtils.setRotateAngle(rightFoot, 0.33161255787892263F, -0.0F, 0.0F);
        this.leftCrest = new AdvancedModelRenderer(this, 10, 53);
        this.leftCrest.setRotationPoint(2.5F, -0.8F, -0.5F);
        this.leftCrest.addBox(-0.5F, -2.0F, 0.0F, 1, 4, 6, 0.0F);
        ModelUtils.setRotateAngle(leftCrest, -0.07068583470577035F, -0.0F, 0.0F);
        this.teeth = new AdvancedModelRenderer(this, 44, 18);
        this.teeth.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.teeth.addBox(-2.5F, 0.0F, -6.0F, 5, 1, 7, 0.0F);
        this.upperJaw = new AdvancedModelRenderer(this, 28, 0);
        this.upperJaw.setRotationPoint(0.0F, -0.5F, -6.7F);
        this.upperJaw.addBox(-2.5F, -2.0F, -7.0F, 5, 5, 7, 0.0F);
        ModelUtils.setRotateAngle(upperJaw, 0.03490658503988659F, -0.0F, 0.0F);
        this.headPivot = new AdvancedModelRenderer(this, 0, 0);
        this.headPivot.setRotationPoint(0.0F, -0.8F, -7.1F);
        this.headPivot.addBox(0F, 0F, 0F, 0, 0, 0, 0);
        ModelUtils.setRotateAngle(headPivot, 0.6457718232379019F, -0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0F, 0F);
        this.head.addBox(-3.5F, -3.0F, -7.0F, 7, 8, 7, 0.0F);
        ModelUtils.setRotateAngle(head, 0F, -0.0F, 0.0F);
        this.rightLowerArm = new AdvancedModelRenderer(this, 34, 33);
        this.rightLowerArm.mirror = true;
        this.rightLowerArm.setRotationPoint(-1.01F, 2.5F, -0.4F);
        this.rightLowerArm.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        ModelUtils.setRotateAngle(rightLowerArm, -0.5235987755982988F, -0.0F, 0.0F);
        this.upperBody = new AdvancedModelRenderer(this, 80, 0);
        this.upperBody.setRotationPoint(0.0F, 4.0F, 2.5F);
        this.upperBody.addBox(-3.0F, -4.0F, -10.0F, 6, 10, 10, 0.0F);
        ModelUtils.setRotateAngle(upperBody, 0.11309733552923257F, -0.0F, 0.0F);
        this.middleTailBackFeather = new AdvancedModelRenderer(this, 10, 53);
        this.middleTailBackFeather.setRotationPoint(0.0F, 1.5F, 5.0F);
        this.middleTailBackFeather.addBox(-0.5F, -2.0F, 0.0F, 1, 4, 6, 0.0F);
        ModelUtils.setRotateAngle(middleTailBackFeather, 0.1759291886010284F, -0.0F, 0.0F);
        this.head.addChild(this.middleCrest);
        this.lowerBody.addChild(this.tail1);
        this.tail3.addChild(this.leftTailFeather);
        this.tail2.addChild(this.tail3);
        this.head.addChild(this.rightCrest);
        this.tail1.addChild(this.tail2);
        this.leftThigh.addChild(this.leftLeg);
        this.upperBody.addChild(this.neck);
        this.tail3.addChild(this.middleTailFrontFeather);
        this.upperBody.addChild(this.leftUpperArm);
        this.leftLeg.addChild(this.leftFoot);
        this.rightThigh.addChild(this.rightLeg);
        this.tail3.addChild(this.rightTailFeather);
        this.upperBody.addChild(this.rightUpperArm);
        this.leftUpperArm.addChild(this.leftLowerArm);
        this.head.addChild(this.lowerJaw);
        this.rightLeg.addChild(this.rightFoot);
        this.head.addChild(this.leftCrest);
        this.upperJaw.addChild(this.teeth);
        this.head.addChild(this.upperJaw);
        this.headPivot.addChild(this.head);
        this.neck.addChild(this.headPivot);
        this.rightUpperArm.addChild(this.rightLowerArm);
        this.lowerBody.addChild(this.upperBody);
        this.tail3.addChild(this.middleTailBackFeather);
        this.updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.rightThigh.render(f5);
        this.lowerBody.render(f5);
        this.leftThigh.render(f5);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoric prehistoric = (EntityPrehistoric) entity;
        animator.update(entity);
        blockMovement(f, f1, f2, f3, f4, f5, (Entity) entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        animator.setAnimation(prehistoric.speakAnimation);
        animator.startKeyframe(10);
        ModelUtils.rotate(animator, neck, 15, 0, 0);
        ModelUtils.rotate(animator, head, -20, 0, 0);
        ModelUtils.rotate(animator, lowerJaw, 24, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(10);
        animator.setAnimation(prehistoric.attackAnimation);
        animator.startKeyframe(10);
        ModelUtils.rotate(animator, neck, -31, 0, 0);
        ModelUtils.rotate(animator, head, 37, 0, -20);
        ModelUtils.rotate(animator, lowerJaw, 25, 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        ModelUtils.rotate(animator, neck, 6, 0, 0);
        ModelUtils.rotate(animator, head, -14, 0, 20);
        ModelUtils.rotate(animator, lowerJaw, 25, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(10);
        animator.setAnimation(EntityTyrannosaurus.ROAR_ANIMATION);
        animator.startKeyframe(20);
        ModelUtils.rotate(animator, lowerBody, -5.22, 0, 0);
        ModelUtils.rotate(animator, neck, -41, 0, 0);
        ModelUtils.rotate(animator, rightThigh, -15, 0, 0);
        ModelUtils.rotate(animator, rightLeg, -31.3, 0, 0);
        ModelUtils.rotate(animator, rightFoot, 46, 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(20);
        ModelUtils.rotate(animator, lowerBody, -13.04, 0, 0);
        animator.move(rightThigh, 0F, 1.4F, -1F);
        ModelUtils.rotate(animator, lowerJaw, 39.13, 0, 0);
        EntityTyrannosaurus mob = ((EntityTyrannosaurus) animator.getEntity());
        if (mob.getAnimation() == EntityTyrannosaurus.ROAR_ANIMATION && mob.getAnimationTick() >= 20 && mob.getAnimationTick() <= 60) {
            this.flap(head, 0.4F, 0.1F, false, 0, 0, ((Entity) entity).ticksExisted, 1);
            this.flap(neck, 0.4F, 0.1F, false, 0, 0, ((Entity) entity).ticksExisted, 1);
        }
        ModelUtils.rotate(animator, tail1, -13.04, 0, 0);
        ModelUtils.rotate(animator, tail2, 7.83, 0, 0);
        ModelUtils.rotate(animator, tail3, -2.61, 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(20);
        ModelUtils.rotateToInit(animator, lowerBody);
        ModelUtils.rotateToInit(animator, tail1);
        ModelUtils.rotateToInit(animator, tail2);
        ModelUtils.rotateToInit(animator, tail3);
        ModelUtils.rotateToInit(animator, neck);
        ModelUtils.rotateToInit(animator, head);
        animator.endKeyframe();
        animator.resetKeyframe(20);
        if (((EntityPrehistoric) entity).isSkeleton()) {
            return;
        }
        if (mob.getAnimation() == EntityTyrannosaurus.NO_ANIMATION && !mob.isActuallyWeak()) {
            ModelUtils.faceTargetMod(neck, f3, f4, 0.5F);
            ModelUtils.faceTargetMod(head, f3, f4, 0.5F);

        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        AdvancedModelRenderer[] tailParts = { this.tail1, this.tail2, this.tail3 };
        AdvancedModelRenderer[] neckParts = { this.neck, this.head };
        AdvancedModelRenderer[] leftArmParts = { this.leftUpperArm, this.leftLowerArm };
        AdvancedModelRenderer[] rightArmParts = { this.rightUpperArm, this.rightLowerArm };
        if (((EntityPrehistoric) entity).isSkeleton()) {
            return;
        }
        float speed = 0.4F;
        float speed2 = 0.1F;
        float degree = 1F;
        {
            float sitProgress = ((EntityPrehistoric) (entity)).sitProgress;
            sitAnimationRotation(neck, sitProgress, -((float) Math.toRadians(15D)), 0, 0);
            sitAnimationRotation(leftLowerArm, sitProgress, -((float) Math.toRadians(30.0D)), 0, 0);
            sitAnimationRotation(lowerBody, sitProgress, -((float) Math.toRadians(13.04D)), 0, 0);
            sitAnimationRotation(leftCrest, sitProgress, -((float) Math.toRadians(4.05D)), 0, 0);
            sitAnimationRotation(rightLowerArm, sitProgress, -((float) Math.toRadians(30.0D)), 0, 0);
            sitAnimationRotation(middleTailBackFeather, sitProgress, (float) Math.toRadians(10.08D), 0, 0);
            sitAnimationRotation(tail1, sitProgress, -((float) Math.toRadians(10.43D)), 0, 0);
            sitAnimationRotation(tail3, sitProgress, -((float) Math.toRadians(2.61D)), 0, 0);
            sitAnimationRotation(lowerJaw, sitProgress, (float) Math.toRadians(1.26D), 0, 0);
            sitAnimationRotation(leftTailFeather, sitProgress, (float) Math.toRadians(5.95D), 0, 0);
            sitAnimationRotation(rightLeg, sitProgress, -((float) Math.toRadians(40.0D)), 0, 0);
            sitAnimationRotation(upperBody, sitProgress, (float) Math.toRadians(6.48D), 0, 0);
            sitAnimationRotation(rightCrest, sitProgress, -((float) Math.toRadians(4.05D)), 0, 0);
            sitAnimationRotation(rightThigh, sitProgress, -((float) Math.toRadians(50.0D)), 0, 0);
            sitAnimationRotation(leftLeg, sitProgress, -((float) Math.toRadians(40.0D)), 0, 0);
            sitAnimationRotation(leftFoot, sitProgress, (float) Math.toRadians(90.0D), 0, 0);
            sitAnimationRotation(middleCrest, sitProgress, (float) Math.toRadians(9.21D), 0, 0);
            sitAnimationRotation(head, sitProgress, (float) Math.toRadians(17D), 0, 0);
            sitAnimationRotation(middleTailFrontFeather, sitProgress, (float) Math.toRadians(18.73D), 0, 0);
            sitAnimationRotation(tail2, sitProgress, (float) Math.toRadians(13.04D), 0, 0);
            sitAnimationRotation(rightTailFeather, sitProgress, (float) Math.toRadians(5.95D), 0, 0);
            sitAnimationRotation(rightFoot, sitProgress, (float) Math.toRadians(90.0D), 0, 0);
            sitAnimationRotation(leftThigh, sitProgress, -((float) Math.toRadians(50.0D)), 0, 0);
            sitAnimationRotation(upperJaw, sitProgress, (float) Math.toRadians(2.0D), 0, 0);
            sitAnimationPos(rightThigh, sitProgress, 0F, 16.90F - ModelUtils.getDefaultPositionY(rightThigh), 0F);
            sitAnimationPos(lowerBody, sitProgress, 0F, 10.80F - ModelUtils.getDefaultPositionY(lowerBody), 0F);
            sitAnimationPos(leftThigh, sitProgress, 0F, 16.90F - ModelUtils.getDefaultPositionY(leftThigh), 0F);
        }
        {
            float sitProgress = ((EntityPrehistoric) (entity)).sleepProgress;

            sitAnimationRotation(leftLeg, sitProgress, -((float) Math.toRadians(40.0D)), 0, 0);
            sitAnimationRotation(leftUpperArm, sitProgress, (float) Math.toRadians(54.0D), 0, 0);
            sitAnimationRotation(leftLowerArm, sitProgress, -((float) Math.toRadians(30.0D)), 0, 0);
            sitAnimationRotation(middleCrest, sitProgress, (float) Math.toRadians(9.21D), 0, 0);
            sitAnimationRotation(middleTailBackFeather, sitProgress, (float) Math.toRadians(10.08D), 0, 0);
            sitAnimationRotation(rightLowerArm, sitProgress, -((float) Math.toRadians(30.0D)), 0, 0);
            sitAnimationRotation(rightLeg, sitProgress, -((float) Math.toRadians(40.0D)), 0, 0);
            sitAnimationRotation(head, sitProgress, -((float) Math.toRadians(75D)), -((float) Math.toRadians(10.43D)), (float) Math.toRadians(7.83D));
            sitAnimationRotation(rightThigh, sitProgress, -((float) Math.toRadians(50.0D)), 0, 0);
            sitAnimationRotation(middleTailFrontFeather, sitProgress, (float) Math.toRadians(18.73D), 0, 0);
            sitAnimationRotation(upperBody, sitProgress, (float) Math.toRadians(6.48D), -((float) Math.toRadians(7.83D)), 0);
            sitAnimationRotation(tail3, sitProgress, (float) Math.toRadians(7.83D), (float) Math.toRadians(10.43D), (float) Math.toRadians(7.83D));
            sitAnimationRotation(lowerJaw, sitProgress, (float) Math.toRadians(1.26D), 0, 0);
            sitAnimationRotation(rightCrest, sitProgress, -((float) Math.toRadians(4.05D)), 0, 0);
            sitAnimationRotation(leftCrest, sitProgress, -((float) Math.toRadians(4.05D)), 0, 0);
            sitAnimationRotation(tail1, sitProgress, -((float) Math.toRadians(10.43D)), (float) Math.toRadians(7.83D), 0);
            sitAnimationRotation(tail2, sitProgress, -((float) Math.toRadians(7.83D)), (float) Math.toRadians(13.04D), 0);
            sitAnimationRotation(leftFoot, sitProgress, (float) Math.toRadians(90.0D), 0, 0);
            sitAnimationRotation(rightUpperArm, sitProgress, (float) Math.toRadians(54.0D), 0, 0);
            sitAnimationRotation(lowerBody, sitProgress, -((float) Math.toRadians(2.0D)), 0, 0);
            sitAnimationRotation(leftThigh, sitProgress, -((float) Math.toRadians(50.0D)), 0, 0);
            sitAnimationRotation(rightFoot, sitProgress, (float) Math.toRadians(90.0D), 0, 0);
            sitAnimationRotation(leftTailFeather, sitProgress, (float) Math.toRadians(5.95D), 0, 0);
            sitAnimationRotation(rightTailFeather, sitProgress, (float) Math.toRadians(5.95D), 0, 0);
            sitAnimationRotation(neck, sitProgress, (float) Math.toRadians(55D), 0, 0);
            sitAnimationRotation(upperJaw, sitProgress, (float) Math.toRadians(2.0D), 0, 0);
            sitAnimationPos(rightThigh, sitProgress, 0F, 16.90F - ModelUtils.getDefaultPositionY(rightThigh), 0F);
            sitAnimationPos(lowerBody, sitProgress, 0F, 10.80F - ModelUtils.getDefaultPositionY(lowerBody), 0F);
            sitAnimationPos(leftThigh, sitProgress, 0F, 16.90F - ModelUtils.getDefaultPositionY(leftThigh), 0F);
        }
        {
            float sitProgress = ((EntityPrehistoric) (entity)).weakProgress;
            sitAnimationRotationPrev(tail2, sitProgress, -((float) Math.toRadians(7.83D)), -((float) Math.toRadians(15.65D)), 0);
            sitAnimationRotationPrev(middleTailBackFeather, sitProgress, (float) Math.toRadians(10.08D), 0, 0);
            sitAnimationRotationPrev(neck, sitProgress, -(float) Math.toRadians(7D), 0, 0);
            sitAnimationRotationPrev(rightUpperArm, sitProgress, (float) Math.toRadians(54.0D), 0, 0);
            sitAnimationRotationPrev(lowerBody, sitProgress, -((float) Math.toRadians(2.0D)), 0, 0);
            sitAnimationRotationPrev(leftFoot, sitProgress, (float) Math.toRadians(90.0D), 0, 0);
            sitAnimationRotationPrev(rightCrest, sitProgress, -((float) Math.toRadians(4.05D)), 0, 0);
            sitAnimationRotationPrev(rightFoot, sitProgress, (float) Math.toRadians(90.0D), 0, 0);
            sitAnimationRotationPrev(middleTailFrontFeather, sitProgress, (float) Math.toRadians(18.73D), 0, 0);
            sitAnimationRotationPrev(tail1, sitProgress, -((float) Math.toRadians(10.43D)), (float) Math.toRadians(7.83D), 0);
            sitAnimationRotationPrev(leftCrest, sitProgress, -((float) Math.toRadians(4.05D)), 0, 0);
            sitAnimationRotationPrev(rightLowerArm, sitProgress, -((float) Math.toRadians(30.0D)), 0, 0);
            sitAnimationRotationPrev(rightLeg, sitProgress, -((float) Math.toRadians(40.0D)), 0, 0);
            sitAnimationRotationPrev(leftUpperArm, sitProgress, (float) Math.toRadians(54.0D), 0, 0);
            sitAnimationRotationPrev(upperBody, sitProgress, (float) Math.toRadians(6.48D), -((float) Math.toRadians(7.83D)), 0);
            sitAnimationRotationPrev(leftTailFeather, sitProgress, (float) Math.toRadians(5.95D), 0, 0);
            sitAnimationRotationPrev(leftLowerArm, sitProgress, -((float) Math.toRadians(30.0D)), 0, 0);
            sitAnimationRotationPrev(lowerJaw, sitProgress, (float) Math.toRadians(26.09D), 0, 0);
            sitAnimationRotationPrev(leftLeg, sitProgress, -((float) Math.toRadians(40.0D)), 0, 0);
            sitAnimationRotationPrev(rightThigh, sitProgress, -((float) Math.toRadians(20.87D)), -((float) Math.toRadians(7.83D)), (float) Math.toRadians(54.78D));
            sitAnimationRotationPrev(leftThigh, sitProgress, -((float) Math.toRadians(15.65D)), -((float) Math.toRadians(20.87D)), -((float) Math.toRadians(44.35D)));
            sitAnimationRotationPrev(upperJaw, sitProgress, (float) Math.toRadians(2.0D), 0, 0);
            sitAnimationRotationPrev(head, sitProgress, -((float) Math.toRadians(6.26D)), -((float) Math.toRadians(13.04D)), -((float) Math.toRadians(31.3D)));
            sitAnimationRotationPrev(rightTailFeather, sitProgress, (float) Math.toRadians(5.95D), 0, 0);
            sitAnimationRotationPrev(middleCrest, sitProgress, (float) Math.toRadians(9.21D), 0, 0);
            sitAnimationRotationPrev(tail3, sitProgress, (float) Math.toRadians(7.83D), (float) Math.toRadians(10.43D), (float) Math.toRadians(7.83D));
            sitAnimationPos(rightThigh, sitProgress, 0F, 16.90F - ModelUtils.getDefaultPositionY(rightThigh), 0F);
            sitAnimationPos(lowerBody, sitProgress, 0F, 12.80F - ModelUtils.getDefaultPositionY(lowerBody), 0F);
            sitAnimationPos(leftThigh, sitProgress, 0F, 16.90F - ModelUtils.getDefaultPositionY(leftThigh), 0F);
        }
        this.bob(lowerBody, speed2 * 0.5F, degree * 0.4F, false, entity.ticksExisted, 1);
        this.walk(upperBody, speed2 * 0.5F, degree * 0.05F, false, 1F, 0F, entity.ticksExisted, 1);
        this.walk(lowerBody, speed, degree * 0.05F, true, 0F, 0F, f, f1);
        this.walk(leftThigh, speed2, 0.6F, false, 0F, 0.4F, f, f1);
        this.walk(leftLeg, speed2, 0.2F, false, 0F, -0.6F, f, f1);
        this.walk(leftFoot, speed2, -0.6F, true, 2.5F, -0.4F, f, f1);
        this.walk(rightThigh, speed2, 0.6F, true, 0F, -0.4F, f, f1);
        this.walk(rightLeg, speed2, 0.2F, true, 0F, 0.6F, f, f1);
        this.walk(rightFoot, speed2, -0.6F, false, 2.5F, 0.4F, f, f1);
        this.chainWave(tailParts, speed2, degree * 0.05F, -3, entity.ticksExisted, 1);
        this.chainWave(leftArmParts, speed2, degree * 0.05F, -3, entity.ticksExisted, 1);
        this.chainWave(rightArmParts, speed2, degree * 0.05F, -3, entity.ticksExisted, 1);
        this.chainSwing(tailParts, speed2, degree * 0.15F, -3, entity.ticksExisted, 1);
        this.chainWave(neckParts, speed2, degree * 0.05F, -3, entity.ticksExisted, 1);
        this.chainWave(neckParts, speed, degree * 0.05F, 3, f, f1);
        this.chainWave(tailParts, speed2, degree * 0.15F, -3, f, f1);
        ((EntityPrehistoric) entity).chainBuffer.applyChainSwingBuffer((ModelRenderer[]) tailParts);
    }
}
