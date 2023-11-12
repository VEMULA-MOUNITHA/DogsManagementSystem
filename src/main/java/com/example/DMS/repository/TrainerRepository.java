/**
 * 
 */
package com.example.DMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.DMS.Models.Trainer;

/**
 * @author Mounitha Vemula
 * Nov 11, 2023
 */
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}
