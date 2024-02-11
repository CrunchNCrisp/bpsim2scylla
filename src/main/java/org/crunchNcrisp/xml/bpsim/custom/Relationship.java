package org.crunchNcrisp.xml.bpsim.custom;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@XmlRootElement(name = "relationship", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL")
@Setter
@Getter
public class Relationship {

  private String type;

  private ExtensionElements extensionElements;

  @XmlAttribute(name = "type")
  public String getType() {
    return type;
  }

}