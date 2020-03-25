public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        encoder.encode((short) 97);
        encoder.decode('a');
    }
}
