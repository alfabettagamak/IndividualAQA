package patterns.adapter;

import java.util.ArrayList;

public class Adapter {
        private Second second;

    public Adapter(Second second) {
        this.second = second;
    }

    public ArrayList<Integer> translator(Integer number){
            ArrayList<Integer> newArrayList = new ArrayList<>();
            // 100
            // ["1","0","0"]
            String[] numberToString = number.toString().split("");
            for (String str: numberToString){
                newArrayList.add(Integer.parseInt(str));
            }
            return newArrayList;
    }

    public void printList(Integer number){
        second.printList(translator(number));
    }


}
