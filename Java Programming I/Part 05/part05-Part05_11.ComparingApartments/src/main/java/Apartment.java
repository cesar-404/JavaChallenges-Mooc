
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getArea() {
        return this.squares;
    }
    
    public int getPrice() {
        return this.princePerSquare * this.squares;
    }
    
    public boolean largerThan(Apartment compared) {
        if(this.getArea() > compared.getArea()) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(compared.getPrice() - this.getPrice());
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.getPrice() > compared.getPrice()) {
            return true;
        }
        return false;
    }
}
