package main;

public class NormalGuest extends Guest {

    private boolean isAllowedInFancyArea = false;

    NormalGuest() {
        super();
    }

    NormalGuest(String name, int age) {
        super(name, age);
    }

    NormalGuest(String name, int age, int meals, int drinks) {
        super(name, age, meals, drinks);
    }

    public boolean getIsAllowed(){
        return this.isAllowedInFancyArea;
    }


}
