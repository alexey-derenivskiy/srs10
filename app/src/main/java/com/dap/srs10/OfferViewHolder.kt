package com.dap.srs10

import android.renderscript.ScriptGroup
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class OfferViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val offerImageView : ImageView = itemView.findViewById(R.id.offer_image_view)

    fun bind(offer: Offer){
        offerImageView.setImageResource(offer.image)
        offerImageView.contentDescription = offer.link
    }
}