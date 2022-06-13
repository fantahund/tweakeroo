package fi.dy.masa.tweakeroo.mixin;

import net.minecraft.client.option.SimpleOption;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(SimpleOption.class)
public interface IMixinSimpleOption {
    @Accessor("value")
    void setValueWithoutCheck(Object value);
}
