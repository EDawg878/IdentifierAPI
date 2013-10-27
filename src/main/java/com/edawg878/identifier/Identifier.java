package com.edawg878.identifier;


public interface Identifier {
	
	/**
	 * Gets the player's Mojang Account UUID
	 * 
	 * @param playerName Name of the player
	 * @return String UUID of the given player
	 */
	String getPlayerUUID(String playerName);
	
}