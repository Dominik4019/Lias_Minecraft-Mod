package lias.minecraft.mod.betterfood;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class itembeispielitem extends Item{

	public itembeispielitem(int id) {
		super(id);
	}
	
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("betterfood:testitem");
	}
}
