package mrinfinity.whimsicottmod.net;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Compostable;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProvider;
import net.minecraft.world.level.storage.loot.providers.number.ints.ResolvableInt;

import java.util.function.Function;

public class ModItems {
    private static Identifier ResourceLocation;
    public static final ResourceKey<ContextIntProvider> SEED_COMPOST = ResourceKey.create(
            Registries.CONTEXT_INT_PROVIDER,
            Identifier.withDefaultNamespace("compostable/low")
    );

    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings){
        //Creates the item instance
        Item item = itemFactory.apply(settings.setId(itemKey));

        //Registers the item
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static final Item MYSTERY_SEED = register(
            ModItemIds.MYSTERY_SEED,
            (properties -> new BlockItem(ModBlocks.MYSTERY_BLOCK, properties)),
            new Item.Properties().component(DataComponents.COMPOSTABLE, new Compostable(ResolvableInt.fromKey(SEED_COMPOST))));

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS)
                .register((creativeTab) -> creativeTab.accept(ModItems.MYSTERY_SEED));
    }
}
