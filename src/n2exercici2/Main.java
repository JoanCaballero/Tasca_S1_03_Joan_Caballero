package n2exercici2;

import n2exercici1.Restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Main{

    public static void main(String[] args) {
        Restaurant rest = new Restaurant("Rest", 2);
        Restaurant rest1 = new Restaurant("Resa", 2);
        Restaurant rest2 = new Restaurant("Resta", 4);
        Restaurant rest3 = new Restaurant("resta", 3);
        Restaurant rest4 = new Restaurant("Abc", 3);
        Restaurant rest5 = new Restaurant("Abc", 2);
        Restaurant rest6 = new Restaurant("resta", 4);

        HashSet<Restaurant> restaurants = new HashSet<>();
        restaurants.add(rest);
        restaurants.add(rest1);
        restaurants.add(rest2);
        restaurants.add(rest3);
        restaurants.add(rest4);
        restaurants.add(rest5);
        restaurants.add(rest6);
        ArrayList<Restaurant> restaurantArrayList = new ArrayList<>(restaurants);
        System.out.println(restaurantArrayList);
        Collections.sort(restaurantArrayList, new Comparator<Restaurant>() {
            @Override
            public int compare(Restaurant r1, Restaurant r2) {
                if(r1 == r2){
                    return 0;
                }
                if(r1.getNomLowerCase().compareTo(r2.getNomLowerCase()) == 0){
                    if(r1.getPunt() < r2.getPunt()){
                        return 1;
                    } else if (r1.getPunt() == r2.getPunt()) {
                        return 0;
                    }
                    else{
                        return -1;
                    }
                }
                else {
                    return r1.getNom().compareTo(r2.getNom());
                }
            }
        });
        System.out.println(restaurantArrayList);
    }


}