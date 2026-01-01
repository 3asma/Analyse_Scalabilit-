//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2026.01.01 à 12:44:23 PM GMT+01:00 
//


package com.hotel.soap.gen;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="client" type="{http://hotel.com/soap/reservation}client"/&gt;
 *         &lt;element name="chambre" type="{http://hotel.com/soap/reservation}chambre"/&gt;
 *         &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="statut" type="{http://hotel.com/soap/reservation}statutReservation"/&gt;
 *         &lt;element name="preferences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombrePersonnes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="prixTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="commentaires" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "id",
    "client",
    "chambre",
    "dateDebut",
    "dateFin",
    "statut",
    "preferences",
    "nombrePersonnes",
    "prixTotal",
    "commentaires"
})
public class Reservation {

    protected Long id;
    @XmlElement(required = true)
    protected Client client;
    @XmlElement(required = true)
    protected Chambre chambre;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDebut;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFin;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StatutReservation statut;
    protected String preferences;
    protected Integer nombrePersonnes;
    protected BigDecimal prixTotal;
    protected String commentaires;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Définit la valeur de la propriété client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Obtient la valeur de la propriété chambre.
     * 
     * @return
     *     possible object is
     *     {@link Chambre }
     *     
     */
    public Chambre getChambre() {
        return chambre;
    }

    /**
     * Définit la valeur de la propriété chambre.
     * 
     * @param value
     *     allowed object is
     *     {@link Chambre }
     *     
     */
    public void setChambre(Chambre value) {
        this.chambre = value;
    }

    /**
     * Obtient la valeur de la propriété dateDebut.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDebut() {
        return dateDebut;
    }

    /**
     * Définit la valeur de la propriété dateDebut.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDebut(XMLGregorianCalendar value) {
        this.dateDebut = value;
    }

    /**
     * Obtient la valeur de la propriété dateFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFin() {
        return dateFin;
    }

    /**
     * Définit la valeur de la propriété dateFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFin(XMLGregorianCalendar value) {
        this.dateFin = value;
    }

    /**
     * Obtient la valeur de la propriété statut.
     * 
     * @return
     *     possible object is
     *     {@link StatutReservation }
     *     
     */
    public StatutReservation getStatut() {
        return statut;
    }

    /**
     * Définit la valeur de la propriété statut.
     * 
     * @param value
     *     allowed object is
     *     {@link StatutReservation }
     *     
     */
    public void setStatut(StatutReservation value) {
        this.statut = value;
    }

    /**
     * Obtient la valeur de la propriété preferences.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferences() {
        return preferences;
    }

    /**
     * Définit la valeur de la propriété preferences.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferences(String value) {
        this.preferences = value;
    }

    /**
     * Obtient la valeur de la propriété nombrePersonnes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNombrePersonnes() {
        return nombrePersonnes;
    }

    /**
     * Définit la valeur de la propriété nombrePersonnes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNombrePersonnes(Integer value) {
        this.nombrePersonnes = value;
    }

    /**
     * Obtient la valeur de la propriété prixTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrixTotal() {
        return prixTotal;
    }

    /**
     * Définit la valeur de la propriété prixTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrixTotal(BigDecimal value) {
        this.prixTotal = value;
    }

    /**
     * Obtient la valeur de la propriété commentaires.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentaires() {
        return commentaires;
    }

    /**
     * Définit la valeur de la propriété commentaires.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentaires(String value) {
        this.commentaires = value;
    }

}
