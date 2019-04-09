
package intefaces;

public class CBox implements IBox {
    private Object Objeto;
    
    public CBox(){
        Objeto= null;
}

  
    public void put(Object objeto) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      Objeto = objeto;  
    }


    public Object get() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Objeto;
    }
    
    public void ObtnerClase(CBox cbox){
        
    }
    
}
