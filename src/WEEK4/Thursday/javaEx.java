package WEEK4.Thursday;

public class javaEx { //class level
    /**Create a method that gives the count of digits in a string.
     input-> String str = "34dj5"  output-> countOfDigits =3**/

    public static void main(String[] args) {
        numberOfDigits("ela123");
    }

    public static void numberOfDigits(String str){
        //count of digits
        int countOfDigits =0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                countOfDigits++;
            }
        }
        System.out.println(countOfDigits);
    }
}
