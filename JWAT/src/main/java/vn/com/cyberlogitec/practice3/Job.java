package vn.com.cyberlogitec.practice3;

public class Job {
	private String jobID;
	private String jobTitle;
	private int minSalary;
	private int maxSalary;
	public Job() {}
	public Job(String jobID, String jobTitle, int minSalary, int maxSalary) {
		super();
		this.jobID = jobID;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}
	public String getJobID() {
		return jobID;
	}
	public void setJobID(String jobID) {
		this.jobID = jobID;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}
	public int getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}
	@Override
	public String toString() {
		return "Job [jobID=" + jobID + ", jobTitle=" + jobTitle + ", minSalary=" + minSalary + ", maxSalary="
				+ maxSalary + "]";
	}
	
	
}
