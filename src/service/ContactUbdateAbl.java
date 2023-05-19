package service;

import model.Contact;

public interface ContactUbdateAbl {
Contact uppDate(long OldPhoneNumber,String oldFullName,long newPhoneNumber,String newFullName,Contact[]contacts);
}
