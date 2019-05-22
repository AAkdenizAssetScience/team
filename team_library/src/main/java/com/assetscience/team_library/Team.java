package com.assetscience.team_library;

import android.content.Context;
import android.widget.Toast;

public class Team {
    String name;
    int scor;

    public Team(String name) {
        this.name = name;
    }

    public static void longToast(Context context, String string){
        Toast.makeText(context,string, Toast.LENGTH_LONG).show();
    }

    public int getScor() {
        return scor;
    }

    public void setScor(int scor) {
        this.scor = scor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
