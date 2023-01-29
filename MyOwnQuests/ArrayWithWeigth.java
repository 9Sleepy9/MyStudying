package MyOwnQuests;

public class ArrayWithWeigth {

    private final int[] values; // значени€
    private final int[] weights; // веса
    private final int[] ranges; // границы весов
    private int sum; // общий вес всех значений из массива

    public ArrayWithWeigth(int[] values1, int[] weights1) {
        values = values1;
        weights = weights1;
        ranges = new int[values.length];

        // —умма весов всех значений из массива
        sum = 0;
        for (int weight : weights) {
            sum += weight;
        }

        // «аполн€ем ranges границами весов
        int lastSum = 0;
        for (int i = 0; i < ranges.length; i++) {
            ranges[i] = lastSum;
            lastSum += weights[i];
        }
    }

    /*
        ћассив ranges уже заполнен, так что остаЄтс€
        сгенерировать значение в промежутке [0;sum],
        и найти значение, соответствующее случайно полученному весу:
     */
    public int getRandom() {
        int random = (int) (Math.random() * (sum - 1));

        int ourRangeIndex = 0;
        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i] > random) {
                break;
            }
            ourRangeIndex = i;
        }

        return values[ourRangeIndex];
    }

    /*Ѕинарный поиск, при котором массив делитс€ на две половины
    public int getRandom() {
        int random = (int) (Math.random() * (sum - 1));

        int index = Arrays.binarySearch(ranges, random);
        return values[index >= 0 ? index : -index - 2];
    }
     */

}
