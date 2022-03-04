class Employee {
    static int id; String name;
    Employee(String name) {
        this.name = name;
        id++;
    }
    void display(Employee obj) {
        System.out.print("\nEmployee Id :: " + id + "\nEmployee Name :: " + name);
    }
    void get() {
        display(this);
    }
}

class EmployeeMain {
   public static void main(String... arg) {
        Employee e = new Employee("Ayush Pun");
        e.get();
   } 
}
