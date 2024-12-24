import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ge.btu.recycleviewexample.databinding.ViewPagerItemBinding

class ViewPagerAdapter(private val dataList: List<String>) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ViewPagerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: String) {
            binding.textViewPage.text = data
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewPagerItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size
}