public class MathOperationsDemo {
    public static void main(String[] args) {
        int firstNum = 10; // Первое целое число
        int secondNum = 25; // Второе целое число
// ============== Переменные хранящие в себе математические операции ===============================
        int add = firstNum + secondNum;
        int sub = firstNum - secondNum;
        int mult = firstNum * secondNum;
        double div = (double)firstNum / secondNum; //явно приводим одно из чисел к типу double, чтобы не отпала дробная часть.
// ============== ВЫВОД В КОНСОЛЬ РЕЗУЛЬТАТОВ ====================================        
        System.out.println("First operation 'addition' firstNum + secondNum = " + add);
        System.out.println("Second operation 'subtraction' firstNum - secondNum = " + sub);
        System.out.println("Third operation 'multiplication' firstNum * secondNum = " + mult);
        System.out.println("Fourth operation 'division' firstNum / secondNum = " + div);

    }
}
