import java.util.ArrayList;

public class AddAddress {
    ArrayList<CreateContact> contacts=new ArrayList<>();
    void addContact(CreateContact contact){
        System.out.println(contact);
        contacts.add(contact);
    }
    CreateContact searchName(String editName){
        for(int i=0;i<contacts.size();i++){
            System.out.println(contacts);
            System.out.println(contacts.get(i).firstname);
            if(contacts.get(i).firstname.equals(editName)){
                return  contacts.get(i);
            }
        }
        return null;
    }

    void deleteContact(String deleteName){
        for(int i=0;i<contacts.size();i++){
            if(contacts.get(i).firstname.equals(deleteName))
                contacts.remove(i);
        }
    }

    void display(String addressBookName){

            System.out.println(contacts);

    }
}
