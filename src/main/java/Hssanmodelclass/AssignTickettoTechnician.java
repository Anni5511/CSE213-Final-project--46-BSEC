package Hssanmodelclass;

public class AssignTickettoTechnician {

    public String combobox,button,tableview;

    public AssignTickettoTechnician(String combobox, String button, String tableview) {
        this.combobox = combobox;
        this.button = button;
        this.tableview = tableview;
    }

    public String getCombobox() {
        return combobox;
    }

    public void setCombobox(String combobox) {
        this.combobox = combobox;
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
        return "AssignTickettoTechnician{" +
                "combobox='" + combobox + '\'' +
                ", button='" + button + '\'' +
                ", tableview='" + tableview + '\'' +
                '}';
    }
}
