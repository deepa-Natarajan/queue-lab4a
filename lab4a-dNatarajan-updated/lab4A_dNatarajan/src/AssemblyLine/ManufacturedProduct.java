package AssemblyLine;

import java.util.Random;

public class ManufacturedProduct {

    private int productId;
    private boolean passedInspection;
    ManufacturedProduct mp;

    ManufacturedProduct(int id) {
        productId = id;
        passedInspection = true;
       // inspectionMethod(this);
        
        
    }

   

    public int getProductId() {

        return productId;
    }
    public boolean getpassedInspection(){
        
        return passedInspection;
         
    
    }
  
  

    @Override
    public String toString() {
        
        return String.format("Product Id: " + getProductId() + " ; " + "Passed Inspection: " + getpassedInspection());
    }
 
    

    public ManufacturedProduct inspectionMethod(ManufacturedProduct p) {
        Random r = new Random();
        int inspect = r.nextInt(20);
        if (inspect == 0) {
            passedInspection = false;
        }

        return p;
    }

}
