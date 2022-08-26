package net.mcreator.randomcrapmod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.randomcrapmod.RandomCrapModMod;

import java.util.Map;

public class DeathContractOnButtonClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RandomCrapModMod.LOGGER.warn("Failed to load dependency entity for procedure DeathContractOnButtonClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.WITHER, (float) 127);
	}
}
