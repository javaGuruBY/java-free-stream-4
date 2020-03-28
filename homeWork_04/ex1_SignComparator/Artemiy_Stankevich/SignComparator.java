public class SingComparator {
    String positive = "number is positive";
    String negative = "number is negative";
    String zero = "Number is equal to zero";

    public String compare (int number) {
        if (number > 0) return positive;
        else if (number < 0) return negative;
        else return zero;
    }
}
