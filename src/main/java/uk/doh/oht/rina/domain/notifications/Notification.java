package uk.doh.oht.rina.domain.notifications;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import uk.doh.oht.rina.domain.common.Creator;
import uk.doh.oht.rina.domain.common.FailureReason;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by peterwhitehead on 03/05/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Notification implements Serializable {
    private long serialVersionUID = 1L;

    private String severity;
    private String reason;
    private Creator creator;
    private Date dueDate;
    private Document document;
    private String isRead;
    private String slot;
    private String assignmentRequest;
    private Date creationDate;
    private String type;
    private Case caseData;
    private Boolean expanded;
    private List<ResponsibleParty> responsibleParties;
    private String sourceType;
    private Date lastUpdate;
    private String caseId;
    private Boolean isSelected;
    private FailureReason failureReason;
    private String id;
    private TypeObj typeObj;
    private Boolean isFilteredOut;
    private String category;
    private String status;
    private SeverityObj severityObj;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    class TypeObj implements Serializable {
        private long serialVersionUID = 1L;

        private String template;
        private String severity;
        private String color;
        private String name;
        private String description;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    class SeverityObj implements Serializable {
        private long serialVersionUID = 1L;

        private String color;
        private String name;
        private String icon;
        private Boolean isSelected;
        private String alt_color;
        private String key;
    }
}
