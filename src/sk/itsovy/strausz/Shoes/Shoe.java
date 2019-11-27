package sk.itsovy.strausz.Shoes;

public class Shoe {

    private Type type ;
    private Brand brand ;
    private Color color ;
    private  double price;

    public void setType(Type type) {
        this.type = type;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private  static int count = 0;

    public Shoe(double price) {
        this.price = price;
        count++;
    }

    public Type getType() {
        return type;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }


    public static int getCount() {
        return count;
    }

    public void print (){
        System.out.println("Type is: " +getType() + "\n" + "Brand is: " +getBrand() + "\n" + "Colour is: " +getColor() +"\n"+ "Price is: "+getPrice()+"€");
    }
}
