package hw6;

public class Task_3 {
    public static void main(String[] args) {
    int var1 = -12;
    int  var2 = -12;
    int absVar1 = Math.abs(var1);
    int absVar2 = Math.abs(var2);

    if (absVar1 >= absVar2 ){
        if (absVar1 == absVar2){
            System.out.println("Both numbers have the same absolute value.");
        } else {
            System.out.println("Number "+var1+" has a greater absolute value than number "+var2+ ".");
        }

    } else {
        System.out.println("Number "+var1+" has a smaller absolute value than number "+var2+" .");
    }

    }
}
