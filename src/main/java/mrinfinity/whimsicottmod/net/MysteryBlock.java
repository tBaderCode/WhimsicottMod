package mrinfinity.whimsicottmod.net;

import mrinfinity.whimsicottmod.net.entity.WhimsicottEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MysteryBlock extends CropBlock {
    public static final int MAX_AGE = 3;
    public static final IntegerProperty AGE;
    private static final VoxelShape[] SHAPES;

    public MysteryBlock(final BlockBehaviour.Properties properties) {
        super(properties);
    }

    protected IntegerProperty getAgeProperty() { return AGE; }

    public int getMaxAge() {return MAX_AGE;}

    protected ItemLike getBaseSeedId() {return ModItems.MYSTERY_SEED;}

    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random){
        if (random.nextInt(3) != 0) {
            super.randomTick(state, level, pos, random);
        }
    }

    protected int getBonemealAgeIncrease(Level level) {
        return super.getBonemealAgeIncrease(level) / 3;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{AGE});
    }

    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPES[this.getAge(state)];
    }

    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player)
    {
        if (!level.isClientSide() && this.getAge(state) == MAX_AGE) {
            WhimsicottEntity entity = new WhimsicottEntity(level);
            entity.setPos(pos.getX()+0.5, pos.getY()+0.5, pos.getZ()+0.5);
            level.addFreshEntity(entity);
        }
        return super.playerWillDestroy(level, pos, state, player);
    }

    static {
        AGE = BlockStateProperties.AGE_3;
        SHAPES = Block.boxes(3, (age) -> Block.column((double)16.0F, (double)0.0F, (double)(2 + age * 2)));
    }
}
