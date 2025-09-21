public class main {
    public static void main(String[] args)
    {
        //individal test
        Vehicle vehicle = new Vehicle("1","power","m4", 2025,"bmw",50000);
        System.out.println("Vehicle infor: " +  vehicle.getserialNumber() + vehicle.getname() + vehicle.getmodel() + vehicle.getyear() + vehicle.getmanufacturer() + vehicle.getbaseCost());
        Salesperson salesperson = new Salesperson(1, "Zhenghao");
        System.out.println("Salesperson infor: " + salesperson.getsalespersonId() + salesperson.getsalespersonname() );
        Customer customer = new Customer(1, "Zhenghao", "123 salaya", "0926921961");
        System.out.println("Customer infor: " + customer.getcid() + customer.getcname() + customer.getcaddress() + customer.getcphone() );
        TradeInVehicle tradeInVehicle = new TradeInVehicle("1", "bmw", "m3", 2003, 10000);
        System.out.println("TradeInVehicle infor: " + tradeInVehicle.getSerialNumber() + tradeInVehicle.getMake() + tradeInVehicle.getModel() + tradeInVehicle.getYear() + tradeInVehicle.getallowance());
        Option option = new Option(1, "engine", 1000);
        System.out.println("Option infor: " + option.getoptionCode() + option.getOptiondescription() + option.getOptionprice());
        Invoice invoice = new Invoice(1, "Sep 1 ", customer, salesperson, vehicle);
        System.out.println("v: " + vehicle.toString());
        System.out.println("tv: " + tradeInVehicle.toString());

        //invoice test

        // invoice.addOption(new Option(1, "engine", 2000));
        // invoice.addOption(new Option(2, "key", 1500));
        // invoice.setTradeInVehicle(new TradeInVehicle("123", "BMW", "M4", 2003, 12000));
        System.out.println("invoice price: " + invoice.calculateFinalPrice());
        invoice.setFees(5000, 1000);
        invoice.sign("Josh");
        System.out.println(invoice);
    }
    
}
