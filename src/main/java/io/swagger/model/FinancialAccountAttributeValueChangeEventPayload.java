package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FinancialAccount;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-07T17:56:26.652Z")




public class FinancialAccountAttributeValueChangeEventPayload   {
  @JsonProperty("financialAccount")
  private FinancialAccount financialAccount = null;

  public FinancialAccountAttributeValueChangeEventPayload financialAccount(FinancialAccount financialAccount) {
    this.financialAccount = financialAccount;
    return this;
  }

  /**
   * The involved resource data for the event
   * @return financialAccount
  **/
  @ApiModelProperty(value = "The involved resource data for the event")

  @Valid

  public FinancialAccount getFinancialAccount() {
    return financialAccount;
  }

  public void setFinancialAccount(FinancialAccount financialAccount) {
    this.financialAccount = financialAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialAccountAttributeValueChangeEventPayload financialAccountAttributeValueChangeEventPayload = (FinancialAccountAttributeValueChangeEventPayload) o;
    return Objects.equals(this.financialAccount, financialAccountAttributeValueChangeEventPayload.financialAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialAccountAttributeValueChangeEventPayload {\n");
    
    sb.append("    financialAccount: ").append(toIndentedString(financialAccount)).append("\n");
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

