public class NumbersToEnglish {
    public static final String[] lessThenTen = new String[] {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static final String[] lessThenTwenty = new String[] {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    public static final String[] lessThenHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        System.out.println(numToEngUnchecked(0));
        System.out.println(numToEngUnchecked(26));
        System.out.println(numToEngUnchecked(519));
        System.out.println(numToEngUnchecked(106));
        System.out.println(numToEngUnchecked(999));
    }

    public static String numToEngUnchecked(int num){
        if (num == 0){
            return "Zero";
        }else if (num > 999){
            return "Number out of range";
        } else return numToEng(num);
    }
    public static String numToEng(int num){
        String result = "";
        if (num < 10){
            result = lessThenTen[num];
        }else if (num < 20){
            result = lessThenTwenty[num-10];
        }else if (num < 100){
            result = lessThenHundred[num/10] +" "+ numToEng(num % 10);
        }else if (num < 1000){
            result = numToEng(num/100) + " Hundred " + numToEng(num % 100);
        }

        return result;
    }
}
