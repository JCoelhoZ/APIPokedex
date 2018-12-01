package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import enums.Type;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="pokemon")
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	@Getter @Setter
	private long id;
	
	@Column(name="type")
	@Getter @Setter
	private Type type;
	
	@Column(name="name")
	@Getter @Setter
	private String name;
	
}
