package HTTP.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class User {
    private String _id;
    private String updatedAt;
    private String createdAt;
    private String firstName;
    private String lastName;
    private String email;
    private Position position;
    private Level level;
    public String get_id(){
        return _id;
    }
    public void set_id(String id){
        this._id = (String) id;
    }
    public String getUpdatedAt(){
        return updatedAt;
    }
    public void setUpdatedAt(String input){
        this.updatedAt = input;
    }
    public String getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(String input){
        this.createdAt = input;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String input){
        this.firstName = input;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String input){
        this.lastName = input;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String input){
        this.email = input;
    }
    public Position getPosition(){
        return position;
    }
    public void setPosition(Position input){
        this.position = input;
    }
    public Level getLevel(){
        return level;
    }
    public void setLevel(Level input){
        this.level = input;
    }

    @Override
    public String toString() {
        return "User{" +
                "_id='" + _id + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", position=" + position +
                ", level=" + level +
                '}';
    }
}
