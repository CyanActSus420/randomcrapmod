
package net.mcreator.randomcrapmod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@RandomCrapModModElements.ModElement.Tag
public class TazexutSwordItem extends RandomCrapModModElements.ModElement {

	@ObjectHolder("random_crap_mod:tazexut_sword")
	public static final Item block = null;

	public TazexutSwordItem(RandomCrapModModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("tazexut_sword"));
	}

}
