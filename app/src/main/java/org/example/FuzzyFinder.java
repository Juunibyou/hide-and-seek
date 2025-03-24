package org.example;

import java.util.ArrayList;

public class FuzzyFinder {

    public int linearSearch(ArrayList<Fuzzy> fuzzlist){

        for(int i = 0; i <fuzzlist.size(); i++){
            if(fuzzlist.get(i).color.equals("gold")){
                return i;
            }
        }

    return -1;
    }

    public int binarySearch(ArrayList<Fuzzy> fuzzlist){
        int low = 0;
        int high = fuzzlist.size()-1;

        while(low <= high){
            int middlePosition = (low+high)/2;

            if (fuzzlist.get(middlePosition).color.equals("gold")){
                return middlePosition;
            }
            if (fuzzlist.get(middlePosition).color.compareTo("gold") < 0){
                low = middlePosition + 1;
            }
            else {high = middlePosition - 1;};
        }

    return -1;
    }
}
