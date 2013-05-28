package TeslaCraftMC;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "TeslaCraftMC", name ="TeslaCraft-MC Mod", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class TeslaCraftMC 
{
	public static final String modid = "Cavious_TeslaCraft-MC";
	
	//Create Tab Table
	public static CreativeTabs TabTeslaCraftMC = new TabTeslaCraftMC(CreativeTabs.getNextID(),"TeslaCraft-MC");
	
	//Create Ores
	public static final Block CopperOre = new CopperOre(600, Material.rock).setUnlocalizedName("CopperOre").setStepSound(Block.soundStoneFootstep).setHardness(0.2F).setCreativeTab(TeslaCraftMC.TabTeslaCraftMC);
	public static final Block SilverOre = new SilverOre(601, Material.rock).setUnlocalizedName("SilverOre").setStepSound(Block.soundStoneFootstep).setHardness(0.3F).setCreativeTab(TeslaCraftMC.TabTeslaCraftMC);
	public static final Block PlatinumOre = new PlatinumOre(602, Material.rock).setUnlocalizedName("PlatinumOre").setStepSound(Block.soundStoneFootstep).setHardness(0.4F).setCreativeTab(TeslaCraftMC.TabTeslaCraftMC);
	public static final Block ChromiumOre = new ChromiumOre(603, Material.rock).setUnlocalizedName("ChromiumOre").setStepSound(Block.soundStoneFootstep).setHardness(0.4F).setCreativeTab(TeslaCraftMC.TabTeslaCraftMC);
	public static final Block AluminumOre = new AluminumOre(604, Material.rock).setUnlocalizedName("AluminumOre").setStepSound(Block.soundStoneFootstep).setHardness(0.1F).setCreativeTab(TeslaCraftMC.TabTeslaCraftMC);
	public static final Block TitaniumOre = new TitaniumOre(605, Material.rock).setUnlocalizedName("TitaniumOre").setStepSound(Block.soundStoneFootstep).setHardness(0.1F).setCreativeTab(TeslaCraftMC.TabTeslaCraftMC);
	
	
	//Create Items
	EmptyTestTube = new EmptyTestTube(6000).setUnlocalizedName("EmptyTestTube").setCreativeTab(TeslaCraftMC.TabTeslaCraftMC);
	
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		//Block Registration
		GameRegistry.registerBlock(CopperOre, modid + CopperOre.getUnlocalizedName()) ;
		GameRegistry.registerBlock(SilverOre, modid + SilverOre.getUnlocalizedName()) ;
		GameRegistry.registerBlock(PlatinumOre, modid + PlatinumOre.getUnlocalizedName()) ;
		GameRegistry.registerBlock(ChromiumOre, modid + ChromiumOre.getUnlocalizedName()) ;
		GameRegistry.registerBlock(AluminumOre, modid + AluminumOre.getUnlocalizedName()) ;
		GameRegistry.registerBlock(TitaniumOre, modid + TitaniumOre.getUnlocalizedName()) ;
		
		//Block in-game Name
		LanguageRegistry.addName(CopperOre, "Copper Ore");
		LanguageRegistry.addName(SilverOre, "Silver Ore");
		LanguageRegistry.addName(PlatinumOre, "Platinum Ore");
		LanguageRegistry.addName(ChromiumOre, "Chromium Ore");
		LanguageRegistry.addName(AluminumOre, "Aluminum Ore");
		LanguageRegistry.addName(TitaniumOre, "Titanium Ore");
		
		//Effective Tool 0 = wood, 1 = stone, 2 = iron, 3 = diamond
		MinecraftForge.setBlockHarvestLevel(CopperOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(SilverOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(PlatinumOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(ChromiumOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(AluminumOre, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(TitaniumOre, "pickaxe", 3);
		
		//Crafting Recipe
		
		
		//World Generation
		GameRegistry.registerWorldGenerator(new OreWorldGen());
	}
}
