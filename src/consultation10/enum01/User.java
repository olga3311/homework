package consultation10.enum01;

public class User {
    private String email;
    private String password;

    private Day currentDAyWeek;
    private Role role;

    public User(String email, String password){
        this.email = email;
        this.password = password;
        this.role = Role.USER;
    }
    public String info() {
        return "User{" +
                "role=" + role +
                ", email='" + email + '\'' +
                '}';
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
