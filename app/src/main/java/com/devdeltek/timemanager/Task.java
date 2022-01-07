package com.devdeltek.timemanager;

import org.joda.time.DateTime;
import java.util.Date;

public class Task {

    private String mTitle;

    private DateTime mStartTime;
    private DateTime mTotalTime;

    private int mRepeat;

    private String mNotes;
    private String[]  mGoals;

    private int[] mDays;
    private subTask[] mActivities;

    private boolean mComplete;

    public Task(String title, DateTime startTime, DateTime totalTime, int repeat, String notes, String[] goals, int[] days){
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

    public DateTime getmStartTime() {
        return mStartTime;
    }

    public void setmStartTime(DateTime mStartTime) {
        this.mStartTime = mStartTime;
    }

    public DateTime getmEndTime() {
        return mTotalTime;
    }

    public void setmEndTime(DateTime mTotalTime) {
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
