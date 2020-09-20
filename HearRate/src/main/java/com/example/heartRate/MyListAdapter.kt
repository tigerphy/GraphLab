package com.example.heartRate

import android.bluetooth.le.ScanResult
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.list_item.view.*


class MyListAdapter(val context: Context, val deviceList: ArrayList<ScanResult>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(
            R.layout.list_item, null
        ) as ConstraintLayout

        view.name.text = deviceList[position].device.name
        view.mac.text = deviceList[position].device.address
        view.rssi.text = deviceList[position].rssi.toString()
        return view

    }

    override fun getItem(position: Int): Any {
        return deviceList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return deviceList.size
    }

    fun add(device: ScanResult) {
        deviceList.add(device)
        notifyDataSetChanged()
    }

}