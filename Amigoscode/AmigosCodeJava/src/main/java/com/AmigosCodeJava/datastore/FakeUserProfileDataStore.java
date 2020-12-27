package com.AmigosCodeJava.datastore;

import com.AmigosCodeJava.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("7c785989-cbcf-4988-b45a-ef36017322f4"),"janetjones",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("b7452c1a-4f5f-4473-89e8-1f8caa834e51"),"achoquetacherano",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("f0e2609c-25b7-4b78-85e9-1598d8edb9e8"),"giuseppekenu",null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
