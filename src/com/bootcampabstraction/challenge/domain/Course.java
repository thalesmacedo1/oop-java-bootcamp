package com.bootcampabstraction.challenge.domain;

public class Course extends Content{
    private int duration;

    @Override
    public double calculateXp() {
        return DEFAULT_XP * duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", duration=" + duration +
                '}';
    }

}
