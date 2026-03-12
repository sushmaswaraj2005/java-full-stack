import java.util.HashMap;
import java.util.Map;
class Hash{
    public static void main(String[] args) {
        
        HashMap<String,Integer> map=new HashMap<>();
        map.put("danish",1 );
        map.put("taimoor  ",2);
        map.put("ayeza", 3);
        map.put("hania", 4);

        System.out.println(map.containsKey("Reshma"));
        map.get("hania");
        
        //Iteration
        for(Map.Entry<String,Integer> e:map.entrySet()){
            e.getKey();
            e.getValue();
        }
    }
}
