package com.shilo.truetool.client;

import com.ibm.icu.impl.StaticUnicodeSets;
import com.shilo.truetool.events.HandlerKeyB;
import com.shilo.truetool.keys.TrueToolKey;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.option.KeyBinding;

import javax.swing.text.JTextComponent;

public class TrueToolClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        TrueToolKey.setActiveKey();
        HandlerKeyB.eventKeyB();

    }
}
