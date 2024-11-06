public abstract class MessageDecorator implements Message{

    Message decoratedMessage;

    public MessageDecorator(Message decoratedMessage) {
        this.decoratedMessage = decoratedMessage;
    }

    @Override
    public String send() {
       return decoratedMessage.send();
    }
}
