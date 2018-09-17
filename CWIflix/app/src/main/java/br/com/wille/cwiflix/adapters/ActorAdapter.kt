package br.com.wille.cwiflix.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.wille.cwiflix.R
import br.com.wille.cwiflix.models.Person
import br.com.wille.cwiflix.utils.ImageURLProvider
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_actors.view.*

class ActorAdapter(val items: List<Person>) : RecyclerView.Adapter<ActorAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_actors, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        Picasso
            .with(holder.itemView.context)
            .load(ImageURLProvider.large(item.photo))
            .into(holder.posterImageView)

        holder.nameTextView.text = item.name
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val posterImageView = itemView.posterImageView
        val nameTextView = itemView.nameTextView
    }
}