package utils;

public  class Validations {
    
    public static boolean validateUserName(String name){

        //Comprobamos que el texto sea mayor a 4 caracteres que no este vacio y que ademas contenga letras validas
        if(name.length()>=4 && !name.isBlank() && name.matches("[a-zA-Z]+") ){
            return true;
        }else{
            return false;
        }
        

    }


    public static boolean validateAge(int age){

        //Comprobamos que el texto sea mayor a 4 caracteres que no este vacio y que ademas contenga letras validas
        if(age>=15 && age<90){
            return true;
        }else{
            return false;
        }
        

    }



    
}
