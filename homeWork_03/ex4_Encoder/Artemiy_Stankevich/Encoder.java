public class Encoder {

    void encode(short code) {
        System.out.println(code + " => " + (char) code);
    }
    void decode(char symbol) {
        System.out.println(symbol + " => " + (int) symbol);
    }
}
