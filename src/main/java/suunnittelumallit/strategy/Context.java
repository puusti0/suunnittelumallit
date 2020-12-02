package suunnittelumallit.strategy;

import java.util.List;

public class Context {
    private ListConverter converter;

    public Context(ListConverter strategy) {
        this.converter = strategy;
    }
    
    public String convertList(List<String> list) {
        return converter.listToString(list);
    }
    
    public void setStrategy (ListConverter strategy) {
        this.converter = strategy;
    }
}
