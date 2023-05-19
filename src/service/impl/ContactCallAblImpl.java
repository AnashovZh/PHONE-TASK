package service.impl;

import model.Contact;
import service.ContactCallAbl;

public class ContactCallAblImpl implements ContactCallAbl {
    @Override
    public void call(long phoneNumber,Contact[]contacts) {
        for (int i = 0; i < contacts.length; i++) {
            if(phoneNumber==contacts[i].getPhoneNumber()){
                System.out.println(contacts[i].getFullName()+" "+contacts[i].getPhoneNumber());
            }

        }

    }
}
