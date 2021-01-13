package com.CW_IIT.orbit.repository;

import com.CW_IIT.orbit.entity.Orbit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrbitRepository extends CrudRepository<Orbit, Long>{

}
