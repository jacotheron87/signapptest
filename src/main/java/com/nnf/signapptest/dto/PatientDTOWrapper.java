package com.nnf.signapptest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.List;

@Component
public class PatientDTOWrapper {

    @NotNull
    @JsonProperty("stream_name")
    private String streamName;

    @NotNull
    @JsonProperty("client_id")
    private String clientId;

    @NotNull
    @JsonProperty("users")
    private List<ApplicationUser> applicationUsers;

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public List<ApplicationUser> getApplicationUsers() {
        return applicationUsers;
    }

    public void setApplicationUsers(List<ApplicationUser> applicationUsers) {
        this.applicationUsers = applicationUsers;
    }
}
