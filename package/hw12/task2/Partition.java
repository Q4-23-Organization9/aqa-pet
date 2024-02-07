package hw12.task2;

import java.util.List;

public class Partition {

    public void partition(List<Integer> list, int numberX) {
        int low = 0;


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= numberX) {

                int temp = list.get(i);
                list.set(i, list.get(low));
                list.set(low, temp);
                low++;
            }
        }
    }


}
