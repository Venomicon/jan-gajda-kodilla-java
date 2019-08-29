package com.kodilla.testing.forum.statistics;


import java.util.*;

public class StatisticsCalculator {
    Statistics statistics;
    int users;
    int comments;
    int posts;
    int postPerUser;
    int commentPerUser;
    double commentPerPost;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        if (posts > 0) {
            commentPerPost = (double) comments / (double) posts;
        }
        if (users > 0) {
            postPerUser = posts / users;
            commentPerUser = comments / users;
        }
    }

    public int getUsers() {
        return users;
    }

    public int getComments() {
        return comments;
    }

    public int getPosts() {
        return posts;
    }

    public int getPostPerUser() {
        return postPerUser;
    }

    public int getCommentPerUser() {
        return commentPerUser;
    }

    public double getCommentPerPost() {
        return commentPerPost;
    }

    public void showStatistics() {
        System.out.println("Number of users: " + users + "  Number of posts: " + posts + "  Number of comments: " + comments);
        System.out.println("Posts per user: " + postPerUser + "  Comments per user: " + commentPerUser + "  Comments per post: " + commentPerPost);
    }
}
