package bean;

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Application entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "application", catalog = "sql5100650")
public class Application implements java.io.Serializable {

	// Fields

	private ApplicationId id;
	private Student student;
	private School school;
	private Timestamp AOpenDate;
	private String AStatue;
	private Integer ADeposit;
	private String APayStatue;
	private Integer AResidentFee;
	private Timestamp ASubmitDate;
	private String AGrade;
	private String comment;
	private ApplicationDoc applicationDoc;

	// Constructors

	/** default constructor */
	public Application() {
	}

	/** minimal constructor */
	public Application(ApplicationId id, Student student, School school) {
		this.id = id;
		this.student = student;
		this.school = school;
	}

	/** full constructor */
	public Application(ApplicationId id, Student student, School school,
			Timestamp AOpenDate, String AStatue, Integer ADeposit,
			String APayStatue, Integer AResidentFee, Timestamp ASubmitDate,
			String AGrade, String comment, ApplicationDoc applicationDoc) {
		this.id = id;
		this.student = student;
		this.school = school;
		this.AOpenDate = AOpenDate;
		this.AStatue = AStatue;
		this.ADeposit = ADeposit;
		this.APayStatue = APayStatue;
		this.AResidentFee = AResidentFee;
		this.ASubmitDate = ASubmitDate;
		this.AGrade = AGrade;
		this.comment = comment;
		this.applicationDoc = applicationDoc;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "schoolSchoolId", column = @Column(name = "school_school_id", nullable = false)),
			@AttributeOverride(name = "studentStudentId", column = @Column(name = "student_student_id", nullable = false)) })
	public ApplicationId getId() {
		return this.id;
	}

	public void setId(ApplicationId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_student_id", nullable = false, insertable = false, updatable = false)
	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "school_school_id", nullable = false, insertable = false, updatable = false)
	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Column(name = "a_open_date", length = 0)
	public Timestamp getAOpenDate() {
		return this.AOpenDate;
	}

	public void setAOpenDate(Timestamp AOpenDate) {
		this.AOpenDate = AOpenDate;
	}

	@Column(name = "a_statue", length = 45)
	public String getAStatue() {
		return this.AStatue;
	}

	public void setAStatue(String AStatue) {
		this.AStatue = AStatue;
	}

	@Column(name = "a_deposit")
	public Integer getADeposit() {
		return this.ADeposit;
	}

	public void setADeposit(Integer ADeposit) {
		this.ADeposit = ADeposit;
	}

	@Column(name = "a_pay_statue", length = 45)
	public String getAPayStatue() {
		return this.APayStatue;
	}

	public void setAPayStatue(String APayStatue) {
		this.APayStatue = APayStatue;
	}

	@Column(name = "a_resident_fee")
	public Integer getAResidentFee() {
		return this.AResidentFee;
	}

	public void setAResidentFee(Integer AResidentFee) {
		this.AResidentFee = AResidentFee;
	}

	@Column(name = "a_submit_date", length = 0)
	public Timestamp getASubmitDate() {
		return this.ASubmitDate;
	}

	public void setASubmitDate(Timestamp ASubmitDate) {
		this.ASubmitDate = ASubmitDate;
	}

	@Column(name = "a_grade", length = 45)
	public String getAGrade() {
		return this.AGrade;
	}

	public void setAGrade(String AGrade) {
		this.AGrade = AGrade;
	}

	@Column(name = "comment", length = 140)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "application")
	public ApplicationDoc getApplicationDoc() {
		return this.applicationDoc;
	}

	public void setApplicationDoc(ApplicationDoc applicationDoc) {
		this.applicationDoc = applicationDoc;
	}

}