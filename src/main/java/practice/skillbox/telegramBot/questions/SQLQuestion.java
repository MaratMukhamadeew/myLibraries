package practice.skillbox.telegramBot.questions;

import java.util.Objects;

public class SQLQuestion extends AbstractQuestion {
    public SQLQuestion() {
        super("Сколько основных типов связей между таблицами существует в реляционных базах данных");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return Objects.equals(answer, Integer.toString(3));
    }
}
