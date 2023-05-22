import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    FileInputStream fis;
    ObjectInputStream ois;

    public void deserializeCar(){
        try{
            fis = new FileInputStream("D:\\My projects\\Java-Serialization\\Java-Serialization\\test\\text.txt");
            ois = new ObjectInputStream(fis);
            Car c = (Car) ois.readObject();
            System.out.println(c.toString());

        }catch(Exception e){
            System.out.println("Exception occured:" + e.getMessage());
            e.printStackTrace();
        }
    }
}
