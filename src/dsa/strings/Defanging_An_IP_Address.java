package dsa.strings;

// https://leetcode.com/problems/defanging-an-ip-address/
public class Defanging_An_IP_Address {
    static void main() {
        System.out.println(new Defanging_An_IP_Address().defangIPaddr("1.1.1.1"));
    }
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
