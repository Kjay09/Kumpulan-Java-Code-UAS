package NO_2;

public class NO_2 {
    
    public static void main(String[] args) {
        @Override
        Food_2 Chicken = new Food_2("Chicken Strip");
        Food_2 Bento = new Food_2("Bento Box");
        Food_2 Mineral = new Food_2("Mineral Water");
        Food_2 Cracker = new Food_2("Cracker");
        Food_2 Coffee = new Food_2("Coffee");
        Food_2 Toast = new Food_2("Toast Egg");
        Food_2 Beef = new Food_2("Beef Burger");
        Food_2 Burger = new Food_2("Burger");

        Food_2[] foods2 = {Chicken, Bento, Mineral, Cracker, Coffee, Toast, Beef, Burger};
        
        for (Food_2 Food_2 : foods2){
            Food_2.bought();
        }
    }
}
