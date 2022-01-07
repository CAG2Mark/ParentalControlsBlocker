package com.markng.parentalcontrolsblocker.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import java.util.UUID;
import net.minecraft.client.network.SocialInteractionsManager;

@Mixin(value = SocialInteractionsManager.class)
public class HttpRequestBlockerMixin {
	@Inject(method = "isPlayerBlocked", at = @At("HEAD"), cancellable = true)
	private void chatLagFix(UUID uuid, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(false);
	}
}
