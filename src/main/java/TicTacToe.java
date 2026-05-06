public class TicTacToe {
    public static int[] convertSlot(int slot) {
        int index = slot-1;
        int row=index/3;
        int col=index%3;
        return new int[]{row,col};
    }
    public static void main(String[] args){
        int slot = 5;
        int[] result = convertSlot(slot);
        System.out.println("Slot: " + slot);
        System.out.println("Row: " + result[0]);
        System.out.println("Column: " + result[1]);
    }
}