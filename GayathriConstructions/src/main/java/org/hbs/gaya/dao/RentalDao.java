package org.hbs.gaya.dao;

import org.hbs.gaya.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalDao extends JpaRepository<Users, Long>
{

}
