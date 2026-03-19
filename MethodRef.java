class Traverse{
    public static void show(int x){
        System.out.println(x+" ,");
    }
    public void print(int x){
        System.out.println(x+",");
    }
}
void main(){
    Stream<Integer> nums = Stream.iterate(10,x->x+5).limit(10);
    nums.forEach(x -> System.out.print(x+","));
    // nums.forEach(Traverse::show);
    // nums.forEach(new  Traverse()::print);
    // Traverse t = new Traverse();
    // nums.forEach(t::print);
}