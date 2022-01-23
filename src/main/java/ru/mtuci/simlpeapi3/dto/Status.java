package ru.mtuci.simlpeapi3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Status {
    String hostName;
    String helloWord;
}