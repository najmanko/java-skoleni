package cz.adastra.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadParseAndWriteToFile {

    public static void main(String[] args) {
        ReadParseAndWriteToFile readParseAndWriteToFile =
                new ReadParseAndWriteToFile();

        List<String> input =
                readParseAndWriteToFile.readFile(
                        "C:\\temp\\cisla.txt");

        readParseAndWriteToFile.parseAndWrite(input,
                "C:\\temp\\cisla_vystup.txt");
    }

    private List<String> readFile(String path) {
        BufferedReader br = null;
        FileReader fr = null;
        List<String> list = new ArrayList<>();

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                list.add(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    private void parseAndWrite(List<String> list, String file) {

        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            for (String string : list) {
                //parse values
                int number = Integer.parseInt(string);
                if (number % 2 == 0) {
                    bw.write(string);
                    bw.write("\r\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
