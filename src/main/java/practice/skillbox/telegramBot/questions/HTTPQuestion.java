package practice.skillbox.telegramBot.questions;

public class HTTPQuestion extends AbstractQuestion {
    private static final int MINIMAL_COUNT = 4;
    private final String[] httpMethods = { "GET", "POST", "HEAD", "PUT", "PATCH", "DELETE", "OPTIONS", "CONNECT", "TRACE" };
    public HTTPQuestion() {
        super("Перечислите все известные вам методы HTTP-запросов.");
    }

    @Override
    public boolean checkAnswer(String answer) {

        int count = 0;
        for (String method : httpMethods) {
            if (answer.toUpperCase().contains(method)) count++;
        }

        return count >= MINIMAL_COUNT;
    }
}
