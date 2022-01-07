package com.devdeltek.timemanager;

import org.joda.time.LocalTime;
import org.joda.time.Period;

public class Task {

    private String mTitle;

    private LocalTime mStartTime;
    private Period mTotalTime;

    private int mRepeat;

    private String mNotes;
    private String[]  mGoals;

    private int[] mDays;
    private subTask[] mActivities;

    private boolean mComplete;

    public Task(String title, LocalTime startTime, Period totalTime, int repeat, String notes, String[] goals, int[] days){
        mTitle = title;
        mStartTime = startTime;
        mTotalTime = totalTime;
        mRepeat = repeat;
        mNotes = notes;
        mGoals = goals;
        mDays = days;
        mComplete = false;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public LocalTime getmStartTime() {
        return mStartTime;
    }

    public void setmStartTime(LocalTime mStartTime) {
        this.mStartTime = mStartTime;
    }

    public Period getmTotalTime() {
        return mTotalTime;
    }

    public void setmTotalTime(Period mTotalTime) {
        this.mTotalTime = mTotalTime;
    }

    public int getmRepeat() {
        return mRepeat;
    }

    public void setmRepeat(int mRepeat) {
        this.mRepeat = mRepeat;
    }

    public String getmNotes() {
        return mNotes;
    }

    public boolean getmComplete() {
        return mComplete;
    }

    public String[] getmGoals() {
        return mGoals;
    }

    public LocalTime getEndTime(){
        return mStartTime.plus(mTotalTime);
    }

    public void setmNotes(String mNotes) {
        this.mNotes = mNotes;
    }

    public void setmGoals(String[] mGoals) {
        this.mGoals = mGoals;
    }

    public int[] getmDays() {
        return mDays;
    }

    public void setmDays(int[] mDays) {
        this.mDays = mDays;
    }

    public subTask[] getmActivities() {
        return mActivities;
    }

    public void setmActivities(subTask[] mActivities) {
        this.mActivities = mActivities;
    }

    public void setmComplete(boolean mComplete) {
        this.mComplete = mComplete;
    }
}
