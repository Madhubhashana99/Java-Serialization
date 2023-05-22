public class JavaSerialization {
    public static void main(String[] args) {

        Serialization ser = new Serialization();
        Car c = new Car("Black",100.00);
        c.setGear(7);
        ser.serializeCar(c);
    }
}
