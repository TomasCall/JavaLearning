package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class DotCom {

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

    public ArrayList<String> getPoints() {
        return points;
    }

    //DataMembers
    private ArrayList<String> points;
    private byte countOfHits;
    private String name;
    private String[] cols;
    private String[] rows;
    //Constructors
    public DotCom(String name,Boolean lying)
    {
        points=new ArrayList<>();
        Random rnd=new Random();
        this.name=name;
        cols= new String[]{"A", "B", "C", "D", "E", "F", "G"};
        rows= new String[]{"1", "2", "3", "4", "5", "6", "7"};
        int row,col;
        if (lying)
        {
            col= rnd.nextInt(4);
            row=rnd.nextInt(rows.length);
            points.add(rows[row]+cols[col]);
            points.add(rows[row]+cols[col+1]);
            points.add(rows[row]+cols[col+2]);
        }
        else
        {
            row= rnd.nextInt(4);
            col=rnd.nextInt(cols.length);
            points.add(rows[row]+cols[col]);
            points.add(rows[row+1]+cols[col]);
            points.add(rows[row+2]+cols[col]);
        }

    }

    public boolean Checker(String input)
    {
        for (int i = 0; i < points.size(); i++) {
            StringBuilder tmp = new StringBuilder();
            tmp.append(points.get(i));
            tmp.reverse();
            System.out.println(tmp.toString().toLowerCase(Locale.ROOT));
            if (input.equals(points.get(i)) || input.equals(tmp.toString()) || input.equals(points.get(i).toLowerCase(Locale.ROOT)) || input.equals(tmp.toString().toLowerCase(Locale.ROOT)))
            {
                System.out.println("You hit it!");
                points.remove(i);
                countOfHits++;
                return true;
            }
        }
        return  false;
    }
}
