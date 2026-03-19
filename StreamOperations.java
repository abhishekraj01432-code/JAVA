
      import java.util.stream.Stream;
void main(){
    Stream<Integer> sum= Stream.generate(() -> (int)(Math.random()*100)).limit(10)
    .peek(x -> IO.print(x + ","))
    .map(x->x+5)
    .peek(x -> IO.print(x + ","))
    .sorted()
    .peek(x -> IO.print(x + ","))
    .filter(x->x%2==0)
    .peek(x -> IO.print(x + ","))
    .filter(x->x>400);
    
 System.out.println("Sum: "+sum); 
    //   s5.forEach(s-> System.out.print(s+","));
}