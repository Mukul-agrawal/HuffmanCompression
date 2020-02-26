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
        HashMap<Character, String> hashMap = new HashMap<>();
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
        hashMap.put('a', "1010");
        hashMap.put('b', "100000");
        hashMap.put('c', "00000");
        hashMap.put('d', "10110");
        hashMap.put('e', "010");
        hashMap.put('f', "110011");
        hashMap.put('g', "100010");
        hashMap.put('h', "0001");
        hashMap.put('i', "0110");
        hashMap.put('j', "1100001011");
        hashMap.put('k', "11000011");
        hashMap.put('l', "10111");
        hashMap.put('m', "110010");
        hashMap.put('n', "0111");
        hashMap.put('o', "1001");
        hashMap.put('p', "100001");
        hashMap.put('q', "1100001001");
        hashMap.put('r', "0010");
        hashMap.put('s', "0011");
        hashMap.put('t', "1101");
        hashMap.put('u', "00001");
        hashMap.put('v', "1100000");
        hashMap.put('w', "110001");
        hashMap.put('x', "1100001000");
        hashMap.put('y', "100011");
        hashMap.put('z', "1100001010");
        System.out.println();
        System.out.println("Huffman binary : ");
        for (char c : inputarray) {
            if (c >= 'a' && c <= 'z') {
                keyvalue = hashMap.get(c);
                System.out.print(keyvalue + " ");
                huffmanstring.append(keyvalue);
            }
        }
        int huffmanstringlength = huffmanstring.length();
        double ratio = (double) inputstringlength / huffmanstringlength;
        System.out.println();
        System.out.println("Compression ratio = " + ratio);
    }
}
