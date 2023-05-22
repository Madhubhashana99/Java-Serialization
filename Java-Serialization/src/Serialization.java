import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

    FileOutputStream fos;
    ObjectOutputStream oos;

    public void serializeCat(Car c){
        try{
            fos = new FileOutputStream("D:\\My projects\\Java-Serialization\\Java-Serialization\\src\\data\\text.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(c);
            oos.flush();
            fos.close();
            oos.close();
        }catch(Exception e){
            System.out.println("Exception occured: " +e.getMessage());
            e.printStackTrace();
        }
    }
}
