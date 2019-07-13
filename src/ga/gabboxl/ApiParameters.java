package ga.gabboxl;

import java.io.Serializable;

public class ApiParameters implements Serializable {
    private static final long serialVersionUID = 1;
    public String apiName;
    public Long timeStamp;
    public String token;
    public String secret;

    public static ApiParameters newInstance(String apiName, String str, Long l, String secret) {
        ApiParameters apiParameters = new ApiParameters();
        apiParameters.apiName = apiName;
        apiParameters.token = str;
        apiParameters.timeStamp = l;
        apiParameters.secret = secret;
        return apiParameters;
    }
}
