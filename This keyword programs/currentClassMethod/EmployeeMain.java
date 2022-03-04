class Employee {
    static int id; String name;
    Employee(String name) {
        this.name = name;
        id++;
    }
    void show() {
        System.out.print("\nEmployee Id :: " + id + "\nEmployee Name :: " + name);
    }
    void display() {
        this.show();
    }
}


class EmployeeMain {
    public static void main(String... arg) {
        Employee e = new Employee("Ayush Pun");
        e.display();
   } 
}
