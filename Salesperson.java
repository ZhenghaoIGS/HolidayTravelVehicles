class Salesperson {
    private int salespersonId;
    private String salespersonname;

    public Salesperson(int spid, String spn) {
        salespersonId=spid;
        salespersonname=spn;
    }
    public void setSalespersonId(int spid)
    {
        salespersonId=spid;
    }
     public void setname(String spn)
    {
        salespersonname=spn;
    }
    public int getsalespersonId(){
        return salespersonId;
    }
    public String getsalespersonname(){
        return salespersonname;
    }
}