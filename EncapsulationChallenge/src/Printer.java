public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (getTonerLevel() + tonerAmount >= 100 || getTonerLevel() + tonerAmount < 0 ) {
            System.out.println("Invalid, toner level cannot get to other than 0-100, toner remains: " + getTonerLevel() );
            return -1;
        } else {
            System.out.println("New toner level: " + getTonerLevel());
            return getTonerLevel() + tonerAmount;
        }
    }

    public boolean isDuplex() {
        if (duplex) {
            System.out.println("It's a duplex");
        }
        return duplex;
    }

    public int getTonerLevel() {
        if (tonerLevel < 0) {
            tonerLevel = 0;
        }
        return tonerLevel;
    }

    public int printPages(int pages) {
        if (duplex && getTonerLevel() >= pages && getTonerLevel() > 0 && tonerLevel - pages * 2 > 0) {
            if(pages % 2 == 0) {
                tonerLevel -= pages * 2;
            }
            else if (pages % 2 == 1 && pages > 1) {
                tonerLevel -= (pages * 2) + 1;
                pages = pages + 1;
            }
            else {
                tonerLevel -= pages;
            }
            pagesPrinted += pages;
            System.out.println("New toner level: " + getTonerLevel() + " pages printed: " + pages +
                    "\ntotal pages printed = " + pagesPrinted);
            return pages;
        }
        else if(!duplex && getTonerLevel() >= pages && getTonerLevel() > 0  && tonerLevel - pages > 0 ) {
            tonerLevel -= pages;
            pagesPrinted += pages;
            System.out.println("New toner level: " + tonerLevel + " pages printed: " + pages
                    + "\ntotal pages printed = " + pagesPrinted);
            return pages;
        }
        else {
            if (duplex) {
                System.out.println("Not enough toner, toner required = " + pages * 2 + " but only have " + tonerLevel + " toners"
                        + "\ntotal pages printed = " + pagesPrinted);

            }
            else {
                System.out.println("Not enough toner, toner required = " + pages + " but only have " + tonerLevel + " toners"
                        + "\ntotal pages printed = " + pagesPrinted);
            }
            return 0;
        }
    }
}
