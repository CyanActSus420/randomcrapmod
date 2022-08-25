package net.mcreator.randomcrapmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class EnderCookiePlayerFinishesUsingItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RandomCrapModMod.LOGGER.warn("Failed to load dependency entity for procedure EnderCookiePlayerFinishesUsingItem!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate(Math.random(), Math.random(), Math.random());
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation(Math.random(), Math.random(), Math.random(), _ent.rotationYaw,
						_ent.rotationPitch, Collections.emptySet());
			}
		}
	}

}
