import java.util.ArrayList;

public class AddAddress {
    ArrayList<CreateContact> contacts=new ArrayList<>();
    void addContact(CreateContact contact){
        contacts.add(contact);
    }
    CreateContact searchName(String editName){
        for(int i=0;i<contacts.size();i++){
            if(contacts.get(i).firstname.equals(editName)){
                return  contacts.get(i);
            }
        }
        return null;
    }
}
