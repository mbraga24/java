package com.havefunwith.modules.demos.abstractLesson;

import java.util.regex.Pattern;

public class NumberExtractorReport extends ExtractorReport {

    private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Phone Numbers";
    }

    @Override
    public String format(String input) {
        String[] phoneArr = new String[10];
        phoneArr = input.split("");
        StringBuilder sb = new StringBuilder();

        sb.append("(");
        for (int i = 0; i < phoneArr.length; i++) {
            sb.append(phoneArr[i]);
            if (i == 2) sb.append(")");
            if (i == 5) sb.append("-");
        }
        return sb.toString();
    }
}
