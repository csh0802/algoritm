package programmers.level2;


public class ProgressDevelop {
    public static int[] solution(int[] progresses, int[] speeds) {

        int[] date= new int[100];
        int day=0;
        int idx = 0,answerIdx=0;
        while(idx!=progresses.length){

            if(progresses[idx]<100){

                for(int i=0;i<progresses.length;i++){
                    progresses[i] += speeds[i];
                }
                day++;
            }else{
                date[day]++;
                idx++;
            }

        }
        int[] temp = new int[idx];
        for(int a:date){
            if(a!=0){
                temp[answerIdx]=a;
                answerIdx++;

                System.out.println(a);
            }
        }
        int[] answer = new int[answerIdx];
        answerIdx =0;
        for(int a:temp){
            if(a!=0){
                answer[answerIdx]=a;
                answerIdx++;

                System.out.println(a);
            }
        }
        return answer;
        }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answer = solution(progresses,speeds);
        for(int a:answer){
            System.out.println(a);
        }

    }
}
