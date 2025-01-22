package EX_02;

class Car {
    public void display() {
        System.out.println("car body");
    }
}

public class BMW extends Car {

    public void display() {
        super.display();
        System.out.println("blue");
    }

    public static void main(String[] args) {
        BMW b = new BMW();

        b.display();
    }
}
