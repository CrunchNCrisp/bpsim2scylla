package org.crunchNcrisp.xml.bpsim.custom;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;
import org.crunchNcrisp.xml.bpsim.generated.BPSimData;


@XmlRootElement(name = "extensionElements", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
@Getter
public class ExtensionElements {

  @XmlElement(name = "BPSimData", namespace = "http://www.bpsim.org/schemas/2.0")
  private BPSimData bpsimData;
}