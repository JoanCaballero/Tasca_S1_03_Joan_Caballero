package n1exercici2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> llista1 = new ArrayList<>();
        for(int i = 1; i<11; i++){
            llista1.add(i);
        }
        System.out.println(llista1);
        List<Integer> llista2 = new ArrayList<>();
        ListIterator<Integer> iteradorLlista = llista1.listIterator();
        while(iteradorLlista.hasNext()){
            llista2.add(0, iteradorLlista.next());
        }
        System.out.println(llista2);
    }
}
