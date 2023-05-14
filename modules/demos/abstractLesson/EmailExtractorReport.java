package com.havefunwith.modules.demos.abstractLesson;

import java.util.Locale;
import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport {

    private static final Pattern PATTERN = Pattern.compile("^(.+)@(.+)$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Email Report";
    }

    @Override
    public String format(String input) {
        return input.toLowerCase(Locale.ROOT);
    }
}
