package pet.store.dao;

//Wk 14 Created PetStore Dao interface

import org.springframework.data.jpa.repository.JpaRepository;

import pet.store.entity.PetStore;

public interface PetStoreDao extends JpaRepository<PetStore, Long> {

}
