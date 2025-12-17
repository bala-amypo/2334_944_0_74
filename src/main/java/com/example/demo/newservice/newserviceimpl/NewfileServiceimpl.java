package com.example.demo.newserviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newrepo.NewfileRepo;
import com.example.demo.newservice.NewfileService;

@Service
public class NewfileServiceImpl implements NewfileService {

    private final NewfileRepo rip;

    public NewfileServiceImpl(NewfileRepo rip) {
        this.rip = rip;
    }

    @Override
    public NewfileEntity savedata(NewfileEntity newfile) {
        return rip.save(newfile);
    }

    @Override
    public NewfileEntity getidval(Long id) {
        Optional<NewfileEntity> entity = rip.findById(id);
        return entity.orElse(null);
    }

    @Override
    public List<NewfileEntity> getall() {
        return rip.findAll();
    }

    @Override
    public NewfileEntity update(Long id, NewfileEntity newfile) {
        Optional<NewfileEntity> existing = rip.findById(id);

        if (existing.isPresent()) {
            NewfileEntity entity = existing.get();
            entity.setName(newfile.getName());
            entity.setEmail(newfile.getEmail());
            return rip.save(entity);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        rip.deleteById(id);
    }
}
