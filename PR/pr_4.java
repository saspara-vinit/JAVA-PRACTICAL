
import java.util.Scanner;

public class pr_4 {
    public static void main(String[] args) {

        String p_list[] = { "Motor", "Fan", "Tube", "Wires", "Other" };
        float p_rate[] = { 2000, 300, 400, 45, 4000 };
        float p_text[] = { 160, 36, 20, 3.375f, 120 };
        float total_ammount = 0;
        int count = 0, j = 0, i = 0;
        int index[] = new int[20];

        Scanner obj = new Scanner(System.in);
        char option = 'y';

        do {
            System.out.println("Enter 1 --> Motor");
            System.out.println("Enter 2 --> Fan");
            System.out.println("Enter 3 --> Tube");
            System.out.println("Enter 4 --> Wires");
            System.out.println("Enter 5 --> Other");
            int choice = obj.nextInt();

            switch (choice) {
                case 1:
                    total_ammount += (p_rate[0] + p_text[0]);
                    // count++;
                    index[i] = 0;
                    i++;
                    break;
                case 2:
                    total_ammount += (p_rate[1] + p_text[1]);
                    index[i] = 1;
                    i++;
                    break;
                case 3:
                    total_ammount += (p_rate[2] + p_text[2]);
                    index[i] = 2;
                    i++;
                    break;
                case 4:
                    total_ammount += (p_rate[3] + p_text[3]);
                    index[i] = 3;
                    i++;
                    break;
                case 5:
                    total_ammount += (p_rate[4] + p_text[4]);
                    index[i] = 4;
                    i++;
                    break;
                default:
                    System.out.println("Enter Valide Input");
            }

            System.out.println("Press-->y to Purchase another thing");
            System.out.println("Press-->n to Exit");
            option = obj.next().charAt(0);
            count++;
        } while (option == 'y');

        
        System.out.printf("---------------------------------%n");
        System.out.printf("| %-8s | %-8s | %-8s | %n", "Name", "Rate", "Tex");

        System.out.printf("---------------------------------%n");
        for (int k = 0; k < count; k++) {
            // System.out.println(p_list[index[k]] + p_rate[index[k]] + p_text[index[k]]);
            System.out.printf("| %-8s | %-8s | %-8s | %n", p_list[index[k]], p_rate[index[k]], p_text[index[k]]);
        }
        // System.out.println("\n-->Your Total Bill : " + total_ammount);
        System.out.printf("---------------------------------%n");
        System.out.printf("| %-19s | %-8s |%n", "Total Ammount :", total_ammount);
        System.out.println("23DIT066 - Vinit Saspara");  
    }
}