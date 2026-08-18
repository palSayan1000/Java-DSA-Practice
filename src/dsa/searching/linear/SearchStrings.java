package dsa.searching.linear;

public class SearchStrings {
    static void main() {
        String str = "Sayan Pal";
        char target = 'u';
        System.out.println(search(str, target));
    }
    static boolean search(String str, char target){
        if(str.isEmpty())
            return false;
//        for(int i = 0; i < str.length(); i++)
//            if(str.charAt(i) == target)
//                return true;
        for(char c : str.toCharArray())
            if(c == target)
                return true;
        return false;
    }
}
