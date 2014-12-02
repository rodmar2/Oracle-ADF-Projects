package com.globant.invoices.model;

import java.io.Serializable;

import oracle.jbo.Key;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 28 16:55:59 CST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AInvoicesImpl extends EntityImpl implements Serializable  {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id {
            public Object get(AInvoicesImpl obj) {
                return obj.getId();
            }

            public void put(AInvoicesImpl obj, Object value) {
                obj.setId((DBSequence)value);
            }
        }
        ,
        IdJdedwars {
            public Object get(AInvoicesImpl obj) {
                return obj.getIdJdedwars();
            }

            public void put(AInvoicesImpl obj, Object value) {
                obj.setIdJdedwars((Number)value);
            }
        }
        ,
        RegistrationDate {
            public Object get(AInvoicesImpl obj) {
                return obj.getRegistrationDate();
            }

            public void put(AInvoicesImpl obj, Object value) {
                obj.setRegistrationDate((Date)value);
            }
        }
        ,
        Status {
            public Object get(AInvoicesImpl obj) {
                return obj.getStatus();
            }

            public void put(AInvoicesImpl obj, Object value) {
                obj.setStatus((Number)value);
            }
        }
        ,
        IdEmployee {
            public Object get(AInvoicesImpl obj) {
                return obj.getIdEmployee();
            }

            public void put(AInvoicesImpl obj, Object value) {
                obj.setIdEmployee((Number)value);
            }
        }
        ,
        Employees {
            public Object get(AInvoicesImpl obj) {
                return obj.getEmployees();
            }

            public void put(AInvoicesImpl obj, Object value) {
                obj.setEmployees((EntityImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(AInvoicesImpl object);

        public abstract void put(AInvoicesImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ID = AttributesEnum.Id.index();
    public static final int IDJDEDWARS = AttributesEnum.IdJdedwars.index();
    public static final int REGISTRATIONDATE = AttributesEnum.RegistrationDate.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int IDEMPLOYEE = AttributesEnum.IdEmployee.index();
    public static final int EMPLOYEES = AttributesEnum.Employees.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AInvoicesImpl() {
    }

    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the Id
     */
    public DBSequence getId() {
        return (DBSequence)getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(DBSequence value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for IdJdedwars, using the alias name IdJdedwars.
     * @return the IdJdedwars
     */
    public Number getIdJdedwars() {
        return (Number)getAttributeInternal(IDJDEDWARS);
    }

    /**
     * Sets <code>value</code> as the attribute value for IdJdedwars.
     * @param value value to set the IdJdedwars
     */
    public void setIdJdedwars(Number value) {
        setAttributeInternal(IDJDEDWARS, value);
    }

    /**
     * Gets the attribute value for RegistrationDate, using the alias name RegistrationDate.
     * @return the RegistrationDate
     */
    public Date getRegistrationDate() {
        return (Date)getAttributeInternal(REGISTRATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RegistrationDate.
     * @param value value to set the RegistrationDate
     */
    public void setRegistrationDate(Date value) {
        setAttributeInternal(REGISTRATIONDATE, value);
    }

    /**
     * Gets the attribute value for Status, using the alias name Status.
     * @return the Status
     */
    public Number getStatus() {
        return (Number)getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Status.
     * @param value value to set the Status
     */
    public void setStatus(Number value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for IdEmployee, using the alias name IdEmployee.
     * @return the IdEmployee
     */
    public Number getIdEmployee() {
        return (Number)getAttributeInternal(IDEMPLOYEE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IdEmployee.
     * @param value value to set the IdEmployee
     */
    public void setIdEmployee(Number value) {
        setAttributeInternal(IDEMPLOYEE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getEmployees() {
        return (EntityImpl)getAttributeInternal(EMPLOYEES);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setEmployees(EntityImpl value) {
        setAttributeInternal(EMPLOYEES, value);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(DBSequence id) {
        return new Key(new Object[]{id});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.globant.invoices.model.AInvoices");
        }
        return mDefinitionObject;
    }
    
    public String toString() { 
        String s = String.format("Id: %s, IdJEdwards: %s", getId(), getIdJdedwars());
        
        return s;
    }
}