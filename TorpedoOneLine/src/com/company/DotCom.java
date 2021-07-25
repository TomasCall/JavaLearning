package com.company;

import java.util.Random;

public class DotCom {

    public int[] getPoints() {
        return points;
    }

    public void setPoints(int[] points) {
        this.points = points;
    }

    public byte getCountOfHits() {
        return countOfHits;
    }

    public void setCountOfHits(byte countOfHits) {
        this.countOfHits = countOfHits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //DataMembers
    private int[] points;
    private byte countOfHits;
    private String name;

    //Constructors
    public DotCom(String name)
    {
        this.name=name;
        points=new int[3];
        Random rnd = new Random();
        for(int i=0;i<3;i++)
        {
            points[i] = rnd.nextInt(7)+1;
        }
        countOfHits=0;
    }

    public void Checker(int input)
    {
        for (int i=0;i<points.length;i++)
        {
            if(points[i]==input)
            {
                System.out.println("You hit it!");
                countOfHits++;
                break;
            }
        }
    }
}
