package HTTP.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Александр on 03.04.2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Users {

    private List<User> users;
    private String status;

    public List<User> getUsers(){
        return users;
    }
    public void setUsers(List<User> input){
        this.users = input;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String input){
        this.status = input;
    }

    @Override
    public String toString() {
        return "Users{" +
                "users=" + users +
                ", status='" + status + '\'' +
                '}';
    }
}
