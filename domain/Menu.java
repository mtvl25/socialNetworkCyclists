package domain;

import java.util.Scanner;

import presentation.UserUI.ErrorUI;
import presentation.UserUI.MenuUI;
import presentation.UserUI.UserInputUI;
import utils.Loop;
import utils.Validations;




public class Menu{
    //Libreria scanner

    


public static void main(String[] args) {

    //UI en forma de String
    

    //Declaracion de variables temporales
    String name;
    int age;
    String typeOfCycling;
    String location;

    //Crea el escanner que nos permite leer datos por pantalla.
    
    Scanner teclado= new Scanner(System.in);
    

    while (true){
        
        System.out.println(MenuUI.MENU_PRINCIPAL);
        int option=teclado.nextInt();
        

        switch(option){
            case 1:
                name=Loop.askString(UserInputUI.PROMPT_NAME,Validations::validateUserName,ErrorUI.ERROR_INVALID_NAME);
                age=Loop.askInt(UserInputUI.PROMPT_AGE,Validations::validateAge,ErrorUI.ERROR_INVALID_AGE);
                break;
            case 2:
                
                break;
        }
    }
}
}
