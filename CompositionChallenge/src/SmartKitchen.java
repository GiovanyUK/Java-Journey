public class SmartKitchen {
    private CoffeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeMaker();
        dishWasher = new DishWasher(); ;
        iceBox = new Refrigerator(); ;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
        System.out.println("Adding water");
    }
    public void pourMilk () {
        iceBox.setHasWorkToDo(true);
        System.out.println("Pouring milk");
    }
    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
        System.out.println("Loading dish washer");
    }

    public void setKitchenState(boolean coffeeFlag , boolean fridgeFlag,
                                boolean dishWasherFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFoods();
    }
}
