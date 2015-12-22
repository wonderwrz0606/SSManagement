package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ApplicationId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ApplicationId implements java.io.Serializable {

	// Fields

	private Integer schoolSchoolId;
	private Integer studentStudentId;

	// Constructors

	/** default constructor */
	public ApplicationId() {
	}

	/** full constructor */
	public ApplicationId(Integer schoolSchoolId, Integer studentStudentId) {
		this.schoolSchoolId = schoolSchoolId;
		this.studentStudentId = studentStudentId;
	}

	// Property accessors

	@Column(name = "school_school_id", nullable = false)
	public Integer getSchoolSchoolId() {
		return this.schoolSchoolId;
	}

	public void setSchoolSchoolId(Integer schoolSchoolId) {
		this.schoolSchoolId = schoolSchoolId;
	}

	@Column(name = "student_student_id", nullable = false)
	public Integer getStudentStudentId() {
		return this.studentStudentId;
	}

	public void setStudentStudentId(Integer studentStudentId) {
		this.studentStudentId = studentStudentId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ApplicationId))
			return false;
		ApplicationId castOther = (ApplicationId) other;

		return ((this.getSchoolSchoolId() == castOther.getSchoolSchoolId()) || (this
				.getSchoolSchoolId() != null
				&& castOther.getSchoolSchoolId() != null && this
				.getSchoolSchoolId().equals(castOther.getSchoolSchoolId())))
				&& ((this.getStudentStudentId() == castOther
						.getStudentStudentId()) || (this.getStudentStudentId() != null
						&& castOther.getStudentStudentId() != null && this
						.getStudentStudentId().equals(
								castOther.getStudentStudentId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSchoolSchoolId() == null ? 0 : this.getSchoolSchoolId()
						.hashCode());
		result = 37
				* result
				+ (getStudentStudentId() == null ? 0 : this
						.getStudentStudentId().hashCode());
		return result;
	}

}