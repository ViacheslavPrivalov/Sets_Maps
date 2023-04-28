import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
        task4();
    }

    private static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    private static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) % 2 == 0 && nums.get(i) != nums.get(i + 1)) {
                System.out.println(nums.get(i));
            }
        }
    }

    private static void task3() {
        List<String> nums = new ArrayList<>(List.of("one", "two", "two", "three", "four", "four"));
        Set<String> words = new HashSet<>(nums);
        System.out.println(words);
    }

    private static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        Set<String> words = new HashSet<>(strings);
        int ones = 0;
        int twos = 0;
        int threes = 0;
        for (String string : strings) {
            if (string.equals("один")) {
                ones++;
            }
            if (string.equals("два")) {
                twos++;
            }
            if (string.equals("три")) {
                threes++;
            }
        }
        System.out.println(ones);
        System.out.println(twos);
        System.out.println(threes);

    }

}