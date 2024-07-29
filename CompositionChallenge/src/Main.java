public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
//        kitchen.doKitchenWork();
//        kitchen.doKitchenWork();
//        kitchen.addWater();
//        kitchen.pourMilk();
//        kitchen.loadDishWasher();
        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}
