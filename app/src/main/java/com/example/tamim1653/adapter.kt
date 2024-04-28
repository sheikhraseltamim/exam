package com.example.tamim1653

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class adapter(private val context: Activity, private val title:Array<String>, private val desc:Array<String>, private val imageId:Array<Int>):ArrayAdapter<String>(context, title, desc, imageId) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater =context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_item,parent, false)
        val title = rowView.findViewById<TextView>(R.id.playerName)


    }

}