package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Month gener = new Month("Gener");
        Month febrer = new Month("Febrer");
        Month marc = new Month("Març");
        Month abril = new Month("Abril");
        Month maig = new Month("Maig");
        Month juny = new Month("Juny");
        Month juliol = new Month("Juliol");
        Month septembre = new Month("Septembre");
        Month octubre = new Month("Octubre");
        Month novembre = new Month("Novembre");
        Month desembre = new Month("Desembre");

        ArrayList<Month> mesos = new ArrayList<>();
        mesos.add(gener);
        mesos.add(febrer);
        mesos.add(marc);
        mesos.add(abril);
        mesos.add(maig);
        mesos.add(juny);
        mesos.add(juliol);
        mesos.add(septembre);
        mesos.add(octubre);
        mesos.add(novembre);
        mesos.add(desembre);
        System.out.println(mesos);

        Month agost = new Month("Agost");
        mesos.add(7, agost);
        System.out.println(mesos);
        HashSet<Month> hashmesos = new HashSet<>(mesos);
        System.out.println(hashmesos);
        System.out.println("ArrayList mesos: ");
        for (Month mes : mesos) {
            System.out.println(mes.getName());
        }
        System.out.println("HashSet mesos: ");
        Iterator<Month> iterador = hashmesos.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
        System.out.println("PROVA DUPLICATS: ");
        System.out.println(mesos);
        System.out.println("Afegim el mes de desembre repetit.");
        mesos.add(desembre);
        System.out.println("ArrayList dels mesos: " + mesos);
        hashmesos = new HashSet<>(mesos);
        System.out.println("HashSet dels mesos: " + hashmesos);
    }
}