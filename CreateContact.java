public class CreateContact {
    String firstname;
    String lastname;
    String address;
    String city;
    String state;
    int zip;
    String phoneno;
    String email;

    public CreateContact(String firstname,String lastname,String address,String city,String state,int zip,String phoneno,String email){
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneno=phoneno;
        this.email=email;
    }

    @Override
    public String toString() {
        return  firstname+" "+lastname+"\n"+address+"\n"+city+" , "+state+"\n"+zip+"\n"+phoneno+"\n"+email;
    }
}