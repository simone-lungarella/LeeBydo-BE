package me.asah.leebydo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import me.asah.leebydo.model.Employee;

/**
 * Repository per la gestione degli impiegati.
 * 
 * @author Simone Lungarella
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    /**
     * Consente l'eliminazione di un Employee identificato dal suo
     * <code> id </code>.
     * 
     * @param id Identificativo dell'Employee da eliminare.
     */
    void deleteEmployeeById(Long id);

    /**
     * Consente di recuperare un Employee identificandolo dal suo <code> id </code>.
     * 
     * @param id Identificativo dell'Employee da recuperare.
     * @return Employee se recuperato correttamente, occorre interrogare l'object e
     *         sfruttare <em> Optional </em> per verificare l'esito del recupero.
     */
    Optional<Employee> findEmployeeById(Long id);

}
