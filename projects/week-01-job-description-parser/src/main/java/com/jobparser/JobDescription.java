package com.jobparser;

import java.util.List;

public record JobDescription(
        String title,
        String company,
        String location,
        String experience,
        List<String> skills,
        String salary
) {
}