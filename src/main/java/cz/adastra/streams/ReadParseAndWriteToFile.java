package cz.adastra.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadParseAndWriteToFile {

    public static void main(String[] args) {
        ReadParseAndWriteToFile readParseAndWriteToFile =
                new ReadParseAndWriteToFile();

        List<Integer> numbers = readParseAndWriteToFile.
                readFileData("C:\\temp\\numbers.txt");

        readParseAndWriteToFile.writeToFile(numbers,
                "C:\\temp\\numbers_output.txt");
    }

    private List<Integer> readFileData(String path) {
        BufferedReader br = null;
        FileReader fr = null;
        List<Integer> list = new ArrayList<>();
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = null;
            line = br.readLine();
            while (line != null) {
                Integer number = Integer.parseInt(line);
                if (number % 2 == 0) {
                    list.add(number);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    private void writeToFile(List<Integer> list, String file) {

        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            for (Integer i : list) {
                bw.write(i.toString());
                bw.write("\r\n");
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
