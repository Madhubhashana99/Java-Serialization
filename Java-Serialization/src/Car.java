import java.io.*;

public class Car extends Vehicle implements Externalizable {

    private static final long serialVersionUID = 59L;
    private double speed;
    private transient int gear;

    public Car() {}

    public Car(String color, double speed ) {
        super(color);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(getColor());
            out.writeDouble(getSpeed());
            out.writeInt(getGear());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setColor((String) in.readObject());
        setGear(in.readInt());
        setSpeed(in.readDouble());

    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + getColor() +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}
