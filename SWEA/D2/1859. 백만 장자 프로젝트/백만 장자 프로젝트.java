import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int[] nums = new int[N];

            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();
            }

            long ans = 0;

            int max = nums[N - 1];

            for (int i = N - 2; i >= 0; i--) {

                if (nums[i] < max) {
                    // 오늘 사서 미래의 max 가격에 판매
                    ans += max - nums[i];
                } else {
                    // 더 비싼 가격을 발견
                    max = nums[i];
                }
            }

            System.out.println("#" + test_case + " " + ans);
        }
    }
}