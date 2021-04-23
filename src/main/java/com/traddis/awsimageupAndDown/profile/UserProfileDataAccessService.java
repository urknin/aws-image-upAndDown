package com.traddis.awsimageupAndDown.profile;

import com.traddis.awsimageupAndDown.datastore.UserProfileDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {
    private final UserProfileDataStore userProfileDataStore;

    @Autowired
    public UserProfileDataAccessService(UserProfileDataStore userProfileDataStore) {
        this.userProfileDataStore = userProfileDataStore;
    }

    List<UserProfile> getUserProfiles(){
        return userProfileDataStore.getUserProfiles();
    }
}
