package mrinfinity.whimsicottmod.net.client;

import mrinfinity.whimsicottmod.net.WhimsicottMod;
import mrinfinity.whimsicottmod.net.client.model.WhimsicottEntityModel;
import mrinfinity.whimsicottmod.net.entity.WhimsicottEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class WhimsicottEntityRenderer extends MobRenderer<WhimsicottEntity, WhimsicottEntityRenderState, WhimsicottEntityModel> {
    private static final Identifier TEXTURE = WhimsicottMod.id("textures/entity/whimsicott.png");

    public WhimsicottEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new WhimsicottEntityModel(context.bakeLayer(ModEntityModelLayers.WHIMSICOTT)), 0.375f);
    }

    public WhimsicottEntityRenderState createRenderState(){
        return new WhimsicottEntityRenderState();
    }

    public Identifier getTextureLocation(WhimsicottEntityRenderState state){
        return TEXTURE;
    }

    @Override
    public void extractRenderState(WhimsicottEntity entity, WhimsicottEntityRenderState state, float partialTicks) {
        super.extractRenderState(entity, state, partialTicks);
        state.idleAnimationState.copyFrom(entity.idleAnimationState);
        state.flyAnimationState.copyFrom(entity.flyAnimationState);
    }
}
