package main;

public class VIPGuest extends Guest {

    private boolean isAllowedInFancyArea = true;

    VIPGuest() {
        super();
    }

    VIPGuest(String name, int age) {
        super(name, age);
    }

    VIPGuest(String name, int age, int meals, int drinks) {
        super(name, age, meals, drinks);
    }

    public boolean getIsAllowed(){
        return this.isAllowedInFancyArea;
    }


}
