package practice.skillbox.telegramBot.questions;

import java.util.Objects;

public class JavaQuestion extends AbstractQuestion {
    public JavaQuestion() {
        super("Сколько в языке программирования Java существует примитивов?");
    }
    @Override
    public boolean checkAnswer(String answer) {
        return Objects.equals(answer, Integer.toString(8));
    }
}
