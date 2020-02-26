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
        h.put('a', "1010");
        h.put('b', "100000");
        h.put('c', "00000");
        h.put('d', "10110");
        h.put('e', "010");
        h.put('f', "110011");
        h.put('g', "100010");
        h.put('h', "0001");
        h.put('i', "0110");
        h.put('j', "1100001011");
        h.put('k', "11000011");
        h.put('l', "10111");
        h.put('m', "110010");
        h.put('n', "0111");
        h.put('o', "1001");
        h.put('p', "100001");
        h.put('q', "1100001001");
        h.put('r', "0010");
        h.put('s', "0011");
        h.put('t', "1101");
        h.put('u', "00001");
        h.put('v', "1100000");
        h.put('w', "110001");
        h.put('x', "1100001000");
        h.put('y', "100011");
        h.put('z', "1100001010");
    }
}
