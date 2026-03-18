interface square {
    int calc(int x);
    default void hello() {
        System.out.println("Hello from the square interface!");
    }
    static void bye() {
        System.out.println("Goodbye from the square interface!");
    }

}

void main() {
    square sq = (x) -> x * x;
    System.out.println("Square of 5: " + sq.calc(5));
    System.out.println("Square of 25: " + sq.calc(25));
    System.out.println("Square of 55: " + sq.calc(55));
    sq.hello();
    square.bye(); // static member can be accessed by interface name 
}