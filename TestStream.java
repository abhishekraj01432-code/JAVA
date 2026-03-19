import java.util.Arrays;
import java.util.stream.Stream;

void main(){
    int[] arr = {1,2,3,4,5,6,7,8,9};
    Stream <Integer> st1 = Arrays.stream(arr).boxed();
    Integer []arr2 = {10,20,30,40,50,60,70,80,90};
    Stream <Integer> st2 = Arrays.stream(arr2);

   st1.forEach(s->System.out.print(s+","));

   System.out.println();
   st2.forEach(s->System.out.print(s+","));
System.out.println();
   Stream<String> st3 = Stream.of("Ram","Shyam","Mohan","Sohan");
   System.out.println();
   st3.forEach(s->System.out.print(s+","));
System.out.println();
   Stream<Integer> nums = Stream.iterate(10, n->n+1).limit(10);
   System.out.println();
   nums.forEach(s->System.out.print(s+","));
   System.out.println();
   Stream<Integer> randoms = Stream.generate(() -> (int)(Math.random()*100)).limit(10);
   System.out.println();
    randoms.forEach(s->System.out.print(s+","));
}