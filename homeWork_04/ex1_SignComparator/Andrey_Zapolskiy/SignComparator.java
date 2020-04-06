package lv.javaguru.demo;

public class SignComparator {
    public static void main(String[] args) {
        SignComparator test = new SignComparator();

        System.out.println(test.compare(4));


    }
    public String compare(int number) {
        if (number > 0) {
            return "Number is positive";
        } else if (number < 0) {
            return "Number is negative";
        } else {
            return "Number is equal to 0";
        }
    }
}
