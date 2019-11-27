package sk.itsovy.strausz.Shoes;

public class Main {


    public static void main(String[] args) {

        Shoe add = new Shoe(50.99);
        Shoe nike = new Shoe(55.99);
        Shoe puma = new Shoe(25.99);


        add.setBrand(Brand.ADIDAS);
        nike.setBrand(Brand.NIKE);
        puma.setBrand(Brand.PUMA);

        add.setType(Type.SPORT);
        nike.setType(Type.NORMAL);
        puma.setType(Type.STYLISH);

        add.setColor(Color.BLUE);
        nike.setColor(Color.YELLOW);
        puma.setColor(Color.RED);

        add.print();
        System.out.println();

        nike.print();
        System.out.println();

        puma.print();
        System.out.println();

        System.out.println("Number of objects " + Shoe.getCount());


    }
}
