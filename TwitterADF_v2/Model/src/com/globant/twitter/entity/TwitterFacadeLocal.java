package com.globant.twitter.entity;

import java.util.List;

import javax.ejb.Local;

@Local
public interface TwitterFacadeLocal {
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    MentionsBean persistMentionsBean(MentionsBean mentionsBean);

    MentionsBean mergeMentionsBean(MentionsBean mentionsBean);

    void removeMentionsBean(MentionsBean mentionsBean);

    List<MentionsBean> getMentionsBeanFindAll();

    List<Graph_v1> getGraph_v1FindAllNamed();
}
