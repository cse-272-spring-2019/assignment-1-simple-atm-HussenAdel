/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Hussen
 */
public class valdiation {
    private  String Cardnumber;
    boolean v=false;

    public valdiation() {
        this.Cardnumber = "h123";
    }
    public boolean valid (String Cardnumber)
    { 
        if (this.Cardnumber.equals(Cardnumber))
            return true;
        return false;
    }
    
    
    
}
