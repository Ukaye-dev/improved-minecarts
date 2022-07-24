package net.ukaye.improvedminecarts.mixin;

import net.ukaye.improvedminecarts.ImprovedMinecarts;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ImprovedMinecartsMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		ImprovedMinecarts.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
