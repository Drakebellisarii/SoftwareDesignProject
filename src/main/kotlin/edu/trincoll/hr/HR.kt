package edu.trincoll.hr

// The HR class should have:
//   - a list of employees
//   - a hire method that takes an employee and returns a new HR object with that employee added
//   - a fire method that takes an id and returns a new HR object with the employee with that id removed
//   - a payEmployees method that returns the total pay of all employees
class HR(private val employees: List<Employee> = emptyList()) {
    // Method to hire a new employee (returns a new HR object with the added employee)
    fun hire(employee: Employee): HR {
        // Create a new list of employees with the new employee added
        val updatedEmployees = employees + employee
        // Return a new HR object with the updated list
        return HR(updatedEmployees)
    }

    // Method to fire an employee by id (returns a new HR object with the employee removed)
    fun fire(id: Int): HR {
        // Create a new list of employees with the employee of the given id removed
        val updatedEmployees = employees.filter { it.id != id }
        // Return a new HR object with the updated list
        return HR(updatedEmployees)
    }

    // Method to calculate the total pay of all employees
    fun payEmployees(): Double {
        // Sum the pay of all employees
        return employees.sumOf { it.pay() }
    }

    // Optional: Override the toString method to display the current list of employees
    override fun toString(): String {
        return employees.joinToString(separator = "\n") { it.toString() }
    }
}