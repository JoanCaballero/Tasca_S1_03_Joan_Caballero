package n1exercici3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    final static String filePath = "resources/countries.txt";
    static Map<String, String> map;
    static Scanner sca = new Scanner(System.in);
    static Random r = new Random();
    static int punt = 0;
    public static void main(String[] args) {
        Mapa mapa = new Mapa(filePath);
        map = mapa.getMap();
        System.out.println("Introdueix el teu nom s'usuari: ");
        String usuari = sca.nextLine();
        System.out.println("Hola " + usuari + ". Benvingut a la prova.");
        Object[] arrayKeys =  map.keySet().toArray();

        for(int i =0; i < 10; i++){
            int index = r.nextInt(arrayKeys.length);
            Object key = arrayKeys[index];
            System.out.println("Quina és la capital d'aquest pais? " + key);
            String resposta = sca.nextLine();
            if(map.get(key).equalsIgnoreCase(resposta)){
                punt++;
                System.out.println("Correcte.");
            }
            else {
                System.out.println("Incorrecte.");
            }
        }
        System.out.println("Usuari " + usuari + " la teva puntuació ha sigut " + punt + "/10.");
        if(punt<5){
            System.out.println("Una llàstima, més sort la pròxima vegada.");
        } else if (punt == 5) {
            System.out.println("Per poc, però aprovat. Felicitats!");
        } else{
            System.out.println("Felicitats! Estàs fet/a tot un/a rodamón.");
        }
        try(FileWriter fw = new FileWriter("resources/classificacio.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)){
            out.println("Usuari: " + usuari + ". Puntuació: " + punt);
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }


}