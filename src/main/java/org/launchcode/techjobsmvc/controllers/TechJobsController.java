package org.launchcode.techjobsmvc.controllers;

import org.launchcode.techjobsmvc.models.JobData;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {

    //TODO:create a HashMap called actionChoices
    static HashMap<String, String> actionChoices = new HashMap<>();
    static HashMap<String, String> columnChoices = new HashMap<>();
    static HashMap<String, Object> tableChoices = new HashMap<>();

    //TODO: create an empty constructor
    //TODO: populate the HashMap with actionChoices within constructor
    public TechJobsController () {
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");


        tableChoices.put("employer", JobData.getAllEmployers());
        tableChoices.put("location", JobData.getAllLocations());
        tableChoices.put("positionType", JobData.getAllPositionTypes());
        tableChoices.put("coreCompetency", JobData.getAllCoreCompetency());
    }

    //TODO: write a static method that returns the actionChoice HashMap
    //TODO: add annotation @ModelAttribute("actions") to the method
    //this annotation will cause the return value of the method to be set in the model with "actions" as the key
    //for every controller that extends TechJobsController
    @ModelAttribute("actions")
    private static HashMap<String, String> getActionChoices(){
        return actionChoices;
    }

    @ModelAttribute("columns")
    private static HashMap<String, String> getColumnChoices(){
        return columnChoices;
    }

    @ModelAttribute("tables")
    private static HashMap<String, Object> getTableChoices(){
        return tableChoices;
    }










}
