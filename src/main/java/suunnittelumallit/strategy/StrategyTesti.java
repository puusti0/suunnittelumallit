package suunnittelumallit.strategy;

import java.util.Arrays;
import java.util.List;

public class StrategyTesti {
    
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Appelsiini","Banaani","Omena","Porkkana","Kurkku","Lanttu","Peruna","Kaali","Herne");
        
        Context context = new Context(new StrategyOne());
        System.out.println(context.convertList(lista));
        
        context.setStrategy(new StrategyTwo());
        System.out.println(context.convertList(lista));
        
        context.setStrategy(new StrategyTree());
        System.out.println(context.convertList(lista));
    } 
}
