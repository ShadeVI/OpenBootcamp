package temaCincoEntrega.clases;

import temaCincoEntrega.intefaces.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {
    private static int counter = 0;
    public CocheCRUDImpl(){
        CocheCRUDImpl.counter++;
    }
    public void save(){
        System.out.println("Save method");
    }
    public void findAll(){
        System.out.println("Find All method");
    }
    public void delete(){
        System.out.println("Delete method");
    }
}
