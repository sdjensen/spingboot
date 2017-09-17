package dk.flaesk.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User extends AbstractPersistable<Long> {


    private String userId;
    private String userName;
    private String password;

    @OneToMany(targetEntity = Address.class, mappedBy="user", fetch= FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Address> addresses;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
