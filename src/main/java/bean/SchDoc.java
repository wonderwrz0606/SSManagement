package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * SchDoc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sch_doc", catalog = "sql5100650")
public class SchDoc implements java.io.Serializable {

	// Fields

	private Integer schoolSchoolId;
	private School school;
	private Integer i20;
	private String comment;

	// Constructors

	/** default constructor */
	public SchDoc() {
	}

	/** minimal constructor */
	public SchDoc(Integer schoolSchoolId, School school) {
		this.schoolSchoolId = schoolSchoolId;
		this.school = school;
	}

	/** full constructor */
	public SchDoc(Integer schoolSchoolId, School school, Integer i20,
			String comment) {
		this.schoolSchoolId = schoolSchoolId;
		this.school = school;
		this.i20 = i20;
		this.comment = comment;
	}

	// Property accessors
	@Id
	@Column(name = "school_school_id", unique = true, nullable = false)
	public Integer getSchoolSchoolId() {
		return this.schoolSchoolId;
	}

	public void setSchoolSchoolId(Integer schoolSchoolId) {
		this.schoolSchoolId = schoolSchoolId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Column(name = "i-20")
	public Integer getI20() {
		return this.i20;
	}

	public void setI20(Integer i20) {
		this.i20 = i20;
	}

	@Column(name = "comment", length = 140)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}