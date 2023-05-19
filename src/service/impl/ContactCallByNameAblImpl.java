package service.impl;

import model.Contact;
import service.ContactCallByNameAbl;

public class ContactCallByNameAblImpl implements ContactCallByNameAbl {


    @Override
    public void callByName(String fullName, Contact[] contacts) {
        for (int i = 0; i < contacts.length; i++) {
            if(fullName.equals(contacts[i].getFullName())){
                System.out.println(contacts[i].getFullName()+" "+contacts[i].getPhoneNumber());
            }
        }
    }
}
