package com.exzray.model;

import org.springframework.beans.factory.BeanNameAware;

import javax.annotation.PostConstruct;

public class Doctor implements Staff, BeanNameAware {

    private String qualification;

    private Nurse assistant;

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void info() {
        System.out.println("qualification: " + qualification);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("set bean name method called!");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                ", assistant=" + assistant +
                '}';
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Nurse getAssistant() {
        return assistant;
    }

    public void setAssistant(Nurse assistant) {
        this.assistant = assistant;
    }

    @PostConstruct
    void postContruct(){
        System.out.println("post construct is called");
    }
}
