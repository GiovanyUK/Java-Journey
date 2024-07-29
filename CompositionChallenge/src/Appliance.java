public class Appliance {
    private boolean hasWorkToDo;

    public Appliance(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public Appliance () {
        this.hasWorkToDo = false;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class Refrigerator extends Appliance {

    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public Refrigerator() {
        setHasWorkToDo(false);
    }

    public void orderFoods() {
        if (isHasWorkToDo()) {
            setHasWorkToDo(true);
            System.out.println("Ordering food");
        }
        else {
            setHasWorkToDo(false);
            System.out.println("No more tasks...");
        }
    }
}

class DishWasher extends Appliance {

    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public DishWasher() {
        setHasWorkToDo(false);
    }

    public void doDishes() {
        if(isHasWorkToDo()) {
            setHasWorkToDo(true);
            System.out.println("Dish washing");
        }
        else {
            setHasWorkToDo(false);
            System.out.println("No more tasks...");
        }
    }
}

class CoffeMaker extends Appliance {

    public CoffeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public CoffeMaker() {
        setHasWorkToDo(false);
    }

    public void brewCoffee(){
        if(isHasWorkToDo()) {
            setHasWorkToDo(true);
            System.out.println("Brewing coffee");
        } else {
            setHasWorkToDo(false);
            System.out.println("No more tasks...");
        }
    }





}