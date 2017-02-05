package wtf.entities.simpleentities;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ZombieMiner extends EntityZombie{
	public ZombieMiner(World worldIn) {
		super(worldIn);
		setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack((rand.nextBoolean() ? Items.STONE_PICKAXE : Items.WOODEN_PICKAXE), 1, rand.nextInt(60)));
		setItemStackToSlot(EntityEquipmentSlot.OFFHAND, new ItemStack(Blocks.TORCH));
		setItemStackToSlot(EntityEquipmentSlot.HEAD, new ItemStack(Items.LEATHER_HELMET, 1, rand.nextInt(30)));
	}
}
