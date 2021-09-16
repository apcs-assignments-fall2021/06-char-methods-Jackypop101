public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return(ch);
        }
        if (ch >= 'A' && ch <= 'Z') {
            int x = ch;
            int y = x + 32;
            char z = (char) y;
            return(z);
        }
        else {
            return (ch);
        }
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return(ch);
        }
        if (ch >= 'a' && ch <= 'z') {
            int x = ch;
            int y = x - 32;
            char z = (char) y;
            return(z);
        }
        else {
            return (ch);
        }
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        String res = "";
        char x;
        for (int i = 0; i<str.length(); i++){
            x = str.charAt(i);
            if (!(x >= '0' && x <= '9')){
                res += x;
            }
        }
        return res;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
    }
}
