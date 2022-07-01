package LEET_CODE;

import java.util.Scanner;

public class mains {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.next();
        String strkid = new String("");
        int len = str.length();
        int ans = -1;
        boolean tag = false;
        for(int i = len/2; i > 0; i--){
            if(len % i != 0)
                continue;
            char[] strtemp = new char[i];
            //strtemp = str.toCharArray();
            str.getChars(0, i, strtemp, 0);
            strkid = new String(strtemp);//strtemp.toString();
            tag = false;
            for(String retval: str.split(strkid)){
                tag = true;
            }
            if(tag)
                continue;
            System.out.println(strkid);
            ans = i;
            break;
        }
        if(ans == -1)
            System.out.println("false");


    }
}
