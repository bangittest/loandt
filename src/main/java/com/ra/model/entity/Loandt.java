package com.ra.model.entity;

public class Loandt {
    private double loanAmnt;
    private String term;
    private double intRate;
    private double installment;
    private String grade;
    private String subGrade;
    private String empTitle;
    private String empLength;
    private String homeOwnership;
    private double annualInc;
    private String virificationStatus;
    private String issueD;
    private String loanStatus;
    private String purpose;
    private String title;
    private double dti;
    private String earliest_cr_line;
    private double open_acc;
    private double pub_rec;
    private double revol_bal;
    private double revol_util;
    private double total_acc;
    private String initial_list_status;
    private String application_type;
    private double mort_acc;
    private double pub_rec_bankruptcies;
    private String address;

    public Loandt() {
    }

    public Loandt(double loanAmnt, String term, double intRate, double installment, String grade, String subGrade, String empTitle, String empLength, String homeOwnership, double annualInc, String virificationStatus, String issueD, String loanStatus, String purpose, String title, double dti, String earliest_cr_line, double open_acc, double pub_rec, double revol_bal, double revol_util, double total_acc, String initial_list_status, String application_type, double mort_acc, double pub_rec_bankruptcies, String address) {
        this.loanAmnt = loanAmnt;
        this.term = term;
        this.intRate = intRate;
        this.installment = installment;
        this.grade = grade;
        this.subGrade = subGrade;
        this.empTitle = empTitle;
        this.empLength = empLength;
        this.homeOwnership = homeOwnership;
        this.annualInc = annualInc;
        this.virificationStatus = virificationStatus;
        this.issueD = issueD;
        this.loanStatus = loanStatus;
        this.purpose = purpose;
        this.title = title;
        this.dti = dti;
        this.earliest_cr_line = earliest_cr_line;
        this.open_acc = open_acc;
        this.pub_rec = pub_rec;
        this.revol_bal = revol_bal;
        this.revol_util = revol_util;
        this.total_acc = total_acc;
        this.initial_list_status = initial_list_status;
        this.application_type = application_type;
        this.mort_acc = mort_acc;
        this.pub_rec_bankruptcies = pub_rec_bankruptcies;
        this.address = address;
    }

    public double getLoanAmnt() {
        return loanAmnt;
    }

    public void setLoanAmnt(double loanAmnt) {
        this.loanAmnt = loanAmnt;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public double getIntRate() {
        return intRate;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    public double getInstallment() {
        return installment;
    }

    public void setInstallment(double installment) {
        this.installment = installment;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubGrade() {
        return subGrade;
    }

    public void setSubGrade(String subGrade) {
        this.subGrade = subGrade;
    }

    public String getEmpTitle() {
        return empTitle;
    }

    public void setEmpTitle(String empTitle) {
        this.empTitle = empTitle;
    }

    public String getEmpLength() {
        return empLength;
    }

    public void setEmpLength(String empLength) {
        this.empLength = empLength;
    }

    public String getHomeOwnership() {
        return homeOwnership;
    }

    public void setHomeOwnership(String homeOwnership) {
        this.homeOwnership = homeOwnership;
    }

    public double getAnnualInc() {
        return annualInc;
    }

    public void setAnnualInc(double annualInc) {
        this.annualInc = annualInc;
    }

    public String getVirificationStatus() {
        return virificationStatus;
    }

    public void setVirificationStatus(String virificationStatus) {
        this.virificationStatus = virificationStatus;
    }

    public String getIssueD() {
        return issueD;
    }

    public void setIssueD(String issueD) {
        this.issueD = issueD;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDti() {
        return dti;
    }

    public void setDti(double dti) {
        this.dti = dti;
    }

    public String getEarliest_cr_line() {
        return earliest_cr_line;
    }

    public void setEarliest_cr_line(String earliest_cr_line) {
        this.earliest_cr_line = earliest_cr_line;
    }

    public double getOpen_acc() {
        return open_acc;
    }

    public void setOpen_acc(double open_acc) {
        this.open_acc = open_acc;
    }

    public double getPub_rec() {
        return pub_rec;
    }

    public void setPub_rec(double pub_rec) {
        this.pub_rec = pub_rec;
    }

    public double getRevol_bal() {
        return revol_bal;
    }

    public void setRevol_bal(double revol_bal) {
        this.revol_bal = revol_bal;
    }

    public double getRevol_util() {
        return revol_util;
    }

    public void setRevol_util(double revol_util) {
        this.revol_util = revol_util;
    }

    public double getTotal_acc() {
        return total_acc;
    }

    public void setTotal_acc(double total_acc) {
        this.total_acc = total_acc;
    }

    public String getInitial_list_status() {
        return initial_list_status;
    }

    public void setInitial_list_status(String initial_list_status) {
        this.initial_list_status = initial_list_status;
    }

    public String getApplication_type() {
        return application_type;
    }

    public void setApplication_type(String application_type) {
        this.application_type = application_type;
    }

    public double getMort_acc() {
        return mort_acc;
    }

    public void setMort_acc(double mort_acc) {
        this.mort_acc = mort_acc;
    }

    public double getPub_rec_bankruptcies() {
        return pub_rec_bankruptcies;
    }

    public void setPub_rec_bankruptcies(double pub_rec_bankruptcies) {
        this.pub_rec_bankruptcies = pub_rec_bankruptcies;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
