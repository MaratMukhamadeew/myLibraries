package practice.skillbox.telegramBot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import practice.skillbox.telegramBot.questions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
//        askQuestion(new JavaQuestion());
//        askQuestion(new SQLQuestion());
//        askQuestion(new GitQuestion());
//        askQuestion(new HTTPQuestion());
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        botsApi.registerBot(new Bot());
    }

    public static void askQuestion(AbstractQuestion question) {
        System.out.println(question.getQuestion());
        String answer = new Scanner(System.in).nextLine();

        boolean result = question.checkAnswer(answer);

        if (result) System.out.println("Верно!");
        else System.out.println("Неверно!");
    }
}