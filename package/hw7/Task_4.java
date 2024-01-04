package hw7;

public class Task_4 {
    public static void main(String[] args) {

        int size = 360 / 10 + 1;
        int x = 0;
        double[] sinArray = new double[size];

        System.out.println("  x  |   sin(x)  ");
        System.out.println("-------------------");

        for (int i = 0; i < size; i++)

        {
            sinArray[i] = Math.sin(Math.toRadians(x));
            if (Math.abs(sinArray[i]) < 1e-10) {sinArray[i] = 0.0;}
            System.out.println("  " + x + "  |  "  + sinArray[i]);
            x += 10;
        }


    }

}
