interface Operation {
    void area();
    void volume();
}

class Cylinder implements Operation {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void area() {
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface Area of the Cylinder: " + surfaceArea);
    }

    @Override
    public void volume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the Cylinder: " + volume);
    }
}

public class SetA3 {
    public static void main(String[] args) {
        double radius = 5.0;  // Example radius
        double height = 10.0;  // Example height

        Cylinder cylinder = new Cylinder(radius, height);

        System.out.println("Cylinder Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);

        cylinder.area();
        cylinder.volume();
    }
}
