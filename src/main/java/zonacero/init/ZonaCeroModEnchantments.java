
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package zonacero.init;

import zonacero.enchantment.HaciaCuencaEnchantment;

import zonacero.ZonaCeroMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class ZonaCeroModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ZonaCeroMod.MODID);
	public static final RegistryObject<Enchantment> HACIA_CUENCA = REGISTRY.register("hacia_cuenca", () -> new HaciaCuencaEnchantment());
}
