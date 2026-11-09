
package com.jobparser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JobFileReader {

    public String readJobDescription(String filePath)
            throws IOException {

        Path path = Path.of(filePath);

        String content = Files.readString(path);

        return content;
    }
}
