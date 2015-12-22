package bean;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TStudent entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_student", catalog = "sql5100650")
public class TStudent implements java.io.Serializable {

	// Fields

	private Integer stuId;
	private String lastName;
	private String firstName;
	private String stuGender;
	private String stuRef;
	private Integer stuAge;
	private Integer stuPhone;
	private String stuStreet;
	private String stuCity;
	private String stuPvn;
	private String stuZip;
	private Integer stuSat;
	private Integer stuTf;
	private String stuDeci;
	private String comment;
	private Set<TApplication> TApplications = new HashSet<TApplication>(0);

	// Constructors

	/** default constructor */
	public TStudent() {
	}

	/** minimal constructor */
	public TStudent(Integer stuId) {
		this.stuId = stuId;
	}

	/** full constructor */
	public TStudent(Integer stuId, String lastName, String firstName,
			String stuGender, String stuRef, Integer stuAge, Integer stuPhone,
			String stuStreet, String stuCity, String stuPvn, String stuZip,
			Integer stuSat, Integer stuTf, String stuDeci, String comment,
			Set<TApplication> TApplications) {
		this.stuId = stuId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.stuGender = stuGender;
		this.stuRef = stuRef;
		this.stuAge = stuAge;
		this.stuPhone = stuPhone;
		this.stuStreet = stuStreet;
		this.stuCity = stuCity;
		this.stuPvn = stuPvn;
		this.stuZip = stuZip;
		this.stuSat = stuSat;
		this.stuTf = stuTf;
		this.stuDeci = stuDeci;
		this.comment = comment;
		this.TApplications = TApplications;
	}

	// Property accessors
	@Id
	@Column(name = "stu_id", unique = true, nullable = false)
	public Integer getStuId() {
		return this.stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	@Column(name = "last_name", length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "first_name", length = 45)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "stu_gender", length = 45)
	public String getStuGender() {
		return this.stuGender;
	}

	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}

	@Column(name = "stu_ref", length = 45)
	public String getStuRef() {
		return this.stuRef;
	}

	public void setStuRef(String stuRef) {
		this.stuRef = stuRef;
	}

	@Column(name = "stu_age")
	public Integer getStuAge() {
		return this.stuAge;
	}

	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}

	@Column(name = "stu_phone")
	public Integer getStuPhone() {
		return this.stuPhone;
	}

	public void setStuPhone(Integer stuPhone) {
		this.stuPhone = stuPhone;
	}

	@Column(name = "stu_street", length = 45)
	public String getStuStreet() {
		return this.stuStreet;
	}

	public void setStuStreet(String stuStreet) {
		this.stuStreet = stuStreet;
	}

	@Column(name = "stu_city", length = 45)
	public String getStuCity() {
		return this.stuCity;
	}

	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}

	@Column(name = "stu_pvn", length = 45)
	public String getStuPvn() {
		return this.stuPvn;
	}

	public void setStuPvn(String stuPvn) {
		this.stuPvn = stuPvn;
	}

	@Column(name = "stu_zip", length = 45)
	public String getStuZip() {
		return this.stuZip;
	}

	public void setStuZip(String stuZip) {
		this.stuZip = stuZip;
	}

	@Column(name = "stu_Sat")
	public Integer getStuSat() {
		return this.stuSat;
	}

	public void setStuSat(Integer stuSat) {
		this.stuSat = stuSat;
	}

	@Column(name = "stu_TF")
	public Integer getStuTf() {
		return this.stuTf;
	}

	public void setStuTf(Integer stuTf) {
		this.stuTf = stuTf;
	}

	@Column(name = "stu_deci", length = 45)
	public String getStuDeci() {
		return this.stuDeci;
	}

	public void setStuDeci(String stuDeci) {
		this.stuDeci = stuDeci;
	}

	@Column(name = "comment", length = 45)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "TStudent")
	public Set<TApplication> getTApplications() {
		return this.TApplications;
	}

	public void setTApplications(Set<TApplication> TApplications) {
		this.TApplications = TApplications;
	}

}