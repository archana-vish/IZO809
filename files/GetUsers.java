package com.av8242n.files;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GetUsers {
    public static void main(String[] args) throws Exception {
        Files.lines(Paths.get("/Users/av8242n/Development/Timetable/Logs/LIVE/timetable-webapp-prodCurr.log"))
                .filter(a -> a.contains("2018-02-19"))
                .filter(s -> s.contains("Logged in as :: "))
                .map(ss -> "'" + ss.substring(ss.lastIndexOf(":") + 1).trim() + "',")
                .filter(b -> b.startsWith("'t"))
                .limit(1000)
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
