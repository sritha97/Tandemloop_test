public class program3 {

    public static void getString(int count){
        
        String output = "";

        for(int i = 0;i< count;i++){

            int oddNumber = i*2 + 1;

            if(i == 0){
                output = String.format("%s", oddNumber);
            }
            else if((count % 2 == 1) || ((count % 2 == 0 ) && i < count - 1)){
                output = String.format("%s,%s",output ,oddNumber);
            }
        }
       
        System.out.println(String.format("Input a = %s, then output: %s", count,output));
        

    }

    public static void main(String[] args) {
        // test 
        getString(1);
        getString(2);
        getString(3);
        getString(4);
        getString(5);
        getString(6);
    }
    
}
