package cz.adastra.streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlReader {
    public static void main(String[] args) throws Exception {

        URL idnes = new URL("http://www.idnes.cz");
        BufferedReader in = new BufferedReader(new InputStreamReader(idnes.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
