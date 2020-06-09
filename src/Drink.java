class Drink {
    String name;
    Double price;
    Boolean containsAlcohol;
    Ingredient ingredient1;
    Ingredient ingredient2;
    Ingredient ingredient3;


    // create constructor drink and put constructor ingredient in it in drinkinfo class
    Drink(String n, double p, boolean cA, Ingredient ingr1, Ingredient ingr2, Ingredient ingr3) {
        name = n;
        price = p;
        containsAlcohol = cA;
        ingredient1 = ingr1;
        ingredient2 = ingr2;
        ingredient3 = ingr3;
    }
}
