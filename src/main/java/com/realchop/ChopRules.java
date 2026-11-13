package com.realchop;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;

public final class ChopRules {
    /** Log + axe in main hand, survival-like mode. Used on both client and server. */
    public static boolean isChoppable(Player p, BlockState s) {
        return !p.isCreative() && !p.isSpectator()
                && s.is(BlockTags.LOGS)
                && p.getMainHandItem().is(ItemTags.AXES);
    }

    private ChopRules() {}
}
