package com.act.autowood

import org.bukkit.plugin.java.JavaPlugin

class ActAutoWood: JavaPlugin() {
    override fun onEnable() {
        AutoWoodTask().runTaskTimer(this, 0L, 3600)
    }
}