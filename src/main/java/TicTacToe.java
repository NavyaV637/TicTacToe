import java.util.Scanner;
public class TicTacToe {
    public static int getSlotInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();
        return slot;
    }
    public static void main(String[] args) {
        int selectedSlot = getSlotInput();

        System.out.println("You selected slot: " + selectedSlot);
    }
}