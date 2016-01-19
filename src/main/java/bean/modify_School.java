package bean;

// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * School entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_school", catalog = "sql5100650")
public class modify_School implements java.io.Serializable {

	// Fields

	private Integer schId;
	private String schName;
	private String schShort;
	private String schWebsite;
	private Date deadLine;
	private String IOdeadLine;
	private String schGrade;
	private Integer schEst;
	private Integer schCap;
	private String schPtRatio;
	private String schStreet;
	private String schCity;
	private String schState;
	private String schZip;
	private Integer schSat;
	private Integer schSsat;
	private Integer schSeason;
	private Integer schTf;
	private Integer schEsl;
	private Integer schChnPop;
	private Integer schDeps;
	private Integer schFee;
	private Integer totalFee;
	private String schDes;
	private String schGroup;
	private String schReligon;
	private String schType;
	private Integer schResFee;
	private String schResType;
	private Date schStartDate;
	private String comment;
	private Set<Application> applications = new HashSet<Application>(0);

	// Constructors

	/** default constructor */
	public modify_School() {
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "sch_id", unique = true, nullable = false)
	public Integer getSchId() {
		return this.schId;
	}

	public void setSchId(Integer schId) {
		this.schId = schId;
	}

	@Column(name = "sch_name", length = 45)
	public String getSchName() {
		return this.schName;
	}

	public void setSchName(String schName) {
		this.schName = schName;
	}

	@Column(name = "sch_short", length = 45)
	public String getSchShort() {
		return this.schShort;
	}

	public void setSchShort(String schShort) {
		this.schShort = schShort;
	}

	@Column(name = "sch_website", length = 45)
	public String getSchWebsite() {
		return this.schWebsite;
	}

	public void setSchWebsite(String schWebsite) {
		this.schWebsite = schWebsite;
	}

	public String getIOdeadLine() {
		return this.IOdeadLine;
	}

	public void setIOdeadLine(String iOdeadLine) {
		this.IOdeadLine = iOdeadLine;
	}

	@Column(name = "deadLine", length = 0)
	public Date getDeadLine() {
		return this.deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	@Column(name = "sch_grade", length = 45)
	public String getSchGrade() {
		return this.schGrade;
	}

	public void setSchGrade(String schGrade) {
		this.schGrade = schGrade;
	}

	@Column(name = "sch_Est")
	public Integer getSchEst() {
		return this.schEst;
	}

	public void setSchEst(Integer schEst) {
		this.schEst = schEst;
	}

	@Column(name = "sch_cap")
	public Integer getSchCap() {
		return this.schCap;
	}

	public void setSchCap(Integer schCap) {
		this.schCap = schCap;
	}

	@Column(name = "sch_pt_ratio", length = 45)
	public String getSchPtRatio() {
		return this.schPtRatio;
	}

	public void setSchPtRatio(String schPtRatio) {
		this.schPtRatio = schPtRatio;
	}

	@Column(name = "sch_street", length = 45)
	public String getSchStreet() {
		return this.schStreet;
	}

	public void setSchStreet(String schStreet) {
		this.schStreet = schStreet;
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

	// all state name convert to upperCase
	public void setSchState(String schState) {
		this.schState = schState;
	}

	@Column(name = "sch_zip", length = 45)
	public String getSchZip() {
		return this.schZip;
	}

	public void setSchZip(String schZip) {
		this.schZip = schZip;
	}

	@Column(name = "sch_Sat")
	public Integer getSchSat() {
		return this.schSat;
	}

	public void setSchSat(Integer schSat) {
		this.schSat = schSat;
	}

	@Column(name = "sch_TF")
	public Integer getSchTf() {
		return this.schTf;
	}

	public void setSchTf(Integer schTf) {
		this.schTf = schTf;
	}

	@Column(name = "sch_Esl")
	public Integer getSchEsl() {
		return this.schEsl;
	}

	public void setSchEsl(Integer schEsl) {
		this.schEsl = schEsl;
	}

	@Column(name = "sch_chn_pop")
	public Integer getSchChnPop() {
		return this.schChnPop;
	}

	public void setSchChnPop(Integer schChnPop) {
		this.schChnPop = schChnPop;
	}

	@Column(name = "sch_deps")
	public Integer getSchDeps() {
		return this.schDeps;
	}

	public void setSchDeps(Integer schDeps) {
		this.schDeps = schDeps;
	}

	@Column(name = "sch_fee")
	public Integer getSchFee() {
		return this.schFee;
	}

	public void setSchFee(Integer schFee) {
		this.schFee = schFee;
	}

	@Column(name = "total_fee")
	public Integer getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(Integer totalFee) {
		this.totalFee = totalFee;
	}

	@Column(name = "sch_des", length = 45)
	public String getSchDes() {
		return this.schDes;
	}

	public void setSchDes(String schDes) {
		this.schDes = schDes;
	}

	@Column(name = "sch_group", length = 45)
	public String getSchGroup() {
		return this.schGroup;
	}

	public void setSchGroup(String schGroup) {
		this.schGroup = schGroup;
	}

	@Column(name = "sch_religon", length = 45)
	public String getSchReligon() {
		return this.schReligon;
	}

	public void setSchReligon(String schReligon) {
		this.schReligon = schReligon;
	}

	@Column(name = "sch_type", length = 45)
	public String getSchType() {
		return this.schType;
	}

	public void setSchType(String schType) {
		this.schType = schType;
	}

	@Column(name = "sch_res_fee")
	public Integer getSchResFee() {
		return this.schResFee;
	}

	public void setSchResFee(Integer schResFee) {
		this.schResFee = schResFee;
	}

	@Column(name = "sch_res_type")
	public String getSchResType() {
		return this.schResType;
	}

	public void setSchResType(String schResType) {
		this.schResType = schResType;
	}

	@Column(name = "sch_start_date", length = 0)
	public Date getSchStartDate() {
		return this.schStartDate;
	}

	public void setSchStartDate(Date schStartDate) {
		this.schStartDate = schStartDate;
	}

	@Column(name = "sch_Ssat")
	public Integer getSchSsat() {
		return schSsat;
	}

	public void setSchSsat(Integer schSsat) {
		this.schSsat = schSsat;
	}

	@Column(name = "sch_Season")
	public Integer getSchSeason() {
		return schSeason;
	}

	public void setSchSeason(Integer schSeason) {
		this.schSeason = schSeason;
	}

	@Column(name = "comment", length = 45)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "school")
	public Set<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(Set<Application> applications) {
		this.applications = applications;
	}

}