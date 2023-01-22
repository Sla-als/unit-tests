package seminars.fourth;

import java.util.List;

public class Main {
    //   HW4.2 Создайте метод, который проверяет, что переданный список содержит только цифры (от 0 до 9)
    //   и напишите к этому методу тест, который для проверки использует мок-объект списка.


    public static boolean checkList(List<Integer> list) {
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 0 && list.get(i) < 10) check = true;
        }
        return check;
    }

}
