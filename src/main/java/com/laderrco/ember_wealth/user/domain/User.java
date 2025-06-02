package com.laderrco.ember_wealth.user.domain;

import java.util.HashMap;
import java.util.Map;


// no muttable data, what can we do with User?
// no packages, must be self sufficient
public class User {

    private final UserId userId;
    private final Email email;
    private DisplayName displayName;

    // commented out -> for the auth.user
    // private String password;
    // private Date createdAt;
    // private Date lastLoginDate;
    // private Integer failedLoginAttempts;
    // private Boolean isLocked;
    private String avatarURL;
    private Boolean isPrivate;
    private Integer followerCount;
    private Integer followingCount;
    private Map<String, String> privacySettings;  


    // do not allow the entities to be in Invalid state
    public User(Email email, DisplayName displayName) {
        if(displayName == null){
         throw new IllegalArgumentException("Your username can't be empty");   
        }
        if (email == null) {
            throw new IllegalArgumentException("Your email can't be empty");
        }

        this.userId = new UserId();
        this.email = email;
        this.displayName = displayName;
        this.avatarURL = "some_default_location.png";
        this.isPrivate = false;
        this.followerCount = 0; 
        this.followingCount = 0;
        this.privacySettings = new HashMap<>();
    }

        public UserId getUserId() {
        return userId;
    }

    public void makeAccountPrivate() {
        this.isPrivate = true;
    }

    public void updateUsername(DisplayName newUsername) {
        
    }


    public Email getEmail() {
        return email;
    }


    public DisplayName getDisplayName() {
        return displayName;
    }


    public String getAvatarURL() {
        return avatarURL;
    }


    public Boolean getIsPrivate() {
        return isPrivate;
    }


    public Integer getFollowerCount() {
        return followerCount;
    }


    public Integer getFollowingCount() {
        return followingCount;
    }


    public Map<String, String> getPrivacySettings() {
        return privacySettings;
    }

}
