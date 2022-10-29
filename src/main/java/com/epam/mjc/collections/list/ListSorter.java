package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ListSorter {
    public void sort(List<String> sourceList) {
        String mintemp;

        ListComparator comparator = new ListComparator();
        for (int i = 0; i <sourceList.size(); i++) {
            for (int j = 0; j < sourceList.size(); j++) {
                if(comparator.compare(sourceList.get(i), sourceList.get(j)) < 0){
                    mintemp = sourceList.get(i);
                    sourceList.set(i, sourceList.get(j));
                    sourceList.set(j, mintemp);
                }
            }
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        var first = Math.pow(Integer.parseInt(a),2) * 5 + 3;
        var second = Math.pow(Integer.parseInt(b),2) * 5 + 3;
        if (first == second) return 0;
        else if(first > second) return 1;
        else return -1;
    }
}
