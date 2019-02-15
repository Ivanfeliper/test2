public class Candy extends DessertItem {
    double weight,pricePerPound;                                              //one attribute of my subclass
    public Candy(String name, double weight, double pricePerPound){                                                       //constructor for the attribute
        super(name);                                             // invoke superclass
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    @Override
    public double calculateItemCost() {
        return (weight*pricePerPound);
    }
    public String toString(){
        return "candy"+"weight"+weight+" * pricePerPound"+pricePerPound;
    }
}
