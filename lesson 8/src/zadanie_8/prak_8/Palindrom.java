package zadanie_8.prak_8;

public class Palindrom {
    public static boolean isPalindrom(String str){
        String str1 = str.toLowerCase();
        if (str.equals("")){
            return true;
        }
        if(str1.charAt(0) != str1.charAt(str.length() - 1)){
            return false;
        }else {
            return isPalindrom(str1.substring(1, str1.length() - 1));
        }
    }

    public static void main(String[] args) {
        String str = "write"; //NO
        System.out.println(isPalindrom(str) ? "YES" : "NO");
        String str1 = "wirriw"; //YES
        System.out.println(isPalindrom(str1) ? "YES" : "NO");
    }
}
