package programmers.level2;

import java.util.LinkedList;
import java.util.*;

public class PairRemove {
    public static int solution(String s){
        int answer = -1;
        List<Character> charList = new ArrayList<>();

        if(s.length()%2==1){
            return 0;
        }
        for(int i =0;i<s.length();i++){
            charList.add(s.charAt(i));
        }
        int count=0;
        int idx=1;

        while(answer == -1){

            if(charList.get(idx-1)==charList.get(idx)){
                charList.remove(idx-1);
                charList.remove(idx-1);
                count++;
                idx=1;
            }else{
                if(idx==charList.size()-1 && count==0){
                    answer = 0;
                }else if(idx==charList.size()-1 ){
                    idx=1;
                    count=0;
                }else{
                    idx++;
                }
            }

            if(charList.size()==0){
                answer = 1;

            }

        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "aaabbaaa";
        int answer = solution(s);
        System.out.println(answer);
    }
}
