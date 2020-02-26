import java.util.HashMap;
import java.util.Scanner;

public class HuffmanCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any text : ");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        char[] inputarray = input.toCharArray();
        String temporary;
        String keyvalue;
        StringBuilder inputstring = new StringBuilder(inputarray.length);
        StringBuilder huffmanstring = new StringBuilder(inputarray.length);
        HashMap<Character, String> h = new HashMap<>();
        System.out.println("Input String Binary : ");
        for (int i = 0; i < inputarray.length; i++) {
            if (inputarray[i] >= 'a' && inputarray[i] <= 'z') {
                temporary = Integer.toBinaryString(inputarray[i]);
                int remainigbits = 8 - temporary.length();
                String s = "0".repeat(remainigbits) + temporary;
                System.out.print(s + " ");
                inputstring.append(s);
            }
        }
        int inputstringlength = inputstring.length();
    }
}
