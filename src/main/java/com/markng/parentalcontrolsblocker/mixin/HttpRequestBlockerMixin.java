package com.markng.parentalcontrolsblocker.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.UUID;

@Mixin(com.mojang.authlib.yggdrasil.YggdrasilSocialInteractionsService.class)
public class HttpRequestBlockerMixin {
	@Inject(at = @At("HEAD"), method = "isBlockedPlayer", cancellable = true, remap = false)
	private void block_fetch(final UUID uuid, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(false);
	}
}
