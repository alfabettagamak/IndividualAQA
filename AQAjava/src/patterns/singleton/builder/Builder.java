package patterns.singleton.builder;

public class Builder {

    private User user;

    public Builder(){
        this.user = new User();
    }

    public Builder withName(String name){
        user.firstName = name;
        return this;
    }

    public Builder withLastName(String name){
        user.lastName = name;
        return this;
    }

    public Builder withMiddleName(String name){
        user.middleName = name;
        return this;
    }

    public Builder withAge(int age){
        user.age = age;
        return this;
    }

    public User build(){
        return this.user;
    }
}
