package org.crunchNcrisp;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.crunchNcrisp.xml.bpsim.custom.Definitions;
import org.crunchNcrisp.xml.bpsim.generated.BPSimData;

import java.io.File;

public class BPSimParser {

    public static BPSimData readFileWithoutWrapper(File bpsimFile) throws JAXBException {

          JAXBContext context = JAXBContext.newInstance(BPSimData.class);
          Unmarshaller unmarshaller = context.createUnmarshaller();

          return (BPSimData) unmarshaller.unmarshal(bpsimFile);
    }

  public static BPSimData readFileWithWrapper(File bpsimFile) throws JAXBException {

    JAXBContext context = JAXBContext.newInstance(Definitions.class);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    Definitions bpsimDataWrapper = (Definitions) unmarshaller.unmarshal(bpsimFile);

    // Access the BPSimData
    return bpsimDataWrapper.getRelationship().getExtensionElements().getBpsimData();
  }
}
