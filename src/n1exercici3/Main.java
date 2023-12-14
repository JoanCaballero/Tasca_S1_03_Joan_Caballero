package n1exercici3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        gestioExam gE = new gestioExam();
        gE.nomUsuari();
        gE.crearExam();
        gE.imprimirPuntuacio();
        gE.gestionarClassificacio();
    }


}