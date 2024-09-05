
class Complete1 {
    String a;
    byte b;

    public Complete1(String a, byte b) {
        this.a = a;
        this.b = b;
    }
}

class Complete2 {
    public int power(int num, int exponent) {
        return (int) Math.pow(num, exponent);
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

class Complete3 {
    int x;
    int y;

    public Complete3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public int subtract() {
        return x - y;
    }
}

public class CompleteMain {
    public static void main(String[] args) {
        Complete1 complete1 = new Complete1("Hello", (byte) 10);
        System.out.println("Complete1: a = " + complete1.a + ", b = " + complete1.b);

        Complete2 complete2 = new Complete2();
        int square = complete2.power(5, 2);
        int cube = complete2.power(5, 3);
        int sum = complete2.add(10, 20);
        System.out.println("Complete2: square = " + square + ", cube = " + cube + ", sum = " + sum);

        Complete3 complete3 = new Complete3(10, 5);
        complete3.display();
        int difference = complete3.subtract();
        System.out.println("Complete3: difference = " + difference);
    }
}