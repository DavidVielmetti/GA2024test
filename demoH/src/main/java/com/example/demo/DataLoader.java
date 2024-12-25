package com.example.demo;



import com.example.demo.services.DataLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Scanner;


@Component
@Order(1)
public class DataLoader implements CommandLineRunner {

    private final DataLoadService dataLoadService;

    @Autowired
    public DataLoader(DataLoadService dataLoadService) {
        this.dataLoadService = dataLoadService;
    }

    @Override
    public void run(String... args) throws Exception {
            dataLoadService.loadCsvData("static/data.csv");
            System.out.println("Datos cargados correctamente.");
    }
}



