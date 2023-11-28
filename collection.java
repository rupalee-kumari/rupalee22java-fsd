
import java.util.ArrayList;
import java.util.Collections;
class collection{
        public static void main(String args[]) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            //add elements
            list.add(1);
            list.add(3);
            list.add(4);
            list.add(5);
            System.out.println(list);
            //to get an element
            int element = list.get(0);
            System.out.println(element);
            //add element in between
            list.add(1,2);
            System.out.println(list);
            int size = list.size();
            System.out.println(size);
            for(int i=0; i<list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            //Sorting the list
            list.add(0);
            Collections.sort(list);
            System.out.println(list);
        }
}









