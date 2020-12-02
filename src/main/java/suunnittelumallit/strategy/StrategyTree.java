package suunnittelumallit.strategy;

import java.util.List;

public class StrategyTree implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<list.size(); i++) {
            if (i%3 == 0) {
                sb.append("\n" + list.get(i));
            } else {
                sb.append(" " + list.get(i));
            }
        }
        
        return sb.toString();
    } 
}
