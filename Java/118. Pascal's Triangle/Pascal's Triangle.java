import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<List<Integer>> superList = Solution.generate(5);

        for (List list: superList) {
            System.out.print("[");
            for (Object i: list) {
                System.out.print(i);
                System.out.print(",");
            }
            System.out.print("], ");
        }


    }

    static class Solution {
        public static List<List<Integer>> generate(int numRows) { // Pascal's triangle

            List<List<Integer>> superList =  new ArrayList<>();

            if (numRows <= 0)
                return superList;

            for (int i = 1; i <= numRows; i++) {
                List<Integer> list =  new ArrayList<>();

                for(int j = 0; j < i; j++) {
                    if(j == 0 || j == i-1) {
                        list.add(1);
                    }
                    else {
                        list.add((superList.get(i-2).get(j-1) + superList.get(i-2).get(j)));
                    }
                }
                superList.add(list);
            }
            return superList;
        }
    }
}
