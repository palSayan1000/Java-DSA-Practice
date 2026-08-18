package basic_understanding.number_pro;

public class All_3_Digit_Armstrong extends ArmsStrong_Number{
    public static void main(){
        // Printing all three digit armstrong number
        for(int i = 100; i < 1000; i++)
            if(checkArm(i))
                System.out.print(i + "\t");
        System.out.println();
    }
}
