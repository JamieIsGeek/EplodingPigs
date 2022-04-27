package dev.jamieisgeek.exploding_pigs.events;

import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class ExplodingPigsListener implements Listener {

    @EventHandler
    public void onAnimalHit(EntityDamageByEntityEvent e) {

        if(e.getEntityType() == EntityType.PIG) {

            if(e.getDamager() instanceof Player) {
                Player p = (Player) e.getDamager();
      
                e.setDamage(600);

                Location loc = e.getEntity().getLocation();


                TNTPrimed tntPrimed = (TNTPrimed) p.getWorld().spawnEntity(loc, EntityType.PRIMED_TNT);
                tntPrimed.setSilent(true);
                tntPrimed.setIsIncendiary(true);
                tntPrimed.setFuseTicks(0);
                tntPrimed.setYield(15);


            }
        }


    }
}
