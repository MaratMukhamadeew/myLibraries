package practice.skillbox.telegramBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import practice.skillbox.telegramBot.questions.*;

import java.util.concurrent.ConcurrentHashMap;

public class Bot extends TelegramLongPollingBot {
    private final AbstractQuestion[] questions;
    private ConcurrentHashMap<Long, UserData> users;

    public Bot() {
        questions = new AbstractQuestion[]{
                new JavaQuestion(), new SQLQuestion(), new HTTPQuestion(), new GitQuestion()
        };

        users = new ConcurrentHashMap<>();
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        String text = message.getText();
        Long userId = message.getFrom().getId();

        if (text.equals("/start")) {
            UserData data = new UserData();
            users.put(userId, data);
            sendText(userId, questions[0].getQuestion());
            return;
        }

        UserData data = users.get(userId);
        int current = data.getCurrent();

        if (current == questions.length) {
            sendText(userId, "Вы завершили опрос. Перезапустите бота командой /start, " +
                    "если хотите пройти опрос снова.");
            return;
        }

        boolean result = questions[current].checkAnswer(text);
        data.setScore(data.getScore() + (result ? 1 : 0));
        data.setCurrent(current + 1);
        if (current == questions.length - 1) {
            sendText(userId, "Ваш рейтинг: " + data.getScore() + " из " + questions.length);
        } else {
            sendText(userId, questions[data.getCurrent()].getQuestion());
        }
    }

    public void sendText(Long who, String what) {
        SendMessage sm = SendMessage.builder()
                .chatId(who.toString())
                .text(what).build();
        try {
            execute(sm);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getBotToken() {
        return "7873495460:AAHk8dwEg1_fK6MAYZrVDIKh1KRpuMwjSh8";
    }

    @Override
    public String getBotUsername() {
        return "intensive13032025bot";
    }
}
