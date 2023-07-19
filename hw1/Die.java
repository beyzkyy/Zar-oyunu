import java.util.Random;
public class Die{
    
    int nextRoll(){
     Random r=new Random();
        int zar=r.nextInt(7);  
      return zar;
    }
}