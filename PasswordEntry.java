public class PasswordEntry {
    private String platform;
    private String username;
    private String password;

    public PasswordEntry(String platform, String username, String password) {
        this.platform = platform;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return platform + "," + username + "," + password;
    }

    // Getter Metotları
    public String getPlatform() { return platform; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}