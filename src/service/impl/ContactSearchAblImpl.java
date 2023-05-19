package service.impl;

import model.Contact;
import service.ContactSearchAbl;

public class ContactSearchAblImpl implements ContactSearchAbl {
    @Override
    public void searchContact(String fullName, Contact[]contacts) {
        for (int i = 0; i < contacts.length; i++) {
            if (fullName.equalsIgnoreCase(contacts[i].getFullName())){
                System.out.println(contacts[i].toString());
            }
        }

    }
}
