package seminars.five;

import net.bytebuddy.utility.dispatcher.JavaDispatcher;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import seminars.five.dbase.UserRepository;
import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;

import java.util.Arrays;
import java.util.List;

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



    // Integration test
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

    // Создаем экземпляр Testcontainers для PostgreSQL.
    // Обратите внимание, что мы используем версию 13.2.
    @Container
    public PostgreSQLContainer postgres= new PostgreSQLContainer("postgres:13.2");

    @Test
    public void testAddAndRetrieveUser() {
        // Создаем UserRepository, которое будет взаимодействовать с нашей базой данных.
        UserRepository userRepository = new UserRepository(postgres.getJdbcUrl(), postgres.getUsername(), postgres.getPassword());

        // ЗДЕСЬ ВАШ КОД
        // 1. Создайте нового пользователя.
        // 2. Добавьте этого пользователя в базу данных с помощью UserRepository.
        // 3. Извлеките этого пользователя из базы данных с помощью UserRepository.
        // 4. Проверьте, что извлеченный пользователь соответствует ожидаемому.
    }

}