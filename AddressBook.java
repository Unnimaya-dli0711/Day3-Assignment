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
                    break;
                case 3:
                    break;
                case 4:
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