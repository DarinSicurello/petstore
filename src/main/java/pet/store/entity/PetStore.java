package pet.store.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data

public class PetStore {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pet_store_Id;
	private String pet_store_Name;
	private String pet_store_address;
	private String pet_store_city;
	private String pet_store_state;
	private String pet_store_zip;
	private String pet_store_phone;

	@EqualsAndHashCode.Exclude
	@ToString.Exclude

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	Set<Employee> employees = new HashSet<>();

	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "pet_store_customer",
		joinColumns = @JoinColumn(name = "pet_store_id"),
		inverseJoinColumns = @JoinColumn(name = "customer_id"))
	private Set<Customer> customers = new HashSet<>();
}
