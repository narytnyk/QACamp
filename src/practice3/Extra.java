package practice3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Extra {
    private static boolean  isMatch;

    public static void main(String []args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("qwerty");
        arrayList.add("evrghn");
        arrayList.add("fnrh");
        arrayList.add("sererth");

        System.out.println("Collection has duplicates: " + findingDuplicates(arrayList));
    }

    private static boolean findingDuplicates (ArrayList<String> arrayList){


        Set<String> set = new HashSet<>(arrayList);

        if (set.size() < arrayList.size()) {
            isMatch =true;
        }  else{
            isMatch =false;
        }
            return isMatch;
        }
    }

