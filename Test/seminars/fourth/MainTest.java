package seminars.fourth;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class MainTest {

    /**
     * 4.1. Создать мок-объект Iterator, настроить поведение так,
     * чтобы за два вызова next() Iterator вернул два слова  “Hello World”,
     * и проверить это поведение с помощью утверждений
     */
    @Test
    public void iteratorWillReturnHelloWorld() {
        // Arrange
        //Iterator iteratorMock = ;
        //when(iteratorMock...;
        // Act
        //String result = i.next() + " " + i.next();
        // Assert
        // ...
    }
    // Решение:
    //  @Test
    //  public void iteratorWillReturnHelloWorld() {
    //      // Arrange
    //      Iterator i = mock(Iterator.class);
    //      when(i.next()).thenReturn("Hello").thenReturn("World");
    //      // Act
    //      String result = i.next() + " " + i.next();
    //      // Assert
    //      assertEquals("Hello World", result);
    //  }

    /**
     * 4.2. Создать мок-объект Списка (List<String>), задать поведение таким образом,
     * чтобы при запросе первого элемента списка возвращалось Geek, при запросе второго Brains,
     * проверить поведение с помощью утверждений, проверить, что при добавлении в список ничего не происходит
     */
    @Test
    public void mockListWillReturnGeekBrains() {
        // Arrange
        // List<String> mockList = ...
        // Act

        // Assert

    }
    // Решение:
    // @Test
    // public void mockListWillReturnGeekBrains() {
    //     // Arrange
    //     List<String> mockList = mock(List.class);
    //     // Act
    //     // Assert
    //     mockList.add("Skip");
    //     when(mockList.get(0)).thenReturn("Geek");
    //     when(mockList.get(1)).thenReturn("Brains");
    //     assertEquals("Geek", mockList.get(0));
    //     assertEquals("Brains", mockList.get(1));
    // }

    /**
     * 4.3. Создайте мок-объект множества (Set) и проверьте взаимодействие (verify):
     * вызовите два метода, например addAll(...);  и clear() и проверьте,
     * что они действительно были вызваны у мок-объекта
     */
    @Test
    public void verifyMockTest() {
        //   Set mockSet = ...
    }
    // Решение:
    // @Test
    // public void verifyMockTest() {
    //     // Arrange
    //     Set mockSet = mock(Set.class);
    //     Set<String> toAdd = new HashSet<String>();
    //     // Act
    //     mockSet.addAll(toAdd);
    //     mockSet.clear();
    //     // Assert
    //     verify(mockSet).addAll(toAdd);
    //     verify(mockSet).clear();
    // }

    /**
     * 4.4. Создайте мок-объект множества (Set) и определите поведение так, чтобы на вызов метода, запрашивающего
     * размер множества (size()), мок возвращал 10, проверьте, используя утверждения, что в множестве ничего нет,
     * но размер равен 10
     */
    @Test
    public void stubMethodCalls() {

    }
    // Решение:
    // @Test
    // public void stubMethodCalls() {
    //     Set mockSet = mock(Set.class);
    //     when(mockSet.size()).thenReturn(10);
    //     assertEquals(10, mockSet.size());
    // }

    /**
     * 4.5. Создайте шпиона (spy()) для списка (List), добавьте в список объекты,
     * используя реальные методы списка (например, строки) и проверьте, что список возвращает то,
     * что вы в него положили и проверьте с помощью утверждений
     */
    @Test
    public void testSpy() {
        List list = new LinkedList();
        List spyList = spy(list);

    }
    // Решение:
//     @Test
//             public void testSpy() {
//
//             List list = new LinkedList();
//             List spyList = spy(list);
//
//             // Опционально можно сделать stub
//             when(spyList.size()).thenReturn(100);
//
//             // Используем реальные методы
//             spyList.add("one");
//             spyList.add("two");
//
//
//             assertEquals("one", spyList.get(0));
//             assertEquals(100, spyList.size());
//
//             //Опционально:
//             //проверяем что методы действительно были вызваны
//             verify(spyList).add("one");
//             verify(spyList).add("two");
//
//             try {
//                     //Impossible: real method is called so spy.get(0) throws IndexOutOfBoundsException (the list is yet empty)
//                     when(spyList.get(0)).thenReturn("foo");
//                 } catch (IndexOutOfBoundsException e) {
//                     // Expected
//                 }
//             //You have to use doReturn() for stubbing
//             doReturn("foo").when(spyList).get(0);
//         }


    /**
     * 4.6. Создайте мок-объект класса VoidMethodClass и переопределите поведение так,
     * чтобы вызов метода methodThrowingException выбрасывал исключение IllegalArgumentException,
     * проверьте что исключение выбрасывается с помощью try-catch блока
     */
    static class VoidMethodClass {
        public void methodThrowingException(boolean check) {
        }
    }

    @Test
    public void testVoidMethodThrowingException() {
        VoidMethodClass mock = mock(VoidMethodClass.class);

    }

    // Решение:
//    @Mock
//    VoidMethodClass mock;
//
//    @Test
//    public void testVoidMethodThrowingException() {
//        mock = mock(VoidMethodClass.class);
//        doThrow(new IllegalArgumentException()).when(mock).methodThrowingException(false);
//        try {
//            mock.methodThrowingException(true);
//        } catch (IllegalArgumentException e) {
//            // Expected
//        }
//    }



    //HW4.2
    @Test
    void checkList() {
        List<Integer> mockList = mock(List.class);
        //    when(mockList.get(0)).thenReturn(0);
        //    when(mockList.get(1)).thenReturn(4);
        //    when(mockList.get(2)).thenReturn(9);

             when(mockList.get(0)).thenReturn(-1);
             when(mockList.get(1)).thenReturn(10);

             when(mockList.size()).thenReturn(2);

             assertEquals(false, Main.checkList(mockList));

    }



}
