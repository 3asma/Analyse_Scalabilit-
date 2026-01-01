//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2026.01.01 à 12:44:23 PM GMT+01:00 
//


package com.hotel.soap.gen;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="chambreId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="preferences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombrePersonnes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "id",
    "clientId",
    "chambreId",
    "dateDebut",
    "dateFin",
    "preferences",
    "nombrePersonnes",
    "commentaires"
})
@XmlRootElement(name = "updateReservationRequest")
public class UpdateReservationRequest {

    protected long id;
    protected long clientId;
    protected long chambreId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDebut;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFin;
    protected String preferences;
    protected Integer nombrePersonnes;
    protected String commentaires;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété clientId.
     * 
     */
    public long getClientId() {
        return clientId;
    }

    /**
     * Définit la valeur de la propriété clientId.
     * 
     */
    public void setClientId(long value) {
        this.clientId = value;
    }

    /**
     * Obtient la valeur de la propriété chambreId.
     * 
     */
    public long getChambreId() {
        return chambreId;
    }

    /**
     * Définit la valeur de la propriété chambreId.
     * 
     */
    public void setChambreId(long value) {
        this.chambreId = value;
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
