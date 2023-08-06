package seminars.sixth;

public class ListComparator {
    // java -jar libs/checkstyle-10.12.2-all.jar -c /sun_checks.xml src/seminars/sixth/ListComparator.java > checkstyle_report.txt
    public double findAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }

    public String compareLists(int[] list1, int[] list2) {
        double average1 = findAverage(list1);
        double average2 = findAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
