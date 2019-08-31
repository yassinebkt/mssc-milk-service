package com.bkt.msscmilkservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class MilkPagedList extends PageImpl<MilkDto> {

    public MilkPagedList(List<MilkDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public MilkPagedList(List<MilkDto> content) {
        super(content);
    }
}
