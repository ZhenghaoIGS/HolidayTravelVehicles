class Option {
    private int optionCode;
    private String description;
    private double price;

    public Option(int oc, String od, double op) {
        optionCode = oc;
        description = od;
        price = op;
    }

   public void setoptionCode(int oc)
    {
        optionCode=oc;
    }
     public void setoptiondescription(String od)
    {
        description=od;
    }
     public void setoptionprice(double op)
    {
        price=op;
    }
    public int getoptionCode(){
        return optionCode;
    }
    public String getOptiondescription(){
        return description;
    }
    public double getOptionprice(){
        return price;
    }
    public String toString() {
        return description + " ($" + price + ")";
    }
}