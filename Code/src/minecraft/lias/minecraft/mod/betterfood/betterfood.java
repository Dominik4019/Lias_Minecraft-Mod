package lias.minecraft.mod.betterfood;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "betterfood", name = "Better food", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class betterfood {
	
	@Instance("lias")
	public static betterfood instance;
	
	@SidedProxy(clientSide="lias.minecraft.mod.betterfood.proxies.betterfoodClientProxy", serverSide="lias.minecraft.mod.betterfood.proxies.betterfoodCommonProxy")
	public static betterfoodCommonProxy proxy;
	
	//-------------------------------------------------------------------------------------------------
	
	public static Item testitem;
	public int testItemID = 15000;
	
	//-------------------------------------------------------------------------------------------------
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
	}

	@Init
	public void init(FMLInitializationEvent event) {
		
		testitem = new itembeispielitem(testItemID).setCreativeTab(CreativeTabs.tabMaterials).setMaxStackSize(32);
		
		registerItems();
		initCraftingRecipes();
		updateLanguage();
	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	
	//-------------------------------------------------------------------------------------------------
	//									Eigene Methoden
	//-------------------------------------------------------------------------------------------------
	
	// Crafting Rezepte 
	
	public void initCraftingRecipes() {
		
		//abk�rzen von Bl�cken oder Items
		ItemStack Testname = new ItemStack(Block.planks);
		
		//Beispiel dazu ohne anordnung in der Workbench	
		GameRegistry.addShapelessRecipe(new ItemStack(Block.dirt, 32), Testname);
		
		//Beispiel mit anordnung in der Workbench
		GameRegistry.addRecipe(new ItemStack(Item.pickaxeIron, 16), "X#X", "X#X", "X#X", '#', Testname);
		
		
		//Beispiel ohne anordnung in der Workbench						
		GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond, 64), new ItemStack(Block.dirt));
		
		//Beispiel ohne anordnung in der Workbench mit mehreren Bl�cken
		GameRegistry.addShapelessRecipe(new ItemStack(Block.wood, 64), new ItemStack(Block.dirt), new ItemStack(Block.sand));
		
		//Beispiel mit anordnung in der Workbench
		GameRegistry.addRecipe(new ItemStack(Item.appleRed, 16), "X#X", "X#X", "X#X", '#', Block.sand);
		
		//Beispiel mit anordnung in der Workbench mit mehreren Bl�cken
		GameRegistry.addRecipe(new ItemStack(Item.coal, 16), "X#X", "XCX", "X#X", '#', Block.sand, 'C', Block.cobblestone);
		
		//Rezept f�r das Beispielitem
		GameRegistry.addShapelessRecipe(new ItemStack(testitem), Testname, Block.cobblestone);
		
	}	
	
	private void registerItems(){
		
		GameRegistry.registerItem(testitem, "Testitem");
		
	}
	
	private void updateLanguage(){
		
		LanguageRegistry.addName(testitem, "Testitem");
		
	}
}
