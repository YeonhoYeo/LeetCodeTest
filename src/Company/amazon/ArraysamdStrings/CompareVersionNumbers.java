package Company.amazon.ArraysamdStrings;

/**
 *
 * Approach 1: Split + Parse, Two Pass
 * Complexity Analysis
 *
 * Time complexity : \mathcal{O}(N + M + \max(N, M))O(N+M+max(N,M)), where NN and MM are lengths of input strings.
 *
 * Space complexity : \mathcal{O}(N + M)O(N+M) to store arrays nums1 and nums2.
 */

public class CompareVersionNumbers {

    public static void main(String[] args) {
        String version1 = "1.01";
        String version2 = "1.001";

        System.out.println(compareVersion(version1, version2));

    }

    public static int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");

        int v1 = 0;
        int v2 = 0;

        int maxSize = Math.max(ver1.length, ver2.length);

        for (int i = 0; i < maxSize; i++) {
            v1 = i < ver1.length ? Integer.parseInt(ver1[i]) : 0;
            v2 = i < ver2.length ? Integer.parseInt(ver2[i]) : 0;
            if ( v1 != v2 ) {
                return v1 > v2 ? 1 : -1;
            }
        }
        return 0;
    }
}
