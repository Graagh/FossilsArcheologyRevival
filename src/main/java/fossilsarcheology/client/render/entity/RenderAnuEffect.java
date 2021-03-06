package fossilsarcheology.client.render.entity;

import fossilsarcheology.client.model.ModelAnuTotem;
import fossilsarcheology.client.render.entity.layer.LayerAnuEffect;
import fossilsarcheology.server.entity.utility.EntityAnuEffect;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderAnuEffect extends RenderLiving {
    private static final ResourceLocation explodingTexture = new ResourceLocation("fossil:textures/blocks/anuTotemExploding.png");
    private static final ResourceLocation texture = new ResourceLocation("fossil:textures/blocks/anuTotem.png");
    protected ModelAnuTotem modelAnuTotem;

    public RenderAnuEffect(RenderManager render) {
        super(render, new ModelAnuTotem(), 0.3F);
        this.modelAnuTotem = (ModelAnuTotem) this.mainModel;
        this.addLayer(new LayerAnuEffect());
    }

    protected void rotateCorpse(EntityAnuEffect entity, float x, float y, float z) {
        float f3 = 0;
        float f4 = 0;
        GL11.glRotatef(-f3, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(f4 * 10.0F, 1.0F, 0.0F, 0.0F);
        GL11.glTranslatef(0.0F, 0.0F, 1.0F);

        if (entity.deathTime > 0) {
            float f5 = ((float) entity.deathTime + z - 1.0F) / 20.0F * 1.6F;
            f5 = MathHelper.sqrt(f5);

            if (f5 > 1.0F) {
                f5 = 1.0F;
            }

            GL11.glRotatef(f5 * this.getDeathMaxRotation(entity), 0.0F, 0.0F, 1.0F);
        }
    }

    /**
     * Renders the model in RenderLiving
     */
    protected void renderModel(EntityAnuEffect entity, float x, float y, float z, float i, float j, float u) {
        int i1 = 0;
        if (entity.world != null) {
            i1 = entity.getAnuRotation();
        }
        short short1 = 0;
        if (i1 == 2) {
            GL11.glTranslatef(0, 0, -1);
            short1 = 360;
        }

        if (i1 == 3) {
            GL11.glTranslatef(0, 0, -1);
            short1 = 180;
        }

        if (i1 == 4) {
            GL11.glTranslatef(0, 0, -1);
            short1 = 90;
        }

        if (i1 == 5) {
            GL11.glTranslatef(0, 0, -1);
            short1 = -90;
        }

        GL11.glRotatef(-1 * short1, 0.0F, 1.0F, 0.0F);

        GL11.glPushMatrix();
        if (entity.deathTicks > 0) {
            float f6 = (float) entity.deathTicks / 200.0F;
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            GL11.glAlphaFunc(GL11.GL_GREATER, f6);
            this.bindTexture(explodingTexture);
            this.mainModel.render(entity, x, y, z, i, j, u);
            GL11.glAlphaFunc(GL11.GL_GREATER, 0.1F);
            GL11.glDepthFunc(GL11.GL_EQUAL);
        }
        GL11.glPopMatrix();

        this.bindEntityTexture(entity);
        this.mainModel.render(entity, x, y, z, i, j, u);

        if (entity.hurtTime > 0) {
            GL11.glDepthFunc(GL11.GL_EQUAL);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.5F);
            GL11.glTranslatef(0, 0, 1);
            this.mainModel.render(entity, x, y, z, i, j, u);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glPopMatrix();

        }
    }

    protected ResourceLocation getEntityTexture(EntityAnuEffect entity) {
        return texture;
    }

    protected int shouldRenderPass(EntityAnuEffect entity, int x, float i) {
        if (x == 1) {
            GL11.glDepthFunc(GL11.GL_LEQUAL);
        }

        if (x != 0) {
            return -1;
        } else {
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDepthFunc(GL11.GL_EQUAL);
            char c0 = 61680;
            int j = c0 % 65536;
            int k = c0 / 65536;
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j / 1.0F, (float) k / 1.0F);
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            return 1;
        }
    }

    @Override
    protected void renderModel(EntityLivingBase entity, float x, float y, float z, float i, float j, float u) {
        this.renderModel((EntityAnuEffect) entity, x, y, z, i, j, u);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return this.getEntityTexture((EntityAnuEffect) entity);
    }

    @Override
    public void doRender(Entity entity, double x, double y, double z, float i, float j) {
        this.doRender((EntityAnuEffect) entity, x, y, z, i, j);
    }
}