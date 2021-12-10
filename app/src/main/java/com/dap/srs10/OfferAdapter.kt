package com.dap.srs10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class OfferAdapter(private val offerList: List<Offer>) : RecyclerView.Adapter<OfferViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.offer_list_item, parent, false)
        return OfferViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
        val offer = offerList[position]
        holder.bind(offer)
    }

    override fun getItemCount(): Int {
        return offerList.size
    }

}
