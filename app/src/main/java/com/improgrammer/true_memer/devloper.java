package com.improgrammer.true_memer;
import android.util.Log;


public class devloper {
    private  String env = "dev";

    public static void main(String[] args) {

    }


    public void print(String label, String Msg){
        if (env == "dev"){
            Log.d(label, Msg);
        }
    }

}
