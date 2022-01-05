package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;

public class OpenChatting {
    public static String[] solution(String[] record){

        HashMap<String,String> nickHash = new HashMap<>();
        ArrayList<String> chatLog = new ArrayList<>();



        for(int i=0;i<record.length;i++){
            String[] temp = record[i].split(" ");
            String id = temp[1];
            String nickName = "";
            if(!temp[0].equals("Leave")){
                nickName = temp[2];
            }

            switch (temp[0]){
                case "Enter":
                    nickHash.put(id,nickName);
                    chatLog.add(id+"님이 입장하셨습니다.");
                    break;
                case "Leave":
                    chatLog.add(id+"님이 퇴장하셨습니다.");
                    break;
                case "Change":
                    nickHash.put(id,nickName);
                    break;
            }

        }

        String[] answer = new String[chatLog.size()];
        int count = 0;
        for(String str:chatLog){
            int idEndIdx = str.indexOf("님");
            String userId = str.substring(0,idEndIdx);
            answer[count++] = str.replace(userId,nickHash.get(userId));
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] answer = solution(record);
        for(String str:answer){
            System.out.println(str);
        }

    }
}
