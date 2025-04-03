class Car implements Hybrid{

    Integer cylinder;
    String battery;
    
    Car(Integer cyl, String bat){
        this.cylinder = cyl;
        this.battery = bat;
    }
    
    public Integer getCylinder(){
        return this.cylinder;
    }
    public String getBattery(){
        return this.battery;
    } 
    public String showSource(){
        return "my car runs both on gas and electricity";
    }
}
