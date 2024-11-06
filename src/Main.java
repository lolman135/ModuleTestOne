public class Main {
    public static void main(String[] args) {

        String text = "Hello guys!";
        Message message = new ConcreteMessage(text);

        Message compressedMessage = new CompressDecorator(message);
        Message timedCompressedMessage = new TimeDecorator(compressedMessage);
        Message namedTimedCompressedMessage = new NameDecorator(timedCompressedMessage, "Kyrylo");

        Message encryptedMessage = new EncryptionDecorator(message);

        System.out.println(namedTimedCompressedMessage.send() + "\n" + encryptedMessage.send());

    }
}