package com.example.firabasetryout;

//import java.lang.reflect.Array;
//import java.util.Scanner;

public class PersonalityTest {
    public int array[];
    public String[] personality;
    int numPersonalities;

    public PersonalityTest() {
        this.numPersonalities = 9;
        this.array = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
        this.personality = new String[]{"Peace Maker", "Reformer", "Helper", "Achiever",
                "Individualist", "Investigator", "Loyalist", "Enthusiaist", "Challenger"};


    }

    public void update(String option) {
//int array[]={0,0,0,0,0,0,0,0,0};
//String[] personality = {"Peace Maker", "Reformer", "Helper","Achiever","Individualist","Investigator","Loyalist","Enthusiaist","Challenger"};


        /** System.out.print("Enter an option: ");
         String option = input.nextLine();
         String opt2 = input.nextLine();
         String opt3 = input.nextLine();
         String opt4 = input.nextLine();**/

        switch (option) {
            case "12":
                array[3] += 3;
                array[5] += 3;
                break;
            case "2":
                array[4] += 6;
                break;
            case "I do not know":
                array[7] += 6;
                break;
            case "Really":
                array[7] += 6;
                break;
            case "0":
                array[7] += 6;
                break;
            case "It depends":
                array[5] += 6;
                break;
            case "Both":
                array[0] += 6;
                break;
            case "No one":
                array[1] += 6;
                break;
            case "The Audience":
                array[4] += 3;
                array[8] += 3;
                break;
            case "Myself":
                array[2] += 3;
                array[3] += 3;
                break;
            case "None of the above":
                array[7] += 3;
                break;
            case "I do not Know":
                array[5] += 3;
                break;
            case "Cry":
                array[2] += 3;
                array[3] += 3;
                break;
            case "Shout at the Audience":
                array[8] += 6;
                break;
            case "Leave":
                array[2] += 3;
                array[0] += 3;
                break;
            case "Continue Singing":
                array[4] += 2;
                array[8] += 2;
                array[6] += 2;
                break;
            case "Laugh":
                array[7] += 6;
                break;
            case "Show them a magic trick":
                array[7] += 6;
                break;
            case "Wait for Green":
                array[1] += 2;
                array[6] += 2;
                array[2] += 2;
                break;
            case "Check for cops then continue":
                array[0] += 6;
                break;
            case "Ignore and continue":
                array[4] += 3;
                array[8] += 3;
                break;
            case "Drive faster":
                array[7] += 6;
                break;
        }

    }

    public String getMax() {
        int max = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) // to get the index of the highest score and use...
        {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }

        return personality[index];
//System.out.println(personality[index]);

    }
}