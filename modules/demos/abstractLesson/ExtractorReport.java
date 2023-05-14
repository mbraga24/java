package com.havefunwith.modules.demos.abstractLesson;

import com.havefunwith.globalUtil.Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class ExtractorReport {

    public abstract Pattern getPattern();
    public abstract String getReportName();
    public abstract String format(String input);

    public String parse(String path) throws FileNotFoundException {
        String output = "";
        int content = 0;
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        if (scanner.hasNext()) {
            scanner.nextLine();
        } else {
            return ReportMessages.EMPTY_FILE.toString();
        }

        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);

            boolean matches = matcher.matches();
            if (matches) {
                output += format(nextLine) + "\n";
            }

            if (scanner.hasNext()) {
                content+=1;
            }
        }

        return output.isBlank() && content == 0 ?
                ReportMessages.EMPTY_FILE.toString() + " -- Contains Header" : output.isBlank() && content > 0 ?
                ReportMessages.NO_MATCH_FOUND.toString() : output;
    }

    public void prepareAndSendReport(String path) throws FileNotFoundException {
        System.out.print("Starting report -- " + getReportName());
        Util.loading();
        String report = parse(path);
        System.out.println(report);
        if (report.equals(ReportMessages.EMPTY_FILE.toString())) {
            System.out.println("Please, enter a valid data report.");
        } else {
            sendReport();
        }
    }

    private void sendReport() {
        System.out.print("Sending report");
        Util.loading();
        System.out.println("Report sent.");
    }
}
