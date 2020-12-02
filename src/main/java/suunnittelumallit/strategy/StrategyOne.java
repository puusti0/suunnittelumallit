package suunnittelumallit.strategy;

import java.util.Iterator;
import java.util.List;

public class StrategyOne implements ListConverter{

    @Override
    public String listToString(List<String> list) {
        Iterator<String> i = list.iterator();
        StringBuilder sb = new StringBuilder();
        
        while (i.hasNext()) {
            sb.append(i.next());
            sb.append("\n");
        }
        
        return sb.toString();
    }
}
