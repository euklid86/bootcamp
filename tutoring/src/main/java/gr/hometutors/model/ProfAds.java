package gr.hometutors.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * Model class for the profads entity
 * 
 * @author Dimitris
 */
@Entity
@Table(name = "profads")
@Access(value = AccessType.FIELD)
public class ProfAds {

	/*
	 * Class fields with reflection to the profads entity
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pid")
	private Long pid;

	@Column(name = "information")
	private String information;

	@Column(name = "reviewcode")
	private String reviewCode;

	@ManyToOne
	private Professor professor;

	/*
	 * Accessors for the class private fields
	 */

	public Long getPid() {
		return pid;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getReviewCode() {
		return reviewCode;
	}

	public void setReviewCode(String reviewCode) {
		this.reviewCode = reviewCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((information == null) ? 0 : information.hashCode());
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		result = prime * result + ((reviewCode == null) ? 0 : reviewCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfAds other = (ProfAds) obj;
		if (information == null) {
			if (other.information != null)
				return false;
		} else if (!information.equals(other.information))
			return false;
		if (pid == null) {
			if (other.pid != null)
				return false;
		} else if (!pid.equals(other.pid))
			return false;
		if (reviewCode == null) {
			if (other.reviewCode != null)
				return false;
		} else if (!reviewCode.equals(other.reviewCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProfAds [pid=" + pid + ", information=" + information + ", reviewCode=" + reviewCode + "]";
	}

}
