package net.mcreator.randomcrapmod.procedures;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.randomcrapmod.RandomCrapModMod;

import java.util.Map;
import java.util.Collections;

public class EnderCookiePlayerFinishesUsingItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RandomCrapModMod.LOGGER.warn("Failed to load dependency x for procedure EnderCookiePlayerFinishesUsingItem!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RandomCrapModMod.LOGGER.warn("Failed to load dependency y for procedure EnderCookiePlayerFinishesUsingItem!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RandomCrapModMod.LOGGER.warn("Failed to load dependency z for procedure EnderCookiePlayerFinishesUsingItem!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RandomCrapModMod.LOGGER.warn("Failed to load dependency entity for procedure EnderCookiePlayerFinishesUsingItem!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("EnderCookieTeleportRandom", Math.random());
		if (entity.getPersistentData().getDouble("EnderCookieTeleportRandom") >= 0.75) {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((x + 25), (y + 2.5), (z + 25));
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + 25), (y + 2.5), (z + 25), _ent.rotationYaw, _ent.rotationPitch,
							Collections.emptySet());
				}
			}
		} else if (entity.getPersistentData().getDouble("EnderCookieTeleportRandom") >= 0.5) {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((x + 10), (y + 1), (z + 10));
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + 10), (y + 1), (z + 10), _ent.rotationYaw, _ent.rotationPitch,
							Collections.emptySet());
				}
			}
		} else {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((x + 0), (y + 0), (z + 0));
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + 0), (y + 0), (z + 0), _ent.rotationYaw, _ent.rotationPitch,
							Collections.emptySet());
				}
			}
		}
	}
}
