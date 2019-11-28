package Java24;

public class CableModem extends Modem {
    String method = "Кабельное подключение";

    public void connect() {
        System.out.println("Подключение к Интернету...");
        System.out.println("Используем " + method);
    }
}
