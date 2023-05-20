package service.impl;

import model.Contact;
import model.Phone;
import service.PhoneTurnOnAbl;

public class PhoneTurnOnAblImpl implements PhoneTurnOnAbl {

    @Override
    public void turnOn(String password, Phone[]phones) {
        for (int i = 0; i < phones.length; i++) {
            if(password.equals(phones[i].getPassword())){
                System.out.println("This phone turnOn: "+phones[i].getName()+" "+phones[i].getBrand());
            }
            else System.out.println("Try again");
        }
    }
}
