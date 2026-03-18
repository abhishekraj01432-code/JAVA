void main(){
    new Thread (
        ()->System.out.println("New Thread created")
    ).start();
}