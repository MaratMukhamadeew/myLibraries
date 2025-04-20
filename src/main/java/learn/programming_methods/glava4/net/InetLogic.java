package learn.programming_methods.glava4.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetLogic {
    public static void main(String[] args) {
        InetAddress currentIP = null;
        InetAddress bsuIP = null;
        try {
            currentIP = InetAddress.getLocalHost();
            // Вывод IP-адреса локального компьютера
            System.out.println("Мой IP -> " + currentIP.getHostAddress());
            bsuIP = InetAddress.getByName("www.bsu.by");
            // Вывод IP-адреса БГУ www.bsu.by
            System.out.println("BSU -> " + bsuIP.getHostAddress());
        } catch (UnknownHostException e) {
            // Если не удаётся найти IP
            System.err.println("Адрес недоступен " + e);
        }
    }
}
