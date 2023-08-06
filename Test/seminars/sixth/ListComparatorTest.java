package seminars.sixth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListComparatorTest {

    ListComparator comparator = new ListComparator();

    @Test
    public void testCompareListsFirstGreater() {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {1, 2, 3};
        assertEquals("Первый список имеет большее среднее значение", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareListsSecondGreater() {
        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3, 4, 5};
        assertEquals("Второй список имеет большее среднее значение", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareListsEqual() {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {5, 4, 3, 2, 1};
        assertEquals("Средние значения равны", comparator.compareLists(list1, list2));
    }

}