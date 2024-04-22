package net.ericawesomeness.ecaveplus.event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.level.ExplosionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Tremor {

    @SubscribeEvent
    public static void onExplosion(ExplosionEvent explosion){
        for (Player player : explosion.getLevel().getEntitiesOfClass(Player.class)){
            if (explosion.getExplosion().getPosition() ){

            }
        }
    }
}
