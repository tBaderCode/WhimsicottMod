package mrinfinity.whimsicottmod.net.entity;

import mrinfinity.whimsicottmod.net.WhimsicottMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;

public class ModEntityTypeIds {
    public static ResourceKey<EntityType<?>> WHIMSICOTT = create("whimsicott");

    private static ResourceKey<EntityType<?>> create(String name) {
        return ResourceKey.create(Registries.ENTITY_TYPE, WhimsicottMod.id(name));
    }
}
