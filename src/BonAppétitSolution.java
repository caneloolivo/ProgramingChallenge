import java.util.List;

public class BonAppétitSolution {
	// Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
    	int sharedBill = 0;
        for (int x = 0; x< bill.size(); x++){
            if(x != k){
                sharedBill += bill.get(x);
            }                        
        }
        sharedBill /= 2;
        if(sharedBill >= b)
            System.out.println("Bon Appetit");
        else {
            System.out.println(b - sharedBill);
        }
    }
    
    public static void main(String [] args) {
    	int k = 4; 
    	int b = 1;
    }
}
