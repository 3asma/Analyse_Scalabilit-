//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2026.01.01 à 12:44:23 PM GMT+01:00 
//


package com.hotel.soap.gen;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeChambre.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <pre>
 * &lt;simpleType name="typeChambre"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SIMPLE"/&gt;
 *     &lt;enumeration value="DOUBLE"/&gt;
 *     &lt;enumeration value="SUITE"/&gt;
 *     &lt;enumeration value="DELUXE"/&gt;
 *     &lt;enumeration value="FAMILIALE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeChambre")
@XmlEnum
public enum TypeChambre {

    SIMPLE,
    DOUBLE,
    SUITE,
    DELUXE,
    FAMILIALE;

    public String value() {
        return name();
    }

    public static TypeChambre fromValue(String v) {
        return valueOf(v);
    }

}
