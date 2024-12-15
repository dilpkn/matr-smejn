import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");
        Scanner in = new Scanner(input);
        int n,m;
        n = in.nextInt();
        m = in.nextInt();
        int[][] matrix = new int[n][n];
        for(int i =0;i<m;i++){
            int u = in.nextInt();
            int v = in.nextInt();
            matrix[u-1][v-1] = 1;
            matrix[v-1][u-1] = 1;
        }
        FileWriter writer = new FileWriter("output.txt");
        for(int[] t:matrix){
            for(int i:t){
                writer.write(i+ " ");
            }
            writer.write("\n");
        }
        writer.close();
    }
}
