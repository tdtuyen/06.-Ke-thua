package circle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1, "blue", 1);
        System.out.printf("Volume of cylinder = %5.04f", + cylinder.getVolume());
    }
}
