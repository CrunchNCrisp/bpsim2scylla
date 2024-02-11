package org.crunchNcrisp;

import javax.xml.bind.JAXBException;
import lombok.SneakyThrows;
import org.crunchNcrisp.xml.bpsim.generated.BPSimData;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class BPSimParserTest {

    @Test
    @SneakyThrows
    void bpsimFileWithoutWrapperCanBeUnmarshalled() {
        assertNotNull(getNonWrappedBPSIMData());
    }

    @Test
    @SneakyThrows
    void bpsimFileWithWrapperCanBeUnmarshalled() {
        assertNotNull(getWrappedBPSIMData());
    }

    BPSimData getWrappedBPSIMData() throws JAXBException {
        URL resourceUrlWrapped = getClass().getClassLoader().getResource(
            "BPSIM_Wrapped.xml");
        File bpsimFileWrapped = new File(resourceUrlWrapped.getFile());
        return BPSimParser.readFileWithWrapper(bpsimFileWrapped);
    }

    BPSimData getNonWrappedBPSIMData() throws JAXBException {
        URL resourceUrl = getClass().getClassLoader().getResource(
            "BPSIM_Extracted.xml");
        File bpsimFile = new File(resourceUrl.getFile());
        return BPSimParser.readFileWithoutWrapper(bpsimFile);
    }
}