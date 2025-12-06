package Hssanmodelclass;

public class FilterTicketsbyStatus {
    public String title,combobox,tableview,button;

    public FilterTicketsbyStatus(String title, String combobox, String tableview, String button) {
        this.title = title;
        this.combobox = combobox;
        this.tableview = tableview;
        this.button = button;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCombobox() {
        return combobox;
    }

    public void setCombobox(String combobox) {
        this.combobox = combobox;
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
        return "FilterTicketsbyStatus{" +
                "title='" + title + '\'' +
                ", combobox='" + combobox + '\'' +
                ", tableview='" + tableview + '\'' +
                ", button='" + button + '\'' +
                '}';
    }
}
