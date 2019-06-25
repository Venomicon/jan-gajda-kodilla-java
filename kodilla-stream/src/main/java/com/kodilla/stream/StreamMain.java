package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(n -> n.getSex() == 'M')
                .filter(n -> n.getBirthDate().getYear() <= 1999)
                .filter(n -> n.getPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println("Number of elements: " + resultMap.size());
        resultMap.entrySet().stream()
                .map(entry -> entry.getKey() + "  >>>  " + entry.getValue())
                .forEach(System.out::println);
    }
}