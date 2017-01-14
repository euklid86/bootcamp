package gr.hometutors.model;

import java.sql.Timestamp;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Model class for the reviews entity
 * 
 * @author Dimitris
 */
@Entity
@Access(value = AccessType.FIELD)
@Table(name = "reviews")
public class Reviews {

	/*
	 * Class fields with reflection to the reviews entity
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rid")
	private Long rid;

	@Column(name = "stars")
	private int stars;

	@Column(name = "evaluation")
	private String evaluation;

	@Column(name = "timestamp")
	private Timestamp timestamp;


	/*
	 * Accessors for the class private fields
	 */
	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((evaluation == null) ? 0 : evaluation.hashCode());
		result = prime * result + ((rid == null) ? 0 : rid.hashCode());
		result = prime * result + stars;
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
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
		Reviews other = (Reviews) obj;
		if (evaluation == null) {
			if (other.evaluation != null)
				return false;
		} else if (!evaluation.equals(other.evaluation))
			return false;
		if (rid == null) {
			if (other.rid != null)
				return false;
		} else if (!rid.equals(other.rid))
			return false;
		if (stars != other.stars)
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reviews [rid=" + rid + ", stars=" + stars + ", evaluation=" + evaluation + ", timestamp=" + timestamp
				+ "]";
	}

}
