package com.company.Classes;

import java.util.Date;

public class TechnicalStaff extends Staff{
    public TechnicalStaff( Person person, Date joined, String[] education, String[] certification, String[] languages ) {
        super( person, joined, education, certification, languages );
    }
}