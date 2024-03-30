
package net.mcreator.isekaireborn.client.renderer;

public class RyukaRenderer extends HumanoidMobRenderer<RyukaEntity, HumanoidModel<RyukaEntity>> {

	public RyukaRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(RyukaEntity entity) {
		return new ResourceLocation("isekai_reborn:textures/entities/ryukanewskinplain.png");
	}

}
