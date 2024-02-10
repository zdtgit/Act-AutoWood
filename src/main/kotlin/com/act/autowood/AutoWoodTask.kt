package com.act.autowood

import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.scheduler.BukkitRunnable

class AutoWoodTask: BukkitRunnable() {
    override fun run() {
        for (player in Bukkit.getOnlinePlayers()) {
            player.inventory.addItem(ItemStack(Material.OAK_LOG, 64))
            player.sendMessage(MiniMessage.miniMessage().deserialize("<green>나무<gray>가 지급되었습니다"))
        }
    }
}