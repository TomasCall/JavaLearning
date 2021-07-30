package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GameHelper {

    //Data Members
    ArrayList<DotCom> dotComs;
    ArrayList<String> pointsAlready;
    //Contructor

    public GameHelper()
    {
        dotComs=new ArrayList<>();
        pointsAlready=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Give me the name of the company!");
            String name = UserInput();
            DotCom dc = new DotCom(name,i%2==1,pointsAlready);
            dotComs.add(dc);
        }
    }


    //Methods
    public String UserInput()
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return  input;
    }
    public void Start()
    {

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
    }
}
