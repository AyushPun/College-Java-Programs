class Address {
    String city, state, country;
    Address(String city, String state, String country) {
      this.city = city;
      this.state = state;
      this.country = country;
    }
  }
  
  class Employee {
    int id; String name; Address ad;
    Employee(int id, String name, Address ad) {
      this.id = id;
      this.name = name;
      this.ad = ad;
    }
    void show() {
      System.out.print("\nId :: " + id + "\nName :: " + name + "\nCity :: " + ad.city + "\nState :: " + ad.state + "\nCountry :: " + ad.country);
    }
  }
  
  class Aggregation {
      public static void main(String... arg) {
       Address ad1 = new Address("Uttam Nagar", "Delhi", "India");
      Employee emp1 = new Employee(1, "Ayush Pun", ad1);
      emp1.show();
      }
  }