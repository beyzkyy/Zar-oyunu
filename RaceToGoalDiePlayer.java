public class RaceToGoalDiePlayer implements DiePlayer {


    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        if(myScore>=71 && maxScore>=71 ) return true;
        else if(turnTotal<21+Math.round((maxScore-myScore)/8) && (turnTotal+myScore)<100) return true;
        else  return false;
    }
    
}
