package bigg.service;

import bigg.model.Smartphone;
import bigg.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartphoneService implements ISmartphoneService {
    @Autowired
    ISmartphoneRepository repository;

    @Override
    public Iterable<Smartphone> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Smartphone> findByID(long id) {
        return repository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartphone) {
        return repository.save(smartphone);
    }

    @Override
    public void remove(long id) {
        repository.deleteById(id);
    }
}
