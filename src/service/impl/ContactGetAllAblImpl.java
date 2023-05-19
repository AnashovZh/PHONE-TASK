package service.impl;

import model.Contact;
import service.ContactGetAllAbl;

public class ContactGetAllAblImpl implements ContactGetAllAbl {
    @Override
    public void getAllContact(Contact[] contacts) {
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i].getFullName()+" "+contacts[i].getPhoneNumber());
        }
    }
}
