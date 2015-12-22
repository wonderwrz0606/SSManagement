package bean;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TApplication entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_application", catalog = "sql5100650")
public class TApplication implements java.io.Serializable {

	// Fields

	private Integer AId;
	private TStudent TStudent;
	private TSchool TSchool;
	private Timestamp AOpenDate;
	private String AStatue;
	private Integer ADeposit;
	private String APayStatue;
	private Integer AResidentFee;
	private Timestamp ASubmitDate;
	private String AGrade;
	private String comment;
	

	// Constructors

	/** default constructor */
	public TApplication() {
	}

	/** minimal constructor */
	public TApplication(TStudent TStudent, TSchool TSchool) {
		this.TStudent = TStudent;
		this.TSchool = TSchool;
	}

	/** full constructor */
	public TApplication(TStudent TStudent, TSchool TSchool,
			Timestamp AOpenDate, String AStatue, Integer ADeposit,
			String APayStatue, Integer AResidentFee, Timestamp ASubmitDate,
			String AGrade, String comment, String TApplicationcol) {
		this.TStudent = TStudent;
		this.TSchool = TSchool;
		this.AOpenDate = AOpenDate;
		this.AStatue = AStatue;
		this.ADeposit = ADeposit;
		this.APayStatue = APayStatue;
		this.AResidentFee = AResidentFee;
		this.ASubmitDate = ASubmitDate;
		this.AGrade = AGrade;
		this.comment = comment;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "a_id", unique = true, nullable = false)
	public Integer getAId() {
		return this.AId;
	}

	public void setAId(Integer AId) {
		this.AId = AId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "t_student_stu_id", nullable = false)
	public TStudent getTStudent() {
		return this.TStudent;
	}

	public void setTStudent(TStudent TStudent) {
		this.TStudent = TStudent;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "t_school_sch_id", nullable = false)
	public TSchool getTSchool() {
		return this.TSchool;
	}

	public void setTSchool(TSchool TSchool) {
		this.TSchool = TSchool;
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

}