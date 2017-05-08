package net.dyeo.teleporter.inventory;

import java.util.Random;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class InventoryHelper
{

	private static final Random RANDOM = new Random();

	public static void spawnItemStack(World worldIn, double x, double y, double z, ItemStack stack)
	{
		float f = RANDOM.nextFloat() * 0.8F + 0.1F;
		float f1 = RANDOM.nextFloat() * 0.8F + 0.1F;
		float f2 = RANDOM.nextFloat() * 0.8F + 0.1F;

		while (stack.stackSize > 0)
		{
			int i = RANDOM.nextInt(21) + 10;

			if (i > stack.stackSize)
			{
				i = stack.stackSize;
			}

			stack.stackSize -= i;
			EntityItem entityitem = new EntityItem(worldIn, x + (double)f, y + (double)f1, z + (double)f2, new ItemStack(stack.getItem(), i, stack.getItemDamage()));

			if (stack.hasTagCompound())
			{
				entityitem.getEntityItem().setTagCompound((NBTTagCompound)stack.getTagCompound().copy());
			}

			float f3 = 0.05F;
			entityitem.motionX = RANDOM.nextGaussian() * (double)f3;
			entityitem.motionY = RANDOM.nextGaussian() * (double)f3 + 0.2D;
			entityitem.motionZ = RANDOM.nextGaussian() * (double)f3;
			worldIn.spawnEntityInWorld(entityitem);
		}
	}
}