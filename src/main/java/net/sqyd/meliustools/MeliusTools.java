package net.sqyd.meliustools;

import net.fabricmc.api.ModInitializer;
import net.sqyd.meliustools.tools.ModTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeliusTools implements ModInitializer {
	public static final String MOD_ID = "meliustools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModTools.registerModTools();
		ModTools.registerToVanillaItemGroups();
	}
}