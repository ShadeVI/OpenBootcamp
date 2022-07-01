package temaCincoEntrega;

import temaCincoEntrega.clases.CocheCRUDImpl;

public class TemaCincoMain {
    public static void main(String[] args){
        CocheCRUDImpl objectoCoche = new CocheCRUDImpl();
        objectoCoche.save();
        objectoCoche.findAll();
        objectoCoche.delete();
    }
}
