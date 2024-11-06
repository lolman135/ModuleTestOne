import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeDecorator extends MessageDecorator{

    public TimeDecorator(Message decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public String send() {

        return super.send() + " sended at: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

}
