import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Number_406
 * @Description 406. 根据身高重建队列
 * https://leetcode-cn.com/problems/queue-reconstruction-by-height/
 * @Author fan
 * @CreateTime 2021/11/20 9:19 下午
 * @Version 1.0
 */
public class Number_406 {
    public static void main(String[] args) {
   int[][] people=     {{9,0},{7,0},{1,9},{3,0},{2,7},{5,3},{6,0},{3,4},{6,2},{5,2}};
        System.out.println(Arrays.deepToString(reconstructQueue(people)));
    }

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (people1, people2) -> {
            if (people1[0] != people2[0]) {
                return people2[0] - people1[0];
            } else {
                return people1[1] - people2[1];
            }
        });
        List<int[]> list = new ArrayList();
        for (int[] person : people) {
            list.add(person[1], person);
        }
        return list.toArray(new int[people.length][]);
    }
}
