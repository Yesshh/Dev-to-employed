package com.jobparser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JobParser {

    public String extractField(String content, String fieldName) {

        String regex = "(?m)^" + Pattern.quote(fieldName) + ":\\s*(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);

        if (matcher.find()) {
            return matcher.group(1).trim();
        }

        return "Not specified";
    }
}