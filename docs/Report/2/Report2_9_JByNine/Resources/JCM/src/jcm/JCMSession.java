package jcm;

public class JCMSession
{
    private static JCMSession single_instance = null;

    public String accessToken;

    private JCMSession()
    {
    }
    public void setAccessToken(String accessToken ){
        this.accessToken= accessToken ;
    }
    public static JCMSession getInstance(String accessToken)
    {
        if (single_instance == null) {
            single_instance = new JCMSession();
        }
        single_instance.setAccessToken(accessToken);
        return single_instance;
    }
}