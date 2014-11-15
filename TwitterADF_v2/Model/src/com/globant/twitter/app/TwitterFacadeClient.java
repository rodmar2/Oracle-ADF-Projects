package com.globant.twitter.app;

import com.globant.twitter.entity.Graph_v1;
import com.globant.twitter.entity.MentionsBean;
import com.globant.twitter.entity.TwitterFacade;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TwitterFacadeClient {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            TwitterFacade twitterFacade = (TwitterFacade)context.lookup("TwitterADF_v2-Model-TwitterFacade#com.globant.twitter.entity.TwitterFacade");
            for (MentionsBean mentionsbean : (List<MentionsBean>)twitterFacade.getMentionsBeanFindAll()) {
                printMentionsBean(mentionsbean);
            }
            for (Graph_v1 graph_v1 : (List<Graph_v1>)twitterFacade.getGraph_v1FindAllNamed()) {
                printGraph_v1(graph_v1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printMentionsBean(MentionsBean mentionsbean) {
        System.out.println( "dateOfMention = " + mentionsbean.getDateOfMention() );
        System.out.println( "id = " + mentionsbean.getId() );
        System.out.println( "mentionedBy = " + mentionsbean.getMentionedBy() );
        System.out.println( "tweet = " + mentionsbean.getTweet() );
        System.out.println( "twitterAccount = " + mentionsbean.getTwitterAccount() );
    }

    private static void printGraph_v1(Graph_v1 graph_v1) {
        System.out.println( "dateOfMention = " + graph_v1.getDateOfMention() );
        System.out.println( "twitterAccount = " + graph_v1.getTwitterAccount() );
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://localhost:7101");
        return new InitialContext( env );
    }
}
