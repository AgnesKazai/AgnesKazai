public class DrawChessTable {
    public static void main(String[] args) {

        int size = 8;
        String pattern = "#";
        String indentation = " ";

        for (int i = 0; i < size; i++) {
            String line = "";
            for (int j = 0; j < size; j++) {
                line += ((i + j) & 1) == 0 ? pattern : indentation;
            }
            System.out.println(line);
        }
    }
}

