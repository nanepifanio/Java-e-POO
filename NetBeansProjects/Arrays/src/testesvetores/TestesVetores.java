package testesvetores;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vetor.Vetor;
import vetor.VetorGenerics;
import vetor.VetorObject;

public class TestesVetores {

    public static void main(String[] args) {
         /**
       
                        VetorGenerics<String> v = new VetorGenerics(3);
                        //Ou  VetorGenerics<String> v = new VetorGenerics<String>(3);

                        try { 
                            v.setElementos("Renan");
                            v.setElementos("Ingrid");
                            v.setElementos("Duda");
                        } catch (Exception ex) {

                        }

                        System.out.println(v.getTamanho());
                        System.out.println(v);//Pode ser só o objeto ou pode colocar o toString()

                        System.out.println(v.getElementos(2));

                        System.out.println(v.getElementos("Duda"));

                        v.setElementos(2, "Paty");
                        System.out.println(v);
                        System.out.println(v.getTamanho());
                        System.out.println(v.getElementos("Duda"));

                        v.removeElementos(0);
                        System.out.println(v);
                        System.out.println(v.getTamanho());

                        int pos = v.getElementos("Maria");
                        if (pos > -1) {
                            v.removeElementos(pos);
                        } else { 
                            System.out.println("Elemento não existe no vetor.");
                        }
                        System.out.println(v);
                        System.out.println(v.getTamanho());
        
        */
        
        /**
         
                        ArrayList<String> arrayList = new ArrayList();

                        arrayList.add("A");
                        arrayList.add("C");
                        arrayList.add("D");

                        System.out.println(arrayList);
                        System.out.println(arrayList.size());

                        arrayList.add(1, "B");

                        System.out.println(arrayList);
                        System.out.println(arrayList.size());

                        System.out.println(arrayList.get(2));

                        System.out.println(arrayList.indexOf("D"));

                        arrayList.remove("A");

                        System.out.println(arrayList);
                        System.out.println(arrayList.size());

                        arrayList.remove(0);
                        System.out.println(arrayList);
                        System.out.println(arrayList.size());

        */
        
        VetorGenerics<String> vetor = new VetorGenerics(5);
        
        try {
            vetor.setElementos("A");
            vetor.setElementos("B");
            vetor.setElementos("A");
        } catch (Exception ex) {
            Logger.getLogger(TestesVetores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(vetor);
        
        System.out.println(vetor.ultimoIndice("A"));
    }
    
}
