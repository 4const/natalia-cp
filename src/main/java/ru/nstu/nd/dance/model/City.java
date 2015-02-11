package ru.nstu.nd.dance.model;

import javax.persistence.*;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String name;

	@Column(columnDefinition = "integer default 0")
	private int score;

	public City() {
	}

	public City(Integer id, String name, int score) {
		this.id = id;
		this.name = name;
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
		if (!(o instanceof City)) {
			return false;
		}

		City city = (City)o;

		if (score != city.score) {
			return false;
		}
		if (id != null ? !id.equals(city.id) : city.id != null) {
			return false;
		}
		if (name != null ? !name.equals(city.name) : city.name != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + score;
		return result;
	}

	@Override
	public String toString() {
		return "City{" +
			"id=" + id +
			", name='" + name + '\'' +
			", score=" + score +
			'}';
	}
}
