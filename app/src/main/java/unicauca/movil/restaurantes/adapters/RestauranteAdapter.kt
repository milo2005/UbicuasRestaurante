package unicauca.movil.restaurantes.adapters

import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import unicauca.movil.restaurantes.R
import unicauca.movil.restaurantes.model.Restaurante

class RestauranteAdapter:RecyclerView.Adapter<RestauranteAdapter.RestauranteViewHolder>(){

    var data:List<Restaurante> = emptyList()

    override fun onBindViewHolder(holder: RestauranteViewHolder, position: Int) {
        val res = data[position]
        holder.title.text = res.nombre
        holder.phone.text = res.telefono
        holder.place.text = res.direccion
        Picasso.with(holder.img.context)
                .load(Uri.parse(res.img))
                .into(holder.img)
    }

    override fun getItemCount(): Int = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {
        val view:View = View.inflate(parent.context, R.layout.template_restaurante, null)
        return RestauranteViewHolder(view)
    }


    class RestauranteViewHolder(view: View):RecyclerView.ViewHolder(view){
        val title = view.findViewById<TextView>(R.id.title)
        val img = view.findViewById<ImageView>(R.id.img)
        val place = view.findViewById<TextView>(R.id.place)
        val phone =  view.findViewById<TextView>(R.id.phone)
    }
}
