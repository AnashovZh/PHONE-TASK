package model;
public class Phone {
    private String brand;
    private String name;
    private String password;
    private Contact[] contacts;
    public Phone(String brand, String name, String password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }
    public static void call(long number,Contact[]contacts){
        for (int i = 0; i <contacts.length ; i++) {
            if(number==contacts[i].getPhoneNumber()){
                System.out.println(contacts[i].getFullName()+" "+contacts[i].getPhoneNumber());
            }
        }
    }public static void appDateName(Contact []contacts,String name){
        for (int i = 0; i < contacts.length; i++) {
            if(name.equals(contacts[i].getFullName())){
            }
        }
    }
}