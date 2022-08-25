
package net.mcreator.randomcrapmod.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@RandomCrapModModElements.ModElement.Tag
public class TazexutBlockBlock extends RandomCrapModModElements.ModElement {

	@ObjectHolder("random_crap_mod:tazexut_block")
	public static final Block block = null;

	public TazexutBlockBlock(RandomCrapModModElements instance) {
		super(instance, 10);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(CreativeTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f, 10f).setLightLevel(s -> 0).harvestLevel(4)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());

			setRegistryName("tazexut_block");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
