
package com.skiwi.githubhooksechatservice.github.events;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Frank van Heeswijk
 */
public class User {
    @JsonProperty
    private String name;
    
    @JsonProperty
    private String email;
    
    @JsonProperty
    private String username;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }
}
