package edu.trincoll.hr

// Abstract class Employee should have:
//   - a name of type String
//   - an id of type Int.
// It should implement the Comparable interface with the
// compareTo method.
//
// It should include an abstract method pay()
// that returns a Double.
//
// It should override the toString method to
// return a string with the name and id of the employee.
abstract class Employee(val name: String, val id: Int): Comparable<Employee>{

        // Abstract method pay(), to be implemented by subclasses
        abstract fun pay(): Double

        // Implementation of the Comparable interface
        override fun compareTo(other: Employee): Int {
            // First compare by pay
            val payComparison = pay().compareTo(other.pay())
            if (payComparison != 0) {
                return payComparison
            }

            // If pay is the same, compare by name
            val nameComparison = name.compareTo(other.name)
            if (nameComparison != 0) {
                return nameComparison
            }

            // If both pay and name are the same, compare by id
            return id.compareTo(other.id)
        }

        // Override the toString method
        override fun toString(): String {
            return "Employee(name=$name, id=$id)"
        }
}