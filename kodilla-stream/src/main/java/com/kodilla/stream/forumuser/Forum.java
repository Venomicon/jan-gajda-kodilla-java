package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1,"user1",'M', 1970, 02,01,0));
        userList.add(new ForumUser(2,"user2",'M', 1975, 02,01,10));
        userList.add(new ForumUser(3,"user3",'F', 1995, 02,01,1));
        userList.add(new ForumUser(4,"user4",'F', 1990, 02,01,0));
        userList.add(new ForumUser(5,"user5",'M', 2005, 02,01,5));
        userList.add(new ForumUser(6,"user6",'F', 1998, 02,01,8));
        userList.add(new ForumUser(7,"user7",'M', 1980, 02,01,51));
        userList.add(new ForumUser(8,"user8",'M', 2001, 02,01,2));
        userList.add(new ForumUser(9,"user9",'M', 1986, 02,01,64));
        userList.add(new ForumUser(10,"user10",'F', 2000, 02,01,0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<ForumUser>(userList);
    }
}
