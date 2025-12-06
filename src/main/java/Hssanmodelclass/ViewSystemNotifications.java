package Hssanmodelclass;

public class ViewSystemNotifications {

    public String button,tableview;

    public ViewSystemNotifications(String button, String tableview) {
        this.button = button;
        this.tableview = tableview;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getTableview() {
        return tableview;
    }

    public void setTableview(String tableview) {
        this.tableview = tableview;
    }

    @Override
    public String toString() {
        return "ViewSystemNotifications{" +
                "button='" + button + '\'' +
                ", tableview='" + tableview + '\'' +
                '}';
    }
}
