package hw6;

public class Task_4 {
    public static void main(String[] args) {
        int side1 = 3;
        int side2 = 5;
        int side3 = 3;

        if (side1 == side2)
        {
           if (side1 != side3)
           {
               System.out.println("This triangle is isosceles.");
           } else
                {
                    System.out.println("This triangle is not isosceles, but equilateral.");
                }

        } else if (side1 == side3 || side2 == side3)
            {
                System.out.println("This triangle is isosceles.");
            } else
                {
                    System.out.println("This triangle is not isosceles, but scalene.");
                }
    }
}
