package mrinfinity.whimsicottmod.net;

import mrinfinity.whimsicottmod.net.entity.ModEntityTypes;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhimsicottMod implements ModInitializer {
	public static final String MOD_ID = "whimsicottmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModEntityTypes.initialize();
		ModBlocks.Initialize();
		ModItems.initialize();

		PlayerBlockBreakEvents.AFTER.register((level, player, pos, state, blockEntity) -> {
			if (level.isClientSide() || player.isCreative()) return;

			if (state.is(Blocks.WHEAT)
					&& state.getValue(BlockStateProperties.AGE_7) == 7
					&& level.getRandom().nextFloat() < 0.01F) {
				Block.popResource(level, pos, new ItemStack(ModItems.MYSTERY_SEED));
			}
		});
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
