package odev6.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "hrms")
public class Users {
	
	@Id
	@GeneratedValue
	@Column(name = "users_id")
	private int usersId;
	
	@Id
	@GeneratedValue
	@Column(name = "job_seekers_id")
	private int jobSeekersId;
	
	@Id
	@GeneratedValue
	@Column(name = "system_employees_id")
	private int systemEmployeesId;
	
	@Id
	@GeneratedValue
	@Column(name = "employers_id")
	private int employersId;
	
	@Id
	@GeneratedValue
	@Column(name = "job_seekers_login_id")
	private int jobSeekersLoginId;
	
	
	@Id
	@GeneratedValue
	@Column(name = "employeers_login_id")
	private int employeersLoginId;
	
	@Id
	@GeneratedValue
	@Column(name = "job_position_id")
	private int jobPositionId;
	
	@Id
	@GeneratedValue
	@Column(name = "e_mail_verification_id")
	private int eMailVerificationId;
	
	@Id
	@GeneratedValue
	@Column(name = "activation_code_id")
	private int activationCodeId;

	public Users(int usersId, int jobSeekersId, int systemEmployeesId, int employersId, int jobSeekersLoginId,
			int employeersLoginId, int jobPositionId, int eMailVerificationId, int activationCodeId) {
		super();
		this.usersId = usersId;
		this.jobSeekersId = jobSeekersId;
		this.systemEmployeesId = systemEmployeesId;
		this.employersId = employersId;
		this.jobSeekersLoginId = jobSeekersLoginId;
		this.employeersLoginId = employeersLoginId;
		this.jobPositionId = jobPositionId;
		this.eMailVerificationId = eMailVerificationId;
		this.activationCodeId = activationCodeId;
	}

	public int getUsersId() {
		return usersId;
	}

	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}

	public int getJobSeekersId() {
		return jobSeekersId;
	}

	public void setJobSeekersId(int jobSeekersId) {
		this.jobSeekersId = jobSeekersId;
	}

	public int getSystemEmployeesId() {
		return systemEmployeesId;
	}

	public void setSystemEmployeesId(int systemEmployeesId) {
		this.systemEmployeesId = systemEmployeesId;
	}

	public int getEmployersId() {
		return employersId;
	}

	public void setEmployersId(int employersId) {
		this.employersId = employersId;
	}

	public int getJobSeekersLoginId() {
		return jobSeekersLoginId;
	}

	public void setJobSeekersLoginId(int jobSeekersLoginId) {
		this.jobSeekersLoginId = jobSeekersLoginId;
	}

	public int getEmployeersLoginId() {
		return employeersLoginId;
	}

	public void setEmployeersLoginId(int employeersLoginId) {
		this.employeersLoginId = employeersLoginId;
	}

	public int getJobPositionId() {
		return jobPositionId;
	}

	public void setJobPositionId(int jobPositionId) {
		this.jobPositionId = jobPositionId;
	}

	public int geteMailVerificationId() {
		return eMailVerificationId;
	}

	public void seteMailVerificationId(int eMailVerificationId) {
		this.eMailVerificationId = eMailVerificationId;
	}

	public int getActivationCodeId() {
		return activationCodeId;
	}

	public void setActivationCodeId(int activationCodeId) {
		this.activationCodeId = activationCodeId;
	}
	
	
	
	
	

}
