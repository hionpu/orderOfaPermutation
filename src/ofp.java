import java.util.ArrayList;
import java.util.Arrays;

public class ofp {
    public static int orderOfPresentation(int N, int[] K) {
        // TODO:
        Integer[] num = new Integer[N];
        for (int i = 0; i<N; i++) num[i] = i+1;
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(num));
        int ans = 0;


        System.out.println(numList);

        for (int j = 0; j<N; j++) {
            int index = numList.indexOf(Integer.valueOf(K[j]));
            int level = j+1;
            ans += (index) * fact(N-(level));
            numList.remove(Integer.valueOf(K[j]));
            System.out.println("numList = " + numList + ", ans = " + ans);

        }
        return ans;
    }
    public static int fact(int n) {
        if (n == 0) return 1;
        int ans = 1;
        for (int i = 1; i <= n; i++) ans *= i;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(orderOfPresentation(5,new int[]{1,3,2,4,5}));
    }
}
