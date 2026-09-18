package dsa.data_structures.stringbuffer.understanding;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    static void main() {

//         constructor 1 -> type
        StringBuffer sb = new StringBuffer();

        // constructor number 2
        StringBuffer sb2 = new StringBuffer("Sayan Bal");

        // constructor number 3
        @SuppressWarnings({"StringBufferReplaceableByStringBuilder", "MismatchedStringBuilderQueryUpdate"})
        StringBuffer sb3 = new StringBuffer(100); // specifying the capacity of the empty string buffer obj

        // methods
        sb.append("wemakedevs.org");
        sb.append(" is nice!!!!");

        sb.setCharAt(0, 'W'); // replacing the char at a specific index

        sb.insert(2, " Rahul "); // inserting a string at a specific index and offsetting and shifting all the chars from that index
        System.out.println(sb); // automatically converts to toString()

        sb.replace(sb.indexOf(" "), sb.indexOf(" ", sb.indexOf(" ") + 1) + 1, "");
        System.out.println(sb);

        sb.delete(sb.indexOf(" "), sb.length());
//        sb.setLength(sb.indexOf(" "));

        String str = sb.toString();
        System.out.println(str);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb3.capacity());

        System.out.println(RandomString.generate(20));

        // remove whitespaces = " "

        String sentence = "H i  ffoijose id  dk dkg osjnd   fg g  gg g h j  t  ";
        System.out.println(sentence); // original

        System.out.println(sentence.replaceAll("\\s", "")); // without spaces one "\\s" is the regex

        // split
        String arr = "Sayan Pal Is The GOAT(Greatest,,,Of All Time)";
        System.out.println(Arrays.toString(arr.split("[\\s(,)]+")));

        // rounding off
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println(df.format(7.2));
        System.out.println(df.format(7.29));

    }
}
