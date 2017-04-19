package HTTP.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Level{
    private String _id;
    private String name;
    private int rank;

    public String get_id(){
        return _id;
    }
    public void set_id(String input){
        this._id = input;
    }
    public String getName(){
        return name;
    }
    public void setName(String input){
        this.name = input;
    }
    public int getRank(){
        return rank;
    }
    public void setRank(int input){
        this.rank = input;
    }

    @Override
    public String toString() {
        return "Level{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }
}
