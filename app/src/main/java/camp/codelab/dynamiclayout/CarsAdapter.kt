package camp.codelab.dynamiclayout

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.item_car.view.*


class CarsAdapter : RecyclerView.Adapter<CarsAdapter.CarsViewHolder> {

    // carsList of items
    val carsList: List<Car>

    // constructor to pass the items from Activity
    constructor(carsList: List<Car>) : super() {
        this.carsList = carsList
    }

    // inflate the layout you created in res/layout
    // and return a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsAdapter.CarsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_car, parent, false)
        return CarsViewHolder(view)
    }

    // get the count of carsList items to create rows accordingly
    override fun getItemCount(): Int {
        return carsList.size
    }

    // bind data and layout using the viewHolder and position to get data from carsList
    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {

        holder.carNameTextView.text = carsList[position].name
        holder.carMakeTextView.text = carsList[position].make
        holder.carModelTextView.text = carsList[position].model.toString()
        holder.carColorTextView.text = carsList[position].color

    }


    // this is the ViewHolder's class
    class CarsViewHolder : RecyclerView.ViewHolder {

        val carNameTextView: TextView
        val carMakeTextView: TextView
        val carModelTextView: TextView
        val carColorTextView: TextView

        constructor(view: View) : super(view) {
            carNameTextView = view.carNameTextView
            carMakeTextView = view.carMakeTextView
            carModelTextView = view.carModelTextView
            carColorTextView = view.carColorTextView
        }
    }

}