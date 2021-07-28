package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {

    //Data Members
    ArrayList<DotCom> dotComs = new ArrayList<>();
    //Contructor
    public GameHelper()
    {
        System.out.println("Give me the name of the first company!");
        for (int i = 0; i < 3; i++) {
            String name = UserInput();
            DotCom dc = new DotCom(name,i%2==1);
            dotComs.add(dc);
        }
    }
    //Methods
    public String UserInput()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("Give me a point! ");
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return"bipbup";
    }
    public void Start()
    {

        /*
        for (int i = 0; i < dotComOne.getPoints().size(); i++) {
            System.out.println(dotComOne.getPoints().get(i));
        }

         */
        while (dotComs.size()!=0)
        {
            System.out.println("Give me a point! ");
            String input = UserInput();
            for (int i = 0; i < dotComs.size(); i++) {
                if (dotComs.get(i).Checker(input))
                {
                    if (dotComs.get(i).getCountOfHits()==3)
                    {
                        System.out.println("You sank the ship of "+dotComs.get(i).getName());
                        dotComs.remove(i);
                    }
                }
            }
        }
        //System.out.println("You sank the ships of "+dotComOne.getName());
    }
}
