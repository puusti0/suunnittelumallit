package suunnittelumallit.strategy;

import java.util.List;

public class StrategyTwo implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        String[] stringArray = new String[list.size()];
        stringArray = list.toArray(stringArray);
        String returnString = ""; 
        
        for (int i=0; i<stringArray.length; i++) {
            if (i%2 == 0) {
                returnString += "\n" + stringArray[i];
            } else {
                returnString += " " + stringArray[i];
            }
        }
        return returnString;   
    }
}
