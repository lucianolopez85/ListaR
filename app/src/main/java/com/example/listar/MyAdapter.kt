package com.example.listar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(
    var mCtx: Context,
    var resource: Int,
    var items:List<Model>
): ArrayAdapter<Model>(mCtx, resource, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resource, null)

        val imageView:ImageView = view.findViewById(R.id.image)
        val titleTextView:TextView = view.findViewById(R.id.title)
        val descriptionTextView:TextView = view.findViewById((R.id.description))

        var mItem:Model = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        titleTextView.text = mItem.title
        descriptionTextView.text = mItem.description

        return view
    }
}