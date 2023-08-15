public class YouShallNotPass {

    public boolean password(String password) {
        final int MinUppercase = 1;
        final int MinLowercase = 1;
        final int numDigits = 1;
        final int specialChar = 1;
        final int lengthRequirement = 8;

        int counterUppercase = 0;
        int counterLowercase = 0;
        int counterDigits = 0;
        int counterSpecialChar = 0;
        int falseRequirements = 0;

        if (password.contains(" ")){
            System.out.println("Password cannot contain white spaces");
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)){
                counterUppercase++;
            }else if (Character.isLowerCase(c)){
                counterLowercase++;
            }else if (Character.isDigit(c)){
                counterDigits++;
            } else if (c >= 33 && c <= 46 || c == 64) {
                counterSpecialChar++;
            }
        }
        if (password.length() >= lengthRequirement && counterUppercase >= MinUppercase && counterLowercase >= MinLowercase && counterDigits >= numDigits && counterSpecialChar >= specialChar) {
            System.out.println("Valid Password");
            return true;
        }else {
            System.out.println("Your password does not contain the following:");
            if(password.length() < lengthRequirement)
                falseRequirements++;
            System.out.println("Need atleast 8 characters");
            if (counterLowercase < MinLowercase)
                falseRequirements++;
            System.out.println("Minimum lowercase letters");
            if (counterUppercase < MinUppercase)
                falseRequirements++;
            System.out.println("Minimum uppercase letters");
            if(counterDigits < numDigits)
                falseRequirements++;
            System.out.println("Minimum number of numeric digits");
            if(counterSpecialChar < specialChar)
                falseRequirements++;
            System.out.println("Password should contain at lest 3 special characters");
        }
        if (falseRequirements >= 4){
            System.out.println("Your password is too weak!");
        }else if(falseRequirements >= 2){
            System.out.println("Your password is moderate");
        }
        return false;
    }
}
