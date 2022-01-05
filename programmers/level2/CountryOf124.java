package programmers.level2;

import java.util.Scanner;



public class CountryOf124 {



        public static String solution(int n) {
            String[] numbers = {"4", "1", "2"};
            String answer = "";

            int num = n;

            while (num > 0) {
                int temp = num % 3;
                num /= 3;

                if (temp == 0){
                    num--;
                }

                answer = numbers[temp] + answer;
            }

            return answer;
        }


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();


            System.out.println(solution(i));
        }

    }

