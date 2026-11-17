package mrinfinity.whimsicottmod.net.client;

import mrinfinity.whimsicottmod.net.WhimsicottMod;
import mrinfinity.whimsicottmod.net.client.model.WhimsicottEntityModel;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;

public class ModEntityModelLayers {
    public static final ModelLayerLocation WHIMSICOTT = new ModelLayerLocation(WhimsicottMod.id("whimsicott"), "main");

    private static ModelLayerLocation createMain(String name){
        return new ModelLayerLocation(WhimsicottMod.id(name), "main");
    }

    public static void RegisterModelLayers(){
        ModelLayerRegistry.registerModelLayer(ModEntityModelLayers.WHIMSICOTT, WhimsicottEntityModel::createBodyLayer);
    }

}
