package org.actus.webapp.models;

import java.util.Map;

import java.util.HashMap;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "demos")
public class Demo {

    @Id
    private String _id;
    @Field(value="identifier")
    private String identifier;
    @Field (value="label")
    private String label;
    @Field (value="contractType")
    private String contractType;
    @Field (value="version")
    private String version;
    @Field (value="description")
    private String description;
 //   private String terms;
    @Field (value="terms")
    private Map<String, Object> terms = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Demo() {
    }

    /**
     *
     * @param description
     * @param contractType
     * @param label
     * @param identifier
     * @param version
     */
    public Demo(String identifier, String label, String contractType, String version, String description) {
        super();
        this.identifier = identifier;
        this.label = label;
        this.contractType = contractType;
        this.version = version;
        this.description = description;
     //   this.terms = terms;
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }



    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   // public String getTerms() {
   //     return terms;
  //  }

  //  public void setTerms(String terms) {
   //     this.terms = terms;
   // }

    public Map<String, Object> getTerms() {
        return this.terms;
    }

    public void setTerms(String name, Object value) {
        this.terms.put(name, value);
    }

}