package pet.store.entity;

public class Customer {
    
	Set<PetStore> petStores
	
	@ManyToMany(mappedBy = "customers", cascade = CascadeType.PERSIST)
	
	@Entity 
	
	@Data
	
}
