
package boierhaat;

public abstract class User implements UserType{
    private String name;
    private String id;
    private String type;

    public User(String name, String id,String type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }
    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    public String toString(){
        return "User name : "+name+"\nUser id : "+id;
    }
    public String getUserType() {
        return this.type;
    }
    
}
