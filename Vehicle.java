class Vehicle {
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public Vehicle(String sn, String n, String m, int y, String mf, double bc) {
        serialNumber=sn;
        name=n;
        model=m;
        year=y;
        manufacturer=mf;
        baseCost=bc;
    }

    // Getters and Setters
    public void setSerialNumber(String sn)
    {
        serialNumber=sn;
    }
     public void setname(String n)
    {
        name=n;
    }
     public void setmodel(String m)
    {
        model=m;
    }
     public void setyear(int y)
    {
        year=y;
    }
     public void setmanufactturer(String mf)
    {
        manufacturer=mf;
    }
     public void setbaseCost(double bc)
    {
        baseCost=bc;
    }
    public String getserialNumber(){
        return serialNumber;
    }
    public String getname(){
        return name;
    }
     public String getmodel(){
        return model;
    }
     public int getyear(){
        return year;
    }
     public String getmanufacturer(){
        return manufacturer;
    }
     public double getbaseCost(){
        return baseCost;
    }
    public String toString() {
        return year + " " + manufacturer + " " + model + " (" + serialNumber + ")";
    }
}
  