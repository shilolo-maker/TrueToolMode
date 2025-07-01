package com.shilo.truetool.events;


import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;

public class HandlerAttackBlock {

    private static boolean isRegister = true;

    public static void register() {

        AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
            if (!world.isClient || player.isSpectator() || player.isCreative() || !isRegister) return ActionResult.PASS;

            BlockState state = world.getBlockState(pos);

            boolean found = false;

            for (int i = 0; i < 9; i++) {
                ItemStack stack = player.getInventory().getStack(i);

                if (!stack.isEmpty() && stack.isSuitableFor(state)){
                   float speedBreaking = stack.getMiningSpeedMultiplier(state);
                   player.getInventory().selectedSlot = i;
                   found = true;

                    for (int j = 0; j < 9;) {
                        ItemStack Stack = player.getInventory().getStack(j);
                        float speedBreaking2 = Stack.getMiningSpeedMultiplier(state);

                        if (speedBreaking2 > speedBreaking){
                            player.getInventory().selectedSlot = j;
                            speedBreaking = speedBreaking2;
                        }

                        j++;
                    }

                    return ActionResult.PASS;
                }
            }
            if (!found){

                return ActionResult.PASS;
            }

            return null;
        });
    }
    public static void unRegister() {
        isRegister = false;
    }

    public static void Register () {
        isRegister = true;
    }
}

