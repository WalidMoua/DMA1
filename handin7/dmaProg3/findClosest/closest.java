package findClosest;

import java.util.*;

public class closest
{

  public int findClosest(ArrayList<Integer> input)
  {
    // No base case, no recursion
    Collections.sort(input); //sort ArrayList
    // O(n log n)
    int difference = Integer.MAX_VALUE; //initialize difference with a value
    //1 initialization and attribution = O(2)
    for(int i = 1; i<input.size();i++){
      // O(n)
      if(input.get(i)-input.get(i-1) < difference){//if the difference between the 2 numbers is lower than the actual difference
        //1 condition, 2 .get, 2 "-", 1 "<" = O(5)
        difference = input.get(i)-input.get(i-1); // set the new difference
        //1 attribution, 2 "-", 2 .get = O(5)
      }
    }
    return difference;
    //1 return = O(1)
  }

/*
T(n) = O(n log n)
*/

}