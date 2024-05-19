import java.util.Scanner;
import java.util.Random;

public class kjh20211221_mid1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		
		String[] rsp = {"가위", "바위", "보"};
		
		while (true) {
            System.out.println("가위, 바위, 보 중 하나를 입력하면 게임이 시작됩니다. (게임을 끝내려면 '종료' 입력): ");
            String myChoice = s.nextLine();

            if (myChoice.equals("종료")) {
                System.out.println("게임 종료");
                break;
            }

            if (!myChoice.equals("가위") && !myChoice.equals("바위") && !myChoice.equals("보")) {
                System.out.println("가위, 바위, 보 중 하나를 입력해주세요.");
                continue;
            }

            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = rsp[computerChoiceIndex];
            
            System.out.println("나: " + myChoice + " vs 컴퓨터: " + computerChoice);
            
            if (myChoice.equals(computerChoice)) {
                System.out.println("무승부!");
            }
            else if ((myChoice.equals("가위") && computerChoice.equals("보")) ||
                       (myChoice.equals("바위") && computerChoice.equals("가위")) ||
                       (myChoice.equals("보") && computerChoice.equals("바위"))) {
                System.out.println("승리!");
            }
            else {
                System.out.println("패배!");
            }
        }

        s.close();
	}
}
