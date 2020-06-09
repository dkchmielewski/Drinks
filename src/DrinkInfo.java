class DrinkInfo {
    public static void main(String[] args) {

        Ingredient tequila = new Ingredient("Tequila", "2 oz");
        Ingredient orangeLiquor = new Ingredient("Orange liquor", "1 oz");
        Ingredient limeJuice = new Ingredient("Lime juice", "1 oz");

        Drink drink1 = new Drink("Margarita", 10.00, true, tequila,
                orangeLiquor, limeJuice);
        System.out.println("Drink name: " + drink1.name);
        System.out.println("Price: $" + drink1.price);
        System.out.println("Contains alcohol: " + drink1.containsAlcohol);
        System.out.println("Ingredients: \n" + drink1.ingredient1.name);
        System.out.println(drink1.ingredient1.amount);
        System.out.println(drink1.ingredient2.name);
        System.out.println(drink1.ingredient2.amount);
        System.out.println(drink1.ingredient3.name);
        System.out.println(drink1.ingredient3.amount);

    }
}
