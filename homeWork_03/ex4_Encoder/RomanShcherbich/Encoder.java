package login;

public class Encoder {

  public void decode(Character character) {
    char[] charArray = new char[1];
    charArray[0] = character;
    System.out.println("char '" + character
        + "' decoded  to '" + Character.codePointAt(charArray,0) + "'");
  }

  public void encode(short code) {
    System.out.println("code '" + code
        + "' encoded  to '" + Character.valueOf(Character.toChars(Integer.valueOf(code))[0]) + "'");
  }
}
