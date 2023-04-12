import java.util.HashMap;

public class IntegerToRoman {
    public String intToRoman(int num) {
        HashMap<Integer,Character> map=new HashMap<Integer,Character>();
        map.put(1000,'M');
        String roman="";
        while(num!=0){
            roman+=map.get(num%10);
            
        }
    }
}
