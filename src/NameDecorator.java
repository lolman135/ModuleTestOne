import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NameDecorator extends MessageDecorator{

    private String fullName;

    public NameDecorator(Message decoratedMessage, String fullName) {
        super(decoratedMessage);
        this.fullName = fullName;
    }

    @Override
    public String send() {

        return super.send() + " sended by: " + fullName;
    }

}
