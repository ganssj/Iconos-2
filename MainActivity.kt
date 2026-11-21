package com.vitroglass.icons

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * VitroGlass Icon Pack — Companion & One-Tap Launcher Applier
 * Tema configurado: personalizado (Squircle n=2.5, Trazo=1.7px)
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun applyToLauncher(launcherId: String) {
        val intent = when (launcherId) {
            "nova" -> Intent("com.teslacoilsw.launcher.APPLY_ICON_THEME").apply {
                setPackage("com.teslacoilsw.launcher")
                putExtra("com.teslacoilsw.launcher.extra.ICON_THEME_PACKAGE", packageName)
            }
            "lawnchair" -> Intent("app.lawnchair.APPLY_ICONS").apply {
                setPackage("app.lawnchair")
                putExtra("packageName", packageName)
            }
            "smart" -> Intent("ginlemon.smartlauncher.setGSLTHEME").apply {
                putExtra("package", packageName)
            }
            "action" -> Intent("com.actionlauncher.playstore.APPLY_ICON_PACK").apply {
                putExtra("packageName", packageName)
            }
            "hyperion" -> Intent("projekt.launcher.APPLY_ICON_PACK").apply {
                setPackage("projekt.launcher")
                putExtra("packageName", packageName)
            }
            else -> packageManager.getLaunchIntentForPackage(launcherId)
        }

        try {
            if (intent != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "Lanzador no instalado en el dispositivo", Toast.LENGTH_SHORT).show()
            }
        } catch (e: Exception) {
            Toast.makeText(this, "Aplica el tema desde los ajustes de tu lanzador", Toast.LENGTH_LONG).show()
        }
    }
}
