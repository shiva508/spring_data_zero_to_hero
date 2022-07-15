package com.pool.controller.inheritance.mappedsuperclass;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pool.model.inheritance.mappedsuperclass.DebitAccountMsc;

@RestController
@RequestMapping("/api/v1/msc")
public class MappedSuperClassCotrolller {
    @PostMapping("create")
    public DebitAccountMsc save(@RequestBody DebitAccountMsc debitAccountMsc) {
        return new DebitAccountMsc();
    }
}
