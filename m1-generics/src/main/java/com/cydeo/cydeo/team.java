package com.cydeo.cydeo;

import java.util.ArrayList;
import java.util.List;

public class team<T extends player> {
    private String name;
    private List<T> members=new ArrayList<>();

    public team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public boolean addplayer(T player){
if (members.contains(player)){
    System.out.println(((player)player).getName()+" is already on this team");
return false;

}else{members.add(player);
    System.out.println(((player)player).getName()+" are added to this "+this.name);}
  return true;   }
}
