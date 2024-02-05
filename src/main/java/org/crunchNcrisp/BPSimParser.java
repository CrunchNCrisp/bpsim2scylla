package org.crunchNcrisp;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BPSimParser {

    private static final Logger LOGGER = Logger.getLogger(BPSimParser.class.getName());

    public static void parseFile(File bpsimFile) {
        try {
           Document document = new SAXBuilder().build(bpsimFile);

           Element rootElement = document.getRootElement();

            LOGGER.log(Level.INFO, "Root Element Name: {0}", rootElement.getName());

            // todo: add parsing logic

        } catch (JDOMException | IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }
}
