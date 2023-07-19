public class MyDiePlayer implements DiePlayer {

    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        if(maxScore>90) return true;
        else if(turnTotal<30 && (myScore+turnTotal)<100) return true;
        else return false;
    }
    
}
