package mrinfinity.whimsicottmod.net.client.model;// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import mrinfinity.whimsicottmod.net.client.WhimsicottEntityRenderState;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.Identifier;

public class WhimsicottEntityModel extends EntityModel<WhimsicottEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("whimsicottmod", "whimsicott"), "main");

	private final KeyframeAnimation walkAnimation;
	private final KeyframeAnimation idleAnimation;
	private final KeyframeAnimation flyAnimation;

	private final ModelPart whimsicott;
	private final ModelPart locator_root;
	private final ModelPart locator_top;
	private final ModelPart body;
	private final ModelPart locator_target;
	private final ModelPart locator_middle;
	private final ModelPart torso;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart head_ai;
	private final ModelPart head_angle;
	private final ModelPart locator_mouth;
	private final ModelPart locator_item_face;
	private final ModelPart locator_face;
	private final ModelPart hair;
	private final ModelPart hair_top_right;
	private final ModelPart fluff_top_right;
	private final ModelPart fluff_top;
	private final ModelPart hair_middle_right;
	private final ModelPart hair_bottom_right;
	private final ModelPart fluff_bottom_right;
	private final ModelPart hair_top_left;
	private final ModelPart locator_item_hat;
	private final ModelPart fluff_top_left;
	private final ModelPart hair_middle_left;
	private final ModelPart hair_bottom_left;
	private final ModelPart fluff_bottom_left;
	private final ModelPart hair_back;
	private final ModelPart hair_front;
	private final ModelPart locator_head;
	private final ModelPart horn_right;
	private final ModelPart horn_left;
	private final ModelPart face;
	private final ModelPart eyes;
	private final ModelPart eye_right;
	private final ModelPart locator_eye_right;
	private final ModelPart eyelid_angry_right;
	private final ModelPart eyelid_sad_right;
	private final ModelPart eyelid_unamused_right;
	private final ModelPart eye_left;
	private final ModelPart locator_eye_left;
	private final ModelPart eyelid_angry_left;
	private final ModelPart eyelid_sad_left;
	private final ModelPart eyelid_unamused_left;
	private final ModelPart eyelid_right;
	private final ModelPart eyelid_left;
	private final ModelPart eyelid_recoil_right;
	private final ModelPart eyelid_recoil_left;
	private final ModelPart eyelid_happy_right;
	private final ModelPart eyelid_happy_left;
	private final ModelPart mouth;
	private final ModelPart mouth_closed_smile;
	private final ModelPart mouth_closed_neutral;
	private final ModelPart mouth_closed_frown;
	private final ModelPart mouth_open_neutral;
	private final ModelPart mouth_open_smile;
	private final ModelPart mouth_open_frown;
	private final ModelPart mouth_open_o;
	private final ModelPart locator_jaw_upper;
	private final ModelPart locator_jaw_lower;
	private final ModelPart face_ditto;
	private final ModelPart eyes_ditto;
	private final ModelPart eyes_closed_ditto;
	private final ModelPart mouth_ditto;
	private final ModelPart mouth_open_ditto;
	private final ModelPart arms;
	private final ModelPart arm_right;
	private final ModelPart locator_hand_primary;
	private final ModelPart locator_item;
	private final ModelPart arm_left;
	private final ModelPart locator_hand_secondary;
	private final ModelPart legs;
	private final ModelPart leg_right;
	private final ModelPart locator_foot_primary;
	private final ModelPart leg_left;
	private final ModelPart locator_foot_secondary;

	public WhimsicottEntityModel(ModelPart root) {
		super(root);
		this.whimsicott = root.getChild("whimsicott");
		this.locator_root = this.whimsicott.getChild("locator_root");
		this.locator_top = this.whimsicott.getChild("locator_top");
		this.body = this.whimsicott.getChild("body");
		this.locator_target = this.body.getChild("locator_target");
		this.locator_middle = this.body.getChild("locator_middle");
		this.torso = this.body.getChild("torso");
		this.neck = this.torso.getChild("neck");
		this.head = this.neck.getChild("head");
		this.head_ai = this.head.getChild("head_ai");
		this.head_angle = this.head_ai.getChild("head_angle");
		this.locator_mouth = this.head_angle.getChild("locator_mouth");
		this.locator_item_face = this.head_angle.getChild("locator_item_face");
		this.locator_face = this.head_angle.getChild("locator_face");
		this.hair = this.head_angle.getChild("hair");
		this.hair_top_right = this.hair.getChild("hair_top_right");
		this.fluff_top_right = this.hair_top_right.getChild("fluff_top_right");
		this.fluff_top = this.hair_top_right.getChild("fluff_top");
		this.hair_middle_right = this.hair.getChild("hair_middle_right");
		this.hair_bottom_right = this.hair.getChild("hair_bottom_right");
		this.fluff_bottom_right = this.hair_bottom_right.getChild("fluff_bottom_right");
		this.hair_top_left = this.hair.getChild("hair_top_left");
		this.locator_item_hat = this.hair_top_left.getChild("locator_item_hat");
		this.fluff_top_left = this.hair_top_left.getChild("fluff_top_left");
		this.hair_middle_left = this.hair.getChild("hair_middle_left");
		this.hair_bottom_left = this.hair.getChild("hair_bottom_left");
		this.fluff_bottom_left = this.hair_bottom_left.getChild("fluff_bottom_left");
		this.hair_back = this.hair.getChild("hair_back");
		this.hair_front = this.head_angle.getChild("hair_front");
		this.locator_head = this.hair_front.getChild("locator_head");
		this.horn_right = this.head_angle.getChild("horn_right");
		this.horn_left = this.head_angle.getChild("horn_left");
		this.face = this.head_angle.getChild("face");
		this.eyes = this.face.getChild("eyes");
		this.eye_right = this.eyes.getChild("eye_right");
		this.locator_eye_right = this.eye_right.getChild("locator_eye_right");
		this.eyelid_angry_right = this.eye_right.getChild("eyelid_angry_right");
		this.eyelid_sad_right = this.eye_right.getChild("eyelid_sad_right");
		this.eyelid_unamused_right = this.eye_right.getChild("eyelid_unamused_right");
		this.eye_left = this.eyes.getChild("eye_left");
		this.locator_eye_left = this.eye_left.getChild("locator_eye_left");
		this.eyelid_angry_left = this.eye_left.getChild("eyelid_angry_left");
		this.eyelid_sad_left = this.eye_left.getChild("eyelid_sad_left");
		this.eyelid_unamused_left = this.eye_left.getChild("eyelid_unamused_left");
		this.eyelid_right = this.eyes.getChild("eyelid_right");
		this.eyelid_left = this.eyes.getChild("eyelid_left");
		this.eyelid_recoil_right = this.eyes.getChild("eyelid_recoil_right");
		this.eyelid_recoil_left = this.eyes.getChild("eyelid_recoil_left");
		this.eyelid_happy_right = this.eyes.getChild("eyelid_happy_right");
		this.eyelid_happy_left = this.eyes.getChild("eyelid_happy_left");
		this.mouth = this.face.getChild("mouth");
		this.mouth_closed_smile = this.mouth.getChild("mouth_closed_smile");
		this.mouth_closed_neutral = this.mouth.getChild("mouth_closed_neutral");
		this.mouth_closed_frown = this.mouth.getChild("mouth_closed_frown");
		this.mouth_open_neutral = this.mouth.getChild("mouth_open_neutral");
		this.mouth_open_smile = this.mouth.getChild("mouth_open_smile");
		this.mouth_open_frown = this.mouth.getChild("mouth_open_frown");
		this.mouth_open_o = this.mouth.getChild("mouth_open_o");
		this.locator_jaw_upper = this.mouth.getChild("locator_jaw_upper");
		this.locator_jaw_lower = this.mouth.getChild("locator_jaw_lower");
		this.face_ditto = this.head_angle.getChild("face_ditto");
		this.eyes_ditto = this.face_ditto.getChild("eyes_ditto");
		this.eyes_closed_ditto = this.face_ditto.getChild("eyes_closed_ditto");
		this.mouth_ditto = this.face_ditto.getChild("mouth_ditto");
		this.mouth_open_ditto = this.face_ditto.getChild("mouth_open_ditto");
		this.arms = this.torso.getChild("arms");
		this.arm_right = this.arms.getChild("arm_right");
		this.locator_hand_primary = this.arm_right.getChild("locator_hand_primary");
		this.locator_item = this.arm_right.getChild("locator_item");
		this.arm_left = this.arms.getChild("arm_left");
		this.locator_hand_secondary = this.arm_left.getChild("locator_hand_secondary");
		this.legs = this.body.getChild("legs");
		this.leg_right = this.legs.getChild("leg_right");
		this.locator_foot_primary = this.leg_right.getChild("locator_foot_primary");
		this.leg_left = this.legs.getChild("leg_left");
		this.locator_foot_secondary = this.leg_left.getChild("locator_foot_secondary");

		this.walkAnimation = WhimsicottAnimation.GROUND_WALK.bake(root);
		this.idleAnimation = WhimsicottAnimation.GROUND_IDLE.bake(root);
		this.flyAnimation = WhimsicottAnimation.AIR_FLY.bake(root);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition whimsicott = partdefinition.addOrReplaceChild("whimsicott", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition locator_root = whimsicott.addOrReplaceChild("locator_root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition locator_top = whimsicott.addOrReplaceChild("locator_top", CubeListBuilder.create(), PartPose.offset(0.0F, -25.0F, 0.0F));

		PartDefinition body = whimsicott.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition locator_target = body.addOrReplaceChild("locator_target", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, -6.0F));

		PartDefinition locator_middle = body.addOrReplaceChild("locator_middle", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(110, 12).addBox(-2.5F, -5.75F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.25F, -0.25F));

		PartDefinition neck = torso.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, -5.45F, 1.25F));

		PartDefinition cube_r1 = neck.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(87, 5).addBox(-1.0F, -0.75F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 0.15F, 1.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = neck.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(29, 0).addBox(-3.0F, -1.0F, -5.5F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.35F, 1.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2F, -1.0F));

		PartDefinition head_ai = head.addOrReplaceChild("head_ai", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_angle = head_ai.addOrReplaceChild("head_angle", CubeListBuilder.create().texOffs(100, 0).addBox(-3.5F, -5.6F, -3.0F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition locator_mouth = head_angle.addOrReplaceChild("locator_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -3.0F));

		PartDefinition locator_item_face = head_angle.addOrReplaceChild("locator_item_face", CubeListBuilder.create(), PartPose.offset(0.0F, -2.35F, -3.0F));

		PartDefinition locator_face = head_angle.addOrReplaceChild("locator_face", CubeListBuilder.create(), PartPose.offset(0.0F, -1.85F, -3.0F));

		PartDefinition hair = head_angle.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(109, 56).addBox(-4.5F, 0.75F, 5.775F, 9.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.55F, 2.225F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hair_top_right = hair.addOrReplaceChild("hair_top_right", CubeListBuilder.create(), PartPose.offset(-4.5F, -2.2F, 1.775F));

		PartDefinition cube_r3 = hair_top_right.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(29, 29).addBox(-6.5F, -7.5F, -5.5F, 9.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 3.45F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition fluff_top_right = hair_top_right.addOrReplaceChild("fluff_top_right", CubeListBuilder.create().texOffs(74, 60).addBox(-1.5F, -2.5F, -1.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 1.95F, 3.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition fluff_top = hair_top_right.addOrReplaceChild("fluff_top", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -3.05F, 3.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r4 = fluff_top.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(102, 59).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition hair_middle_right = hair.addOrReplaceChild("hair_middle_right", CubeListBuilder.create(), PartPose.offset(-7.0F, 5.8F, 2.775F));

		PartDefinition cube_r5 = hair_middle_right.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-8.5F, -4.5F, -6.5F, 9.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, -0.55F, 1.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition hair_bottom_right = hair.addOrReplaceChild("hair_bottom_right", CubeListBuilder.create(), PartPose.offset(-4.0209F, 9.7044F, 1.775F));

		PartDefinition cube_r6 = hair_bottom_right.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 40).addBox(-7.25F, -0.25F, -5.0F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5209F, -2.9544F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition fluff_bottom_right = hair_bottom_right.addOrReplaceChild("fluff_bottom_right", CubeListBuilder.create().texOffs(88, 59).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9791F, 0.6456F, 0.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition hair_top_left = hair.addOrReplaceChild("hair_top_left", CubeListBuilder.create(), PartPose.offset(3.9269F, -2.2632F, 1.775F));

		PartDefinition cube_r7 = hair_top_left.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(29, 9).addBox(-1.5F, -8.0F, -5.5F, 10.0F, 9.0F, 11.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-3.9269F, 3.0132F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition locator_item_hat = hair_top_left.addOrReplaceChild("locator_item_hat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8731F, -4.4868F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition fluff_top_left = hair_top_left.addOrReplaceChild("fluff_top_left", CubeListBuilder.create(), PartPose.offset(4.5731F, 2.0132F, 3.0F));

		PartDefinition cube_r8 = fluff_top_left.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(81, 59).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition hair_middle_left = hair.addOrReplaceChild("hair_middle_left", CubeListBuilder.create(), PartPose.offset(7.7572F, 4.9026F, 2.775F));

		PartDefinition cube_r9 = hair_middle_left.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 20).addBox(0.5F, -4.5F, -6.5F, 9.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9572F, -0.6526F, 1.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition hair_bottom_left = hair.addOrReplaceChild("hair_bottom_left", CubeListBuilder.create(), PartPose.offset(4.0209F, 9.7044F, 1.775F));

		PartDefinition cube_r10 = hair_bottom_left.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(60, 0).addBox(-0.75F, -0.25F, -5.0F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5209F, -2.9544F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition fluff_bottom_left = hair_bottom_left.addOrReplaceChild("fluff_bottom_left", CubeListBuilder.create().texOffs(95, 59).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9791F, 0.0456F, 0.0F, 0.0F, 0.0F, -0.829F));

		PartDefinition hair_back = hair.addOrReplaceChild("hair_back", CubeListBuilder.create().texOffs(58, 31).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.75F, 6.275F));

		PartDefinition hair_front = head_angle.addOrReplaceChild("hair_front", CubeListBuilder.create().texOffs(71, 17).addBox(-4.5F, -1.55F, -3.95F, 9.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(72, 26).addBox(-4.5F, -1.85F, -3.95F, 9.0F, 3.0F, 5.0F, new CubeDeformation(0.45F)), PartPose.offsetAndRotation(0.0F, -7.4F, -0.25F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hair_front.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(48, 0).addBox(-2.5F, -0.01F, -1.8F, 5.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.55F, -3.95F, -0.0087F, 0.0F, 0.0F));

		PartDefinition locator_head = hair_front.addOrReplaceChild("locator_head", CubeListBuilder.create(), PartPose.offset(0.0F, -1.55F, -3.95F));

		PartDefinition horn_right = head_angle.addOrReplaceChild("horn_right", CubeListBuilder.create().texOffs(104, 24).addBox(-1.0F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(106, 32).addBox(-1.0F, 1.0F, -3.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.75F, -4.1F, -1.0F, -0.0035F, -0.6632F, 0.4485F));

		PartDefinition horn_left = head_angle.addOrReplaceChild("horn_left", CubeListBuilder.create().texOffs(116, 24).addBox(-2.0F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(118, 32).addBox(-1.0F, 1.0F, -3.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.75F, -4.1F, -1.0F, -0.0035F, 0.6632F, -0.4485F));

		PartDefinition face = head_angle.addOrReplaceChild("face", CubeListBuilder.create(), PartPose.offset(-2.25F, -2.35F, -2.51F));

		PartDefinition eyes = face.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eye_right = eyes.addOrReplaceChild("eye_right", CubeListBuilder.create().texOffs(1, 1).addBox(-0.25F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition locator_eye_right = eye_right.addOrReplaceChild("locator_eye_right", CubeListBuilder.create(), PartPose.offset(0.25F, -0.25F, -0.49F));

		PartDefinition eyelid_angry_right = eye_right.addOrReplaceChild("eyelid_angry_right", CubeListBuilder.create().texOffs(1, 21).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(0.7F, -0.8F, 0.1F));

		PartDefinition eyelid_sad_right = eye_right.addOrReplaceChild("eyelid_sad_right", CubeListBuilder.create().texOffs(1, 24).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(-0.3F, -0.8F, 0.1F));

		PartDefinition eyelid_unamused_right = eye_right.addOrReplaceChild("eyelid_unamused_right", CubeListBuilder.create().texOffs(1, 27).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(0.2F, -0.8F, 0.1F));

		PartDefinition eye_left = eyes.addOrReplaceChild("eye_left", CubeListBuilder.create().texOffs(6, 1).addBox(-0.75F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.5F, 0.0F, 0.0F));

		PartDefinition locator_eye_left = eye_left.addOrReplaceChild("locator_eye_left", CubeListBuilder.create(), PartPose.offset(-0.25F, -0.25F, -0.49F));

		PartDefinition eyelid_angry_left = eye_left.addOrReplaceChild("eyelid_angry_left", CubeListBuilder.create().texOffs(6, 21).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(-0.7F, -0.8F, 0.1F));

		PartDefinition eyelid_sad_left = eye_left.addOrReplaceChild("eyelid_sad_left", CubeListBuilder.create().texOffs(6, 24).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(0.3F, -0.8F, 0.1F));

		PartDefinition eyelid_unamused_left = eye_left.addOrReplaceChild("eyelid_unamused_left", CubeListBuilder.create().texOffs(6, 27).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(-0.2F, -0.8F, 0.1F));

		PartDefinition eyelid_right = eyes.addOrReplaceChild("eyelid_right", CubeListBuilder.create().texOffs(1, 5).addBox(-0.95F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(0.2F, 0.2F, 0.1F));

		PartDefinition eyelid_left = eyes.addOrReplaceChild("eyelid_left", CubeListBuilder.create().texOffs(1, 8).addBox(-1.05F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(4.3F, 0.2F, 0.1F));

		PartDefinition eyelid_recoil_right = eyes.addOrReplaceChild("eyelid_recoil_right", CubeListBuilder.create().texOffs(1, 58).addBox(-1.0167F, -1.5F, -0.5033F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0667F, 0.2F, 0.0933F));

		PartDefinition eyelid_recoil_left = eyes.addOrReplaceChild("eyelid_recoil_left", CubeListBuilder.create().texOffs(9, 58).addBox(-0.9833F, -1.5F, -0.5033F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(4.4333F, 0.2F, 0.0933F));

		PartDefinition eyelid_happy_right = eyes.addOrReplaceChild("eyelid_happy_right", CubeListBuilder.create().texOffs(0, 41).addBox(-0.3167F, -1.1F, -0.4933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
		.texOffs(0, 44).addBox(-1.1667F, -0.45F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
		.texOffs(0, 47).addBox(0.5333F, -0.45F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0667F, 0.2F, 0.0933F));

		PartDefinition eyelid_happy_left = eyes.addOrReplaceChild("eyelid_happy_left", CubeListBuilder.create().texOffs(5, 41).addBox(-0.6833F, -1.1F, -0.4933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
		.texOffs(5, 44).addBox(0.1667F, -0.45F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
		.texOffs(5, 47).addBox(-1.5333F, -0.45F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(4.4333F, 0.2F, 0.0933F));

		PartDefinition mouth = face.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(2.25F, 1.75F, -0.5F));

		PartDefinition mouth_closed_smile = mouth.addOrReplaceChild("mouth_closed_smile", CubeListBuilder.create().texOffs(37, 49).addBox(-1.75F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(45, 49).addBox(0.75F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(40, 49).addBox(-1.0F, -0.15F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mouth_closed_neutral = mouth.addOrReplaceChild("mouth_closed_neutral", CubeListBuilder.create().texOffs(40, 51).addBox(-1.0F, -0.25F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.1F));

		PartDefinition mouth_closed_frown = mouth.addOrReplaceChild("mouth_closed_frown", CubeListBuilder.create().texOffs(37, 53).addBox(-1.75F, -0.25F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(45, 53).addBox(0.75F, -0.25F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(40, 53).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.1F));

		PartDefinition mouth_open_neutral = mouth.addOrReplaceChild("mouth_open_neutral", CubeListBuilder.create().texOffs(37, 55).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.1F));

		PartDefinition mouth_open_smile = mouth.addOrReplaceChild("mouth_open_smile", CubeListBuilder.create().texOffs(37, 58).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(37, 60).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.1F));

		PartDefinition mouth_open_frown = mouth.addOrReplaceChild("mouth_open_frown", CubeListBuilder.create().texOffs(44, 58).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(42, 60).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.1F));

		PartDefinition mouth_open_o = mouth.addOrReplaceChild("mouth_open_o", CubeListBuilder.create().texOffs(44, 55).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.1F));

		PartDefinition locator_jaw_upper = mouth.addOrReplaceChild("locator_jaw_upper", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, 0.01F));

		PartDefinition locator_jaw_lower = mouth.addOrReplaceChild("locator_jaw_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.01F));

		PartDefinition face_ditto = head_angle.addOrReplaceChild("face_ditto", CubeListBuilder.create(), PartPose.offset(-2.25F, -2.35F, -2.41F));

		PartDefinition eyes_ditto = face_ditto.addOrReplaceChild("eyes_ditto", CubeListBuilder.create().texOffs(51, 49).addBox(-2.5F, -0.3F, -0.5F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(2.25F, 0.05F, 0.0F));

		PartDefinition eyes_closed_ditto = face_ditto.addOrReplaceChild("eyes_closed_ditto", CubeListBuilder.create().texOffs(50, 51).addBox(-0.95F, -0.45F, -0.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(51, 53).mirror().addBox(-0.45F, -0.95F, -0.51F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.2F, 0.2F, 0.1F));

		PartDefinition mouth_ditto = face_ditto.addOrReplaceChild("mouth_ditto", CubeListBuilder.create().texOffs(61, 55).addBox(2.0F, -0.75F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(49, 55).addBox(-3.0F, -0.75F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(52, 55).addBox(-2.0F, -0.25F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(2.25F, 1.75F, -0.5F));

		PartDefinition mouth_open_ditto = face_ditto.addOrReplaceChild("mouth_open_ditto", CubeListBuilder.create().texOffs(49, 57).addBox(-3.5F, -1.0F, 0.0F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(2.25F, 1.75F, -0.4F));

		PartDefinition arms = torso.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(0.0F, -3.05F, 0.25F));

		PartDefinition arm_right = arms.addOrReplaceChild("arm_right", CubeListBuilder.create().texOffs(100, 12).addBox(-2.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition locator_hand_primary = arm_right.addOrReplaceChild("locator_hand_primary", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.25F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition locator_item = arm_right.addOrReplaceChild("locator_item", CubeListBuilder.create(), PartPose.offset(-2.25F, 0.0F, 0.0F));

		PartDefinition arm_left = arms.addOrReplaceChild("arm_left", CubeListBuilder.create().texOffs(100, 16).addBox(-0.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition locator_hand_secondary = arm_left.addOrReplaceChild("locator_hand_secondary", CubeListBuilder.create(), PartPose.offsetAndRotation(2.25F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, -0.25F));

		PartDefinition leg_right = legs.addOrReplaceChild("leg_right", CubeListBuilder.create().texOffs(98, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.95F, 0.0F, 0.0F));

		PartDefinition locator_foot_primary = leg_right.addOrReplaceChild("locator_foot_primary", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leg_left = legs.addOrReplaceChild("leg_left", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.95F, 0.0F, 0.0F));

		PartDefinition locator_foot_secondary = leg_left.addOrReplaceChild("locator_foot_secondary", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(WhimsicottEntityRenderState state) {
		super.setupAnim(state);

		this.idleAnimation.apply(state.idleAnimationState, state.ageInTicks);
		this.flyAnimation.apply(state.flyAnimationState, state.ageInTicks);
		if(!state.flyAnimationState.isStarted()) {
			this.walkAnimation.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1.0F, 1.0F);
		}
	}
}