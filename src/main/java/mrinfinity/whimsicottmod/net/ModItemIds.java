package mrinfinity.whimsicottmod.net;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemIds {
    public static ResourceKey<Item> create(String name){
        return ResourceKey.create(Registries.ITEM, WhimsicottMod.id(name));
    }

    public static final ResourceKey<Item> MYSTERY_SEED = create("mystery_seed");
}
