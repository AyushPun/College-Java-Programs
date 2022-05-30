class box {
    int l, b, h, a;
    box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
        System.out.println("Length of box in 'box' class: " + l);
        System.out.println("Height of box in 'box' class: " + b);
        System.out.println("Breadth of box in 'box' class: " + h);
        System.out.println();
    }
    void area() {
        a = l * b;
    }
}

class box_weight extends box {
    int w;
    box_weight(int l, int b, int h, int w) {
        super(l, b, h);// object creation of super class
        this.w = w;
        System.out.println("Weight: " + w);
        System.out.println("Length of box in 'box_weight' class: " + l);
        System.out.println("Height of box in 'box_weight' class: " + b);
        System.out.println("Breadth of box in 'box_weight' class: " + h);
        System.out.println();
    }
}
class shipment extends box_weight {
    int cost;
    shipment(int l, int b, int h, int cost) {
        super(l, b, h, cost);
        this.cost = cost;
        System.out.println("Cost: " + cost);
        System.out.println("Length of box in 'shipment' class: " + l);
        System.out.println("Height of box in 'shipment' class: " + b);
        System.out.println("Breadth of box in 'shipment' class: " + h);
        System.out.println();
    }
}

// Multilevel inheritance
class Prog8 {
    public static void main(String args[]) {
        box b = new box(1, 2, 3);
        box_weight s = new box_weight(10, 20, 30, 100);
        shipment d = new shipment(40, 50, 60, 500);
    }
}
