package cu.uci.coj.Application.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "DBPROBLEM_ITEM".
 */
public class DBProblemItem {

    private Long id;
    /** Not-null value. */
    private String item;

    public DBProblemItem() {
    }

    public DBProblemItem(Long id) {
        this.id = id;
    }

    public DBProblemItem(Long id, String item) {
        this.id = id;
        this.item = item;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getItem() {
        return item;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setItem(String item) {
        this.item = item;
    }

}