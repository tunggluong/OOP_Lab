public class Cart {
    private DigitalVideoDisc[] digitalVideoDiscs;
    private int qtyOrdered;
    private static final int MAX_NUMBERS_ORDERED = 20;

    public Cart() {
        digitalVideoDiscs = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
        qtyOrdered=0;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered<MAX_NUMBERS_ORDERED) {
            digitalVideoDiscs[qtyOrdered]=disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
            if (qtyOrdered==MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full.");
            }
        } else {
            System.out.println("The cart is full. Cannot add more discs.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found=false;
        for (int i=0;i<qtyOrdered;i++) {
            if (digitalVideoDiscs[i].equals(disc)) { 
                for (int j=i;j<qtyOrdered-1;j++) {
                    digitalVideoDiscs[j]=digitalVideoDiscs[j+1];
                }
                digitalVideoDiscs[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                found=true;
                break;
            }
        }
        if(!found) {
            System.out.println("The disc is not found in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i=0;i<qtyOrdered;i++) {
            total+=digitalVideoDiscs[i].getCost();
        }
        return total;
    }
}
