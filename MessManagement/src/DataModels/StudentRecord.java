package DataModels;

public class StudentRecord {
    String hostelRollNo;
    String itemId;

    public StudentRecord() {
    }
    
    public StudentRecord(String hostelRollNo, String itemId) {
        this.hostelRollNo = hostelRollNo;
        this.itemId = itemId;
    }

    public String getHostelRollNo() {
        return hostelRollNo;
    }

    public void setHostelRollNo(String hostelRollNo) {
        this.hostelRollNo = hostelRollNo;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
