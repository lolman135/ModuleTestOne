public class EncryptionDecorator extends MessageDecorator{

    public EncryptionDecorator(Message decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public String send() {
       return super.send().replaceAll("[a-zA-Z]" , "*");
    }
}
