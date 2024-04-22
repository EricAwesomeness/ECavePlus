package net.ericawesomeness.ecaveplus.event;

import net.minecraftforge.event.level.ExplosionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Tremor {



    @SubscribeEvent
    public static void onExplosion(ExplosionEvent explosion){
        if (explosion.getExplosion().getPosition() ){}
    }
}
