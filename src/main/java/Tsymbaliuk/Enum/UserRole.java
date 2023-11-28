package Tsymbaliuk.Enum;

public enum UserRole {
    ADMINISTRATOR("rwd"), EDITOR("rw"), READER;

    private String filePermission = "r";

    UserRole(String filePermission) {
        this.filePermission = filePermission;
    }

    UserRole() {
    }

    public String getFilePermission() {
        return filePermission;
    }

    public void setFilePermission(String filePermission) {
        this.filePermission = filePermission;
    }
}
