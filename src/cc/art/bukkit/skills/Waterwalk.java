package cc.art.bukkit.skills;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Waterwalk implements Listener {

	public Waterwalk(Main main) {
		// TODO Auto-generated constructor stub
	}

	@EventHandler
	public void onPlayerMove(final PlayerMoveEvent event) {
	Player player = event.getPlayer();
	Location loc = player.getLocation();
	Location loc2 = player.getLocation();
	Location loc3 = player.getLocation();
	loc.setY(loc.getY() - 1);
	loc2.setY(loc.getY()- 1);
	loc3.setY(loc.getY()- 1);
	loc2.setX(loc2.getX() + 1);
	loc2.setZ(loc2.getZ() - 1);
	loc3.setX(loc3.getX() - 1);
	loc3.setZ(loc3.getZ() + 1);
	Material block = loc.getBlock().getType();
	if (block == Material.WATER || block == Material.STATIONARY_WATER)
		if (player.hasPermission("art.test")) {
		loc.getBlock().setType(Material.ICE);
		}
	}
}