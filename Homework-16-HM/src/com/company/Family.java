package com.company;

import java.util.ArrayList;
import java.util.List;


public class Family {
    private String familyLastName;
    private Integer familyAverageAge;
    private String familyAddress;
    private List<Member> members = new ArrayList<>();

    public Family(String familyLastName, Integer familyAverageAge, String familyAddress, List<Member> members) {
        this.familyLastName = familyLastName;
        this.familyAverageAge = familyAverageAge;
        this.familyAddress = familyAddress;
        this.members = members;
    }

    public String getFamilyLastName() {
        return familyLastName;
    }

    public Integer getFamilyAverageAge() {
        return familyAverageAge;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public List<Member> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "Family{" +
                "familyLastName='" + familyLastName + '\'' +
                ", familyAverageAge=" + familyAverageAge +
                ", familyAddress='" + familyAddress + '\'' +
                ", members=" + members +
                '}';
    }
}
