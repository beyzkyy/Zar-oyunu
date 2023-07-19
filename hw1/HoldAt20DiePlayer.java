public class HoldAt20DiePlayer implements DiePlayer{

    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        if((myScore+turnTotal)<100 && turnTotal<20) return true;
        else  return false;
    }
    
    
}
