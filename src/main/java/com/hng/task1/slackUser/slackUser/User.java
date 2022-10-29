package com.hng.task1.slackUser.slackUser;

public class User {
    private String slackUsername;
    private Boolean backend;
    private  Integer age;
    private String bio;

    public User() {
    }

    public String getSlackUsername() {
        return slackUsername;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }

    public Boolean getBackend() {
        return backend;
    }

    public void setBackend(Boolean backend) {
        this.backend = backend;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public User(String slackUsername, Boolean backend, Integer age, String bio) {
        this.slackUsername = slackUsername;
        this.backend = backend;
        this.age = age;
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "userModel{" +
                "slackUsername='" + slackUsername + '\'' +
                ", backend=" + backend +
                ", age=" + age +
                ", bio='" + bio + '\'' +
                '}';
    }
}
