package lse;
import java.util.*;

public class LittleSearchEngineDriver {
    public static void main(String[] args) {
        LittleSearchEngine littleone = new LittleSearchEngine();
        try {
            String x = "docs.txt";
            String y = "noisewords.txt";

            littleone.makeIndex(x, y );
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        Set<String > res = littleone.keywordsIndex.keySet();
        System.out.println("\n\n");
        for(String zz : res) {
            System.out.println(zz + " " + littleone.keywordsIndex.get(zz).toString());
        }
        ArrayList<String> top5 = littleone.top5search("deep", "world");
        if(top5 != null) {
                System.out.println("\n\nRes: " + top5.toString());
        }
        else {
            System.out.println("\n\nRes: null");
        }
    }
}
