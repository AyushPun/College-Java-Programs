class test {
    public static void main(String[] args) {
        System.out.println("Connecting to a selected database...");
        System.out.println("Connected database successfully");
        System.out.println("Inserting records into the table...");
        int i=0;
        String empname[] = {"Ayush Pun", "Tony", "Peter", "Bruce", "Steve"};
        int age[] = {19, 20, 32, 40, 15};
        while(i<5) {
            System.out.println(i + " " + empname[i] + " " + age[i]);
            i++;
        }
    }
}