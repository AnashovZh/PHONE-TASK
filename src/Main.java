
import model.Contact;
import model.Phone;
import service.*;
import service.impl.*;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Contact contact1=new Contact(501250499,"Anashov Zhanuzak");
Contact contact2=new Contact(773213425,"Vaidulaev Manas");
Contact contact3=new Contact(705061202,"Anashov Aitmat");
Contact contact4=new Contact(221785317,"Alisherov Erzhigit");
Contact contact5=new Contact(552931005,"Nazirbek uulu Baktulan");
Contact contact6=new Contact(999041202,"Mukanbetov Aibek");
Contact contact7=new Contact(505005004,"Ulan (agai) Kubanchbekov");
Contact contact8=new Contact(776001023,"Adilet Askaraliev");
Contact contact9=new Contact(771000072,"Asylbek Abdurashitov");
Contact contact10=new Contact(501278650,"Nurmukhammed Alymbai uulu");
Contact contact11=new Contact(776447233,"Kanjarbek Abdurazakov");

Contact [] contacts={contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11};
Contact[]contacts1={contact1,contact2,contact3};
Contact[]contacts2={contact4,contact5,contact6,contact7};
Contact[]contacts3={contact8,contact9,contact10,contact11};

Phone phone1=new Phone("Samsung ","GalaxyA52","AC2502",contacts1);
Phone phone2=new Phone("Apple ","14Pro","ac5454",contacts2);
Phone phone3=new Phone("Xiaomi","Redmi10","a1234",contacts3);
Phone[]phones={phone1,phone2,phone3};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ушул сандарды  танданыз:"+"\n"+
                "1-> Тедефонду куйгузуучу метод:"+"\n"+
                "2-> Телефон номери менен чалуучу метод:"+"\n"+
                "3-> Аты менен чалуучу метод:"+"\n"+
                "4-> Атынын жардамы менен контактыны табуучу метод"+"\n"+
                "5-> Контакттын атын жана номерин озгортуучу метод:"+"\n"+
                "6-> Телефондогу баардык контакттарды чыгаруучу метод:"+"\n");
        int number=10;

        while(number!=0){
           int number1= scanner.nextInt();
        switch(number1){

            case 1:

                System.out.println("Тедефонду куйгузуучу метод: ");
                PhoneTurnOnAbl phoneTurnOnAbl=new PhoneTurnOnAblImpl();
                phoneTurnOnAbl.turnOn("trsdfxcfty",phones);
                break;
            case 2:
                System.out.println("Телефон номери менен чалуучу метод:");
                ContactCallAbl contactCallAbl=new ContactCallAblImpl();
                contactCallAbl.call(505005004,contacts);
                break;
            case 3:
                System.out.println("Аты менен чалуучу метод:");
                ContactCallByNameAbl contactCallByNameAbl=new ContactCallByNameAblImpl();
                contactCallByNameAbl.callByName("Anashov Zhanuzak",contacts);
                break;
            case 4:
                System.out.println("Атынын жардамы менен контактыны табуучу метод");
                ContactSearchAbl contactSearchAbl=new ContactSearchAblImpl();
                contactSearchAbl.searchContact("Nazirbek uulu Baktulan",contacts);
                break;
            case 5:
                System.out.println("Контакттын атын жана номерин озгортуучу метод:");
                ContactAblImpl contactAbl = new ContactAblImpl();
                contactAbl.uppDate(552931005,"Nazirbek uulu Baktulan", 255633265,
                        "Asanov Asan",contacts);
                break;
            case 6:
                System.out.println("Телефондогу баардык контакттарды чыгаруучу метод:");
                ContactGetAllAbl ContactGetAllAbl=new ContactGetAllAblImpl();
                ContactGetAllAbl.getAllContact(contacts);
                break;
            default:System.out.println("Ушул сандарды гана танданыз !!! "+"\n"+
                    "1-> Тедефонду куйгузуучу метод:"+"\n"+
                    "2-> Телефон номери менен чалуучу метод:"+"\n"+
                    "3-> Аты менен чалуучу метод:"+"\n"+
                    "4-> Атынын жардамы менен контактыны табуучу метод"+"\n"+
                    "5-> Контакттын атын жана номерин озгортуучу метод:"+"\n"+
                    "6-> Телефондогу баардык контакттарды чыгаруучу метод:"+"\n");
        }}











    }


}