package abdullah.modelclasses;

public class Report {
    private String companyName;
    private int year;
    private String filePath;

    public Report() {
    }

    public Report(String companyName, int year, String filePath) {
        this.companyName = companyName;
        this.year = year;
        this.filePath = filePath;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "Report{" +
                "companyName='" + companyName + '\'' +
                ", year=" + year +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
