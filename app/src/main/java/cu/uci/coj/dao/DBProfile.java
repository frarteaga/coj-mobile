package cu.uci.coj.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "DBPROFILE".
 */
public class DBProfile {

    private Long id;
    /** Not-null value. */
    private String userProfile;

    public DBProfile() {
    }

    public DBProfile(Long id) {
        this.id = id;
    }

    public DBProfile(Long id, String userProfile) {
        this.id = id;
        this.userProfile = userProfile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getUserProfile() {
        return userProfile;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

}
