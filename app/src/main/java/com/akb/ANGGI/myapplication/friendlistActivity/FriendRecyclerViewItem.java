package com.akb.ANGGI.myapplication.friendlistActivity;

/*Tanggal Pengerjaan : 19 Mei 2019
 * NIM : 10116042
 * Nama : ANGGI
 * Kelas : AKB-1*/


public class FriendRecyclerViewItem {

    // Save car name.
    private String FriendName;

    // Save car image resource id.
    private int FriendImageId;

    public FriendRecyclerViewItem(String FriendName, int FriendImageId) {
        this.FriendName = FriendName;
        this.FriendImageId = FriendImageId;
    }

    public String getFriendName() {
        return FriendName;
    }

    public void setFriendName(String FriendyName) {
        this.FriendName = FriendName;
    }

    public int getFriendImageId() {
        return FriendImageId;
    }

    public void setFriendImageId(int FriendImageId) {
        this.FriendImageId = FriendImageId;
    }
}