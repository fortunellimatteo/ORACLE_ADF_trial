package model;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 06 11:04:22 CEST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UserTableImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        IdUser,
        NameUser,
        DataDecorrenza,
        EmailUser,
        NumberTelephone,
        Matricola,
        Salary,
        Surname;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int IDUSER = AttributesEnum.IdUser.index();
    public static final int NAMEUSER = AttributesEnum.NameUser.index();
    public static final int DATADECORRENZA = AttributesEnum.DataDecorrenza.index();
    public static final int EMAILUSER = AttributesEnum.EmailUser.index();
    public static final int NUMBERTELEPHONE = AttributesEnum.NumberTelephone.index();
    public static final int MATRICOLA = AttributesEnum.Matricola.index();
    public static final int SALARY = AttributesEnum.Salary.index();
    public static final int SURNAME = AttributesEnum.Surname.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UserTableImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.UserTable");
    }

    /**
     * Gets the attribute value for IdUser, using the alias name IdUser.
     * @return the value of IdUser
     */
    public Long getIdUser() {
        return (Long) getAttributeInternal(IDUSER);
    }

    /**
     * Sets <code>value</code> as the attribute value for IdUser.
     * @param value value to set the IdUser
     */
    public void setIdUser(Long value) {
        setAttributeInternal(IDUSER, value);
    }

    /**
     * Gets the attribute value for NameUser, using the alias name NameUser.
     * @return the value of NameUser
     */
    public String getNameUser() {
        return (String) getAttributeInternal(NAMEUSER);
    }

    /**
     * Sets <code>value</code> as the attribute value for NameUser.
     * @param value value to set the NameUser
     */
    public void setNameUser(String value) {
        setAttributeInternal(NAMEUSER, value);
    }

    /**
     * Gets the attribute value for DataDecorrenza, using the alias name DataDecorrenza.
     * @return the value of DataDecorrenza
     */
    public Timestamp getDataDecorrenza() {
        return (Timestamp) getAttributeInternal(DATADECORRENZA);
    }

    /**
     * Sets <code>value</code> as the attribute value for DataDecorrenza.
     * @param value value to set the DataDecorrenza
     */
    public void setDataDecorrenza(Timestamp value) {
        setAttributeInternal(DATADECORRENZA, value);
    }

    /**
     * Gets the attribute value for EmailUser, using the alias name EmailUser.
     * @return the value of EmailUser
     */
    public String getEmailUser() {
        return (String) getAttributeInternal(EMAILUSER);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmailUser.
     * @param value value to set the EmailUser
     */
    public void setEmailUser(String value) {
        setAttributeInternal(EMAILUSER, value);
    }

    /**
     * Gets the attribute value for NumberTelephone, using the alias name NumberTelephone.
     * @return the value of NumberTelephone
     */
    public BigDecimal getNumberTelephone() {
        return (BigDecimal) getAttributeInternal(NUMBERTELEPHONE);
    }

    /**
     * Sets <code>value</code> as the attribute value for NumberTelephone.
     * @param value value to set the NumberTelephone
     */
    public void setNumberTelephone(BigDecimal value) {
        setAttributeInternal(NUMBERTELEPHONE, value);
    }

    /**
     * Gets the attribute value for Matricola, using the alias name Matricola.
     * @return the value of Matricola
     */
    public String getMatricola() {
        return (String) getAttributeInternal(MATRICOLA);
    }

    /**
     * Sets <code>value</code> as the attribute value for Matricola.
     * @param value value to set the Matricola
     */
    public void setMatricola(String value) {
        setAttributeInternal(MATRICOLA, value);
    }

    /**
     * Gets the attribute value for Salary, using the alias name Salary.
     * @return the value of Salary
     */
    public Long getSalary() {
        return (Long) getAttributeInternal(SALARY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Salary.
     * @param value value to set the Salary
     */
    public void setSalary(Long value) {
        setAttributeInternal(SALARY, value);
    }

    /**
     * Gets the attribute value for Surname, using the alias name Surname.
     * @return the value of Surname
     */
    public String getSurname() {
        return (String) getAttributeInternal(SURNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Surname.
     * @param value value to set the Surname
     */
    public void setSurname(String value) {
        setAttributeInternal(SURNAME, value);
    }

    /**
     * @param idUser key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Long idUser) {
        return new Key(new Object[] { idUser });
    }


}

