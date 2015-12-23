package bean;
// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Application entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_application"
    ,catalog="sql5100650"
)

public class Application  implements java.io.Serializable {


    // Fields    

     private Integer aId;
     private Student student;
     private School school;
     private Date aOpenDate;
     private String aStatue;
     private Integer aDeposit;
     private String aPayStatue;
     private Integer aResidentFee;
     private Date aSubmitDate;
     private String aGrade;
     private String comment;


    // Constructors

    /** default constructor */
    public Application() {
    }

	/** minimal constructor */
    public Application(Student student, School school) {
        this.student = student;
        this.school = school;
    }
    
    /** full constructor */
    public Application(Student student, School school, Date aOpenDate, String aStatue, Integer aDeposit, String aPayStatue, Integer aResidentFee, Date aSubmitDate, String aGrade, String comment) {
        this.student = student;
        this.school = school;
        this.aOpenDate = aOpenDate;
        this.aStatue = aStatue;
        this.aDeposit = aDeposit;
        this.aPayStatue = aPayStatue;
        this.aResidentFee = aResidentFee;
        this.aSubmitDate = aSubmitDate;
        this.aGrade = aGrade;
        this.comment = comment;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="a_id", unique=true, nullable=false)

    public Integer getaId() {
        return this.aId;
    }
    
    public void setaId(Integer aId) {
        this.aId = aId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="t_student_stu_id", nullable=false)

    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="t_school_sch_id", nullable=false)

    public School getSchool() {
        return this.school;
    }
    
    public void setSchool(School school) {
        this.school = school;
    }
    
    @Column(name="a_open_date", length=0)

    public Date getaOpenDate() {
        return this.aOpenDate;
    }
    
    public void setaOpenDate(Date aOpenDate) {
        this.aOpenDate = aOpenDate;
    }
    
    @Column(name="a_statue", length=45)

    public String getaStatue() {
        return this.aStatue;
    }
    
    public void setaStatue(String aStatue) {
        this.aStatue = aStatue;
    }
    
    @Column(name="a_deposit")

    public Integer getaDeposit() {
        return this.aDeposit;
    }
    
    public void setaDeposit(Integer aDeposit) {
        this.aDeposit = aDeposit;
    }
    
    @Column(name="a_pay_statue", length=45)

    public String getaPayStatue() {
        return this.aPayStatue;
    }
    
    public void setaPayStatue(String aPayStatue) {
        this.aPayStatue = aPayStatue;
    }
    
    @Column(name="a_resident_fee")

    public Integer getaResidentFee() {
        return this.aResidentFee;
    }
    
    public void setaResidentFee(Integer aResidentFee) {
        this.aResidentFee = aResidentFee;
    }
    
    @Column(name="a_submit_date", length=0)

    public Date getaSubmitDate() {
        return this.aSubmitDate;
    }
    
    public void setaSubmitDate(Date aSubmitDate) {
        this.aSubmitDate = aSubmitDate;
    }
    
    @Column(name="a_grade", length=45)

    public String getaGrade() {
        return this.aGrade;
    }
    
    public void setaGrade(String aGrade) {
        this.aGrade = aGrade;
    }
    
    @Column(name="comment", length=140)

    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
   








}