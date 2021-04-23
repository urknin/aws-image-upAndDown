package com.traddis.awsimageupAndDown.datastore;

import com.traddis.awsimageupAndDown.profile.UserProfile;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "janet jackson", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "morgan jackson", null));
    }


    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
