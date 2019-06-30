package ga.gabboxl;

import java.io.Serializable;

public class ApiParameters implements Serializable {
    private static final long serialVersionUID = 1;
    public Long timeStamp;
    public String token;

    public static ApiParameters newInstance(String str, Long l) {
        ApiParameters apiParameters = new ApiParameters();
        apiParameters.token = str;
        apiParameters.timeStamp = l;
        return apiParameters;
    }
}
