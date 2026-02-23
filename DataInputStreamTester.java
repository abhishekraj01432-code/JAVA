import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamTester {
    public static void main(String[] args) {
        DataInputStream dis;
        try {
            dis = new DataInputStream(
                    new FileInputStream("data.dat"));
            int roll = dis.readInt();
            boolean isActive = dis.readBoolean();
            float fee = dis.readFloat();
            String name = dis.readUTF();
            System.out.println("Name:" + name);
            System.out.println("Roll:" + roll);
            System.out.println("Fee:" + fee);
            System.out.println("IsActive:" + isActive);
            dis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}