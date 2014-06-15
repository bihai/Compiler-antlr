/**
Represent Function 

@since June 14, 2014
@auhtor whimycwd

*/

import java.util.*;

public class FunctionSymbol extends Symbol {
    List<String> signature = null;
    

    public FunctionSymbol(String name){ 
        super(name,Type.tFunc);
    }
   
    public void setSignature(List<String> list){
        signature = list;
    }

}
