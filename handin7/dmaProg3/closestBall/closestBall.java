package closestBall;
import java.util.*;

public class closestBall
{
  public int computeClosest(ArrayList<Integer> players, ArrayList<Integer> balls)
  {
    Collections.sort(players);//sort players
    //O(n log n)
    Collections.sort(balls);//sort balls
    //O(m log m)
    int difference = Integer.MAX_VALUE;
    //initialization and attribution = O(2)
    int r = 0, l = 0;
    //2 initialization and 2 attribution = O(4)
    while(r!=players.size() && l!=balls.size()){
      //O(n)
      if(Math.abs(players.get(r)-balls.get(l))<difference)
        //1 condition, 3 call method, 1 "-", 1 "<" = O(5)
        difference = Math.abs(players.get(r) - balls.get(l));
        //attribution, 3 call method, 1 "-" = O(4)
      else if(r == players.size() - 1){
        //condition, 1 "==", 1 call method, 1 "-" = O(4)
        r = 0;
        //1 attribution = O(1)
        l++;
        //1 incrementation = O(1)
      }else
        r++;
        //1 incrementation = O(1)
    }
    return difference;
    //1 return = O(1)
  }
}

/*
T(n) = O(n log n + m log m) If we ignore constants
*/
