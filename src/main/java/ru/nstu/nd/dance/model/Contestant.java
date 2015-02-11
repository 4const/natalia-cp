package ru.nstu.nd.dance.model;

import javax.persistence.*;

@Entity
public class Contestant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String name;

	@ManyToOne(optional = false)
	private City city;

	private short grade;

	@Column(columnDefinition = "integer default 0")
	private int score;


	public Contestant() {
	}

	public Contestant(Integer id, String name, City city, short grade, int score) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.grade = grade;
		this.score = score;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public short getGrade() {
		return grade;
	}

	public void setGrade(short grade) {
		this.grade = grade;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Contestant)) {
			return false;
		}

		Contestant that = (Contestant)o;

		if (grade != that.grade) {
			return false;
		}
		if (score != that.score) {
			return false;
		}
		if (city != null ? !city.equals(that.city) : that.city != null) {
			return false;
		}
		if (id != null ? !id.equals(that.id) : that.id != null) {
			return false;
		}
		if (name != null ? !name.equals(that.name) : that.name != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (city != null ? city.hashCode() : 0);
		result = 31 * result + (int)grade;
		result = 31 * result + score;
		return result;
	}

	@Override
	public String toString() {
		return "Contestant{" +
			"id=" + id +
			", name='" + name + '\'' +
			", city=" + city +
			", grade=" + grade +
			", score=" + score +
			'}';
	}
}
