import java.util.HashMap;
import java.util.Map;

public class program4 {
    

    private static Map<Integer,Integer> getCounts(int[] input,int[] countArray){

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i < countArray.length;i++){
            int count = 0;
            for (int j = 0;j<input.length;j++){
                if(input[j] % countArray[i] == 0){
                    count = count + 1;
                }
            }
            map.put(countArray[i], count);
        }

        return map;
    }

    public static void main(String[] args) {
        // Input
        int[] input = new int[] {1,2,8,9,12,46,76,82,15,20,30};
        int[] countArray = new int[] {1,2,3,4,5,6,7,8,9};
        
        // test
        Map<Integer,Integer> result = getCounts(input,countArray);
        System.out.println(result.toString());

    }
}
