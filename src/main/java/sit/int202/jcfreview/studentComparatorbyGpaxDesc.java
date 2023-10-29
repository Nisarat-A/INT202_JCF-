package sit.int202.jcfreview;

import java.util.Comparator;

public class studentComparatorbyGpaxDesc implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        if (o1.getGpax()<o2.getGpax()){return  1;} else if (o1.getGpax()>o2.getGpax()) {return -1;}
        else {return o1.getName().compareTo(o2.getName());}
}}
