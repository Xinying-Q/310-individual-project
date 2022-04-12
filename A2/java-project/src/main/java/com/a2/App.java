package com.wootric;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sentiment Analysis!" );
        Sentiment.init();
        Sentiment.findSentiment("This product is horrible");
        Sentiment.findSentiment("This product does exactly what it is supposed to do");
        Sentiment.findSentiment("The report takes forever to load");
        Sentiment.findSentiment("You guys have done amazing job with customer experience ");
        Sentiment.findSentiment("The trends chart took really long and it crashed ultimately");
        Sentiment.findSentiment("Wow, this is amazing! I wish I had known it before ");
        Sentiment.findSentiment("Wootric is going to go very far on customer experience platform ");
        Sentiment.findSentiment("Wootric is an amazingly well designed product ");
        Sentiment.findSentiment("Well done guys. I am very proud of you ");




    }
}
