
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package zonacero.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ZonaCeroModTabs {
	public static CreativeModeTab TAB_ZONA_CERO_TAB;

	public static void load() {
		TAB_ZONA_CERO_TAB = new CreativeModeTab("tabzona_cero_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ZonaCeroModItems.LOGO.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
