import java.util.Scanner;

public class CurrencyCnt {
    public static void main(String[] args) {


        int refund = 25000;

            int curr50000 = 50000;
            int curr10000 = 10000;
            int curr5000 = 5000;
            int curr1000 = 1000;

            //25,000원을 5만원으로 나누었을 때 몫, 나머지
            //25,000원을 각 화폐 단위로 나누었을 때 몫과 나머지를 출력하는 코드를 작성
            //각 화폐 단위는 위와 같이 각각 변수로 선언 해주세요.

            System.out.printf("5만원권 %d장 나머지:%d%n",refund/curr50000,refund%curr50000);
            System.out.printf("1만원권 %d장 나머지:%d%n",refund/curr10000,refund%curr10000);
            System.out.printf("5천원권 %d장 나머지:%d%n",refund/curr5000,refund%curr5000);
            System.out.printf("1천원권 %d장 나머지:%d%n",refund/curr1000,refund%curr1000);

        }
    }


