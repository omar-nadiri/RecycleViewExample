package ge.btu.recycleviewexample

import MyRecyclerViewAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ge.btu.recycleviewexample.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Sample data for the RecyclerView
        val dataList = List(20) { "Item ${it + 1}" }

        // Set up the RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MyRecyclerViewAdapter(dataList)
    }
}