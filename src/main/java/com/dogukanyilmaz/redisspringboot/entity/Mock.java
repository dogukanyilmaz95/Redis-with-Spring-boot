package com.dogukanyilmaz.redisspringboot.entity;

import com.dogukanyilmaz.redisspringboot.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author dogukanyilmaz
 * Created 21.01.2020
 */
@Entity
@Data
public class Mock extends BaseEntity {
    @NotNull
    private String mockData;
}
