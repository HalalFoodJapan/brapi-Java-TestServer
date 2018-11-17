package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OntologyRefernce;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewTraitRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-06T17:40:52.157-05:00[America/New_York]")

public class NewTraitRequest   {
  @JsonProperty("alternativeAbbreviations")
  @Valid
  private List<String> alternativeAbbreviations = null;

  @JsonProperty("attribute")
  private String attribute = null;

  @JsonProperty("class")
  private String propertyClass = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("entity")
  private String entity = null;

  @JsonProperty("mainAbbreviation")
  private String mainAbbreviation = null;

  @JsonProperty("ontologyRefernce")
  private OntologyRefernce ontologyRefernce = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("synonyms")
  @Valid
  private List<String> synonyms = null;

  @JsonProperty("traitName")
  private String traitName = null;

  @JsonProperty("xref")
  private String xref = null;

  public NewTraitRequest alternativeAbbreviations(List<String> alternativeAbbreviations) {
    this.alternativeAbbreviations = alternativeAbbreviations;
    return this;
  }

  public NewTraitRequest addAlternativeAbbreviationsItem(String alternativeAbbreviationsItem) {
    if (this.alternativeAbbreviations == null) {
      this.alternativeAbbreviations = new ArrayList<String>();
    }
    this.alternativeAbbreviations.add(alternativeAbbreviationsItem);
    return this;
  }

  /**
   * Other frequent abbreviations of the trait, if any. These abbreviations do not have to follow a convention
   * @return alternativeAbbreviations
  **/
  @ApiModelProperty(value = "Other frequent abbreviations of the trait, if any. These abbreviations do not have to follow a convention")


  public List<String> getAlternativeAbbreviations() {
    return alternativeAbbreviations;
  }

  public void setAlternativeAbbreviations(List<String> alternativeAbbreviations) {
    this.alternativeAbbreviations = alternativeAbbreviations;
  }

  public NewTraitRequest attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * A trait can be decomposed as \"Trait\" = \"Entity\" + \"Attribute\", the attribute is the observed feature (or characteristic) of the entity e.g., for \"grain colour\", attribute = \"colour\"
   * @return attribute
  **/
  @ApiModelProperty(value = "A trait can be decomposed as \"Trait\" = \"Entity\" + \"Attribute\", the attribute is the observed feature (or characteristic) of the entity e.g., for \"grain colour\", attribute = \"colour\"")


  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public NewTraitRequest propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Trait class. (examples: \"morphological trait\", \"phenological trait\", \"agronomical trait\", \"physiological trait\", \"abiotic stress trait\", \"biotic stress trait\", \"biochemical trait\", \"quality traits trait\", \"fertility trait\", etc.)
   * @return propertyClass
  **/
  @ApiModelProperty(value = "Trait class. (examples: \"morphological trait\", \"phenological trait\", \"agronomical trait\", \"physiological trait\", \"abiotic stress trait\", \"biotic stress trait\", \"biochemical trait\", \"quality traits trait\", \"fertility trait\", etc.)")


  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public NewTraitRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of a trait
   * @return description
  **/
  @ApiModelProperty(value = "The description of a trait")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NewTraitRequest entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * A trait can be decomposed as \"Trait\" = \"Entity\" + \"Attribute\", the entity is the part of the plant that the trait refers to e.g., for \"grain colour\", entity = \"grain\"
   * @return entity
  **/
  @ApiModelProperty(value = "A trait can be decomposed as \"Trait\" = \"Entity\" + \"Attribute\", the entity is the part of the plant that the trait refers to e.g., for \"grain colour\", entity = \"grain\"")


  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public NewTraitRequest mainAbbreviation(String mainAbbreviation) {
    this.mainAbbreviation = mainAbbreviation;
    return this;
  }

  /**
   * Main abbreviation for trait name. (examples: \"Carotenoid content\" => \"CC\")
   * @return mainAbbreviation
  **/
  @ApiModelProperty(value = "Main abbreviation for trait name. (examples: \"Carotenoid content\" => \"CC\")")


  public String getMainAbbreviation() {
    return mainAbbreviation;
  }

  public void setMainAbbreviation(String mainAbbreviation) {
    this.mainAbbreviation = mainAbbreviation;
  }

  public NewTraitRequest ontologyRefernce(OntologyRefernce ontologyRefernce) {
    this.ontologyRefernce = ontologyRefernce;
    return this;
  }

  /**
   * Get ontologyRefernce
   * @return ontologyRefernce
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OntologyRefernce getOntologyRefernce() {
    return ontologyRefernce;
  }

  public void setOntologyRefernce(OntologyRefernce ontologyRefernce) {
    this.ontologyRefernce = ontologyRefernce;
  }

  public NewTraitRequest status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Trait status (examples: \"recommended\", \"obsolete\", \"legacy\", etc.)
   * @return status
  **/
  @ApiModelProperty(value = "Trait status (examples: \"recommended\", \"obsolete\", \"legacy\", etc.)")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NewTraitRequest synonyms(List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  public NewTraitRequest addSynonymsItem(String synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new ArrayList<String>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

  /**
   * Other trait names
   * @return synonyms
  **/
  @ApiModelProperty(value = "Other trait names")


  public List<String> getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }

  public NewTraitRequest traitName(String traitName) {
    this.traitName = traitName;
    return this;
  }

  /**
   * The human readable name of a trait
   * @return traitName
  **/
  @ApiModelProperty(value = "The human readable name of a trait")


  public String getTraitName() {
    return traitName;
  }

  public void setTraitName(String traitName) {
    this.traitName = traitName;
  }

  public NewTraitRequest xref(String xref) {
    this.xref = xref;
    return this;
  }

  /**
   * Cross reference of the trait to an external ontology or database term e.g., Xref to a trait ontology (TO) term
   * @return xref
  **/
  @ApiModelProperty(value = "Cross reference of the trait to an external ontology or database term e.g., Xref to a trait ontology (TO) term")


  public String getXref() {
    return xref;
  }

  public void setXref(String xref) {
    this.xref = xref;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewTraitRequest newTraitRequest = (NewTraitRequest) o;
    return Objects.equals(this.alternativeAbbreviations, newTraitRequest.alternativeAbbreviations) &&
        Objects.equals(this.attribute, newTraitRequest.attribute) &&
        Objects.equals(this.propertyClass, newTraitRequest.propertyClass) &&
        Objects.equals(this.description, newTraitRequest.description) &&
        Objects.equals(this.entity, newTraitRequest.entity) &&
        Objects.equals(this.mainAbbreviation, newTraitRequest.mainAbbreviation) &&
        Objects.equals(this.ontologyRefernce, newTraitRequest.ontologyRefernce) &&
        Objects.equals(this.status, newTraitRequest.status) &&
        Objects.equals(this.synonyms, newTraitRequest.synonyms) &&
        Objects.equals(this.traitName, newTraitRequest.traitName) &&
        Objects.equals(this.xref, newTraitRequest.xref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternativeAbbreviations, attribute, propertyClass, description, entity, mainAbbreviation, ontologyRefernce, status, synonyms, traitName, xref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewTraitRequest {\n");
    
    sb.append("    alternativeAbbreviations: ").append(toIndentedString(alternativeAbbreviations)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    mainAbbreviation: ").append(toIndentedString(mainAbbreviation)).append("\n");
    sb.append("    ontologyRefernce: ").append(toIndentedString(ontologyRefernce)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    traitName: ").append(toIndentedString(traitName)).append("\n");
    sb.append("    xref: ").append(toIndentedString(xref)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

