package org.crunchNcrisp;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class BPSimParserTest {

    @Test
    void parseFile() {

        URL resourceUrl = getClass().getClassLoader().getResource("BPSim.xml"); // Replace with your actual file name
        assertNotNull(resourceUrl, "Could not find resource");

        File bpsimFile = new File(resourceUrl.getFile());
        BPSimParser.parseFile(bpsimFile);
    }
}