package com.einfoplanet.navigationdrawer.model;

/**
 * Created by bridgelabz5 on 25/3/16.
 */
public class NavDrawerItem {
    private String title;
    private int icon;
    private String count="0";

    //boolean to set visibility of the counter
    private boolean isCounterVisible=false;

    public NavDrawerItem(){}


    public NavDrawerItem(String title,int icon){
        this.title=title;
        this.icon=icon;
    }

    public NavDrawerItem(String title,int icon,boolean isCounterVisible,String count){
        this.title=title;
        this.icon=icon;
        this.isCounterVisible=isCounterVisible;
        this.count=count;
    }

    //Getter setter for title,icon,count,isCounterVisible.

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public boolean isCounterVisible() {
        return isCounterVisible;
    }

    public void setIsCounterVisible(boolean isCounterVisible) {
        this.isCounterVisible = isCounterVisible;
    }

}
