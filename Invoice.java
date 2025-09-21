import java.util.ArrayList;
import java.util.List;

class Invoice {
    private int invoiceId;
    private String date;
    private Customer customer;
    private Salesperson salesperson;
    private Vehicle vehicle;
    private TradeInVehicle tradeInVehicle;
    private List<Option> options;
    private double tax;
    private double licenseFee;
    private String signature;

    public Invoice(int invoiceId, String date, Customer customer, Salesperson salesperson, Vehicle vehicle) {
        this.invoiceId = invoiceId;
        this.date = date;
        this.customer = customer;
        this.salesperson = salesperson;
        this.vehicle = vehicle;
        this.options = new ArrayList<>();
    }
    public void addOption(Option option) {
        options.add(option);
    }
    public void setTradeInVehicle(TradeInVehicle tradeInVehicle) {
        this.tradeInVehicle = tradeInVehicle;
    }
    public void setFees(double tax, double licenseFee) {
        this.tax = tax;
        this.licenseFee = licenseFee;
    }
    public void sign(String signature) {
        this.signature = signature;
    }
    public double calculateFinalPrice() {
        double total = vehicle.getbaseCost();

        for (Option option : options) {
            total += option.getOptionprice();
        }

        if (tradeInVehicle != null) {
            total -= tradeInVehicle.getallowance();
        }

        total += tax + licenseFee;
        return total;
    }
    public String toString() {
        return "Invoice #" + invoiceId + "\nCustomer: " + customer.getcname() +
                "\nSalesperson: " + salesperson.getsalespersonname() +
                "\nVehicle: " + vehicle +
                "\nTrade-In: " + (tradeInVehicle) +
                "\nOptions: " + options +
                "\nFinal Price: $" + calculateFinalPrice() +
                "\nSignature: " + (signature);
    }
}