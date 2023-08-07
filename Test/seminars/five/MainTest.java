package seminars.five;

import org.junit.jupiter.api.Test;
import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;
import seminars.five.order.OrderService;
import seminars.five.order.PaymentService;
import seminars.five.user.UserRepository;
import seminars.five.user.UserService;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    // 5.1.
    // RandomNumberGenerator
    @Test
    public void testGenerateRandomNumbers() {
        RandomNumberModule generator = new RandomNumberModule();
        int[] numbers = generator.generateRandomNumbers(10);

        // Проверяем, что размер массива, возвращаемого функцией, равен ожидаемому
        assertEquals(10, numbers.length);
    }

    // MaxNumberModule
    @Test
    public void testFindMaxNumber() {
        MaxNumberModule finder = new MaxNumberModule();

        // Создаем тестовый массив
        int[] numbers = {1, 2, 3, 4, 5};

        // Проверяем, что функция находит ожидаемое максимальное число в массиве
        assertEquals(5, finder.findMaxNumber(numbers));
    }

    @Test
    public void testFindMaxInGeneratedNumbers() {
        RandomNumberModule generator = new RandomNumberModule();
        MaxNumberModule finder = new MaxNumberModule();

        // Генерируем массив случайных чисел
        int[] numbers = generator.generateRandomNumbers(10);

        // Находим максимальное число в массиве
        int maxNumber = finder.findMaxNumber(numbers);

        // Сортируем массив, чтобы легко определить максимальное число
        Arrays.sort(numbers);

        // Проверяем, что найденное максимальное число равно максимальному числу в отсортированном массиве
        assertEquals(numbers[numbers.length - 1], maxNumber);

    }


    //5.2.
    @Test
    public void testGetUserName() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        String result = userService.getUserName(1);

        assertEquals("User 1", result);
    }


    //5.3.
    @Test
    public void testPlaceOrder() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        boolean result = orderService.placeOrder("order1", 100.0);

        assertTrue(result);
    }


}