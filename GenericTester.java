class Item<T>{
    T a,b;
    public Item(T p, T q){
        a = p;
        b = q;
    }

    void swap(){
        System.out.println("Before swap: a = " + a + ", b = " + b);
        T temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
        show();
    }

    void show(){
        System.out.println("a = " + a + ", b = " + b);
    }
}

void main(){
    Item<Integer> num = new Item<>(10, 20);
    Item<Float> real = new Item<>(1.5f, 2.5f);
    Item<String> names = new Item<>("Hello", "World");

    num.swap();
    real.swap();
    names.swap();
}