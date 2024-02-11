package com.act.autowood

import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.scheduler.BukkitRunnable

class AutoWoodTask: BukkitRunnable() {
    private var count = 0

    override fun run() {
        if (count <= 0) {
            for (player in Bukkit.getOnlinePlayers()) {
                player.inventory.addItem(ItemStack(Material.OAK_LOG, 64))
            }

            Bukkit.broadcast("<green>나무<gray>가 지급되었습니다".mini)

            count = 60
        } else {
            for (player in Bukkit.getOnlinePlayers()) {
                player.sendActionBar("<blue>나무 <gray>지급까지 <green>${count}초".mini)
            }
        }

        count--
    }

        private val String.mini
        get() = MiniMessage.miniMessage().deserialize(this)
}