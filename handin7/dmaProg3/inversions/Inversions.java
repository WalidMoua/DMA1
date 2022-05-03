package inversions;

import java.util.*;

public class Inversions {
    public int countInversions(ArrayList<Integer> input) {
        int count=0;
        //O(1)
        for (int i = 0; i < input.size() - 1; i++) //for each element
        { //O(n)
            for (int j = i + 1; j < input.size(); j++)// to compare element right to current item
                //O(n)
                if (input.get(i) > input.get(j)) {
                    //O(3)
                    count++;
                    //O(2)
                }
        }
        int n = input.size();
        //O(2)
        int z, k, temp;
        //O(3)
        boolean swapped;
        //O(1)
        for (z = 0; z < n - 1; z++)
        //O(n)
        {
            swapped = false; //O(1)
            for (k = 0; k < n - z - 1; k++)
            //O(n)
            {
                if (input.get(k) > input.get(k + 1))
                {//O(5)
                    // swap arr[j] and arr[j+1]
                    temp = input.get(k);
                    //O(3)
                    input.set(k, k+1);
                    //O(3)
                    input.set(k+1, temp);
                    //O(2)
                    swapped = true;
                    //O(1)
                }
            }
            // if no two elements were
            // swapped by inner loop, then break
            if (swapped == false)//O(2)
                break;//O(1)
        }
        return count;//O(1)
    }
}
//O(n^2)