package com.cobbleopolis.cobblestonestudios

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import android.view.{Menu, MenuItem}

//remove if not needed

class CobblestoneActivity extends ActionBarActivity {

    var logout: AlertDialog.Builder = null
    var settings: AlertDialog.Builder = null

    protected override def onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)

        logout = new AlertDialog.Builder(this)
        logout.setTitle("Do you want to logout?")
        logout.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            def onClick(dialog: DialogInterface, whichButton: Int): Unit = {

            }
        })
        logout.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

            def onClick(dialog: DialogInterface, whichButton: Int): Unit = {
            }
        })

        settings = new AlertDialog.Builder(this)
        settings.setTitle(R.string.settings_title)
        settings.setItems(R.array.media_names, new DialogInterface.OnClickListener() {
            def onClick(dialog: DialogInterface, which: Int): Unit = {

            }
        })


        setContentView(R.layout.activity_cobblestone)
    }

    override def onCreateOptionsMenu(menu: Menu): Boolean = {
        getMenuInflater.inflate(R.menu.menu_cobblestone, menu)
        true
    }

    override def onOptionsItemSelected(item: MenuItem): Boolean = {
        val id = item.getItemId
        if (id == R.id.action_settings) {
            settings.show()
            return true
        } else if (id == R.id.action_logout) {
            logout.show()
            return true
        }
        super.onOptionsItemSelected(item)
    }

    override def onBackPressed() {
        logout.show()
    }
}