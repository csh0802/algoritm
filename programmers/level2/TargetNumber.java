package programmers.level2;

public class TargetNumber {

        static int answer;

        public static void dfs(int[] numbers, int target, int idx, int sum){
            if(idx==numbers.length && target==sum){
                answer++;
            }else if(idx==numbers.length && target!=sum){

            }else{
                dfs(numbers,target,idx+1,sum+numbers[idx]);
                dfs(numbers,target,idx+1,sum-numbers[idx]);
            }

        }
        public static int solution(int[] numbers, int target) {

            dfs(numbers,target,0,0);

            return answer;
        }


    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println(TargetNumber.solution(numbers,target));

    }
}
