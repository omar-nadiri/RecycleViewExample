package ge.btu.recycleviewexample

import ViewPagerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ge.btu.recycleviewexample.databinding.ActivityViewPagerBinding

class ViewPagerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewPagerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding
        binding = ActivityViewPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Sample data for the ViewPager
        val dataList = listOf("Page 1", "Page 2", "Page 3", "Page 4", "Page 5")

        // Set up the ViewPager2
        val adapter = ViewPagerAdapter(dataList)
        binding.viewPager.adapter = adapter
    }
}