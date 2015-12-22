package bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * School entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "school", catalog = "sql5100650")
public class School implements java.io.Serializable {

	// Fields

	private Integer schoolId;
	private String schoolName;
	private String schCity;
	private String schState;
	private String schStreet;
	private Integer schZipCode;
	private String webSite;
	private String est;
	private String appGrade;
	private Integer capcity;
	private Integer ptRatio;
	private String type;
	private String religon;
	private String esl;
	private Integer chinesePopulation;
	private Integer sat;
	private String group;
	private String resident;
	private Integer schDeposit;
	private Integer tuitionFee;
	private Integer totalFee;
	private String description;
	private Timestamp deadLine;
	private String comment;
	private Set<Application> applications = new HashSet<Application>(0);
	private SchDoc schDoc;

	// Constructors

	/** default constructor */
	public School() {
	}

	/** minimal constructor */
	public School(Integer schoolId) {
		this.schoolId = schoolId;
	}

	/** full constructor */
	public School(Integer schoolId, String schoolName, String schCity,
			String schState, String schStreet, Integer schZipCode,
			String webSite, String est, String appGrade, Integer capcity,
			Integer ptRatio, String type, String religon, String esl,
			Integer chinesePopulation, Integer sat, String group,
			String resident, Integer schDeposit, Integer tuitionFee,
			Integer totalFee, String description, Timestamp deadLine,
			String comment, Set<Application> applications, SchDoc schDoc) {
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.schCity = schCity;
		this.schState = schState;
		this.schStreet = schStreet;
		this.schZipCode = schZipCode;
		this.webSite = webSite;
		this.est = est;
		this.appGrade = appGrade;
		this.capcity = capcity;
		this.ptRatio = ptRatio;
		this.type = type;
		this.religon = religon;
		this.esl = esl;
		this.chinesePopulation = chinesePopulation;
		this.sat = sat;
		this.group = group;
		this.resident = resident;
		this.schDeposit = schDeposit;
		this.tuitionFee = tuitionFee;
		this.totalFee = totalFee;
		this.description = description;
		this.deadLine = deadLine;
		this.comment = comment;
		this.applications = applications;
		this.schDoc = schDoc;
	}

	// Property accessors
	@Id
	@Column(name = "school_id", unique = true, nullable = false)
	public Integer getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	@Column(name = "schoolName", length = 45)
	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Column(name = "sch_city", length = 45)
	public String getSchCity() {
		return this.schCity;
	}

	public void setSchCity(String schCity) {
		this.schCity = schCity;
	}

	@Column(name = "sch_state", length = 45)
	public String getSchState() {
		return this.schState;
	}

	public void setSchState(String schState) {
		this.schState = schState;
	}

	@Column(name = "sch_street", length = 45)
	public String getSchStreet() {
		return this.schStreet;
	}

	public void setSchStreet(String schStreet) {
		this.schStreet = schStreet;
	}

	@Column(name = "sch_zipCode")
	public Integer getSchZipCode() {
		return this.schZipCode;
	}

	public void setSchZipCode(Integer schZipCode) {
		this.schZipCode = schZipCode;
	}

	@Column(name = "web_site", length = 45)
	public String getWebSite() {
		return this.webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	@Column(name = "est", length = 45)
	public String getEst() {
		return this.est;
	}

	public void setEst(String est) {
		this.est = est;
	}

	@Column(name = "app_grade", length = 45)
	public String getAppGrade() {
		return this.appGrade;
	}

	public void setAppGrade(String appGrade) {
		this.appGrade = appGrade;
	}

	@Column(name = "capcity")
	public Integer getCapcity() {
		return this.capcity;
	}

	public void setCapcity(Integer capcity) {
		this.capcity = capcity;
	}

	@Column(name = "pt_ratio")
	public Integer getPtRatio() {
		return this.ptRatio;
	}

	public void setPtRatio(Integer ptRatio) {
		this.ptRatio = ptRatio;
	}

	@Column(name = "type", length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "religon", length = 45)
	public String getReligon() {
		return this.religon;
	}

	public void setReligon(String religon) {
		this.religon = religon;
	}

	@Column(name = "ESL", length = 45)
	public String getEsl() {
		return this.esl;
	}

	public void setEsl(String esl) {
		this.esl = esl;
	}

	@Column(name = "chinese_population")
	public Integer getChinesePopulation() {
		return this.chinesePopulation;
	}

	public void setChinesePopulation(Integer chinesePopulation) {
		this.chinesePopulation = chinesePopulation;
	}

	@Column(name = "SAT")
	public Integer getSat() {
		return this.sat;
	}

	public void setSat(Integer sat) {
		this.sat = sat;
	}

	@Column(name = "group", length = 45)
	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Column(name = "resident", length = 45)
	public String getResident() {
		return this.resident;
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	@Column(name = "sch_deposit")
	public Integer getSchDeposit() {
		return this.schDeposit;
	}

	public void setSchDeposit(Integer schDeposit) {
		this.schDeposit = schDeposit;
	}

	@Column(name = "tuition_fee")
	public Integer getTuitionFee() {
		return this.tuitionFee;
	}

	public void setTuitionFee(Integer tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

	@Column(name = "total_fee")
	public Integer getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(Integer totalFee) {
		this.totalFee = totalFee;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "dead_line", length = 0)
	public Timestamp getDeadLine() {
		return this.deadLine;
	}

	public void setDeadLine(Timestamp deadLine) {
		this.deadLine = deadLine;
	}

	@Column(name = "comment", length = 140)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "school")
	public Set<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(Set<Application> applications) {
		this.applications = applications;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "school")
	public SchDoc getSchDoc() {
		return this.schDoc;
	}

	public void setSchDoc(SchDoc schDoc) {
		this.schDoc = schDoc;
	}

}