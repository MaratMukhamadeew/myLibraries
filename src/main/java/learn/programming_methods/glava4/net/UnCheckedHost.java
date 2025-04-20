package learn.programming_methods.glava4.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UnCheckedHost {
    public static void main(String[] args) {
        // Задание IP-адреса в виде массива
        byte[] ip = { (byte) 217, (byte) 21, (byte) 43, (byte) 10};
        try {
            InetAddress address = InetAddress.getByAddress("University", ip);
            System.out.println(address.getHostName() + " -> соединение: " + address.isReachable(1000));
        } catch (UnknownHostException e) {
            System.err.println("Адрес недоступен " + e);
        } catch (IOException e) {
            System.err.println("Ошибка потока " + e);
        }
    }
}
