import java.util.ArrayList;

public class b {
    public static void sortIAL(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while(!list.isEmpty()) {
            int min = Integer.MAX_VALUE;
            int j = 0; 
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) < min) {
                    j = i; 
                    min = list.get(i);
                }
            }
            temp.add(list.remove(j));
        }
        while(!temp.isEmpty()) {
            list.add(temp.remove(0));
        }
      }
      
      public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(1);
        nums.add(5);
        nums.add(9);
        nums.add(2);
        nums.add(6);
        nums.add(5);
        nums.add(3);
        System.out.println(nums);
        sortIAL(nums);
        System.out.println(nums);
      }
}
