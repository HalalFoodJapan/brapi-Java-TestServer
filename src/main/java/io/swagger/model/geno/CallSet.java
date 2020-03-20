package io.swagger.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * A CallSet is a collection of calls that were generated by the same analysis of the same sample.
 */
@ApiModel(description = "A CallSet is a collection of calls that were generated by the same analysis of the same sample.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:53.794Z[GMT]")
public class CallSet   {
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("callSetDbId")
  private String callSetDbId = null;

  @JsonProperty("callSetName")
  private String callSetName = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("sampleDbId")
  private String sampleDbId = null;

  @JsonProperty("studyDbId")
  private String studyDbId = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  @JsonProperty("variantSetIds")
  @Valid
  private List<String> variantSetIds = null;

  public CallSet additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public CallSet putAdditionalInfoItem(String key, String additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new HashMap<String, String>();
    }
    this.additionalInfo.put(key, additionalInfoItem);
    return this;
  }

  /**
   * Additional arbitrary info
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "Additional arbitrary info")
  
    public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public CallSet callSetDbId(String callSetDbId) {
    this.callSetDbId = callSetDbId;
    return this;
  }

  /**
   * The call set ID.
   * @return callSetDbId
  **/
  @ApiModelProperty(example = "eb2bfd3d", value = "The call set ID.")
  
    public String getCallSetDbId() {
    return callSetDbId;
  }

  public void setCallSetDbId(String callSetDbId) {
    this.callSetDbId = callSetDbId;
  }

  public CallSet callSetName(String callSetName) {
    this.callSetName = callSetName;
    return this;
  }

  /**
   * The call set name.
   * @return callSetName
  **/
  @ApiModelProperty(example = "Sample_123_DNA_Run_456", value = "The call set name.")
  
    public String getCallSetName() {
    return callSetName;
  }

  public void setCallSetName(String callSetName) {
    this.callSetName = callSetName;
  }

  public CallSet created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The date this call set was created
   * @return created
  **/
  @ApiModelProperty(value = "The date this call set was created")
  
    @Valid
    public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public CallSet sampleDbId(String sampleDbId) {
    this.sampleDbId = sampleDbId;
    return this;
  }

  /**
   * The Biosample entity the call set data was generated from.
   * @return sampleDbId
  **/
  @ApiModelProperty(example = "5e50e11d", value = "The Biosample entity the call set data was generated from.")
  
    public String getSampleDbId() {
    return sampleDbId;
  }

  public void setSampleDbId(String sampleDbId) {
    this.sampleDbId = sampleDbId;
  }

  public CallSet studyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a study within the given database server
   * @return studyDbId
  **/
  @ApiModelProperty(example = "708149c1", value = "The ID which uniquely identifies a study within the given database server")
  
    public String getStudyDbId() {
    return studyDbId;
  }

  public void setStudyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
  }

  public CallSet updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The time at which this call set was last updated
   * @return updated
  **/
  @ApiModelProperty(value = "The time at which this call set was last updated")
  
    @Valid
    public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public CallSet variantSetIds(List<String> variantSetIds) {
    this.variantSetIds = variantSetIds;
    return this;
  }

  public CallSet addVariantSetIdsItem(String variantSetIdsItem) {
    if (this.variantSetIds == null) {
      this.variantSetIds = new ArrayList<String>();
    }
    this.variantSetIds.add(variantSetIdsItem);
    return this;
  }

  /**
   * The IDs of the variant sets this call set has calls in.
   * @return variantSetIds
  **/
  @ApiModelProperty(example = "[\"cfd3d60f\",\"a4e8bfe9\"]", value = "The IDs of the variant sets this call set has calls in.")
  
    public List<String> getVariantSetIds() {
    return variantSetIds;
  }

  public void setVariantSetIds(List<String> variantSetIds) {
    this.variantSetIds = variantSetIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallSet callSet = (CallSet) o;
    return Objects.equals(this.additionalInfo, callSet.additionalInfo) &&
        Objects.equals(this.callSetDbId, callSet.callSetDbId) &&
        Objects.equals(this.callSetName, callSet.callSetName) &&
        Objects.equals(this.created, callSet.created) &&
        Objects.equals(this.sampleDbId, callSet.sampleDbId) &&
        Objects.equals(this.studyDbId, callSet.studyDbId) &&
        Objects.equals(this.updated, callSet.updated) &&
        Objects.equals(this.variantSetIds, callSet.variantSetIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, callSetDbId, callSetName, created, sampleDbId, studyDbId, updated, variantSetIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallSet {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    callSetDbId: ").append(toIndentedString(callSetDbId)).append("\n");
    sb.append("    callSetName: ").append(toIndentedString(callSetName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    sampleDbId: ").append(toIndentedString(sampleDbId)).append("\n");
    sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    variantSetIds: ").append(toIndentedString(variantSetIds)).append("\n");
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
