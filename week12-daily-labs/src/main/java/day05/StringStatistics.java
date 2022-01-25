package day05;

import java.util.HashMap;
import java.util.Map;

public class StringStatistics {

    public Map<Character,Integer> charDb(String input){
        Map<Character,Integer> result= new HashMap<>();
        for (char c:input.toCharArray()) {
            if(!result.containsKey(c)){
                result.put(c,1);
            }else{
                result.put(c,result.get(c)+1);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        StringStatistics stringStatistics = new StringStatistics();

        System.out.println(stringStatistics.charDb("Aranyalmafa"));
    }
}
