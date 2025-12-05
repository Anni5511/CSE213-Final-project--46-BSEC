package Hssanmodelclass;

public class SearchNotices {
    public String searchfeild,tableview,button;

    public SearchNotices(String searchfeild, String tableview, String button) {
        this.searchfeild = searchfeild;
        this.tableview = tableview;
        this.button = button;
    }

    public String getSearchfeild() {
        return searchfeild;
    }

    public void setSearchfeild(String searchfeild) {
        this.searchfeild = searchfeild;
    }

    public String getTableview() {
        return tableview;
    }

    public void setTableview(String tableview) {
        this.tableview = tableview;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return "SearchNotices{" +
                "searchfeild='" + searchfeild + '\'' +
                ", tableview='" + tableview + '\'' +
                ", button='" + button + '\'' +
                '}';
    }
}
