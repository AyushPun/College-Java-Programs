class Prog2 {
    public static void main(String[] args) {
        outerloop:      //label
        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                if (i*j>2) {
                    System.out.println("Breaking");
                    break outerloop;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Done");
    }
}
