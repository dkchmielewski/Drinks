class DrinkInfo {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Margarita";
        drink1.price = 10.00;
        drink1.containsAlcohol = true;

        Drink ingredient1 = new Drink();
        drink1.ingredient1 = "Tequila";
        drink1.amountIngredient1 = 2;

        Drink ingredient2 = new Drink();
        drink1.ingredient2 = "Orange liquor";
        drink1.amountIngredient2 = 1;

        Drink ingredient3 = new Drink();
        drink1.ingredient3 = "Lime juice";
        drink1.amountIngredient3 = 1;

        System.out.println("Drink name: " + drink1.name);
        System.out.println("Price: $" + drink1.price);
        System.out.println("Contains alcohol: " + drink1.containsAlcohol);
        System.out.println("Ingredients: " + drink1.ingredient1 + ", "
                + drink1.ingredient2 + ", " + drink1.ingredient3);
        System.out.println("Recipe: \n" + drink1.ingredient1 + ": " + drink1.amountIngredient1 + " oz" +
        "\n" + drink1.ingredient2 + ": " + drink1.amountIngredient2 + " oz" +
                "\n" + drink1.ingredient3 + ": " + drink1.amountIngredient3 + " oz");
    }
}
