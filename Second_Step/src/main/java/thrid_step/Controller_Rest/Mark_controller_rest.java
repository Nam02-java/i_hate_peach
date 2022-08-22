package thrid_step.Controller_Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thrid_step.Repositories_Rest.Persons_repository_rest;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/getMark")
public class Mark_controller_rest {

    @Autowired
    private Persons_repository_rest persons_repository_rest;

    @GetMapping("")
    List<String> getAll_Mark() {
        List<String> list_mark = new ArrayList<>();
        for (int i = 0; i < persons_repository_rest.findAll().size(); i++) {
            list_mark.add(persons_repository_rest.findAll().get(i).getMark());
        }
        return list_mark;
    }
}
