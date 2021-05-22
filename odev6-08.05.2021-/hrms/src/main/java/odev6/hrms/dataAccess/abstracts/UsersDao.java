package odev6.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import odev6.hrms.entities.concretes.Users;

public interface UsersDao extends JpaRepository<Users,Integer>{

}
