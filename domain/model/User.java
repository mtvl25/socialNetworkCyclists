public class User{

    //Atributos 
    private String name;
    private int age;
    private String typeOfCycling;
    private String location;


    //Constructor

    public User(String name,int age,String typeOfCycling,String location){
        this.name=name;
        this.age=age;
        this.typeOfCycling=typeOfCycling;
        this.location=location;
    }


    //SETTERS



    //Cambiar nombre
    public void setName(String name){
        this.name=name;
    }


    //Cambiar Edad
    public void setAge(int age){
        this.age=age;
    }

    //Cambiar tipo de ciclismo
    public void setTypeOfCycling(String typeOfCycling){
        this.typeOfCycling=typeOfCycling;
    }


    //Cambiar ubicacion
    public void setLocation(String location){
        this.location=location;
    }



    //GETTERS



    //Obtener nombre
    public String getName(){
        return this.name;
    }

    //Obtener edad
    public int getAge(){
        return this.age;
    }

    //Obtener tipo de ciclismo

    public String getTypeOfCycling(){
        return this.typeOfCycling;
    }

    //Obtener Ubicacion
    public String getLocation(){
        return this.location;
    }

    //Metodos

    
}