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
 * <p>Classe Java pour statutReservation.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <pre>
 * &lt;simpleType name="statutReservation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EN_ATTENTE"/&gt;
 *     &lt;enumeration value="CONFIRMEE"/&gt;
 *     &lt;enumeration value="ANNULEE"/&gt;
 *     &lt;enumeration value="TERMINEE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statutReservation")
@XmlEnum
public enum StatutReservation {

    EN_ATTENTE,
    CONFIRMEE,
    ANNULEE,
    TERMINEE;

    public String value() {
        return name();
    }

    public static StatutReservation fromValue(String v) {
        return valueOf(v);
    }

}
