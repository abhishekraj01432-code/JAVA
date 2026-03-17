interface parent {
    default void hello() {
        System.out.println("Hello default Method");
    }
}

class child implements parent {
    public void bye () {
        System.out.println("I am the child Method");
        hello();
    }
}

class child2 implements parent {
    @Override
    public void hello() {
        System.out.println("Hello overriden by child2");
    }
}   

public class DefaultTester {
    public static void main(String[] args) {
        child c = new child();
        c.hello();
        c.bye();
        parent p = new child();
        p.hello();
        child2 c2 = new child2();
        c2.hello();
        parent p2 = new child2();
        p2.hello();
    }
}

