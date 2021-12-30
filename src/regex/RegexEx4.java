package regex;

import java.util.regex.Pattern;

public class RegexEx4 {
    void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip + " is Ok? " + Pattern.matches(regex, ip));
    }
    public static void main(String[] args) {
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";
        RegexEx4 r4 = new RegexEx4();
        r4.checkIP(ip1);
        r4.checkIP(ip2);
    }
}
