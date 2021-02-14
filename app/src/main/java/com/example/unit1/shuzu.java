package com.example.unit1;

import android.util.Log;
import org.w3c.dom.ls.LSOutput;

public class shuzu {


    public void shuzu1() {
        int[][] ints={{1,2},{4,5},{5,6}};
        int sum=0;
        for(int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                System.out.println(ints[i][j]);
                sum+=ints[i][j]; 
            }
        }
        System.out.println(sum);
    }


}
