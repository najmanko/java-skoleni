package cz.adastra.streams;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by jozef.najman on 22.09.2017.
 */
public class Soubor {
    private String name;
    private Long size;
    private Date lastChange;
    private String path;

    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.YYYY");

    public Soubor(String name, Long size, Date lastChange, String path) {
        this.name = name;
        this.size = size;
        this.lastChange = lastChange;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public Long getSize() {
        return size;
    }

    public Date getLastChange() {
        return lastChange;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return formatName(name, 80) + formatName(formatNumber(size), 8) + "\t\t" + dateFormat.format(lastChange) + "\t\t" + path;
    }

    private String formatNumber(long number) {

        return NumberFormat.getNumberInstance(Locale.US).format(number);
    }

    private String formatName(String name, int lenght) {
        int tabs = lenght - name.length();
        int tabsCount = tabs/4;
        if (tabs % 4 > 0) {
            tabsCount += 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        for (int i = 0; i < tabsCount; i++) {
            sb.append("\t");
        }
        return sb.toString();
    }
}
