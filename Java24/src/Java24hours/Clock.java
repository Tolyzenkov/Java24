package Java24hours;

import java.time.*;
import java.time.temporal.*;

public class Clock {
    public static void main(String[] arguments) {
        //Определеить текущее время и дату
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);
        
        //Вывести приветствие
        if (hour < 12) {
            System.out.println("Доброе утро! \n");
        } else if (hour < 17) {
            System.out.println("Добрый день! \n");
        } else {
            System.out.println("Добрый вечер! \n");
        }
        
        //Начало формирования строки, отображающей время
        System.out.println("Сейчас ");
        
        //Сколько часов
        System.out.print(hour);
        System.out.println((hour != 1 & hour != 21) ?
                " часа (часов) " : " час ");
        
        //Сколько минут
        if (minute != 0) {
            System.out.print(minute);
            System.out.print((minute != 1 & minute != 21
            & minute != 31 & minute != 41 & minute != 51) ?
            " минуты (минут)" : " минута");
        }
        //Отображение числа и месяца
        System.out.print("\n" + day + " ");
        //Название месяца
        switch (month) {
            case 1:
                System.out.print("Января");
                break;
            case 2:
                System.out.print("Февраля");
                break;
            case 3:
                System.out.print("Марта");
                break;
            case 4:
                System.out.print("Апреля");
                break;
            case 5:
                System.out.print("Мая");
                break;
            case 6:
                System.out.print("Июня");
                break;
            case 7:
                System.out.print("Июля");
                break;
            case 8:
                System.out.print("Августа");
                break;
            case 9:
                System.out.print("Сентября");
                break;
            case 10:
                System.out.print("Октября");
                break;
            case 11:
                System.out.print("Ноября");
                break;
            case 12:
                System.out.print("Декабря");
        }
        
        //Отображение года
        System.out.println(", " + year);
    }
}