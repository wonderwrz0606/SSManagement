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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * School entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_school"
    ,catalog="sql5100650"
)

public class School  implements java.io.Serializable {


    // Fields    

     private Integer schId;
     private String schName;
     private String schCity;
     private String schState;
     private String schWebsite;
     private Date deadLine;
     private String IOdeadline;
     private Integer schSsat;
     private Integer schTf;
     private Integer schSeason;
     private Integer schCap;
     private Integer schChnPop;
     private Integer schDeps;
     private String schDes;
     private Integer schEst;
     private Integer schFee;
     private String schGrade;
     private String schGroup;
     private String schPtRatio;
     private String schReligon;
     private Integer schResFee;
     private String schResType;
     private Integer schSat;
     private String schShort;
     private Date schStartDate;
     private String schStreet;
     private String schType;
     private String schZip;
     private Integer totalFee;
     private Integer schEsl;
     private String comment;
     private Integer schCls;
     private Integer schAp;
     private String schSport;
     private Date springDeadLine;
     private Date fallDeadLine;
     private Date schFall;
     private Date schSpring;
     private Set<Application> applications = new HashSet<Application>(0);


    // Constructors

    /** default constructor */
    public School() {
    }

    
    /** full constructor */
    public School(String schName, String schCity, String schState, String schWebsite, Date deadLine, String IOdeadline, Integer schSsat, Integer schTf, Integer schSeason, Integer schCap, Integer schChnPop, Integer schDeps, String schDes, Integer schEst, Integer schFee, String schGrade, String schGroup, String schPtRatio, String schReligon, Integer schResFee, String schResType, Integer schSat, String schShort, Date schStartDate, String schStreet, String schType, String schZip, Integer totalFee, Integer schEsl, String comment, Integer schCls, Integer schAp, String schSport, Date springDeadLine, Date fallDeadLine, Date schFall, Date schSpring, Set<Application> applications) {
        this.schName = schName;
        this.schCity = schCity;
        this.schState = schState;
        this.schWebsite = schWebsite;
        this.deadLine = deadLine;
        this.IOdeadline = IOdeadline;
        this.schSsat = schSsat;
        this.schTf = schTf;
        this.schSeason = schSeason;
        this.schCap = schCap;
        this.schChnPop = schChnPop;
        this.schDeps = schDeps;
        this.schDes = schDes;
        this.schEst = schEst;
        this.schFee = schFee;
        this.schGrade = schGrade;
        this.schGroup = schGroup;
        this.schPtRatio = schPtRatio;
        this.schReligon = schReligon;
        this.schResFee = schResFee;
        this.schResType = schResType;
        this.schSat = schSat;
        this.schShort = schShort;
        this.schStartDate = schStartDate;
        this.schStreet = schStreet;
        this.schType = schType;
        this.schZip = schZip;
        this.totalFee = totalFee;
        this.schEsl = schEsl;
        this.comment = comment;
        this.schCls = schCls;
        this.schAp = schAp;
        this.schSport = schSport;
        this.springDeadLine = springDeadLine;
        this.fallDeadLine = fallDeadLine;
        this.schFall = schFall;
        this.schSpring = schSpring;
        this.applications = applications;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="sch_id", unique=true, nullable=false)

    public Integer getSchId() {
        return this.schId;
    }
    
    public void setSchId(Integer schId) {
        this.schId = schId;
    }
    
    @Column(name="sch_name", length=45)

    public String getSchName() {
        return this.schName;
    }
    
    public void setSchName(String schName) {
        this.schName = schName;
    }
    
    @Column(name="sch_city", length=45)

    public String getSchCity() {
        return this.schCity;
    }
    
    public void setSchCity(String schCity) {
        this.schCity = schCity;
    }
    
    @Column(name="sch_state", length=45)

    public String getSchState() {
        return this.schState;
    }
    
    public void setSchState(String schState) {
        this.schState = schState;
    }
    
    @Column(name="sch_website", length=45)

    public String getSchWebsite() {
        return this.schWebsite;
    }
    
    public void setSchWebsite(String schWebsite) {
        this.schWebsite = schWebsite;
    }
    
    @Column(name="deadline", length=0)

