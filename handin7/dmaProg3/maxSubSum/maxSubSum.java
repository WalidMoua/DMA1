package maxSubSum;

import java.util.*;

public class maxSubSum
{
  public int findMaxSubSum(ArrayList<Integer> input)
  {
    // Kadane’s algorithm
    int max = Integer.MIN_VALUE;
    //initialization and attribution = O(2)
    int end = 0;
    //initialization and attribution = O(2)
    for(int i = 0; i<input.size();i++){
      //O(n)
      end = end + input.get(i);
      //attribution, 1 "+", 1 call method = O(3)
      if(end<0)
        //condition, 1 "<" = O(2)
        end = 0;
      //attribution = O(1)
      if(max < end)
        //condition, 1 "<" = O(2)
        max = end;
      //attribution = O(1)
    }
    return max;
    //return = O(1)
  }
}
