package com.company;

import com.company.DotCom;
import com.company.GameHelper;

public class Main {

    public static void main(String[] args) {
        DotCom dotCom = new DotCom("Google");
        GameHelper gameHelper = new GameHelper();
        while (dotCom.getCountOfHits()!=3)
        {
            int input = gameHelper.UserInput();
            if(input==-1)
            {
                System.out.println("This is not a number!");
            }
            else
            {
                dotCom.Checker(input);
            }
        }
        System.out.println("You sank the ships of "+dotCom.getName());
    }
}
