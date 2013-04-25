package lias.minecraft.mod.betterfood;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class blockbeispielblock extends Block{

	public blockbeispielblock(int id, Material mar) {
		super(id, mar);
	}

	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("betterfood:testblock");
	}
}
