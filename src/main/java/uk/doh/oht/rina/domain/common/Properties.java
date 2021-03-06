package uk.doh.oht.rina.domain.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 03/05/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties implements Serializable {
    private long serialVersionUID = 1L;

    private String importance;
    private String criticality;
}
