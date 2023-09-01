import java.util.HashMap;

public class PhoneNumberWordDecoder {
    public static void main(String[] args) {
        System.out.println(decode("123-647-EYES"));
        System.out.println(decode("(325)444-TEST"));
        System.out.println(decode("653-TRY-THIS"));
        System.out.println(decode("435-224-7613"));
    }
    public static String decode(String str){
        HashMap<Character,Integer> letters = new HashMap<>();
        letters.put('A',2);
        letters.put('B',2);
        letters.put('C',2);
        letters.put('D',3);
        letters.put('E',3);
        letters.put('F',3);
        letters.put('G',4);
        letters.put('H',4);
        letters.put('I',4);
        letters.put('J',5);
        letters.put('K',5);
        letters.put('L',5);
        letters.put('M',6);
        letters.put('N',6);
        letters.put('O',6);
        letters.put('P',7);
        letters.put('Q',7);
        letters.put('R',7);
        letters.put('S',7);
        letters.put('T',8);
        letters.put('U',8);
        letters.put('V',8);
        letters.put('W',9);
        letters.put('X',9);
        letters.put('Y',9);
        letters.put('Z',9);

        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)){
                str = str.replace(c,Integer.toString(letters.get(c)).charAt(0));
            }
        }

        return str;
    }
}
