public class ConcreteMessage implements Message{

    private String text;

    public ConcreteMessage(String text) {
        this.text = text;
    }

    @Override
    public String send() {
        return text;
    }
}
