package ke.co.buku.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * This class represents the basic "user" object in AppFuse that allows for authentication
 * and user management.  It implements Spring Security's UserDetails interface.
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 *         Updated by Dan Kibler (dan@getrolling.com)
 *         Extended to implement Spring UserDetails interface
 *         by David Carter david@carter.net
 */
@Entity
@Table(name = "APP_USER")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="APPUSER_FCSEQ")
public class User extends BaseObject implements Serializable, UserDetails {
    private static final long serialVersionUID = 3832626162173359411L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
    private Long id;
    @Column(nullable = false, length = 50, unique = true)
    private String username;                    // required
    
    @Column(nullable = false)
    @XmlTransient
    @JsonIgnore
    private String password;                    // required

    @Transient
    @XmlTransient
    @JsonIgnore
    private String confirmPassword;
    
    @Column(name = "password_hint")
    @XmlTransient
    private String passwordHint;
    
    @Column(name = "first_name", nullable = false, length = 50)
    @Field
    private String firstName;                   // required
    
    @Column(name = "last_name", nullable = false, length = 50)
    @Field
    private String lastName;                    // required
    
    @Column(nullable = false, unique = true)
    @Field
    private String email;                       // required; unique
    
    @Column(name = "phone_number")
    @Field(analyze= Analyze.NO)
    private String phoneNumber;
    
    @Field
    private String website;
    //private Address address = new Address();
    private Integer version;
    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinTable(
            name = "user_role",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )

    private Set<Role> roles = new HashSet<Role>();
	
    @Column(name = "account_enabled")
    private boolean enabled;
    @Column(name = "account_expired", nullable = false)
    private boolean accountExpired;
    @Column(name = "account_locked", nullable = false)
    private boolean accountLocked;
    @Column(name = "credentials_expired", nullable = false)

	private boolean credentialsExpired;
    
	@OneToOne(mappedBy="user")
    private Publisher publisher;
    @OneToOne 
    @JoinColumn(name="REG_ID") 
    private UserRegistration userRegistration;
    @OneToOne(mappedBy="user")
    private Teacher teacher;
    @OneToOne(mappedBy="user")
    private BookStore bookstore;
    @OneToOne(mappedBy="user")
    private Customer customer;
    @ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USERTYPE_ID") 
    private UserType userType = new UserType();
    @Transient
    private String fullName;
    @Transient
    private String usertype;

	

	/**
     * Default constructor - creates a new instance with no values set.
     */
    public User() {
    }

    /**
     * Create a new instance and set the username.
     *
     * @param username login name for user.
     */
    public User(final String username) {
        this.username = username;
    }


	public Long getId() {
        return id;
    }
    public Publisher getPublisher() {
		return publisher;
	}
    
    
    public Teacher getTeacher() {
		return teacher;
	}
    
    
    public UserRegistration getUserRegistration() {
		return userRegistration;
	}

  

    public BookStore getBookstore() {
		return bookstore;
	}
   
    public Customer getCustomer() {
		return customer;
	}


	public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

   public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

   
    public String getWebsite() {
        return website;
    }

    /**
     * Returns the full name.
     *
     * @return firstName + ' ' + lastName
     */
   
/*
    @Embedded
    @IndexedEmbedded
    public Address getAddress() {
        return address;
    }
*/
    public Set<Role> getRoles() {
        return roles;
    }

    /**
     * Convert user roles to LabelValue objects for convenience.
     *
     * @return a list of LabelValue objects with role information
     */
    @Transient
    public List<LabelValue> getRoleList() {
        List<LabelValue> userRoles = new ArrayList<LabelValue>();

        if (this.roles != null) {
            for (Role role : roles) {
                // convert the user's roles to LabelValue Objects
                userRoles.add(new LabelValue(role.getName(), role.getName()));
            }
        }

        return userRoles;
    }

    /**
     * Adds a role for the user
     *
     * @param role the fully instantiated role
     */
    public void addRole(Role role) {
        getRoles().add(role);
    }

    /**
     * @return GrantedAuthority[] an array of roles.
     * @see org.springframework.security.core.userdetails.UserDetails#getAuthorities()
     */
    @Transient
    @JsonIgnore // needed for UserApiITest in appfuse-ws archetype
    public Set<GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new LinkedHashSet<>();
        authorities.addAll(roles);
        return authorities;
    }

    @Version
    public Integer getVersion() {
        return version;
    }

    public UserType getUserType() {
		return userType;
	}



	public String getFullName() {
		return fullName;
	}
    public String getUsertype() {
		return usertype;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

    public boolean isEnabled() {
        return enabled;
    }

    public boolean isAccountExpired() {
        return accountExpired;
    }

    /**
     * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonExpired()
     * @return true if account is still active
     */
    @Transient
    public boolean isAccountNonExpired() {
        return !isAccountExpired();
    }

    public boolean isAccountLocked() {
        return accountLocked;
    }

    /**
     * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonLocked()
     * @return false if account is locked
     */
    @Transient
    public boolean isAccountNonLocked() {
        return !isAccountLocked();
    }

    public boolean isCredentialsExpired() {
        return credentialsExpired;
    }

    /**
     * @see org.springframework.security.core.userdetails.UserDetails#isCredentialsNonExpired()
     * @return true if credentials haven't expired
     */
    @Transient
    public boolean isCredentialsNonExpired() {
        return !credentialsExpired;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

/*    public void setAddress(Address address) {
        this.address = address;
    }
*/
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setAccountExpired(boolean accountExpired) {
        this.accountExpired = accountExpired;
    }

    public void setAccountLocked(boolean accountLocked) {
        this.accountLocked = accountLocked;
    }

    public void setCredentialsExpired(boolean credentialsExpired) {
        this.credentialsExpired = credentialsExpired;
    }
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public void setUserRegistration(UserRegistration userRegistration) {
		this.userRegistration = userRegistration;
	}
	public void setBookstore(BookStore bookstore) {
		this.bookstore = bookstore;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
     * {@inheritDoc}
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        final User user = (User) o;

        return !(username != null ? !username.equals(user.getUsername()) : user.getUsername() != null);

    }

    /**
     * {@inheritDoc}
     */
    public int hashCode() {
        return (username != null ? username.hashCode() : 0);
    }

    /**
     * {@inheritDoc}
     */
    public String toString() {
        ToStringBuilder sb = new ToStringBuilder(this, ToStringStyle.DEFAULT_STYLE)
                .append("username", this.username)
                .append("enabled", this.enabled)
                .append("accountExpired", this.accountExpired)
                .append("credentialsExpired", this.credentialsExpired)
                .append("accountLocked", this.accountLocked);

        if (roles != null) {
            sb.append("Granted Authorities: ");

            int i = 0;
            for (Role role : roles) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(role.toString());
                i++;
            }
        } else {
            sb.append("No Granted Authorities");
        }
        return sb.toString();
    }
}
