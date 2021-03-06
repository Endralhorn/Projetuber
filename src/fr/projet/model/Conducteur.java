package fr.projet.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Conducteur")
@PrimaryKeyJoinColumn(name="COND_ID", referencedColumnName="PER_ID")
public class Conducteur extends Personne{

	private static final long serialVersionUID = 1L;

	
	@Column(name = "COND_IMMAVOITURE")
	private String immaVoiture;
	
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Column(name = "COND_COEFFICIENT")
	private String coefficient;
	
	@Column(name = "COND_MAILPAYPAL")
	private String mailPaypal;

	
	@OneToMany(mappedBy="conducteur", fetch=FetchType.EAGER)
	private List<Course> courses;
	
	public String getImmaVoiture() {
		return immaVoiture;
	}

	public void setImmaVoiture(String immaVoiture) {
		this.immaVoiture = immaVoiture;
	}

	public String getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(String coefficient) {
		this.coefficient = coefficient;
	}

	public String getMailPaypal() {
		return mailPaypal;
	}

	public void setMailPaypal(String mailPaypal) {
		this.mailPaypal = mailPaypal;
	}
	
}
