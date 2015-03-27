package io.github.ryanz12;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ClientPing extends JavaPlugin implements Listener
{
	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
		
		reloadConfig();
	}
	
	@EventHandler
	public void onPing(ServerListPingEvent e){
		int playercount = e.getNumPlayers();
		e.setMaxPlayers(playercount+1);
		e.setMotd("");
	}
	
	public void onDisable(){}
}
