package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tuple {
    public static ArrayList<Integer> solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        s = s.substring(2,s.length()-2);
        s = s.replace("},{","-");

        String[] str = s.split("-");
        Arrays.sort(str,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });
        for(String a : str){
            String[] temp = a.split(",");
            for(String b : temp){
                if(!answer.contains(Integer.parseInt(b))){
                    answer.add(Integer.parseInt(b));
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        ArrayList<Integer> a = new ArrayList();
        a = Tuple.solution(s);
        System.out.println(a.toString());

    }
}
