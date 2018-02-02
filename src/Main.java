import java.util.ArrayList;

public class Main {

    private final static FileOutput outFile = new FileOutput("project2.txt");
    private final static FileInput inFile = new FileInput("project2.txt");
    public static void main(String[] args) {

        ArrayList<Assignment> project = new ArrayList<>();

        project.add(new Encryption( "01010011", "01010010", "10101101", "'7E"));


        for (Assignment thing : project) {
            printOut(thing);
        }

        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();
        FileInput indata = new FileInput("project2.txt");
        String line;


    }
        public static void printOut(Assignment p){
            outFile.fileWrite(p.toString());
        }
    }

