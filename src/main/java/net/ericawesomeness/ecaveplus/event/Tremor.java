package net.ericawesomeness.ecaveplus.event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.event.level.ExplosionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.List;

public class Tremor {

    @SubscribeEvent
    public static void onExplosion(ExplosionEvent explosion){
        int range = 5;
        AABB box = new AABB(event.getExplosion().getPosition()).inflate(range);
        List<Player> players = explosion.getLevel().getEntitiesOfClass(Player.class, box, player -> explosion.getExplosion().getPosition().distanceTo(player.position()) < range);
    }
}
