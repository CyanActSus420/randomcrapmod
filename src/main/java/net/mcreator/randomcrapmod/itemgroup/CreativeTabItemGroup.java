
package net.mcreator.randomcrapmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.randomcrapmod.item.DynamiteItem;
import net.mcreator.randomcrapmod.RandomCrapModModElements;

@RandomCrapModModElements.ModElement.Tag
public class CreativeTabItemGroup extends RandomCrapModModElements.ModElement {
	public CreativeTabItemGroup(RandomCrapModModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcreative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DynamiteItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
