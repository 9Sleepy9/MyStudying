package Chapter_13;


public class GenericMethodDemo {

    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] t, V[] v) {

        if (t.length != v.length)
            return false;

        for (int i = 0; i < t.length; i++)
            if (!t[i].equals(v[i]))
                return false;

        System.out.println("Arrays are equal!");
        return true;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums1[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 6, 6};
        Long nums3[] = {1L, 2L, 3L, 4L};
        Double nums4[] = {1.0, 2.0, 3.0, 4.0, 5.0};

        arraysEqual(nums, nums);
        System.out.println();

        arraysEqual(nums, nums1);
        System.out.println();

        arraysEqual(nums1, nums2);
        System.out.println();

        // Это не сработает, т.к. метод equals вернёт false, необходимо приведение типов
        // arraysEqual(nums, nums3);
        // arraysEqual(nums, nums4);
    }
}

