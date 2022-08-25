
package net.mcreator.randomcrapmod.item;

@RandomCrapModModElements.ModElement.Tag
public class TazexutArmorItem extends RandomCrapModModElements.ModElement {

	@ObjectHolder("random_crap_mod:tazexut_armor_helmet")
	public static final Item helmet = null;

	@ObjectHolder("random_crap_mod:tazexut_armor_chestplate")
	public static final Item body = null;

	@ObjectHolder("random_crap_mod:tazexut_armor_leggings")
	public static final Item legs = null;

	@ObjectHolder("random_crap_mod:tazexut_armor_boots")
	public static final Item boots = null;

	public TazexutArmorItem(RandomCrapModModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{4, 12, 10, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 18;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TazexutItem.block));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "tazexut_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "random_crap_mod:textures/models/armor/tazexut_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

		}.setRegistryName("tazexut_armor_helmet"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "random_crap_mod:textures/models/armor/tazexut_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

		}.setRegistryName("tazexut_armor_chestplate"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "random_crap_mod:textures/models/armor/tazexut_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

		}.setRegistryName("tazexut_armor_leggings"));

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "random_crap_mod:textures/models/armor/tazexut_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

		}.setRegistryName("tazexut_armor_boots"));
	}

}
