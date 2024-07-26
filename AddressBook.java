import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        String firstname;
        String lastname;
        String address;
        String city;
        String state;
        int zip;
        String phoneno;
        String email;
        Map<String,AddAddress> addressBookMap=new HashMap<>();
        System.out.println("Welcome to Address Book");
        int choice;
        Scanner scannerobject=new Scanner(System.in);
        AddAddress addAddress=new AddAddress();
        int initialchoice;
        do{
            System.out.println("Enter the choice");
            System.out.println("1.Add Address Book");
            System.out.println("2.Edit Address Book");
            System.out.println("3.Display Address Book");
            System.out.println("4.Exit");
            initialchoice =scannerobject.nextInt();
            switch (initialchoice){
                case 1:
                    System.out.println("Enter the name of the new Address book");
                    String newaddressBookName=scannerobject.next();
                    if(addressBookMap.containsKey(newaddressBookName)){
                        System.out.println("Address Book with this name already exists");
                    }else {
                        AddAddress newAddressBook=new AddAddress();
                        addressBookMap.put(newaddressBookName,newAddressBook);
                        System.out.println("Address Book with "+newaddressBookName+" is added");
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of the Address book to edit");
                    String editaddressBookName=scannerobject.next();
                    if(addressBookMap.containsKey(editaddressBookName)){
                        AddAddress newAddressBook= addressBookMap.get(editaddressBookName);
                        do{
                            System.out.println("Enter the choice");
                            System.out.println("1.Add contact");
                            System.out.println("2.Edit a contact using name");
                            System.out.println("3.Delete a person using name");
                            System.out.println("4.Add Multiple contacts");
                            System.out.println("5.Exit");
                            choice=scannerobject.nextInt();
                            switch (choice){
                                case 1:
                                    System.out.println("Enter the details to add to address book");
                                    System.out.println("Enter the first name");
                                    firstname=scannerobject.next();
                                    System.out.println("Enter the last name");
                                    lastname=scannerobject.next();
                                    System.out.println("Enter the Address");
                                    address=scannerobject.next();
                                    System.out.println("Enter the state");
                                    state=scannerobject.next();
                                    System.out.println("Enter the City");
                                    city=scannerobject.next();
                                    System.out.println("Enter the phone number");
                                    phoneno=scannerobject.next();
                                    System.out.println("Enter the Email");
                                    email=scannerobject.next();
                                    System.out.println("Enter the zip");
                                    zip=scannerobject.nextInt();
                                    CreateContact contact=new CreateContact(firstname,lastname, address, city, state, zip, phoneno,email);
                                    newAddressBook.addContact(contact);
                                    break;
                                case 2:
                                    System.out.println("Enter the contact name to edit");
                                    String editName= scannerobject.next();
                                    CreateContact oldContact=newAddressBook.searchName(editName);

                                    int editingchoice;
                                    do{
                                        System.out.println("Which field you want to edit");

                                        System.out.println("1.First Name");
                                        System.out.println("2.Last Name");
                                        System.out.println("3.Address");
                                        System.out.println("4.City");
                                        System.out.println("5.State");
                                        System.out.println("6.Zip");
                                        System.out.println("7.Phone Number");
                                        System.out.println("8.Email");
                                        System.out.println("9.Exit");
                                        System.out.println("Enter the choice");
                                        editingchoice=scannerobject.nextInt();
                                        switch (editingchoice){
                                            case 1:
                                                System.out.println("Enter the new First Name");
                                                String newFirstname=scannerobject.next();
                                                oldContact.setFirstname(newFirstname);
                                                break;
                                            case 2:
                                                System.out.println("Enter the new Last Name");
                                                String newLastname=scannerobject.next();
                                                oldContact.setLastname(newLastname);
                                                break;
                                            case 3:
                                                System.out.println("Enter the new Address");
                                                String newAddress=scannerobject.next();
                                                oldContact.setAddress(newAddress);
                                                break;
                                            case 4:
                                                System.out.println("Enter the new City");
                                                String newCity=scannerobject.next();
                                                oldContact.setCity(newCity);
                                                break;
                                            case 5:
                                                System.out.println("Enter the new state");
                                                String newstate=scannerobject.next();
                                                oldContact.setState(newstate);
                                                break;
                                            case 6:
                                                System.out.println("Enter the new Zip");
                                                int newZip=scannerobject.nextInt();
                                                oldContact.setZip(newZip);
                                                break;
                                            case 7:
                                                System.out.println("Enter the new phone number");
                                                String newPhone=scannerobject.next();
                                                oldContact.setPhoneno(newPhone);
                                                break;
                                            case 8:
                                                System.out.println("Enter the new email");
                                                String newEmail=scannerobject.next();
                                                oldContact.setEmail(newEmail);
                                                break;
                                            case 9:
                                                System.out.println("Exiting");
                                                break;
                                            default:
                                                System.out.println("Invalid Input!");
                                        }
                                    }while(editingchoice!=9);
                                    break;
                                case 3:
                                    System.out.println("Enter the contact name to delete");
                                    String deleteName= scannerobject.next();
                                    newAddressBook.deleteContact(deleteName);
                                    System.out.println("Deleted Successfully");
                                    break;
                                case 4:
                                    System.out.println("Enter the number of contacts to be added");
                                    int number=scannerobject.nextInt();
                                    for(int i=0;i<number;i++){
                                        System.out.println("Enter the details to add to address book");
                                        System.out.println("Enter the first name");
                                        firstname=scannerobject.next();
                                        System.out.println("Enter the last name");
                                        lastname=scannerobject.next();
                                        System.out.println("Enter the Address");
                                        address=scannerobject.next();
                                        System.out.println("Enter the state");
                                        state=scannerobject.next();
                                        System.out.println("Enter the City");
                                        city=scannerobject.next();
                                        System.out.println("Enter the phone number");
                                        phoneno=scannerobject.next();
                                        System.out.println("Enter the Email");
                                        email=scannerobject.next();
                                        System.out.println("Enter the zip");
                                        zip=scannerobject.nextInt();
                                        CreateContact contact2=new CreateContact(firstname,lastname, address, city, state, zip, phoneno,email);
                                        newAddressBook.addContact(contact2);
                                    }
                                    break;
                                case 5:
                                    System.out.println("Exiting");
                                    break;
                                default:
                                    System.out.println("Incorrect Input");
                            }
                        }while (choice<5);
                    }else {
                        System.out.println("Address Book with this name does not exist");
                    }
                    break;
                case 3:
                    System.out.println("Enter the name of the Address book to display");
                    String displayaddressBookName=scannerobject.next();
                    if(addressBookMap.containsKey(displayaddressBookName)){
                        AddAddress newAddressBook3= addressBookMap.get(displayaddressBookName);
                        newAddressBook3.display(displayaddressBookName);
                        System.out.println("Displaying the Address Book");

                    }else {
                        System.out.println("Address Book with this name does not exist");
                    }

                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        }while(initialchoice<4);


    }
}