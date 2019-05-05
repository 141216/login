package Entity;

public class User {
    public int id;
    public String name;
    public String password;
    public String number;
    public String email;
    public int isSucceed;

    public void setId(int id){this.id = id;}

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setSucceed(int isSucceed){this.isSucceed = isSucceed;}

    public void setEmail(String email){
        this.email = email;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public String getNumber(){
        return number;
    }

    public String getEmail(){return email;}

    public int getSucceed(){return isSucceed;}
}
