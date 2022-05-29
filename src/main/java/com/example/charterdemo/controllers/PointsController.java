package com.example.charterdemo.controllers;

import com.example.charterdemo.models.Transaction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PointsController {

    @PostMapping(value="/rest/points")
    public ResponseEntity<Map<String, Integer>> calculatePoints(@RequestBody List<Transaction> transactions) {
        Map<String, Integer> results = new HashMap<>();

        for (int i = 0; i < transactions.size(); i++) {
            String currentMonth = transactions.get(i).month;
            int currentAmount = transactions.get(i).amount;
            Integer previousAmount = results.get(currentMonth);
            int currentPoints = 0;

            if (currentAmount > 100) {
                currentPoints += 50;
                currentPoints += ((currentAmount - 100) * 2);
            } else if (currentAmount > 50 && currentAmount < 100) {
                currentPoints += currentAmount - 50;
            }
            if (previousAmount != null)
                results.put(currentMonth, previousAmount + currentPoints);
            else
                results.put(currentMonth, currentPoints);
        }

        return ResponseEntity.ok(results);
    }
}
