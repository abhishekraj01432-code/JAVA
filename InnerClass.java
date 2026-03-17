// Inner Class
//1. Member Inner Class
//2. Static Inner Class 
//3. Local Inner Class
//4. Anonymous Inner Class

class Outer{
    void funOut(){
        System.out.println("I am the Outer Fun");
    }
    // Inner class can access the members of outer class directly
    class Inner {
        void funIn(){
            System.out.println("I am the Inner Fun");
            funOut();
        }
    }

    void test(){
        // outer class can access the members of inner class by creating the object of inner class
        Inner inObj = new Inner();
        inObj.funIn();
    }
}

void main (){
    System.out.println("Inner Class");
    Outer oObj = new Outer();
    oObj.funOut();
    oObj.test();
 //oObj.funIn(); // cannot access the inner class method directly from outer class object
    Outer.Inner inObj = oObj.new Inner();
    inObj.funIn();
    Outer.Inner inObj2 = new Outer().new Inner();
    inObj2.funIn();
    }