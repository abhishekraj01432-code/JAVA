import java.util.function.*;
@FunctionalInterface
interface Test{
    int calc(int a,int b);
}
class Tester{
    public String hello (int a){
        return a + "";
    }
    Function <Integer,String>hello2 = (i)->"Value ="+i;
    Function <Integer,String>hello3 = (i)->{
        i = i+100;
        return "Value ="+i;};
    public static void main(String[] args) {
        Tester t = new Tester();
        System.out.println(t.hello(25));
        System.out.println(t.hello2.apply(50));
        System.out.println(t.hello3.apply(50));
        Test add = (a,b)-> a + b;
        Test mult =(a,b)->a*b;
        Test div =(a,b)->a/b;
        Test sub =(a,b)-> {
            return a-b;
        };

        System.out.println(add.calc(10,15));
        System.out.println(sub.calc(10,15));
        System.out.println(mult.calc(10,15));
        System.out.println(div.calc(10,15));
    }
}