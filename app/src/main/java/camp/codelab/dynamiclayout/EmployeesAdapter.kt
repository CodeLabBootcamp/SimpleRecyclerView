package camp.codelab.dynamiclayout

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_employee.view.*

class EmployeesAdapter : RecyclerView.Adapter<EmployeesAdapter.EmployeeViewHolder> {

    var employeesList: List<Employee>

    constructor(employeesList: List<Employee>) : super() {
        this.employeesList = employeesList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_employee, parent, false)
        return EmployeeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return employeesList.size
    }

    override fun onBindViewHolder(viewHolder: EmployeeViewHolder, position: Int) {
        viewHolder.setEmployee(employeesList[position])
    }


    class EmployeeViewHolder : RecyclerView.ViewHolder {

        val view: View

        constructor(view: View) : super(view) {
            this.view = view
        }

        fun setEmployee(employee: Employee) {
            view.nameTextView.text = employee.name
            view.salaryTextView.text = employee.salary.toString()
            view.departmentTextView.text = employee.department
        }

    }
}