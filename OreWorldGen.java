package TeslaCraftMC;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreWorldGen implements IWorldGenerator 
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
		case -1:
			generateNether();
			break;
		case 0:
			generateSurface(world, random, chunkX*16, chunkZ*16);
			break;
		case 1:
			generateEnd();
			break;
		}

	}

	private void generateNether() 
	{
		//No Nether
		
	}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) 
	{
		//30 Veins of ore per chunk
		for (int i = 0; i < 30; i++)
		{
			//16x16 area up to 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);
		//10 blocks per vein
		(new WorldGenMinable(TeslaCraftMC.CopperOre.blockID, 10)).generate(world, rand,
				randPosX, randPosY, randPosZ);
		}
		
		//15 Veins of ore per chunk
		for (int i = 0; i < 15; i++)
		{
			//16x16 area up to 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
		//10 blocks per vein
		(new WorldGenMinable(TeslaCraftMC.SilverOre.blockID, 10)).generate(world, rand,
				randPosX, randPosY, randPosZ);
		}
		
		//7 Veins of ore per chunk
		for (int i = 0; i < 7; i++)
		{
			//16x16 area up to 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(40);
			int randPosZ = chunkZ + rand.nextInt(16);
		//10 blocks per vein
		(new WorldGenMinable(TeslaCraftMC.PlatinumOre.blockID, 10)).generate(world, rand,
				randPosX, randPosY, randPosZ);
		}
	}
	
	private void generateEnd() 
	{
		//No End
		
	}

}
