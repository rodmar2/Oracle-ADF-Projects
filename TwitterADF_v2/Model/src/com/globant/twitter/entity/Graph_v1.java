package com.globant.twitter.entity;

import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name = "Graph_v1.findAllNamed", 
                    query = "select o from Graph_v1 o"
                    )
})

public class Graph_v1 implements Serializable {
    
    @Column(name="DATE_OF_MENTION")
    private Timestamp dateOfMention;
       
    @Column(name="TWITTER_ACCOUNT", length = 50)
    private String twitterAccount;
    
    //@Column(name="NO_MENTIONS")
//    private Long noMentions;

    public Graph_v1() {
    }

    public Graph_v1(Timestamp dateOfMention, String twitterAccount/*, Long noMentions*/) {
        this.dateOfMention = dateOfMention;
        //this.noMentions = noMentions;
        this.twitterAccount = twitterAccount;
    }

    public Timestamp getDateOfMention() {
        return dateOfMention;
    }

    public void setDateOfMention(Timestamp dateOfMention) {
        this.dateOfMention = dateOfMention;
    }

    public String getTwitterAccount() {
        return twitterAccount;
    }

    public void setTwitterAccount(String twitterAccount) {
        this.twitterAccount = twitterAccount;
    }

/*    public void setNoMentions(Long noMentions) {
        this.noMentions = noMentions;
    }

    public Long getNoMentions() {
        return noMentions;
    }
*/
}
