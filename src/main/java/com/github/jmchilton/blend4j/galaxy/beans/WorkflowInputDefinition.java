package com.github.jmchilton.blend4j.galaxy.beans;

public class WorkflowInputDefinition {
  private String value;
  private String label;

  public void setValue(final String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setLabel(final String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }
}
