import java.util.Scanner;
import java.util.Random;

public class kjh20211221_mid2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        Random random = new Random();

        String[] rsp = {"가위", "바위", "보"};

        System.out.println("#컴퓨터와 가위바위보를 하여 상대보다 먼저 정해진 계단을 모두 올라가면 승리하는 게임입니다.#");
        System.out.println("#바위로 이기면 한 칸, 가위로 이기면 두 칸, 보로 이기면 다섯 칸 올라갑니다.#");
        System.out.println();

        System.out.println("총 계단 수를 설정하세요: ");
        int totalStairs = s.nextInt();
        s.nextLine();

        int myStairs = 0;
        int computerStairs = 0;

        while (myStairs < totalStairs && computerStairs < totalStairs) {
            System.out.println("가위, 바위, 보 중 하나를 입력 (게임을 끝내려면 '종료' 입력): ");
            String myChoice = s.nextLine();

            if (myChoice.equals("종료")) {
                System.out.println("게임 종료");
                break;
            }

            if (!myChoice.equals("가위") && !myChoice.equals("바위") && !myChoice.equals("보")) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                continue;
            }

            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = rsp[computerChoiceIndex];
            System.out.println("나: " + myChoice + " vs 컴퓨터: " + computerChoice);

            if (myChoice.equals(computerChoice)) {
                System.out.println("비겼습니다.");
            }
            else if ((myChoice.equals("가위") && computerChoice.equals("보")) ||
                       (myChoice.equals("바위") && computerChoice.equals("가위")) ||
                       (myChoice.equals("보") && computerChoice.equals("바위"))) {
                if (myChoice.equals("가위")) {
                    myStairs += 2;
                    System.out.println("당신이 가위로 이겼습니다! 2칸 올라갑니다.");
                }
                else if (myChoice.equals("바위")) {
                    myStairs += 1;
                    System.out.println("당신이 바위로 이겼습니다! 1칸 올라갑니다.");
                }
                else if (myChoice.equals("보")) {
                    myStairs += 5;
                    System.out.println("당신이 보로 이겼습니다! 5칸 올라갑니다.");
                }
            }
            else {
                if (computerChoice.equals("가위")) {
                    computerStairs += 2;
                    System.out.println("컴퓨터가 가위로 이겼습니다! 2칸 올라갑니다.");
                }
                else if (computerChoice.equals("바위")) {
                    computerStairs += 1;
                    System.out.println("컴퓨터가 바위로 이겼습니다! 1칸 올라갑니다.");
                }
                else if (computerChoice.equals("보")) {
                    computerStairs += 5;
                    System.out.println("컴퓨터가 보로 이겼습니다! 5칸 올라갑니다.");
                }
            }

            System.out.println("--현재 계단: 사용자 - " + myStairs + "/" + totalStairs + ", 컴퓨터 - " + computerStairs + "/" + totalStairs + "--");
            System.out.println();

            if (myStairs >= totalStairs) {
                System.out.println("축하합니다! 사용자가 계단을 모두 올랐습니다.");
                break;
            }
            else if (computerStairs >= totalStairs) {
                System.out.println("컴퓨터가 계단을 모두 올랐습니다. 컴퓨터가 승리했습니다.");
                break;
            }
        }
        s.close();
	}
}
