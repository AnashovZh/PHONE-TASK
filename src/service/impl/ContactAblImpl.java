package service.impl;

import model.Contact;
import service.ContactUbdateAbl;
public class ContactAblImpl implements ContactUbdateAbl {
    @Override
public Contact uppDate(long OldPhoneNumber, String oldFullName, long newPhoneNumber, String newFullName, Contact[] contacts) {
        Contact contact1 = new Contact();
        for (Contact c : contacts) {
            if (c.getFullName().equals(oldFullName)) {
                contact1.setPhoneNumber(newPhoneNumber);
                contact1.setFullName(newFullName);
                System.out.println("Contact by name "+oldFullName+" successfully updated "+contact1);
            }
        }return contact1;
    }
}