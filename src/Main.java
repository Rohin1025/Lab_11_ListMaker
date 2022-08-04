import java.util.ArrayList;
import java.util.Scanner;

public class

Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        int userNum = 0;
        boolean YN = false;
        int a = 0;

        ArrayList<Integer> nums = new ArrayList<>();

        do
        {
            System.out.println("Here is the Current List:");
            a = 0;
            for (int x = 0; x < nums.size(); x++)
            {
                a++;
                System.out.println(a + ": " + nums.get(x));
            }

            System.out.println("A = add an item to the list");
            System.out.println("D = delete an item from the list");
            System.out.println("P = display the list");
            System.out.println("Q = quit the program\n");

            menuChoice = SafeInput.getNonZeroLenString(in, "Select one of the options above");
            System.out.println();
            switch (menuChoice)
            {
                case "A":
                case "a":
                    userNum = SafeInput.getInt(in, "Enter the number you would like to add the list");
                    in.nextLine();
                    nums.add(userNum);
                    break;
                case "D":
                case "d":
                    if(nums.size() == 0)
                    {
                        System.out.println("There are no items to delete\n");
                        break;
                    }
                    else
                    {
                        userNum = SafeInput.getRangedInt(in, "Enter the number of the item you would like to delete", 1, nums.size());
                        in.nextLine();
                        userNum = userNum - 1;
                        nums.remove(userNum);
                        break;
                    }
                case "P":
                case "p":
                    a = 0;
                    for (int x = 0; x < nums.size(); x++)
                    {
                        a++;
                        System.out.println(a + ": " + nums.get(x));
                    }
                    break;
                case "q":
                case "Q":
                    YN = SafeInput.getYNConfirm(in, "Are you sure you would like to quit?");
                    break;
            }
        }
        while(!YN);
        System.out.println("See you next time!");
    }
}
