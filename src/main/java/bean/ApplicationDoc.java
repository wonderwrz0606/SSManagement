package bean;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * ApplicationDoc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "application_doc", catalog = "sql5100650")
public class ApplicationDoc implements java.io.Serializable {

	// Fields

	private ApplicationDocId id;
	private Application application;
	private Integer i20;
	private String comment;

	// Constructors

	/** default constructor */
	public ApplicationDoc() {
	}

	/** minimal constructor */
	public ApplicationDoc(ApplicationDocId id, Application application) {
		this.id = id;
		this.application = application;
	}

	/** full constructor */
	public ApplicationDoc(ApplicationDocId id, Application application,
			Integer i20, String comment) {
		this.id = id;
		this.application = application;
		this.i20 = i20;
		this.comment = comment;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "caseStudentStudentId", column = @Column(name = "case_student_student_id", nullable = false)),
			@AttributeOverride(name = "caseSchoolSchoolId", column = @Column(name = "case_school_school_id", nullable = false)) })
	public ApplicationDocId getId() {
		return this.id;
	}

	public void setId(ApplicationDocId id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Application getApplication() {
		return this.application;
	}

	public void setApplication(Application application) {
		this.application = application;
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