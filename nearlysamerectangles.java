import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class nearlysamerectangles {

    /*
     * Complete the 'nearlySimilarRectangles' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts 2D_LONG_INTEGER_ARRAY sides as parameter.
     */

    public static long nearlySimilarRectangles(List<List<Long>> sides) {
        Map<Double, Long> ratioCounts = new HashMap<>();

        for (List<Long> rect : sides) {
            double ratio = (double) rect.get(0) / rect.get(1);
            ratioCounts.put(ratio, ratioCounts.getOrDefault(ratio, 0L) + 1);
        }

        long count = 0;
        for (long freq : ratioCounts.values()) {
            count += (freq * (freq - 1)) / 2; // Calculate combinations
        }

        return count;
    }
}
// Recently, while researching about similar rectangles,
// you found the term "Nearly Similar Rectangle." Two rectangles
// with sides (a, b) and (c,d) are nearly similar only if a/c = b/d.
// The order of sides matter in this definition, so rectangles [4, 2] and [6,3]
// are nearly
// similar, but rectangles [2, 4] and [6,3] are not. Given an array of
// rectangles with the lengths
// of their sides, calculate the number of pairs of nearly similar rectangles in
// the array.

// For example, let's say there are n = 4 rectangles, and sides = [[5, 10), [10,
// 10), (3, 6), 19, 9]].
// In this case, the first and third rectangles, with sides [5, 10] and [3,6],
// are nearly similar because 5/3 = 10/6. Also, the second and fourth
// rectangles, with sides [10, 10]
// and [9, 9], are nearly similar because 10/9 = 10/9. This means there are 2
// pairs of nearly
// similar rectangles in the array. Therefore, the answer is 2.