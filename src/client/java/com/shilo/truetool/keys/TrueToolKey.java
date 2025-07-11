package com.shilo.truetool.keys;

import com.shilo.truetool.events.HandlerAttackBlock;
import com.shilo.truetool.events.HandlerKeyB;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

import javax.swing.text.JTextComponent;

public class TrueToolKey {

    public static KeyBinding activeKey;


    public static void setActiveKey() {
        activeKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "TrueTool Active",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_B,
                "TrueTool mod keys"
        ));
    }
}
