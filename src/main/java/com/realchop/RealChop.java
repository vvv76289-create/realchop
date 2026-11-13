package com.realchop;

import com.realchop.net.ChopNetwork;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(RealChop.MODID)
public class RealChop {
    public static final String MODID = "realchop";

    public RealChop(IEventBus modBus, ModContainer container) {
        container.registerConfig(ModConfig.Type.COMMON, ChopConfig.SPEC);
        modBus.addListener(ChopNetwork::register);
    }
}
