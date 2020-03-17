import java.io.*;
public class template {
    static StreamTokenizer input;
    public static void main(String[] args) throws java.io.IOException {
        input =new StreamTokenizer(new BufferedReader(new FileReader("template.in")));
        PrintWriter output=new PrintWriter(new FileWriter("template.out"));
        output.println();
        output.close();

    }
}
