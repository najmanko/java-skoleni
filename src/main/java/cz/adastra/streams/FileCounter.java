package cz.adastra.streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by jozef.najman on 21.09.2017.
 */
public class FileCounter {

    public static void main(String[] args) throws IOException {
        final List<Soubor> soubory = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(Paths.get("c:\\Users\\jozef.najman\\Desktop\\"))) {
            paths.forEach(path -> {
                File soubor = path.toFile();
                soubory.addAll(getFileList(soubor));
            });
        }

        Collections.sort(soubory, (o1, o2) -> o2.getSize().compareTo(o1.getSize()));

        soubory.stream().forEach(soubor -> {
            System.out.println(soubor);
        });
    }

    private static List<Soubor> getFileList(File... input) {
        List<Soubor> files = new ArrayList<>();
        for (File file: input) {
            if (file.isDirectory()) {
                files.addAll(getFileList(file.listFiles()));
            } else {
                files.add(new Soubor(file.getName(), file.length(), new Date(file.lastModified()), file.getAbsolutePath()));
            }
        }
        return files;
    }
}
