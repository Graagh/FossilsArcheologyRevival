package fossilsarcheology.server;

import fossilsarcheology.Revival;
import fossilsarcheology.client.sound.FASoundRegistry;
import fossilsarcheology.server.achievement.FossilAchievements;
import fossilsarcheology.server.block.FABlockRegistry;
import fossilsarcheology.server.block.FAFluidRegistry;
import fossilsarcheology.server.block.entity.*;
import fossilsarcheology.server.container.*;
import fossilsarcheology.server.entity.EntityFishBase;
import fossilsarcheology.server.entity.FAEntityRegistry;
import fossilsarcheology.server.entity.prehistoric.EntityPrehistoric;
import fossilsarcheology.server.entity.prehistoric.PrehistoricEntityType;
import fossilsarcheology.server.event.FossilAchivementEvents;
import fossilsarcheology.server.item.FAItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ServerProxy implements IGuiHandler {
    public static final int GUI_ANALYZER = 0;
    public static final int GUI_CULTIVATE = 1;
    public static final int GUI_FEEDER = 2;
    public static final int GUI_WORKTABLE = 3;
    public static final int GUI_SIFTER = 4;
    public static final int GUI_TIME_MACHINE = 5;

    public void onPreInit() {
        NetworkRegistry.INSTANCE.registerGuiHandler(Revival.INSTANCE, this);

        FASoundRegistry.register();
        FAFluidRegistry.register();
        FABlockRegistry.register();
        FAItemRegistry.register();

        FAEntityRegistry.register();

        PrehistoricEntityType.register();

        FossilAchievements.register();
    }

    public void onInit() {
        MinecraftForge.EVENT_BUS.register(new FossilAchivementEvents());
    }

    public void calculateChainBuffer(EntityFishBase entity) {

    }

    public void calculateChainBuffer(EntityPrehistoric entity) {

    }

    public void onPostInit() {

    }

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        if (id == GUI_ANALYZER) {
            return new AnalyzerContainer(player.inventory, (AnalyzerBlockEntity) world.getTileEntity(pos));
        }
        if (id == GUI_CULTIVATE) {
            return new CultivateContainer(player.inventory, (TileEntityCultivate) world.getTileEntity(pos));
        }
        if (id == GUI_FEEDER) {
            return new FeederContainer(player.inventory, (TileEntityFeeder) world.getTileEntity(pos));
        }
        if (id == GUI_WORKTABLE) {
            return new WorktableContainer(player.inventory, (TileEntityWorktable) world.getTileEntity(pos));
        }
        if (id == GUI_SIFTER) {
            return new SifterContainer(player.inventory, (TileEntitySifter) world.getTileEntity(pos));
        }
        if (id == GUI_TIME_MACHINE) {
            return new TimeMachineContainer(player.inventory, (TileEntityTimeMachine) world.getTileEntity(pos));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    public void spawnPacketItemParticles(World worldObj, float f, float f1, float f2, double motionX, double motionY, double motionZ, Item item) {

    }

    public void spawnPacketBlockParticles(World worldObj, float f, float f1, float f2, double motionX, double motionY, double motionZ, Block block) {
    }

    public void spawnPacketHeartParticles(World worldObj, float f, float f1, float f2, double motionX, double motionY, double motionZ) {
    }

    public void spawnBubbleParticles(World world, float f, float f1, float f2, double motionX, double motionY, double motionZ) {
    }

    public void spawnAnuParticle(World world, double posX, double posY, double posZ) {
    }

    public void playSound(SoundEvent sound) {
    }

    public void stopSound(SoundEvent sound) {
    }

    public net.minecraft.client.model.ModelBiped getArmorModel(int id) {
        return null;
    }
}
