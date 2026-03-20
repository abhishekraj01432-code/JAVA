void main (){
    var x= 10;
    var y= 10.5f;
    var z= x+y;
    System.out.println(x+","+y+","+z);
    int[] arr ={1,4,3,2,5,6,7};
    for (var j:arr){
        System.out.println(j + ",");
    }
    System.out.println();
    var names= List.of("aa","bb","cc","dd");
    for(var name:names){
        System.out.print(name+",");
    }
}