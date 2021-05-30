package com.github.frango28.mcplugin.serversupport

import org.bukkit.command.ConsoleCommandSender
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin(){
    companion object{
        internal lateinit var plugin: JavaPlugin
        internal lateinit var console: ConsoleCommandSender
    }

    override fun onEnable() {
        plugin=this
        console=server.consoleSender

        registerListeners()
    }

    override fun onDisable() {

    }

    private fun registerListeners(){

    }

}
