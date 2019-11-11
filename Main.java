
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a.fedko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CatHome home1= new CatHome();
        CatHome home2= new CatHome();
        CatHome home3= new CatHome();
        home1.name="Tiger";
        home2.name="Puss";
        home3.name="Smokey";
        home1.breed="Abyssinian";
        home2.breed="Aegean";
        home3.breed="American Curl";
        System.out.println("Домашние кошки:");
        System.out.println(home1.name);
        System.out.println(home1.breed+"\n");
        System.out.println(home2.name);
        System.out.println(home2.breed+"\n");
        System.out.println(home3.name);
        System.out.println(home3.breed+"\n");
        
        System.out.println("Дикие кошки:");
        CatWild wild1= new CatWild();
        CatWild wild2= new CatWild();
        CatWild wild3= new CatWild();
        wild1.name="Misty";
        wild2.name="Oscar";
        wild3.name="Kitty";
        wild1.breed="Tiger";
        wild2.breed="Lion";
        wild3.breed="Guepard";
        System.out.println(wild1.name);
        System.out.println(wild1.breed+"\n");
        System.out.println(wild2.name);
        System.out.println(wild2.breed+"\n");
        System.out.println(wild3.name);
        System.out.println(wild3.breed);
    }
    
}
