package mrinfinity.whimsicottmod.net.entity;

import mrinfinity.whimsicottmod.net.ModItems;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class WhimsicottEntity extends PathfinderMob {

    public WhimsicottEntity(Level level){
        this(ModEntityTypes.WHIMSICOTT, level);
    }

    protected WhimsicottEntity(EntityType<? extends PathfinderMob> type, Level level) {
        super(type, level);
    }

    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState flyAnimationState = new AnimationState();

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new TemptGoal(this, 1, Ingredient.of(ModItems.MYSTERY_SEED), false));
        this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 4));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createWhimsicottAttributes() {
        return PathfinderMob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20)
                .add(Attributes.MOVEMENT_SPEED, 0.2)
                .add(Attributes.FLYING_SPEED, 0.8)
                .add(Attributes.TEMPT_RANGE, 8)
                .add(Attributes.FALL_DAMAGE_MULTIPLIER, 0);
    }

    public void aiStep() {
        super.aiStep();
        Vec3 motion = this.getDeltaMovement();
        if (!this.onGround() && motion.y < 0.0) {
            this.setDeltaMovement(motion.multiply(1.0, 0.4, 1.0));
        }
    }

    public void tick() {
        super.tick();
        if(this.level().isClientSide()) {
            boolean standing = this.onGround() && this.getDeltaMovement().horizontalDistanceSqr() < 0.1;
            boolean falling = !this.onGround() && !this.isInWater();

            this.idleAnimationState.animateWhen(standing, this.tickCount);
            this.flyAnimationState.animateWhen(falling, this.tickCount);
        }
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }
}
