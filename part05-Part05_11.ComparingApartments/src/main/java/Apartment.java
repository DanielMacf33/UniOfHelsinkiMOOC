
import static java.lang.Math.abs;


public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares < compared.squares){
            return false;
        }
        return true;
        
    }
    
    public int priceDifference(Apartment compared){
        int priceOne = this.squares * this.princePerSquare;
        int priceTwo = compared.squares * compared.princePerSquare;
        
        return abs(priceOne - priceTwo);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int priceOne = this.squares * this.princePerSquare;
        int priceTwo = compared.squares * compared.princePerSquare;
        
        if(priceOne > priceTwo){
            return true;
        }
        
        return false;
    }
    
    

}
