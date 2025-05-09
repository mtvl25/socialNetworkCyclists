package utils;
import java.util.Scanner;
import java.util.function.Predicate;

import presentation.UserUI.ErrorUI;


public final class Loop {
    
    public static String askString(String message,Predicate<String> condition,String errorMesagge) {
            
            Scanner teclado= new Scanner(System.in);
            String respuesta;
            do{
                System.out.println(message);
                respuesta=teclado.nextLine();

                if(!condition.test(respuesta)){
                    System.out.println(errorMesagge);
                }


            }while(!condition.test(respuesta));
            
            return respuesta;
    }


    public static int askInt(String message,Predicate<Integer> condition,String errorMesagge) {
            
            Scanner teclado= new Scanner(System.in);
            int respuesta;
            boolean valid;
            
            do{
                respuesta=0;
                System.out.println(message);
                try{

                    respuesta=teclado.nextInt();
                }catch(Exception e){
                    teclado.nextLine();
                    respuesta=-1;
                }

                valid=condition.test(respuesta);
                if(!valid){
                        System.out.println(ErrorUI.ERROR_INVALID_AGE);
                }
            }while(!valid);
            
            return respuesta;
    }
}
