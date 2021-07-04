package me.asah.leebydo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.asah.leebydo.exception.UserNotFoundException;
import me.asah.leebydo.model.Employee;
import me.asah.leebydo.repository.EmployeeRepo;

/**
 * Service che consente la gestione dei dipendenti modificandone la persistenza
 * degli stessi.
 * 
 * @author Simone Lungarella
 */
@Service
public class EmployeeService {

    /**
     * Repository di un Employee.
     */
    private final EmployeeRepo employeeRepo;

    /**
     * Costruttore del servizio. Inizializza la repository.
     * 
     * @param employeeRepo
     */
    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    /**
     * Consente di memorizzare un Employee sulla base dati.
     * 
     * @param employee Impiegato da memorizzare.
     * @return Impiegato memorizzato.
     */
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    /**
     * Restituisce tutti gli impiegati memorizzati sulla base dati.
     * 
     * @return Tutti gli impiegati sulla base dati.
     */
    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    /**
     * Consente di aggiornare un impiegato.
     * 
     * @param employee Impiegato da aggiornare.
     * @return Impiegato aggiornato.
     */
    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    /**
     * Consente di recuperare l'impiegato identificato dall' <code> id </code>.
     * 
     * @param id Identificativo dell'Employee da recuperare.
     * @return Employee recuperato se esistente, lancia un'eccezione se l'utente non
     *         esiste.
     * @throws UserNotFoundException
     */
    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    /**
     * Consente di eliminare l'impiegato identificato dall' <code> id </code>.
     * 
     * @param id Identificativo dell'impiegato da eliminare.
     */
    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }
}
