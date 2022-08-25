
package net.mcreator.randomcrapmod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@RandomCrapModModElements.ModElement.Tag
public class TazexutShovelItem extends RandomCrapModModElements.ModElement {

	@ObjectHolder("random_crap_mod:tazexut_shovel")
	public static final Item block = null;

	public TazexutShovelItem(RandomCrapModModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TazexutItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("tazexut_shovel"));
	}

}
