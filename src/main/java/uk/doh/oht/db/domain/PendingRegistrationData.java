package uk.doh.oht.db.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.apache.commons.lang3.StringUtils;
import uk.doh.oht.validation.StartDateFormDate;

import java.io.Serializable;
import java.util.Date;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/**
 * Created by peterwhitehead on 10/05/2017.
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PendingRegistrationData implements Serializable {
    private long pendingRegistrationId;
    private String title;
    private String firstName;
    private String otherName;
    private String lastName;
    private String maidenName;
    private Date dateOfBirth;
    private String gender;
    private String nationality;
    private String nino;
    private String telephoneNumber;
    private String emailAddress;
    private String currentLineOne;
    private String currentLineTwo;
    private String currentLineThree;
    private String currentLineFour;
    private String currentLineFive;
    private String currentLineSix;
    private String currentCountry;
    private String currentPostcode;
    private String movingLineOne;
    private String movingLineTwo;
    private String movingLineThree;
    private String movingLineFour;
    private String movingLineFive;
    private String movingLineSix;
    private String movingCountry;
    private String movingPostcode;
    private Date movingDate;
    private String benefitType;
    private String issueType;
    private String registrationStatus;
    private String country;
    private Date entitlementDate;
    private String hasForeignPension;
    private String occupationType;
    private String requestedBy;
    private String caseId;
    private StartDateFormDate startDate;
    private String modifiedByUserId;

    @JsonIgnore
    public String getDisplayCurrentAddress() {
        final String firstLine = Stream.of(currentLineOne, currentLineTwo).filter(s -> s != null && !s.isEmpty()).collect(joining(" "));
        return Stream.of(firstLine, currentLineThree, currentLineFour, currentLineFive, currentLineSix, currentPostcode, currentCountry)
                .filter(StringUtils::isNotEmpty).collect(joining("<br>"));
    }

    @JsonIgnore
    public String getDisplayMovingAddress() {
        final String firstLine = Stream.of(movingLineOne, movingLineTwo).filter(s -> !StringUtils.isEmpty(s)).collect(joining(" "));
        return Stream.of(firstLine, movingLineThree, movingLineFour, movingLineFive, movingLineSix, movingPostcode, movingCountry)
                .filter(StringUtils::isNotEmpty).collect(joining("<br>"));
    }
}
