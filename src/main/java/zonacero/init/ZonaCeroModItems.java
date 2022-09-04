
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package zonacero.init;

import zonacero.item.PalitoItem;
import zonacero.item.LogoItem;
import zonacero.item.ExteriorItem;

import zonacero.ZonaCeroMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class ZonaCeroModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ZonaCeroMod.MODID);
	public static final RegistryObject<Item> LOGO = REGISTRY.register("logo", () -> new LogoItem());
	public static final RegistryObject<Item> PALITO = REGISTRY.register("palito", () -> new PalitoItem());
	public static final RegistryObject<Item> PORTALFRAMEXTERIOR = block(ZonaCeroModBlocks.PORTALFRAMEXTERIOR, ZonaCeroModTabs.TAB_ZONA_CERO_TAB);
	public static final RegistryObject<Item> EXTERIOR = REGISTRY.register("exterior", () -> new ExteriorItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
