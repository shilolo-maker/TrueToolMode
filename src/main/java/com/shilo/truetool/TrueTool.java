package com.shilo.truetool;

import com.shilo.truetool.events.HandleAttackBlock;
import com.sun.jdi.event.ModificationWatchpointEvent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.command.argument.BlockStateArgumentType;
import net.minecraft.util.ActionResult;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;



public class TrueTool implements ModInitializer {
    public static final String MOD_ID = "truetool";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        HandleAttackBlock.register();

    }
}
