public class Customer {
    private int id;
    private String name;
    private String address;
    private String phone;

    public Customer(int cid, String cname, String caddress, String cphone) {
        id = cid;
        name = cname;
        address = caddress;
        phone = cphone;
    }
     public void setcid(int cid)
    {
        id=cid;
    }
     public void setcname(String cname)
    {
        name=cname;
    }
    public void setaddress(String caddress)
    {
        address= caddress;
    }
    public void setphone(String cphone)
    {
        phone= cphone;
    }
    public int getcid(){
        return id;
    }
    public String getcname(){
        return name;
    }
     public String getcaddress(){
        return address;
    }
     public String getcphone(){
        return phone;
    }
    
}
