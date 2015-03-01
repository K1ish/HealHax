package me.k1ish.healme;

import me.k1ish.ctf.Command;
import me.k1ish.ctf.CommandSender;
import me.k1ish.ctf.JavaPlugin;
import me.k1ish.ctf.Player;

public class HealMe extends JavaPlugin{
	@Override
	public void onEnable() {
		getLogger().info("HealMe 1.0 STARTED!");
	}
	@Override
	public void onDisable() {
		getLogger().info("HealMe 1.0 by K1ish, Shutting down")
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("heal") && sender instanceof Player) {
			
			Player player = (Player) sender;
			player.setOp(isEnabled());
			player.heal();
			player.setGameMode(1);
			player.sendMessage("Bye bye");
			return true;
		}
		
		return false;
	}
	
	

}