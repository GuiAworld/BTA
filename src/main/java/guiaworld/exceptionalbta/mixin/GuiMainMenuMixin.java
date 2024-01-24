package guiaworld.exceptionalbta.mixin;

import net.minecraft.client.gui.GuiMainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import guiaworld.exceptionalbta.ExceptionalBTA;

@Mixin(value = GuiMainMenu.class, remap = false)
public class GuiMainMenuMixin {
    @Inject(method = "<clinit>", at = @At("HEAD"))
    private static void exceptionalbta$onClinit(CallbackInfo ci) {
        ExceptionalBTA.LOGGER.info("This line is printed by the example Mixin!");
    }
}
