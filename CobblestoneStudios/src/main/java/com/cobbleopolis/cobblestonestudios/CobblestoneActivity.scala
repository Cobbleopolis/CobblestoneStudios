package com.cobbleopolis.cobblestonestudios

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v7.app.{ActionBar, ActionBarActivity}
import android.view.{Menu, MenuItem}

//remove if not needed

class CobblestoneActivity extends ActionBarActivity {

    protected override def onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
//        val actionBar: ActionBar = getSupportActionBar
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.RED)); // set your desired color
        setContentView(R.layout.activity_cobblestone)
    }

    override def onCreateOptionsMenu(menu: Menu): Boolean = {
        getMenuInflater.inflate(R.menu.menu_cobblestone, menu)
        true
    }

    override def onOptionsItemSelected(item: MenuItem): Boolean = {
        val id = item.getItemId
        if (id == R.id.action_settings) {
            return true
        }
        super.onOptionsItemSelected(item)
    }
}