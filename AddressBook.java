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
        System.out.println("Welcome to Address Book");
        int choice;
        Scanner scannerobject=new Scanner(System.in);
        AddAddress addAddress=new AddAddress();
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
                    firstname=scannerobject.nextLine();
                    System.out.println("Enter the last name");
                    lastname=scannerobject.nextLine();
                    System.out.println("Enter the Address");
                    address=scannerobject.nextLine();
                    System.out.println("Enter the state");
                    state=scannerobject.nextLine();
                    System.out.println("Enter the City");
                    city=scannerobject.nextLine();
                    System.out.println("Enter the phone number");
                    phoneno=scannerobject.nextLine();
                    System.out.println("Enter the Email");
                    email=scannerobject.nextLine();
                    System.out.println("Enter the zip");
                    zip=scannerobject.nextInt();
                    CreateContact contact=new CreateContact(firstname,lastname, address, city, state, zip, phoneno,email);
                    addAddress.addContact(contact);
                    break;
                case 2:
                    System.out.println("Enter the contact name to edit");
                    String editName= scannerobject.nextLine();
                    AddAddress objectaddaddress=new AddAddress();
                    CreateContact oldContact=objectaddaddress.searchName(editName);
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
                    int editingchoice;
                    do{
                        System.out.println("Enter the choice");
                        editingchoice=scannerobject.nextInt();
                        switch (editingchoice){
                            case 1:
                                System.out.println("Enter the new First Name");
                                String newFirstname=scannerobject.nextLine();
                                oldContact.setFirstname(newFirstname);
                                break;
                            case 2:
                                System.out.println("Enter the new Last Name");
                                String newLastname=scannerobject.nextLine();
                                oldContact.setLastname(newLastname);
                                break;
                            case 3:
                                System.out.println("Enter the new Address");
                                String newAddress=scannerobject.nextLine();
                                oldContact.setAddress(newAddress);
                                break;
                            case 4:
                                System.out.println("Enter the new City");
                                String newCity=scannerobject.nextLine();
                                oldContact.setCity(newCity);
                                break;
                            case 5:
                                System.out.println("Enter the new state");
                                String newstate=scannerobject.nextLine();
                                oldContact.setState(newstate);
                                break;
                            case 6:
                                System.out.println("Enter the new Zip");
                                int newZip=scannerobject.nextInt();
                                oldContact.setZip(newZip);
                                break;
                            case 7:
                                System.out.println("Enter the new phone number");
                                String newPhone=scannerobject.nextLine();
                                oldContact.setPhoneno(newPhone);
                                break;
                            case 8:
                                System.out.println("Enter the new email");
                                String newEmail=scannerobject.nextLine();
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
                 
                case 5:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Incorrect Input");
            }
        }while (choice<5);
    }
}