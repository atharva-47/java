@FunctionalInterface
interface CubeCalculator {
    double calculateCube(double number);
}

public class SetA4 {
    public static void main(String[] args) {

        CubeCalculator cubeCalculator = (double number) -> number * number * number;

        double number = 5.0;  

        double cube = cubeCalculator.calculateCube(number);
        System.out.println("Cube of " + number + " is: " + cube);
    }
}

