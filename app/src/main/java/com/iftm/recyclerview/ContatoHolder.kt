package com.iftm.recyclerview

import android.view.TextureView
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ContatoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val nome:TextureView?=itemView.findViewById(R.id.tv_nome)
    val email:TextureView?=itemView.findViewById(R.id.tv_email)
    val contador:TextureView?=itemView.findViewById(R.id.tv_contador)


}