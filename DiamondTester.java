
interface A{
    default void hello(){
        System.out.println("hello from A");
    }
}

interface B{
    default void hello(){
        System.out.println("hello from B");
    }
}

class child implements A,B{
    @Override
    public void hello(){
        System.out.println("Overriden by childA");
    }
    public void bye(){
        A.super.hello();
        B.super.hello();
    }
}

public class DiamondTester {
    public static void main(String[] args) {
        DiamondTester tester = new DiamondTester();
        System.out.println("hello from main");
    }
}