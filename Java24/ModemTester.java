package Java24;

public class ModemTester {
    public static void main(String[] args) {
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        surfBoard.speed = 500000;
        gateway.speed = 400000;
        System.out.println("Попытка подключения кабельного модема:");
        surfBoard.displaySpeed();
        surfBoard.connect();
        System.out.println("Попытка подключения DSL-модема:");
        gateway.displaySpeed();
        gateway.connect();
    }
}
