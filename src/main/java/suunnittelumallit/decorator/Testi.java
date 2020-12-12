package suunnittelumallit.decorator;


public class Testi {
    
    public static void main(String[] args) {
        Pizza pizza1 = new Smetana(new Tonnikala(new Valkosipuli(new Tomaattikastike(new PizzaPohja()))));
        Pizza pizza2 = new Ananas(new Pepperoni(new Jalopeno(new Tomaattikastike(new PizzaPohja()))));
        Pizza pizza3 = new Jalopeno(new Pepperoni(new Valkosipuli(new Tomaattikastike(new PizzaPohja()))));
        
        System.out.println("Tilaukseen kuuluu " + pizza1.getKuvaus() + ". Pizzan hinta on: " + pizza1.getHinta());
        System.out.println("Tilaukseen kuuluu " + pizza2.getKuvaus() + ". Pizzan hinta on: " + pizza2.getHinta());
        System.out.println("Tilaukseen kuuluu " + pizza3.getKuvaus() + ". Pizzan hinta on: " + pizza3.getHinta());
        System.out.println("Koko tilauksen hinta: " + (pizza1.getHinta() + pizza2.getHinta() + pizza3.getHinta()));
    }
}
