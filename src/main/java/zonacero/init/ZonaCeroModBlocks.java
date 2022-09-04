
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package zonacero.init;

import zonacero.block.PortalframexteriorBlock;
import zonacero.block.ExteriorPortalBlock;

import zonacero.ZonaCeroMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class ZonaCeroModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ZonaCeroMod.MODID);
	public static final RegistryObject<Block> PORTALFRAMEXTERIOR = REGISTRY.register("portalframexterior", () -> new PortalframexteriorBlock());
	public static final RegistryObject<Block> EXTERIOR_PORTAL = REGISTRY.register("exterior_portal", () -> new ExteriorPortalBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PortalframexteriorBlock.registerRenderLayer();
		}
	}
}
