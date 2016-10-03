package edu.sjsu.restAPI.pojo;

public class Tracker {

	public String score;
	public String level;
	public String remark;
	public Tracker(String score, String level, String remark) {
		super();
		this.score = score;
		this.level = level;
		this.remark = remark;
	}
	public Tracker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Tracker [score=" + score + ", level=" + level + ", remark=" + remark + "]";
	}
	
	
	
}
