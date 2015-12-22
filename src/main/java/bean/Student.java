package bean;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "student", catalog = "sql5100650")
public class Student implements java.io.Serializable {

	// Fields

	private Integer studentId;
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	private String referrence;
	private String grade;
	private Integer phone;
	private String email;
	private String stuStreet;
	private String stuCity;
	private String stuProvince;
	private String stuZipcode;
	private String decision;
	private String comment;
	private Set<Application> applications = new HashSet<Application>(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String firstName, String lastName, String gender,
			Integer age, String referrence, String grade, Integer phone,
			String email, String stuStreet, String stuCity, String stuProvince,
			String stuZipcode, String decision, String comment,
			Set<Application> applications) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.referrence = referrence;
		this.grade = grade;
		this.phone = phone;
		this.email = email;
		this.stuStreet = stuStreet;
		this.stuCity = stuCity;
		this.stuProvince = stuProvince;
		this.stuZipcode = stuZipcode;
		this.decision = decision;
		this.comment = comment;
		this.applications = applications;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "student_id", unique = true, nullable = false)
	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Column(name = "first_name", length = 45)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "gender", length = 45)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "referrence", length = 45)
	public String getReferrence() {
		return this.referrence;
	}

	public void setReferrence(String referrence) {
		this.referrence = referrence;
	}

	@Column(name = "grade", length = 45)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Column(name = "phone")
	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@Column(name = "email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Column(name = "stu_province", length = 45)
	public String getStuProvince() {
		return this.stuProvince;
	}

	public void setStuProvince(String stuProvince) {
		this.stuProvince = stuProvince;
	}

	@Column(name = "stu_zipcode", length = 45)
	public String getStuZipcode() {
		return this.stuZipcode;
	}

	public void setStuZipcode(String stuZipcode) {
		this.stuZipcode = stuZipcode;
	}

	@Column(name = "decision", length = 45)
	public String getDecision() {
		return this.decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	@Column(name = "comment", length = 140)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "student")
	public Set<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(Set<Application> applications) {
		this.applications = applications;
	}

}