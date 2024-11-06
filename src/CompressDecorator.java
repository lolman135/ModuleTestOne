public class CompressDecorator extends MessageDecorator{

    public CompressDecorator(Message decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public String send() {
       return super.send().replaceAll(" ", "");
    }
}
