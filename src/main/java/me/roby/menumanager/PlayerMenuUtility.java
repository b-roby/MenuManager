package me.roby.menumanager;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class PlayerMenuUtility {

    private final Player owner;

    private static final HashMap<Player, PlayerMenuUtility> playerMenuUtilityMap = new HashMap<>();

    public PlayerMenuUtility(Player p) {
        this.owner = p;
    }

    public Player getOwner() {
        return owner;
    }

    public static PlayerMenuUtility getPlayer(Player player) {
        return playerMenuUtilityMap.get(player);
    }

    public static void putPlayer(Player player){
        PlayerMenuUtility playerMenuUtility = new PlayerMenuUtility(player);
        playerMenuUtilityMap.put(playerMenuUtility.getOwner(), playerMenuUtility);
    }

    public static boolean isPlayerInMenu(Player player){
        return playerMenuUtilityMap.containsKey(player);
    }

}

