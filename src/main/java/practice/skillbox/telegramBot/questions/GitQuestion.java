package practice.skillbox.telegramBot.questions;

public class GitQuestion extends AbstractQuestion {
    public GitQuestion() {
        super("С помощью какой команды в Git можно просмотреть информацию об " +
                "авторстве каждой строки кода в том или ином файле?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.contains("blame");
    }
}
