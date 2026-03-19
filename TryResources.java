 import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

void main(){
    try
        (
            FileReader fread =
                new FileReader("tryResource.java");
                Scanner scan = new Scanner(fread);
        ){
        String line;
        while(scan.hasNext()){
            line = scan.nextLine();
            System.out.println(line);
        }
    }catch (IOException ex){
        System.out.println(ex.getMessage());

    }


}