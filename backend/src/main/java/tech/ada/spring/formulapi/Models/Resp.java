package tech.ada.spring.formulapi.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Resp {

    private @JsonProperty("MRData") MRData MRData;


}
