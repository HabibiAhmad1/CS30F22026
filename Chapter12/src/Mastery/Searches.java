package Mastery;
/*
 * Searches class
 * Includes binary search and ternary search methods.
 */

public class Searches {

    /**
     * Searches items array for goal using ternary search.
     * pre: items is sorted from low to high.
     * post: Position of goal is returned, or -1 if not found.
     */
    public static int ternarySearch(int[] items, int start,
                                    int end, int goal) {

        if (start > end) {
            return(-1);
        } else {
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;

            if (goal == items[mid1]) {
                return(mid1);
            } else if (goal == items[mid2]) {
                return(mid2);
            } else if (goal < items[mid1]) {
                return(ternarySearch(items, start, mid1 - 1, goal));
            } else if (goal > items[mid2]) {
                return(ternarySearch(items, mid2 + 1, end, goal));
            } else {
                return(ternarySearch(items, mid1 + 1, mid2 - 1, goal));
            }
        }
    }
}
