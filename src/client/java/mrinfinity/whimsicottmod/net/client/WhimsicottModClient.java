package mrinfinity.whimsicottmod.net.client;

import mrinfinity.whimsicottmod.net.client.model.WhimsicottEntityModel;
import mrinfinity.whimsicottmod.net.entity.ModEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;

public class WhimsicottModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModelLayerRegistry.registerModelLayer(
				ModEntityModelLayers.WHIMSICOTT, WhimsicottEntityModel::createBodyLayer);
		EntityRendererRegistry.register(ModEntityTypes.WHIMSICOTT, WhimsicottEntityRenderer::new);
	}


}