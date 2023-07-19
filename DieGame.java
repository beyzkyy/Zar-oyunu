public class DieGame {
    public static final int GOAL_SCORE = 100; 
    private DiePlayer[] players;
    private int[] score; 

    public DieGame(DiePlayer[] players){
        this.players=players;
        score=new int[players.length];
    }
    public int playTurn(DiePlayer p,int playernum){
        int turpuan=0,y=0,sayac=0;
        Die die=new Die(); 
        do{
          sayac=sayac+1;   y=die.nextRoll();
          if(y!=1) turpuan=turpuan+y;
          else turpuan=0;  break;
        }
        while(p.isRolling(score[playernum],turpuan,getMaxScore(),sayac));
        
        return turpuan;
    }
    public int play(){
        for(int i=0;i<players.length;i++){
            score[i]=0;
        }
        while(getMaxScore()<GOAL_SCORE){
            for(int i=0;i<players.length;i++){
                 score[i]=score[i]+playTurn(players[i], i);
            }
       }
       int x=0;
       for(int i=1;i<players.length;i++){
          if(score[i]>score[x])   x=i;
       }
       return x;    
    }
    int getMaxScore(){
        int x=0;
       for(int i=0;i<players.length;i++){
          if(score[i]>x)   x=score[i];
       }
       return x;   
    }
    void printScores(){
       for(int i=0;i<players.length;i++){
          System.out.print(score[i]+"\n");
       }
    }
}
