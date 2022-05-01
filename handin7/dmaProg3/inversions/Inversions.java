package inversions;

import java.io.*;
import java.util.*;

public class Inversions
{
  public int countInversions(ArrayList<Integer> input) {
      int count = 0;
      for(int i = 0; i<input.size();i++){
          int j = i+1;
          if(input.get(i)>input.get(j) && j<input.size()){
              int inversion2 = input.get(j);
              input.set(j,input.get(i));
              input.set(i,inversion2);
              count++;
          }
      }
      return 42;
  }
}