    public Date getDeadLine() {
        return this.deadLine;
    }
    
    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }
    
    @Column(name="IOdeadline")

    public String getIOdeadLine() {
        return this.IOdeadline;
    }
    
    public void setIOdeadLine(String IOdeadline) {
        this.IOdeadline = IOdeadline;
    }
    
    @Column(name="sch_Ssat")

    public Integer getSchSsat() {
        return this.schSsat;
    }
    
    public void setSchSsat(Integer schSsat) {
        this.schSsat = schSsat;
    }
    
    @Column(name="sch_TF")

    public Integer getSchTf() {
        return this.schTf;
    }
    
    public void setSchTf(Integer schTf) {
        this.schTf = schTf;
    }
    
    @Column(name="sch_Season")

    public Integer getSchSeason() {
        return this.schSeason;
    }
    
    public void setSchSeason(Integer schSeason) {
        this.schSeason = schSeason;
    }
    
    @Column(name="sch_cap")

    public Integer getSchCap() {
        return this.schCap;
    }
    
    public void setSchCap(Integer schCap) {
        this.schCap = schCap;
    }
    
    @Column(name="sch_chn_pop")

    public Integer getSchChnPop() {
        return this.schChnPop;
    }
    
    public void setSchChnPop(Integer schChnPop) {
        this.schChnPop = schChnPop;
    }
    
    @Column(name="sch_deps")

    public Integer getSchDeps() {
        return this.schDeps;
    }
    
    public void setSchDeps(Integer schDeps) {
        this.schDeps = schDeps;
    }
    
    @Column(name="sch_des", length=45)

    public String getSchDes() {
        return this.schDes;
    }
    
    public void setSchDes(String schDes) {
        this.schDes = schDes;
    }
    
    @Column(name="sch_Est")

    public Integer getSchEst() {
        return this.schEst;
    }
    
    public void setSchEst(Integer schEst) {
        this.schEst = schEst;
    }
    
    @Column(name="sch_fee")

    public Integer getSchFee() {
        return this.schFee;
    }
    
    public void setSchFee(Integer schFee) {
        this.schFee = schFee;
    }
    
    @Column(name="sch_grade", length=45)

    public String getSchGrade() {
        return this.schGrade;
    }
    
    public void setSchGrade(String schGrade) {
        this.schGrade = schGrade;
    }
    
    @Column(name="sch_group", length=45)

    public String getSchGroup() {
        return this.schGroup;
    }
    
    public void setSchGroup(String schGroup) {
        this.schGroup = schGroup;
    }
    
    @Column(name="sch_pt_ratio", length=45)

    public String getSchPtRatio() {
        return this.schPtRatio;
    }
    
    public void setSchPtRatio(String schPtRatio) {
        this.schPtRatio = schPtRatio;
    }
    
    @Column(name="sch_religon", length=45)

    public String getSchReligon() {
        return this.schReligon;
    }
    
    public void setSchReligon(String schReligon) {
        this.schReligon = schReligon;
    }
    
    @Column(name="sch_res_fee")

    public Integer getSchResFee() {
        return this.schResFee;
    }
    
    public void setSchResFee(Integer schResFee) {
        this.schResFee = schResFee;
    }
    
    @Column(name="sch_res_type")

    public String getSchResType() {
        return this.schResType;
    }
    
    public void setSchResType(String schResType) {
        this.schResType = schResType;
    }
    
    @Column(name="sch_Sat")

    public Integer getSchSat() {
        return this.schSat;
    }
    
    public void setSchSat(Integer schSat) {
        this.schSat = schSat;
    }
    
    @Column(name="sch_short", length=45)

    public String getSchShort() {
        return this.schShort;
    }
    
    public void setSchShort(String schShort) {
        this.schShort = schShort;
    }
    
    @Column(name="sch_start_date", length=0)

    public Date getSchStartDate() {
        return this.schStartDate;
    }
    
    public void setSchStartDate(Date schStartDate) {
        this.schStartDate = schStartDate;
    }
    
    @Column(name="sch_street", length=45)

    public String getSchStreet() {
        return this.schStreet;
    }
    
    public void setSchStreet(String schStreet) {
        this.schStreet = schStreet;
    }
    
    @Column(name="sch_type", length=45)

    public String getSchType() {
        return this.schType;
    }
    
    public void setSchType(String schType) {
        this.schType = schType;
    }
    
    @Column(name="sch_zip", length=45)

    public String getSchZip() {
        return this.schZip;
    }
    
    public void setSchZip(String schZip) {
        this.schZip = schZip;
    }
    
    @Column(name="total_fee")

    public Integer getTotalFee() {
        return this.totalFee;
    }
    
    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }
    
    @Column(name="sch_Esl")

    public Integer getSchEsl() {
        return this.schEsl;
    }
    
    public void setSchEsl(Integer schEsl) {
        this.schEsl = schEsl;
    }
    
    @Column(name="comment", length=45)

    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    @Column(name="sch_cls")

    public Integer getSchCls() {
        return this.schCls;
    }
    
    public void setSchCls(Integer schCls) {
        this.schCls = schCls;
    }
    
    @Column(name="sch_ap")

    public Integer getSchAp() {
        return this.schAp;
    }
    
    public void setSchAp(Integer schAp) {
        this.schAp = schAp;
    }
    
    @Column(name="sch_sport", length=45)

    public String getSchSport() {
        return this.schSport;
    }
    
    public void setSchSport(String schSport) {
        this.schSport = schSport;
    }
    
    @Column(name="spring_deadLine", length=0)

    public Date getSpringDeadLine() {
        return this.springDeadLine;
    }
    
    public void setSpringDeadLine(Date springDeadLine) {
        this.springDeadLine = springDeadLine;
    }
    
    @Column(name="fall_deadLine", length=0)

    public Date getFallDeadLine() {
        return this.fallDeadLine;
    }
    
    public void setFallDeadLine(Date fallDeadLine) {
        this.fallDeadLine = fallDeadLine;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="sch_fall", length=0)

    public Date getSchFall() {
        return this.schFall;
    }
    
    public void setSchFall(Date schFall) {
        this.schFall = schFall;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="sch_spring", length=0)

    public Date getSchSpring() {
        return this.schSpring;
    }
    
    public void setSchSpring(Date schSpring) {
        this.schSpring = schSpring;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="school")

    public Set<Application> getApplications() {
        return this.applications;
    }
    
    public void setApplications(Set<Application> applications) {
        this.applications = applications;
    }
   








}