package me.embarker.tauryuu.taurportal;

import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class TaurPortalListener extends PlayerListener {
	
    public void onPlayerPortal(PlayerPortalEvent event) {
    	event.setCancelled(true);
    	return;
    }
    
    public void onPlayerTeleport(PlayerTeleportEvent event) {
        World targetWorld = event.getWorld();
        Environment env = targetWorld.getEnvironment();
        if(targetWorld.getEnvironment() == Environment.THE_END) {
        	event.setCancelled(true);
        }
}
    
}
