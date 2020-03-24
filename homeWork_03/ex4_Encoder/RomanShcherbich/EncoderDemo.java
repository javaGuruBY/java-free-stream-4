package login;

public class EncoderDemo {

  public static void main(String[] args) {
    Encoder encoder = new Encoder();

    Short s = 116;

    encoder.decode('t');
    encoder.encode(s);
  }
}
