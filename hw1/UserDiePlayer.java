import java.util.Scanner;

public class UserDiePlayer implements DiePlayer {
    Scanner sc = new Scanner(System.in);
    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        System.out.print("Roll or Hold?");
        String devam = sc.nextLine();
        if( devam == null) return true;
        else return false;

    }  
}
