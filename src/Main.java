import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        String input;
        int nameCount = 0;
        ArrayList<String> acronymList = new ArrayList<String>();
        nameCount = IOUtil.getInteger("Please declare the number of input: ");
        for(int i = 0; i<nameCount; i++) {
            input = IOUtil.getString("Input " + (i+1) + ": ");
            Abbreviator latestAcronym = new Abbreviator(input);
            acronymList.add(latestAcronym.getAcronym());
        }
        Collections.sort(acronymList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                }
                else{
                    return o1.compareTo(o2);
                }
            }
        });
        for(String counter: acronymList){
            System.out.println(counter);
        }
    }
}
