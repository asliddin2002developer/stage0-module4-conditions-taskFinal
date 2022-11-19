package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double sumOfSides = firstSide + secondSide + thirdSide;
        switch ((int) sumOfSides){
            case 180:
                System.out.println("this is a valid triangle");
                break;
            default:
                System.out.println("it's not a triangle");
        }
    }
}
