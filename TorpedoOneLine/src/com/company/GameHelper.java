package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {

    //Data Members
    public int UserInput()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Give me a point! ");
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (Functions.tryParseInt(input))
        {
            return Integer.parseInt(input);
        }
        else
        {
            return -1;
        }
    }
}
