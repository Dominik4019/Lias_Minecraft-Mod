package lias.minecraft.mod.betterfood;

import lias.minecraft.mod.betterfood.proxies.betterfoodCommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "betterfood", name = "Better food", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class betterfood {
	
	@Instance("lias")
	public static betterfood instance;
	
	@SidedProxy(clientSide="lias.minecraft.mod.betterfood.proxies.betterfoodClientProxy", serverSide="lias.minecraft.mod.betterfood.proxies.betterfoodCommonProxy")
	public static betterfoodCommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
	}

	@Init
	public void init(FMLInitializationEvent event) {
		
	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}