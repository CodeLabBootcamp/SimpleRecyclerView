package camp.codelab.dynamiclayout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val e1 = Employee("Haider", 1000f, "Marketing")
        val e2 = Employee("Fadhil", 0f, "Free")
        val e3 = Employee("Qais", 2000f, "Couple With Layla")
        val e4 = Employee("Sarmad", 205f, "Butterfly")
        val e5 = Employee("Sasuki", 10000f, "Bodyguard")


        val employeeList = listOf(e1, e2, e3, e4, e5, e1, e2, e3, e4, e5, e1, e2, e3, e4, e5)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = EmployeesAdapter(employeeList)


    }
}
