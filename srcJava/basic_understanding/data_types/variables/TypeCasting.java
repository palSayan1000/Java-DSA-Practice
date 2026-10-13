package basic_understanding.data_types.variables;

import java.util.Scanner;

public class TypeCasting {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // Automatic type conversion;
        // float num = sc.nextInt();
        // explicit type conversion can be done from lower precidencity to higher
        // int can be converted expicitly to float and double not vice versa
        //IO.println(num);

        // So how to convert float to int that is called implicit type conversion
        // or forced type conversion
        // or narrowing conversion
        // int n = (int)(67.456);
        //  IO.println(n);

        // automatic type promotions in expressions
        // maximum value of byte is 256
//        int a = 257;
//        byte b = (byte)a;
//        // hey you have given me more value that what i can handle so it is giving the remainder 257 % 256 = 1
//        IO.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        // here a * b easily exceeds the limit of the byte type
//        // here it is automatically being promoted to int when iit is evaluating integer so it is beoing able to stored it

        // byte b = 50;
        // b = b * 2;
        // error as b * 2 is integer how can you assign it to a byte

        // looking into characters
//        int number = 'A';
//        IO.println(number);

        // java follows the unicode principals
//        System.out.println("श्री हरिवंश");
//        System.out.println("Shri Harivansh");
//        System.out.println("শ্রী হরিবংশ");
//        System.out.println("શ્રી હರಿವংশ");
//        System.out.println("ਸ਼੍ਰੀ ਹਰਿਵੰਸ਼");
//        System.out.println(" శ్రీ హరివংশ (శ్రీ హరివంశ)");
//        System.out.println("ஸ்ரீ ஹரிவம்ஶ் (ஸ்ரீ ஹரிவம்சம்)");
//        System.out.println("شری ہری ونش");
//        System.out.println("ଶ୍ରୀ ହରିବଂଶ");
//        System.out.println(" ശ്രീ ഹരിവംശ");
//        System.out.println("什里·哈里万什");
//        System.out.println("Шри Хариванш");
//        System.out.println("Шрі Харіванш");


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + "  " + (i / c) + "  " + (d - s));
        // float + int - double = double
        System.out.println(result);
    }
}
