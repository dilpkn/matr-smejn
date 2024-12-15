import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");
        Scanner in = new Scanner(input);
        int n,m;
        n = in.nextInt();
        m = in.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(n);
        for(int i = 0;i < n; i++){
            arr.add(new ArrayList<>());
        }
        for(int i = 0;i<m; i++){
            int u = in.nextInt();
            int v = in.nextInt();
            arr.get(u-1).add(v);
            arr.get(v-1).add(u);
        }
        FileWriter writer = new FileWriter("output.txt");
        for(int i = 0;i<n;i++){
            writer.write(arr.get(i).size() + " " );
            for(int k: arr.get(i)){
                writer.write(k + " ");
            }
            writer.write("\n");
        }
        writer.close();
    }
}
