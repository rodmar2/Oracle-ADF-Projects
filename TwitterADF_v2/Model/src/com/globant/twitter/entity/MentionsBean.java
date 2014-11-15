package com.globant.twitter.entity;

import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name = "MentionsBean.findAll", query = "select o from MentionsBean o")  
})
@Table(name = "MENTIONS")
public class MentionsBean implements Serializable {
    @Column(name="DATE_OF_MENTION")
    private Timestamp dateOfMention;
    @Id
    @Column(nullable = false)
    private Long id;
    @Column(name="MENTIONED_BY", length = 50)
    private String mentionedBy;
    @Column(length = 300)
    private String tweet;
    @Column(name="TWITTER_ACCOUNT", length = 50)
    private String twitterAccount;

    public MentionsBean() {
    }

    public MentionsBean(Timestamp dateOfMention, Long id, String mentionedBy,
                        String tweet, String twitterAccount) {
        this.dateOfMention = dateOfMention;
        this.id = id;
        this.mentionedBy = mentionedBy;
        this.tweet = tweet;
        this.twitterAccount = twitterAccount;
    }

    public Timestamp getDateOfMention() {
        return dateOfMention;
    }

    public void setDateOfMention(Timestamp dateOfMention) {
        this.dateOfMention = dateOfMention;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMentionedBy() {
        return mentionedBy;
    }

    public void setMentionedBy(String mentionedBy) {
        this.mentionedBy = mentionedBy;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getTwitterAccount() {
        return twitterAccount;
    }

    public void setTwitterAccount(String twitterAccount) {
        this.twitterAccount = twitterAccount;
    }
}
