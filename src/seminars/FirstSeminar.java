package seminars;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.assertj.core.api.Assertions.*;

public class FirstSeminar {

    public static void main(String[] args) {
     //   weekendsCounter();
   //  System.out.println(sum(2_147_483_647, 1));


        //  happyNY();

        expectedValue();

    }


    // 1.1
    public static void weekendsCounter() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 3;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

    // 1.2
    // assert boolean_выражение : сообщение_об_ошибке;
    // Ariane V
    // sum(2_147_483_647, 1) вернула "-2147483648"
    public static int sum(int a, int b) {
//        assert (Integer.MAX_VALUE - a >= b) : "Значение выражения вышло за пределе переменной";
//        int result = a + b;
//        assert (result - a == b) : "Sum of " + a + " + " + b + " returned wrong sum " + result;
//        return result;
        return a + b;

    }

    // 1.3
    // 08/12/2022 06:19:41
    public static  void  happyNY() {
        Calendar calendar =  Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String currentDateTime = dateFormat.format(calendar.getTime()); // Получаем строку в формате "08/12/2022 06:19:41"
        assert currentDateTime.equals("01/01/2023 00:00:00"):"Еще 2022 год :(";
        System.out.println("С новым годом!");
    }

    // 1.4
    // AssertJ
    // assertThat(actual).isEqualTo(expected);
    public static void expectedValue(){
     //   assertThat(8).isEqualTo(sum(2,2));
        assertThat("expected").isEqualTo("actual");
    }

    // 1.5




    // 1.4
    // выражение assert верно, нужно исправить код
//
//    Вот наиболее распространенный вариант использования. Предположим, вы включаете значение enum:
//
//            switch (fruit) {
//        case apple:
//            // do something
//            break;
//        case pear:
//            // do something
//            break;
//        case banana:
//            // do something
//            break;
//    }
//    Пока вы обрабатываете каждый случай, все в порядке. Но когда-нибудь кто-нибудь добавит fig в ваше перечисление и забудет добавить его в ваш оператор switch . Это приводит к ошибке, которую может быть сложно поймать, потому что эффекты не будут ощущаться до тех пор, пока вы не покинете оператор switch . Но если вы напишете свой switch таким образом, вы можете сразу его перехватить:
//
//            switch (fruit) {
//        case apple:
//            // do something
//            break;
//        case pear:
//            // do something
//            break;
//        case banana:
//            // do something
//            break;
//        default:
//            assert false : "Missing enum value: " + fruit;
//    }







    // 1.*
//    class DiscountCalculatorTest {
//
//        DiscountCalculator discountCalculator = new DiscountCalculator();
//
//        public void shouldGiveNoDiscountForValue999() {
//            // Подготовка
//            int buySum = 999;
//            int expectedSum = 999;
//
//            // Исполнение
//            int resultSum = discountCalculator.sumAfterDiscount(buySum);
//
//            // Проверка
//            TestLibrary.assertEquals(expectedSum, resultSum);
//        }
//
//        public static void main(String[] args) {
//            DiscountCalculatorTest test = new DiscountCalculatorTest();
//            test.shouldGiveNoDiscountForValue999();
//        }
//    }
//
//    class TestLibrary {
//        public static <T> void assertEquals(T expected, T actual) {
//            if (!expected.equals(actual)) {
//                throw new RuntimeException(String.format("actual value [%s] not equal to expected [%s]", actual, expected));
//            }
//        }
//    }
//
//    class DiscountCalculator {
//
//        public int sumAfterDiscount(int sum) {
//            if (sum < 1000) {
//                return sum;
//            } else {
//                return (int) (sum * 0.98);
//            }
//        }
//    }
//


}
