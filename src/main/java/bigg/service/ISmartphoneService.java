package bigg.service;

import bigg.model.Smartphone;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findByID(long id);

    Smartphone save(Smartphone smartphone);

    void remove(long id);
}
