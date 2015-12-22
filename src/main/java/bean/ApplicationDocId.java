package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ApplicationDocId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ApplicationDocId implements java.io.Serializable {

	// Fields

	private Integer caseStudentStudentId;
	private Integer caseSchoolSchoolId;

	// Constructors

	/** default constructor */
	public ApplicationDocId() {
	}

	/** full constructor */
	public ApplicationDocId(Integer caseStudentStudentId,
			Integer caseSchoolSchoolId) {
		this.caseStudentStudentId = caseStudentStudentId;
		this.caseSchoolSchoolId = caseSchoolSchoolId;
	}

	// Property accessors

	@Column(name = "case_student_student_id", nullable = false)
	public Integer getCaseStudentStudentId() {
		return this.caseStudentStudentId;
	}

	public void setCaseStudentStudentId(Integer caseStudentStudentId) {
		this.caseStudentStudentId = caseStudentStudentId;
	}

	@Column(name = "case_school_school_id", nullable = false)
	public Integer getCaseSchoolSchoolId() {
		return this.caseSchoolSchoolId;
	}

	public void setCaseSchoolSchoolId(Integer caseSchoolSchoolId) {
		this.caseSchoolSchoolId = caseSchoolSchoolId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ApplicationDocId))
			return false;
		ApplicationDocId castOther = (ApplicationDocId) other;

		return ((this.getCaseStudentStudentId() == castOther
				.getCaseStudentStudentId()) || (this.getCaseStudentStudentId() != null
				&& castOther.getCaseStudentStudentId() != null && this
				.getCaseStudentStudentId().equals(
						castOther.getCaseStudentStudentId())))
				&& ((this.getCaseSchoolSchoolId() == castOther
						.getCaseSchoolSchoolId()) || (this
						.getCaseSchoolSchoolId() != null
						&& castOther.getCaseSchoolSchoolId() != null && this
						.getCaseSchoolSchoolId().equals(
								castOther.getCaseSchoolSchoolId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCaseStudentStudentId() == null ? 0 : this
						.getCaseStudentStudentId().hashCode());
		result = 37
				* result
				+ (getCaseSchoolSchoolId() == null ? 0 : this
						.getCaseSchoolSchoolId().hashCode());
		return result;
	}

}