package io.github.jolkert.perch.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(PlayerEntity.class)
public interface PlayerInvoker
{
	@Invoker("dropShoulderEntities")
	void invokeDropShoulderEntities();
}
