
import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Box box3 = new Box3();
        Box box5 = new Box5();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter object's length: ");
        float length = scanner.nextFloat();
        System.out.print("Please enter object's width: ");
        float width = scanner.nextFloat();
        System.out.print("Please enter object's height: ");
        float height = scanner.nextFloat();
        if (box3.validate(length, width, height)) {
            box3.getBoxname();
        } else if (box5.validate(length, width, height)) {
            box5.getBoxname();
        } else {
            System.out.println("您的物品不符合規定");
        }
    }

}