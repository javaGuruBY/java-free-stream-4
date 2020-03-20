import java.util.Random; //Импортируем пакет Random

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGen = new Random(); //Создаем экземпляр класса (обект) типа Random для исп. его методов.
        int num = 100;

        int firstNum = randomGen.nextInt(num); //Используем метод nextInt() через точечную нотацию
        int secondNum = randomGen.nextInt(num);// то же самое
        int thirdNum = randomGen.nextInt(num); // то же самое

        System.out.println("Первое сгенерированное число = " + firstNum);
        System.out.println("Второе сгенерированное число = " + secondNum);
        System.out.println("Третье сгенерированное число = " + thirdNum);

        System.out.println("Sum = " + (firstNum + secondNum + thirdNum)); 
    }
}
