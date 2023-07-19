public class PlayDie {
    public static void main(String[] args) {
        DiePlayer player1 = new HoldAt20DiePlayer();
        DiePlayer player2 = new HoldAt25DiePlayer();
        DiePlayer player3 = new RaceToGoalDiePlayer();
        DiePlayer player4 = new MyDiePlayer(); 
        DiePlayer[] players={player1,player2,player3,player4};
        int[] dogru = new int[4];  
        for(int i=0;i<dogru.length;i++){
            dogru[i]=0;
        }
        DieGame game = new DieGame(players);
        for(int i=0;i<1000;i++){
           dogru[game.play()]++;
        }
        for(int i=0;i<dogru.length;i++){
            System.out.print(dogru[i]+"\n");
         }    
     }
 }