package TeslaCraftMC;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class TabTeslaCraftMC extends CreativeTabs
{

	public TabTeslaCraftMC(int position, String tabID) 
	{
		super(position, tabID);
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return TeslaCraftMC.CopperOre.blockID;
	}
	public String getTranslatedTablLabel()
	{
		return "TeslaCraft-MC";
	}
}
