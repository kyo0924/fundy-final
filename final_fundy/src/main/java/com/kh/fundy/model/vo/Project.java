package com.kh.fundy.model.vo;

import java.sql.Timestamp;
import java.util.List;

public class Project {
	
	private int projectNo;
	private String memberNick;
	private String projectTitle;
	private String projectThumnail;
	private String projectContent;
	private Timestamp beginDate;
	private Timestamp endDate;
	private int goalPrice;
	private String recommended;
	private String recImageName;
	private int anchorCount;
	private String projectStatCode;
	private String projectSumary;
	private String projectPhone;
	private String memberEmail;
	private String minorCode;
	private String settled;
	private Timestamp projectFormDate;
	private List<FundingOption> foList;
	
	private String minorName;
	private String midCode;
	private String midName;
	private String majorCode;
	private int reach;
	private int reachRate;
	private int funderNo;
	
	public Project() {}

	public Project(int projectNo, String memberNick, String projectTitle, String projectThumnail, String projectContent,
			Timestamp beginDate, Timestamp endDate, int goalPrice, String recommended, String recImageName,
			int anchorCount, String projectStatCode, String projectSumary, String projectPhone, String memberEmail,
			String minorCode, String settled, Timestamp projectFormDate, List<FundingOption> foList, String minorName,
			String midCode, String midName, String majorCode, int reach, int reachRate, int funderNo) {
		super();
		this.projectNo = projectNo;
		this.memberNick = memberNick;
		this.projectTitle = projectTitle;
		this.projectThumnail = projectThumnail;
		this.projectContent = projectContent;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.goalPrice = goalPrice;
		this.recommended = recommended;
		this.recImageName = recImageName;
		this.anchorCount = anchorCount;
		this.projectStatCode = projectStatCode;
		this.projectSumary = projectSumary;
		this.projectPhone = projectPhone;
		this.memberEmail = memberEmail;
		this.minorCode = minorCode;
		this.settled = settled;
		this.projectFormDate = projectFormDate;
		this.foList = foList;
		this.minorName = minorName;
		this.midCode = midCode;
		this.midName = midName;
		this.majorCode = majorCode;
		this.reach = reach;
		this.reachRate = reachRate;
		this.funderNo = funderNo;
	}

	public int getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}

	public String getMemberNick() {
		return memberNick;
	}

	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getProjectThumnail() {
		return projectThumnail;
	}

	public void setProjectThumnail(String projectThumnail) {
		this.projectThumnail = projectThumnail;
	}

	public String getProjectContent() {
		return projectContent;
	}

	public void setProjectContent(String projectContent) {
		this.projectContent = projectContent;
	}

	public Timestamp getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Timestamp beginDate) {
		this.beginDate = beginDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public int getGoalPrice() {
		return goalPrice;
	}

	public void setGoalPrice(int goalPrice) {
		this.goalPrice = goalPrice;
	}

	public String getRecommended() {
		return recommended;
	}

	public void setRecommended(String recommended) {
		this.recommended = recommended;
	}

	public String getRecImageName() {
		return recImageName;
	}

	public void setRecImageName(String recImageName) {
		this.recImageName = recImageName;
	}

	public int getAnchorCount() {
		return anchorCount;
	}

	public void setAnchorCount(int anchorCount) {
		this.anchorCount = anchorCount;
	}

	public String getProjectStatCode() {
		return projectStatCode;
	}

	public void setProjectStatCode(String projectStatCode) {
		this.projectStatCode = projectStatCode;
	}

	public String getProjectSumary() {
		return projectSumary;
	}

	public void setProjectSumary(String projectSumary) {
		this.projectSumary = projectSumary;
	}

	public String getProjectPhone() {
		return projectPhone;
	}

	public void setProjectPhone(String projectPhone) {
		this.projectPhone = projectPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMinorCode() {
		return minorCode;
	}

	public void setMinorCode(String minorCode) {
		this.minorCode = minorCode;
	}

	public String getSettled() {
		return settled;
	}

	public void setSettled(String settled) {
		this.settled = settled;
	}

	public Timestamp getProjectFormDate() {
		return projectFormDate;
	}

	public void setProjectFormDate(Timestamp projectFormDate) {
		this.projectFormDate = projectFormDate;
	}

	public List<FundingOption> getFoList() {
		return foList;
	}

	public void setFoList(List<FundingOption> foList) {
		this.foList = foList;
	}

	public String getMinorName() {
		return minorName;
	}

	public void setMinorName(String minorName) {
		this.minorName = minorName;
	}

	public String getMidCode() {
		return midCode;
	}

	public void setMidCode(String midCode) {
		this.midCode = midCode;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getMajorCode() {
		return majorCode;
	}

	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}

	public int getReach() {
		return reach;
	}

	public void setReach(int reach) {
		this.reach = reach;
	}

	public int getReachRate() {
		return reachRate;
	}

	public void setReachRate(int reachRate) {
		this.reachRate = reachRate;
	}

	public int getFunderNo() {
		return funderNo;
	}

	public void setFunderNo(int funderNo) {
		this.funderNo = funderNo;
	}

}
