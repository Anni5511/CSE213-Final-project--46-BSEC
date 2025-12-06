package Hssanmodelclass;

public class GenerateITReport {

    public String button,tableview;
    public int datepicker;

    public GenerateITReport(String button, String tableview, int datepicker) {
        this.button = button;
        this.tableview = tableview;
        this.datepicker = datepicker;
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

    public int getDatepicker() {
        return datepicker;
    }

    public void setDatepicker(int datepicker) {
        this.datepicker = datepicker;
    }

    @Override
    public String toString() {
        return "GenerateITReport{" +
                "button='" + button + '\'' +
                ", tableview='" + tableview + '\'' +
                ", datepicker=" + datepicker +
                '}';
    }
}
