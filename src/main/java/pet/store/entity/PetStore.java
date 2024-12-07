package pet.store.entity;

public class PetStore {

	Set<Customer> customers
	
	@ManyToMany(cascade = CascadeType.PERSIST)

	@JoinTable(name = "pet_store_customer", joinColumns = @JoinColumn(name = "pet_store_id"), inverseJoinColumns = @JoinColumn(name = "customer_id")
	
	Set<Employee> employees
	
	@OneToMany(mappedBy = "petStore", cascade = CascadeType.ALL, orphanRemoval = true)
	
	@Entity
	
	 @Data
	
}
