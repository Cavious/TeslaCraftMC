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
	
	public static final Block CopperOre = new CopperOre(600, Material.rock).setUnlocalizedName("CopperOre").setStepSound(Block.soundStoneFootstep).setHardness(0.2F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block SilverOre = new SilverOre(600, Material.rock).setUnlocalizedName("SilverOre").setStepSound(Block.soundStoneFootstep).setHardness(0.2F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block PlatinumOre = new PlatinumOre(600, Material.rock).setUnlocalizedName("PlatinumOre").setStepSound(Block.soundStoneFootstep).setHardness(0.2F).setCreativeTab(CreativeTabs.tabBlock);
	
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		//Block Registration
		GameRegistry.registerBlock(CopperOre, modid + CopperOre.getUnlocalizedName()) ;
		GameRegistry.registerBlock(SilverOre, modid + SilverOre.getUnlocalizedName()) ;
		GameRegistry.registerBlock(PlatinumOre, modid + PlatinumOre.getUnlocalizedName()) ;
		
		//Block in-game Name
		LanguageRegistry.addName(CopperOre, "Copper Ore");
		LanguageRegistry.addName(SilverOre, "Silver Ore");
		LanguageRegistry.addName(PlatinumOre, "Platinum Ore");
		
		//Effective Tool 0 = wood, 1 = stone, 2 = iron, 3 = diamond
		MinecraftForge.setBlockHarvestLevel(CopperOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(SilverOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(PlatinumOre, "pickaxe", 1);
		
		//Crafting Recipe
		
		
		//World Generation
		GameRegistry.registerWorldGenerator(new OreWorldGen());
	}
}
