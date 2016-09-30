package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public class Customer extends Person{

    private String address;
    private String teleNum;
    private int customerId;
    private String customer;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeleNum() {
        return teleNum;
    }

    public void setTeleNum(String teleNum) {
        this.teleNum = teleNum;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String introduceYourself(){
        return "Hi I am a  " + customer + ". My name is " + getFirstName() + " " + getLastName() + ".";
    }

    public String productType(String food){
        return "I want to buy a " + food + ".";
    }
}
