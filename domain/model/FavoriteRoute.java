public class FavoriteRoute{

    //Atributos tipo de terreno,distancia y dificultad;
    private String  typeOfLand;
    private double  distance;
    private String  difficulty;




    public FavoriteRoute(String typeOfLand, double distance, String difficulty) {
        this.typeOfLand=typeOfLand;
        this.distance=distance;
        this.difficulty=difficulty;
    }

    //Setters
    public void SetTypeofLand(String typeOfLand){
        this.typeOfLand=typeOfLand;
    }

    public void SetDistance(double distance){
        this.distance=distance;
    }

    public void SetDifficulty(String difficulty){
        this.difficulty=difficulty;
    }



    //Getters

    public String GettypeOfLand(){
        return this.typeOfLand;
    }


    
    public double Getdistance(){
        return this.distance;
    }

    public String Getdifficulty(){
        return this.difficulty;
    }


    

}