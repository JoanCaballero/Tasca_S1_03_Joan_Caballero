package n1exercici3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Mapa {

    private Map<String, String> map;

    public Mapa(String missatge){
        this.map = HashMapFromTextFile(missatge);
    }

    public Map<String, String> getMap() {
        return map;
    }

    public static Map<String, String> HashMapFromTextFile(String filePath){
        Map<String, String> map = new HashMap<>();
        BufferedReader br = null;
        try{
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine() )!= null){
                String[] parts = line.split(" ");
                String pais = parts[0].trim();
                String capital = parts[1].trim();
                if(!pais.equals("") && !capital.equals("")){
                    map.put(pais, capital);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if (br != null){
                try{
                    br.close();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        return map;
    }
}
