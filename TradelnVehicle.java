class TradeInVehicle {
    private String serialNumber;
    private String make;
    private String model;
    private int year;
    private double allowance;

    public TradeInVehicle(String tvsn, String tvmake, String tvmodel, int tvyear,double tvallowance) {
        serialNumber = tvsn;
        make = tvmake;
        model = tvmodel;
        year = tvyear;
        allowance = tvallowance;
    }

    public void setSerialNumber(String tvsn) 
    { 
        serialNumber = tvsn; 
    }
    public void setMake(String tvmake) 
    { 
        make = tvmake; 
    }
    public void setModel(String tvmodel) 
    { 
        model = tvmodel; 
    }
    public void setYear(int tvyear) 
    { 
        year = tvyear; 
    }
    public void setallowance(double tvallowance) 
    { 
        allowance = tvallowance; 
    }

    public String getSerialNumber(){ 
        return serialNumber; 
    }
    public String getMake(){
         return make; 
    }
    public String getModel(){ 
        return model; 
    }
    public int getYear(){ 
        return year; 
    }
    public double getallowance(){ 
        return allowance; 
    }
    public String toString() {
        return year +  " " + make + " " + model + " (" + serialNumber + ")";
    }
}