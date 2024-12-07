package pet.store.entity;

public class Employee {

	PetStore petStore 
	
	@ManyToOne(cascade = CascadeType.ALL)

	@JoinColumn(name = "pet_store_id")
	
	@Entity
	
	 @Data
}
