
package net.mcreator.randomcrapmod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@RandomCrapModModElements.ModElement.Tag
public class TazexutItem extends RandomCrapModModElements.ModElement {

	@ObjectHolder("random_crap_mod:tazexut")
	public static final Item block = null;

	public TazexutItem(RandomCrapModModElements instance) {
		super(instance, 8);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("tazexut");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
