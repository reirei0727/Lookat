package lookat.lookat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class start {
    public static int count = 6;
    public static int c;
    public static boolean ss = false;

    public static void start() {
        new BukkitRunnable() {
            @Override
            public void run() {
                c = count - 1;
                count--;
                for (Player p : Bukkit.getOnlinePlayers()) {

                    p.sendMessage("ゲーム開始まで" + c);
                    Location loc = p.getLocation();
                    loc.getWorld().playSound(loc, Sound.BLOCK_NOTE_BLOCK_HARP, 1F, 10);

                }

                if (count == 0) {
                    for (Player p : Bukkit.getOnlinePlayers()) {
                        Location loc = p.getLocation();
                        p.sendTitle(ChatColor.AQUA + "GAME START", "見た場所がダイヤになる世界", 40, 80, 40);
                        loc.getWorld().playSound(loc, Sound.ENTITY_WITHER_SPAWN, 0.5F, 1);
                        ss = true;
                        this.cancel();
                    }
                }
            }
        }.runTaskTimer(Main.getPlugin(), 60L, 20L);
    }
}