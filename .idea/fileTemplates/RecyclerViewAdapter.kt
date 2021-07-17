#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME} #end

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

#parse("File Header.java")
class ${NAME}(
   val context: Context, 
   var items:ArrayList<${Item_Class}>
): RecyclerView.Adapter<${NAME}.MyViewHolder>() {

   class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)
   
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.${Layout_Res_Id}, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val view = holder.itemView
        // init and handle events
    }

    override fun getItemCount(): Int {
        return items.size
    }
}