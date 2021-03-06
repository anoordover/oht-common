package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PeriodEntitlement implements Serializable {
    private long serialVersionUID = 1L;

    private String entitlementDocument;
    private RegistrationPeriod registrationPeriod;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public String getEntitlementDocument() {
        return entitlementDocument;
    }

    public void setEntitlementDocument(final String entitlementDocument) {
        this.entitlementDocument = entitlementDocument;
    }

    @JsonProperty("RegistrationPeriod")
    public RegistrationPeriod getRegistrationPeriod() {
        return registrationPeriod;
    }

    @JsonProperty("RegistrationPeriod")
    public void setRegistrationPeriod(final RegistrationPeriod registrationPeriod) {
        this.registrationPeriod = registrationPeriod;
    }
}
