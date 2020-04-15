package com.example.sqlitetest6

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

import java.util.ArrayList

class CustomAdapter(private val context: Context, private val userModelArrayList: ArrayList<UserModel>) :
    BaseAdapter() {


    override fun getCount(): Int {
        return userModelArrayList.size
    }

    override fun getItem(position: Int): Any {
        return userModelArrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val holder: ViewHolder

        if (convertView == null) {
            holder = ViewHolder()
            val inflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.lv_item, null, true)

            holder.tvname = convertView!!.findViewById(R.id.name) as TextView
            holder.tvcountry = convertView.findViewById(R.id.title) as TextView
            holder.tvstate = convertView.findViewById(R.id.link) as TextView

            convertView.tag = holder
        } else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = convertView.tag as ViewHolder
        }

        holder.tvname!!.text = "Name: " + userModelArrayList[position].getNames()
        holder.tvcountry!!.text = "Title: " + userModelArrayList[position].getTitles()
        holder.tvstate!!.text = "Link: " + userModelArrayList[position].getLinks()

        return convertView
    }

    private inner class ViewHolder {

        var tvname: TextView? = null
        var tvcountry: TextView? = null
        var tvstate: TextView? = null
    }

}