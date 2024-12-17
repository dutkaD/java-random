package main;

abstract class Guest {
    private String name;
    private int age;
    private int numberMeals;
    private int numberDrinks;

    public Guest() {

    }

    public Guest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Guest(String name, int age, int meals, int drinks) {
        this.name = name;
        this.age = age;
        this.numberMeals = meals;
        this.numberDrinks = drinks;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String nameString){
        this.name = nameString;
    }

    public void setNumberMeals(int meals){
        this.numberMeals = meals;
    }

    public void setNumberDrinks(int drinks){
        this.numberDrinks = drinks;
    }

    public int getAge(){
        return this.age;
    }

}
