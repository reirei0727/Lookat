package lookat.lookat;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class EventListener implements Listener {
    @EventHandler
    public void onLook(PlayerMoveEvent e){
        if(start.ss == false)return;
        Player p = e.getPlayer();
        Location l = p.getTargetBlock(null,300).getLocation();
        if(l.getBlock().getType() == Material.AIR)return;
        if(l.getBlock().getType() == Material.END_PORTAL)return;
        if(l.getBlock().getType() == Material.END_PORTAL_FRAME)return;
        l.getBlock().setType(Material.DIAMOND_BLOCK);
    }

}
