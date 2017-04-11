package ke.co.buku.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

@Entity
@Table(name = "PARAMETER")
@Indexed
@XmlRootElement
@SequenceGenerator(allocationSize=1,name="sequence", sequenceName="PARAMETER_FCSEQ")

public class Parameter {

	public Parameter() {
	}

	@Id
    @Basic(optional = false)
    @GeneratedValue(generator="sequence",strategy=GenerationType.SEQUENCE)
    private Long parameterId;
	@Field
	private Integer groupId;
    @Column(nullable = false, length = 50, unique = true) 
	@Field
    private String description;
    @Column(nullable = false, length = 50, unique = true) 
	@Field
    private String value;
  
    public Long getParameterId() {
		return parameterId;
	}
	public String getValue() {
		return value;
	}
	public String getDescription() {
		return description;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setParameterId(Long parameterId) {
		this.parameterId = parameterId;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
