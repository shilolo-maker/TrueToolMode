package com.shilo.truetool.events;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

import static com.shilo.truetool.keys.TrueToolKey.activeKey;

public class HandlerKeyB {

    private static boolean active = false;

    public static void eventKeyB () {
        ClientTickEvents.END_CLIENT_TICK.register(minecraftClient -> {

            while (activeKey.wasPressed()){
                active = !active;

                if (active) {
                    HandlerAttackBlock.Register();
                    HandlerAttackBlock.register();
                } else {
                    HandlerAttackBlock.unRegister();
                }
            }
           });
       }
    }
