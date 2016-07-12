package com.bysness.screencapturestream;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

/**
 * Created by Anuraag on 7/12/2016.
 */
public class Instance {
    private static Scanner scanner;
    private static ScreenCapture capture;
    private static boolean isContinuous;
    public static void main(String[] args)
    {

        for(int i=0;i<args.length;i++)
        {
            if(args[i].equals("continuous"))
            {

            }
        }
        capture=new ScreenCapture();

        scanner=new Scanner(System.in);
        waitForInput();
    }
    static void waitForInput()
    {
        //System.out.print("ready");
        if(scanner.hasNext()) {
            String input=scanner.next();
            if(input.equals("capture"))
            {
                capture.getSnapshot();
                System.out.print("FILE_END");
                waitForInput();
            }
            else if(input.equals("exit"))
            {
                System.exit(0);
            }
        }
    }
}
