package rf.hir.model;

//package application.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class User implements UserDetails {

    private static final long serialVersionUID = 1L;

    int id;
    String email;
    String password;
    String name;
    String role;
    //0-sima 1-szerkeszto 2-admin
    String lastLogin;

    String registerDate;

    public User() {}

    public User(int id, String email, String name, String password, String registerDate, String lastLogin, String role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name=name;
        this.registerDate = registerDate;
        this.lastLogin = lastLogin;
        this.role = role;
    }

    public User(User user) {
        this.id = user.id;
        this.email = user.email;
        this.password = user.password;
        this.name=user.name;
        this.role = user.role;
    }

    public User(String email, String password, String name, String role) {
        this.email = email;
        this.password = password;
        this.name=name;
        this.role = role;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return name+" [id=" + id + ", email=" + email + ", password=" + password + ", role=" + role + "]\n";
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Collection < ? extends GrantedAuthority > getAuthorities() {
        Set < GrantedAuthority > authorities = new HashSet < GrantedAuthority > ();
        authorities.add(new SimpleGrantedAuthority(this.role));
        return authorities;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }
}