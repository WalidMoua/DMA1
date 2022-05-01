package inversions;

import java.util.*;

public class Inversions {
    public int countInversions(ArrayList<Integer> input) {
        int count = 0; //to store inversion count
        for (int i = 0; i < input.size() - 1; i++) //for each element
            for (int j = i + 1; j < input.size(); j++) // to compare element right to current item
                if (input.get(i) > input.get(j)) {
                    count++;
                }
        return count;
    }
}

